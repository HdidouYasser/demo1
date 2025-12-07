package com.example.demo.professeur;

import jakarta.persistence.*;
import lombok.Data;
import com.example.demo.auth.AuthUser;

@Entity
@Table(name = "professeur_professeur")
@Data
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cin;
    private String telProfesseur;
    private String pathPhoto;
    private String grade;
    private String numSOM;
    private Integer nombreEncadrer;
    private Integer nombreProposer;

    @ManyToOne
    @JoinColumn(name = "etablissement_id", nullable = false)
    private Etablissement etablissement;

    @ManyToOne
    @JoinColumn(name = "labo_id")
    private Laboratoire laboratoire;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private AuthUser user;
}
