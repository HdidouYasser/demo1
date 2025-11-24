package com.example.demo.Candidat;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import org.springframework.stereotype.Service;
@Service
@Entity
@Table(name = "candidats")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidatModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cne;
    private String cin;
    private String nomCandidateAr;
    private String prenomCandidateAr;
    private String adresse;
    private String adresseAr;
    private String sexe;
    private String villeDeNaissance;
    private String villeDeNaissanceAr;
    private String ville;

    @Temporal(TemporalType.DATE)
    private Date dateDeNaissance;

    private String typeDeHandiCape;
    private String academie;
    private String telCandidate;
    private String pathCv;
    private String pathPhoto;
    private Integer etatDossier;
    private String situationFamiliale;
    private Long paysId;
    private Long userId;
    private Boolean fonctionaire;
}