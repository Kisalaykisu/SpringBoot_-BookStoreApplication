package com.example.springboot_bookstoreapplication.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ForgotPasswordDTO {
    private String emailAddress;
    private String newPassword;
}
