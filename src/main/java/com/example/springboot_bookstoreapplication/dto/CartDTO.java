package com.example.springboot_bookstoreapplication.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public @ToString class CartDTO {
    Long bookId;
    int quantity;
}
