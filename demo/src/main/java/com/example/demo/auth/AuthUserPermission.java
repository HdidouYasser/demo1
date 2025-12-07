package com.example.demo.auth;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "auth_user_user_permissions")
@Data
public class AuthUserPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer userId;
    private Integer permissionId;
}