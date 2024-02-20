package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "SongEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class SongEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "sofilename")
    private String filename;
    @Column(name = "sofiletype")
    private String filetype;
    @Column(name = "songdata")
    private byte[] songdata;



}
