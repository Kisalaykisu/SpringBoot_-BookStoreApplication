package com.example.springboot_bookstoreapplication.exception;

public class OrderException extends RuntimeException{
    public OrderException(String exception){
        super(exception);
    }
}
