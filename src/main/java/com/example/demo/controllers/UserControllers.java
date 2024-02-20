package com.example.demo.controllers;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.Interfaces.UserServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserControllers {

    private final UserServiceInterface service;

    public UserControllers(UserServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<UserEntity> getAll(){
        return service.getAll();
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<UserEntity> getById(@PathVariable("user_id") int id){
        UserEntity user = service.getById(id);
        if(user == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //404

        return new ResponseEntity<>(user, HttpStatus.OK); //200
    }

    @PostMapping("/")
    public ResponseEntity<UserEntity> create(@RequestBody UserEntity user){
        UserEntity createdUser = service.create(user);
        if(createdUser == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED); //201
    }

    @GetMapping("/surname/{user_surname}")
    public List<UserEntity> getAllBySurname(@PathVariable("user_surname") String surname){
        return service.getBySurname(surname);
    }

    @GetMapping("/artistname/{user_artistname}")
    public List<UserEntity> getAllByArtistname(@PathVariable("user_artistname") String artistname){
        return service.getByArtistname(artistname);
    }

    @GetMapping("/email/{user_email}")
    public List<UserEntity> getAllByEmail(@PathVariable("user_email") String email){
        return service.getByArtistname(email);
    }
}