package com.example.springboot_bookstoreapplication.exception;

public class CartException extends RuntimeException{
    public CartException(String exception){
        super(exception);
    }
}
