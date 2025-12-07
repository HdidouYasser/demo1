package com.example.demo.professeur;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "professeur_etablissement")
@IdClass(EtablissementId.class)
@Data
public class Etablissement {
    @Id
    private String idEtablissement;
    private String nomEtablissement;
}