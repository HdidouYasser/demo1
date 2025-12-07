package com.example.demo.auth;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "auth_group")
@Data
public class AuthGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}