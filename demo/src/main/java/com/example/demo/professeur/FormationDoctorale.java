package com.example.demo.professeur;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "professeur_formationdoctorale")
@Data
public class FormationDoctorale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pathImage;
    private String initiale;
    private String titre;
    @Lob
    private String axeDeRecherche;
    private LocalDate dateAccreditation;

    @ManyToOne
    @JoinColumn(name = "ced_id", nullable = false)
    private Ced ced;

    @ManyToOne
    @JoinColumn(name = "etablissement_id", nullable = false)
    private Etablissement etablissement;
}
