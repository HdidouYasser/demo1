package com.example.demo.directeur;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "directeur_pole_calendrier")
@Data
public class Calendrier {
    @Id
    private Integer id;
    private String action;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String pour;
}