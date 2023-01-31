package com.trainingzone.TrainingZone.Repository;

import com.trainingzone.TrainingZone.Models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
