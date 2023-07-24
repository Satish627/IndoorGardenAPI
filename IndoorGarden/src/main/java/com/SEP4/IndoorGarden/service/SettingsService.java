package com.SEP4.IndoorGarden.service;

import com.SEP4.IndoorGarden.entity.Settings;
import com.SEP4.IndoorGarden.entity.User;

import java.util.List;
import java.util.Optional;

public interface SettingsService {

    Settings saveSettings(Settings settings);
    List<Settings> getAllSettings();
    Optional<Settings> getSettingsById(Long id);

    Settings updateSettings(Settings settings);
    void deleteSettings(Long id);
}
