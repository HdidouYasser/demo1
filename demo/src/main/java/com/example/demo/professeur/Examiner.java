package com.example.demo.professeur;

import jakarta.persistence.*;
import lombok.Data;
import com.example.demo.Candidat.Candidat;

@Entity
@Table(name = "professeur_examiner")
@Data
public class Examiner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String decision;
    private Float noteDossier;
    private Integer noteEntretien;
    private Boolean publier = false;
    private Boolean valider = false;

    @ManyToOne
    @JoinColumn(name = "commission_id", nullable = false)
    private Commission commission;

    @ManyToOne
    @JoinColumn(name = "sujet_id", nullable = false)
    private Sujet sujet;

    @ManyToOne
    @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat;
}