package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.Interfaces.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<UserEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public UserEntity getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public UserEntity create(UserEntity userEntity) {
        return repo.save(userEntity);
    }

    @Override
    public List<UserEntity> getBySurname(String surname) {
        return repo.findBySurname(surname);
    }
}