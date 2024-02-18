package com.example.demo;

import com.example.demo.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@SpringBootApplication
@RestController
@RequestMapping("/song")
public class DemoApplication {

	@Autowired
	private StorageService service;

	@PostMapping("/uploadSong")
	public ResponseEntity<?> uploadSong(@RequestParam("song") MultipartFile file) throws IOException {
		String uploadSong = service.uploadSong(file);
		return ResponseEntity.status(HttpStatus.OK)
				.body(uploadSong);
	}

	@PostMapping("/uploadImage")
	public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file) throws IOException {
		String uploadImage = service.uploadImage(file);
		return ResponseEntity.status(HttpStatus.OK)
				.body(uploadImage);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
