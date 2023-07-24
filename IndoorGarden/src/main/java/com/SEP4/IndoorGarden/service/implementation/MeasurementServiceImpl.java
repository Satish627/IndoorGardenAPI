package com.SEP4.IndoorGarden.service.implementation;

import com.SEP4.IndoorGarden.entity.Measurement;
import com.SEP4.IndoorGarden.repository.MeasurementRepository;
import com.SEP4.IndoorGarden.service.MeasurementService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MeasurementServiceImpl implements MeasurementService {

    private final MeasurementRepository measurementRepository;

    public MeasurementServiceImpl(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    @Override
    public Measurement saveMeasurement(Measurement measurement) {
        return measurementRepository.save(measurement);
    }

    @Override
    public List<Measurement> getAllMeasurements() {
        return measurementRepository.findAll();
    }

    @Override
    public Optional<Measurement> getMeasurementById(Long id) {
        return measurementRepository.findById(id);
    }

    @Override
    public Measurement updateMeasurement(Measurement measurement) {
        return measurementRepository.save(measurement);
    }

    @Override
    public void deleteMeasurement(Long id) {
        measurementRepository.deleteById(id);
    }
}
