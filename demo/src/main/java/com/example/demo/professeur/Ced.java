package com.example.demo.professeur;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "professeur_ced")
@Data
public class Ced {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String description;
    private String pathImage;
    private String initiale;
    private String titre;

    @ManyToOne
    @JoinColumn(name = "directeur_id")
    private Professeur directeur;
}