package com.example.demo.auth;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "auth_user")
@Data
public class AuthUser {
    @Id
    private Integer id;
    private String password;
    private LocalDateTime lastLogin;
    private Boolean isSuperuser;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isStaff;
    private Boolean isActive;
    private LocalDateTime dateJoined;
}