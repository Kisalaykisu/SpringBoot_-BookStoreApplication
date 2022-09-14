package com.example.springboot_bookstoreapplication.repository;

import com.example.springboot_bookstoreapplication.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserDetails, Long> {
    @Query(value = "SELECT * FROM user WHERE email=:email", nativeQuery = true)
    UserDetails findByEmailAddress(String email);
}