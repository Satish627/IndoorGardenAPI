package com.SEP4.IndoorGarden.service;

import com.SEP4.IndoorGarden.entity.Measurement;
import com.SEP4.IndoorGarden.entity.User;

import java.util.List;
import java.util.Optional;

public interface MeasurementService {
    Measurement saveMeasurement(Measurement measurement);
    List<Measurement> getAllMeasurements();
    Optional<Measurement> getMeasurementById(Long id);

    Measurement updateMeasurement(Measurement measurement);
    void deleteMeasurement(Long id);
}
