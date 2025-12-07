package com.example.demo.professeur;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "professeur_laboratoire")
@Data
public class Laboratoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomLaboratoire;
    @Lob
    private String description;
    private String pathImage;
    private String initial;

    @ManyToOne
    @JoinColumn(name = "ced_id", nullable = false)
    private Ced ced;

    @ManyToOne
    @JoinColumn(name = "directeur_id", nullable = false)
    private Professeur directeur;

    @ManyToOne
    @JoinColumn(name = "etablissement_id", nullable = false)
    private Etablissement etablissement;
}