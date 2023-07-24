package com.SEP4.IndoorGarden.service;

import com.SEP4.IndoorGarden.entity.Garden;

import java.util.List;
import java.util.Optional;


public interface GardenService {
    Garden saveGarden(Garden garden);
    List<Garden> getAllGardens();
    Optional<Garden> getGardenById(Long id);

    Garden updateGarden(Garden garden);
    void deleteGarden(Long id);
}
