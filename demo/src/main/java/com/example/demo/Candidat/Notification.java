package com.example.demo.Candidat;

import jakarta.persistence.*;
import lombok.Data;
import com.example.demo.professeur.Commission;
import com.example.demo.professeur.Sujet;

@Entity
@Table(name = "candidat_notification")
@Data
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @ManyToOne
    @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat;

    @ManyToOne
    @JoinColumn(name = "commission_id")
    private Commission commission;

    @ManyToOne
    @JoinColumn(name = "sujet_id")
    private Sujet sujet;
}