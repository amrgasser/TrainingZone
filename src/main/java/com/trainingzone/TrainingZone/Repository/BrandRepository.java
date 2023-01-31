package com.trainingzone.TrainingZone.Repository;

import com.trainingzone.TrainingZone.Models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
