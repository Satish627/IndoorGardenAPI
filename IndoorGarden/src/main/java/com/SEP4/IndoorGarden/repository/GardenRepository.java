package com.SEP4.IndoorGarden.repository;

import com.SEP4.IndoorGarden.entity.Garden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GardenRepository extends JpaRepository<Garden,Long> {
}
