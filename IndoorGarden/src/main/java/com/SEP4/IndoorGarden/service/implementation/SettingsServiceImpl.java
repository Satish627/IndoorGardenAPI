package com.SEP4.IndoorGarden.service.implementation;

import com.SEP4.IndoorGarden.entity.Settings;
import com.SEP4.IndoorGarden.repository.SettingsRepository;
import com.SEP4.IndoorGarden.service.SettingsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SettingsServiceImpl implements SettingsService {

    private final SettingsRepository settingsRepository;

    public SettingsServiceImpl(SettingsRepository settingsRepository) {
        this.settingsRepository = settingsRepository;
    }

    @Override
    public Settings saveSettings(Settings settings) {
        return settingsRepository.save(settings);
    }

    @Override
    public List<Settings> getAllSettings() {
        return settingsRepository.findAll();
    }

    @Override
    public Optional<Settings> getSettingsById(Long id) {
        return settingsRepository.findById(id);
    }

    @Override
    public Settings updateSettings(Settings settings) {
        return settingsRepository.save(settings);
    }

    @Override
    public void deleteSettings(Long id) {
    settingsRepository.deleteById(id);
    }
}
