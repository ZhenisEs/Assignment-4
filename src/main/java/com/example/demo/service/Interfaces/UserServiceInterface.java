package com.example.demo.service.Interfaces;

import com.example.demo.entity.UserEntity;

import java.util.List;

public interface UserServiceInterface {
    List<UserEntity> getAll();
    UserEntity getById(int id);
    UserEntity create(UserEntity userEntity);
    List<UserEntity> getBySurname(String surname);
}