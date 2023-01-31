package com.trainingzone.TrainingZone.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "classes")
public class Class {
    private @Id Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToMany
    @JoinColumn(name="brand_id")
    private Brand brand;
    @ManyToOne
    @JoinColumn(name="workout_type")
    private WorkoutType workoutType;
    @ManyToOne
    @JoinColumn(name="location_id")
    private Location location;
}
