package com.example.demo.Candidat;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "candidat_pays")
@Data
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
}