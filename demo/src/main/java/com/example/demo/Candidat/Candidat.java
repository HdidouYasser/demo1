package com.example.demo.Candidat;

import jakarta.persistence.*;
import lombok.Data;
import com.example.demo.auth.AuthUser;
import java.time.LocalDate;

@Entity
@Table(name = "candidat_candidat")
@Data
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cne;
    private String cin;
    private String nomCandidatAr;
    private String prenomCandidatAr; // fixed typo
    @Lob
    private String adresse;
    @Lob
    private String adresseAr;
    private String sexe;
    private String villeDeNaissance;
    private String villeDeNaissanceAr;
    private String ville;
    private LocalDate dateDeNaissance;
    private String typeDeHandiCape;
    private String academie;
    private String telCandidat;
    private String pathCv;
    private String pathPhoto;
    private Integer etatDossier;
    private String situationFamiliale;
    private Boolean fonctionaire;

    @ManyToOne
    @JoinColumn(name = "pays_id", nullable = false)
    private Pays pays;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private AuthUser user;
}