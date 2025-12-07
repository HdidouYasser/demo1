package com.example.demo.professeur;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import com.example.demo.Candidat.Candidat;

@Entity
@Table(name = "professeur_inscription")
@Data
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateDiposeDossier;
    private String remarque;
    private Boolean valider = false;

    @ManyToOne
    @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat;

    @ManyToOne
    @JoinColumn(name = "sujet_id", nullable = false)
    private Sujet sujet;
}