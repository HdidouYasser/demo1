package com.example.demo.professeur;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalTime;
import java.time.LocalDate;

@Entity
@Table(name = "professeur_commission")
@Data
public class Commission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateCommission;
    private String lieu;
    private LocalTime heure;

    @ManyToOne
    @JoinColumn(name = "labo_id", nullable = false)
    private Laboratoire laboratoire;
}