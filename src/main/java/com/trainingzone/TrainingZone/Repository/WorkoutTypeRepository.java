package com.trainingzone.TrainingZone.Repository;

import com.trainingzone.TrainingZone.Models.WorkoutType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutTypeRepository extends JpaRepository<WorkoutType, Long> {
}
