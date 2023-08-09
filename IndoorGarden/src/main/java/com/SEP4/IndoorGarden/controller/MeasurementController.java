package com.SEP4.IndoorGarden.controller;

import com.SEP4.IndoorGarden.entity.Measurement;
import com.SEP4.IndoorGarden.entity.User;
import com.SEP4.IndoorGarden.service.MeasurementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/measurements")
public class MeasurementController {

    private final MeasurementService measurementService;

    public MeasurementController(MeasurementService measurementService) {
        this.measurementService = measurementService;
    }

    @GetMapping("/{id}")
    private Optional<Measurement> getMeasurementById(@PathVariable("id") Long id){
        return measurementService.getMeasurementById(id);
    }
    @PostMapping
    private Measurement saveMeasurement(@RequestBody Measurement measurement){
        return measurementService.saveMeasurement(measurement);
    }
    @GetMapping
    private List<Measurement> getAllMeasurements(){
        return measurementService.getAllMeasurements();
    }


    @PutMapping
    private Measurement updateMeasurement(@RequestBody Measurement measurement){
        return measurementService.updateMeasurement(measurement);
    }
    @DeleteMapping("/{id}")
    private void deleteMeasurement(@PathVariable("id") Long id){
        measurementService.deleteMeasurement(id);
    }
}
