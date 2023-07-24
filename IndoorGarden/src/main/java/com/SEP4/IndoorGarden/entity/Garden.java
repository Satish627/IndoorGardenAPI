package com.SEP4.IndoorGarden.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Garden")
public class Garden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gardenId")
    private Long id;

    @Column(name = "gardenName")
    private String name;
    @OneToMany(mappedBy = "garden")
    @JsonManagedReference
    private List<User> users;


    @OneToMany(mappedBy = "gardenMeasurements")
    @JsonManagedReference
    private List<Measurement> measurementList;

    @OneToMany(mappedBy = "gardenId")
    @JsonManagedReference
    private List<Settings> settings;

    public Garden() {
    }

    public Garden(Long id, String name, List<User> users, List<Measurement> measurementList, List<Settings> settings) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.measurementList = measurementList;
        this.settings = settings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Measurement> getMeasurementList() {
        return measurementList;
    }

    public void setMeasurementList(List<Measurement> measurementList) {
        this.measurementList = measurementList;
    }

    public List<Settings> getSettings() {
        return settings;
    }

    public void setSettings(List<Settings> settings) {
        this.settings = settings;
    }
}
