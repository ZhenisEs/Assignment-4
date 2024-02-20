package com.example.demo.repository;
import com.example.demo.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<ImageEntity, Integer> {

    Optional<ImageEntity> findByFilename(String filename);
}