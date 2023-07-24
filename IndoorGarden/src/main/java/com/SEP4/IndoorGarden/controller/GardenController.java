package com.SEP4.IndoorGarden.controller;

import com.SEP4.IndoorGarden.entity.Garden;
import com.SEP4.IndoorGarden.entity.User;
import com.SEP4.IndoorGarden.service.GardenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/garden")
public class GardenController {
    private final GardenService gardenService;

    public GardenController(GardenService gardenService) {
        this.gardenService = gardenService;
    }
    @PostMapping
    private Garden saveGarden(@RequestBody Garden garden){
        return gardenService.saveGarden(garden);
    }
    @GetMapping
    private List<Garden> getAllGardens(){
        return gardenService.getAllGardens();
    }

    @GetMapping("/{id}")
    private Optional<Garden> getGardenById(@PathVariable("id") Long id){
        return gardenService.getGardenById(id);
    }
    @PutMapping
    private Garden updateGarden(@RequestBody Garden garden){
        return gardenService.updateGarden(garden);
    }
    @DeleteMapping("/{id}")
    private void deleteGarden(@PathVariable("id") Long id){
        gardenService.deleteGarden(id);
    }
}
