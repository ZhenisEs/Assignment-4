package com.example.demo.repository;
import com.example.demo.entity.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SongRepository extends JpaRepository<SongEntity, Integer> {
    Optional<SongEntity> findByFilename(String filename);
}
