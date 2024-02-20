package com.example.demo.entity.registration.services;

import com.example.demo.entity.UserEntity;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    UserEntity findUserByEmail(String email);

    List<UserDto> findAllUsers();
}