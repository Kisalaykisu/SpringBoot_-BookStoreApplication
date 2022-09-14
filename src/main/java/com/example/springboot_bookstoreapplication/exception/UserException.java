package com.example.springboot_bookstoreapplication.exception;

public class UserException extends RuntimeException{
    public UserException(String exception){
        super(exception);
    }
}
