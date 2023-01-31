package com.trainingzone.TrainingZone.Repository;

import com.trainingzone.TrainingZone.Models.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {
}
