package com.example.demo.controllers;

import com.example.demo.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/song")
public class SongUploadController {
    @Autowired
    private StorageService service;

    @PostMapping
    public ResponseEntity<?> uploadSong(@RequestParam("song") MultipartFile file) throws IOException {
        String uploadSong = service.uploadSong(file);
        return ResponseEntity.status(HttpStatus.OK)
                .body(uploadSong);
    }

}
