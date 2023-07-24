package com.SEP4.IndoorGarden.repository;

import com.SEP4.IndoorGarden.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement,Long> {
}
