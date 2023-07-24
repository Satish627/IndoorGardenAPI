package com.SEP4.IndoorGarden.controller;

import com.SEP4.IndoorGarden.entity.Settings;
import com.SEP4.IndoorGarden.service.SettingsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/settings")
public class SettingsController {

    private final SettingsService settingsService;

    public SettingsController(SettingsService settingsService) {
        this.settingsService = settingsService;
    }
    @PostMapping
    private Settings saveSettings(@RequestBody Settings settings){
        return settingsService.saveSettings(settings);
    }
    @GetMapping
    private List<Settings> getAllSettings(){
        return settingsService.getAllSettings();
    }

    @GetMapping("/{id}")
    private Optional<Settings> getSettingById(@PathVariable("id") Long id){
        return settingsService.getSettingsById(id);
    }
    @PutMapping
    private Settings updateSettings(@RequestBody Settings settings){
        return settingsService.updateSettings(settings);
    }
    @DeleteMapping("/{id}")
    private void deleteSetting(@PathVariable("id") Long id){
        settingsService.deleteSettings(id);
    }

}
