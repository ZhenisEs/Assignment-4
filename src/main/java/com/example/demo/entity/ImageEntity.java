package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ImageEntity")
@Data
@AllArgsConstructor
@Setter
@NoArgsConstructor
@Getter
@Builder
public class ImageEntity {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "imfilename")
    private String filename;
    @Column(name = "imfiletype")
    private String filetype;
    @Column(name = "imagedata")
    private byte[] imagedata;
}
