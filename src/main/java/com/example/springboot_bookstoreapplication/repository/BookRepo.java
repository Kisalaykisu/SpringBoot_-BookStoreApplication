package com.example.springboot_bookstoreapplication.repository;

import com.example.springboot_bookstoreapplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    @Query(value = "SELECT * FROM book WHERE name=:bookName", nativeQuery = true)
    Book findByBookName(String bookName);

}
