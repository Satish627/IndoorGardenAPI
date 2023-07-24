package com.SEP4.IndoorGarden.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "settings")
public class Settings {

    @Id
    private Long id;

    @ManyToOne
    @JsonBackReference
    private Garden gardenId;

    @ManyToOne
    @JsonBackReference
    private User userId;
    private float maxTemp;
    private float minTemp;
    private float maxHumidity;
    private float minHumidity;
    private float maxCo2;
    private float minCo2;

    public Settings() {
    }

    public Settings(Long id, Garden gardenId, User userId, float maxTemp, float minTemp, float maxHumidity, float minHumidity, float maxCo2, float minCo2) {
        this.id = id;
        this.gardenId = gardenId;
        this.userId = userId;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.maxHumidity = maxHumidity;
        this.minHumidity = minHumidity;
        this.maxCo2 = maxCo2;
        this.minCo2 = minCo2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Garden getGardenId() {
        return gardenId;
    }

    public void setGardenId(Garden gardenId) {
        this.gardenId = gardenId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public float getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(float maxTemp) {
        this.maxTemp = maxTemp;
    }

    public float getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(float minTemp) {
        this.minTemp = minTemp;
    }

    public float getMaxHumidity() {
        return maxHumidity;
    }

    public void setMaxHumidity(float maxHumidity) {
        this.maxHumidity = maxHumidity;
    }

    public float getMinHumidity() {
        return minHumidity;
    }

    public void setMinHumidity(float minHumidity) {
        this.minHumidity = minHumidity;
    }

    public float getMaxCo2() {
        return maxCo2;
    }

    public void setMaxCo2(float maxCo2) {
        this.maxCo2 = maxCo2;
    }

    public float getMinCo2() {
        return minCo2;
    }

    public void setMinCo2(float minCo2) {
        this.minCo2 = minCo2;
    }
}
