package com.example.springboot_bookstoreapplication.service;

import com.example.springboot_bookstoreapplication.dto.ChangePasswordDTO;
import com.example.springboot_bookstoreapplication.dto.ForgotPasswordDTO;
import com.example.springboot_bookstoreapplication.dto.LoginDTO;
import com.example.springboot_bookstoreapplication.dto.UserDTO;
import com.example.springboot_bookstoreapplication.model.UserDetails;

import java.util.List;

public interface IUserService {
    //    UserDetails addUserData(UserDTO userDto);
    String insertData(UserDTO userDTO);

    List<UserDetails> getAllUserData();

    UserDetails getUserDataById(Long id);

    UserDetails getUserDataByEmailAddress(String email);

    UserDetails updateDataByEmail(UserDTO userDTO, String email);

    UserDetails deleteData(Long id);

    UserDetails getUserDataByToken(String token);

    String loginUser(LoginDTO loginDTO);

    String changePassword(ChangePasswordDTO changePasswordDTO);

    String forgotPassword(String email);

    String resetPassword(ForgotPasswordDTO forgotPasswordDTO);
}