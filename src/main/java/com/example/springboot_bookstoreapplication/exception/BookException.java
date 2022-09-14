package com.example.springboot_bookstoreapplication.exception;

public class BookException extends RuntimeException{
    public BookException(String exception){
        super(exception);
    }
}
