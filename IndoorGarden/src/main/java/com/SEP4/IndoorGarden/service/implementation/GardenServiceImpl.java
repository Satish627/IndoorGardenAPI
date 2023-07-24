package com.SEP4.IndoorGarden.service.implementation;

import com.SEP4.IndoorGarden.entity.Garden;
import com.SEP4.IndoorGarden.repository.GardenRepository;
import com.SEP4.IndoorGarden.service.GardenService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GardenServiceImpl implements GardenService {
    private final GardenRepository gardenRepository;

    public GardenServiceImpl(GardenRepository gardenRepository) {
        this.gardenRepository = gardenRepository;
    }

    @Override
    public Garden saveGarden(Garden garden) {
        return gardenRepository.save(garden);
    }

    @Override
    public List<Garden> getAllGardens() {
        return gardenRepository.findAll();
    }

    @Override
    public Optional<Garden> getGardenById(Long id) {
        return gardenRepository.findById(id);
    }

    @Override
    public Garden updateGarden(Garden garden) {
        return gardenRepository.save(garden);
    }

    @Override
    public void deleteGarden(Long id) {
        gardenRepository.deleteById(id);
    }
}
