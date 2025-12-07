package com.example.demo.auth;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "auth_permission")
@Data
public class AuthPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer contentType;
    private String codename;
}