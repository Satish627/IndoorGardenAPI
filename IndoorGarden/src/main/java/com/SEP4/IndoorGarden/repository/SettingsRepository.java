package com.SEP4.IndoorGarden.repository;

import com.SEP4.IndoorGarden.entity.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingsRepository extends JpaRepository<Settings,Long> {
}
