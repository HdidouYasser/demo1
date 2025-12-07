package com.example.demo.professeur;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "professeur_commission_professeurs")
@Data
public class CommissionProfesseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "commission_id", nullable = false)
    private Commission commission;

    @ManyToOne
    @JoinColumn(name = "professeur_id", nullable = false)
    private Professeur professeur;
}
