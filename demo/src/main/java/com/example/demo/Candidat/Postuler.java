package com.example.demo.Candidat;

import jakarta.persistence.*;
import lombok.Data;
import com.example.demo.professeur.Sujet;

@Entity
@Table(name = "candidat_postuler")
@Data
public class Postuler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pathFile;

    @ManyToOne
    @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat Candidat;

    @ManyToOne
    @JoinColumn(name = "sujet_id", nullable = false)
    private Sujet sujet;
}