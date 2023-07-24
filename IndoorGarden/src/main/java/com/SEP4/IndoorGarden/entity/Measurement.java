package com.SEP4.IndoorGarden.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "measurements")
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "measurementId")
    private Long id;

    @Column(name = "temperatureLevel")
    private float temperature;
    @Column(name = "humidityLevel")
    private float humidity;

    @Column(name = "Co2Level")
    private float Co2;
    @Column(name = "timeStamp")
    private Timestamp timeStamp;

    @ManyToOne
    @JsonBackReference
    private Garden gardenMeasurements;

    public Measurement() {

    }

    public Measurement(Long id, float temperature, float humidity, float co2, Timestamp timeStamp, Garden gardenMeasurements) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        Co2 = co2;
        this.timeStamp = timeStamp;
        this.gardenMeasurements = gardenMeasurements;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getCo2() {
        return Co2;
    }

    public void setCo2(float co2) {
        Co2 = co2;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Garden getGardenMeasurements() {
        return gardenMeasurements;
    }

    public void setGardenMeasurements(Garden gardenMeasurements) {
        this.gardenMeasurements = gardenMeasurements;
    }
}
