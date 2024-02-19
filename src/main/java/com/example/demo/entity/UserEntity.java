package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UserEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Firstname")
    private String firstname;
    @Column(name = "Surname")
    private String Surname;
    @Column(name = "Artistname")
    private String Login;
    @Column(name = "Password")
    private String Password;
    @Column (name = "Balance")
    private String Balance;
    @Column (name = "Email")
    private String Email;


}