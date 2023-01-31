package com.trainingzone.TrainingZone.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="brands")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;

}