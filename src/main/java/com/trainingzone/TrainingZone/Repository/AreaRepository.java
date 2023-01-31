package com.trainingzone.TrainingZone.Repository;

import com.trainingzone.TrainingZone.Models.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {
}
