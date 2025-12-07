package com.example.demo.auth;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "auth_group_permissions")
@Data
public class AuthGroupPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer groupId;
    private Integer permissionId;
}