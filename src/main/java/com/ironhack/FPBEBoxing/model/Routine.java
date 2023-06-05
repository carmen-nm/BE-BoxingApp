package com.ironhack.FPBEBoxing.model;

import com.ironhack.FPBEBoxing.classes.RoutuneType;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Routine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private RoutuneType routuneType;
    private Integer minutes;
    @OneToMany
    private List<Exercise> excercises;
    private String materials;

    public Routine() {
    }

    public Routine(String name, RoutuneType routuneType, Integer minutes, List<Exercise> excercises, String materials) {
        this.name = name;
        this.routuneType = routuneType;
        this.minutes = minutes;
        this.excercises = excercises;
        this.materials = materials;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoutuneType getRoutuneType() {
        return routuneType;
    }

    public void setRoutuneType(RoutuneType routuneType) {
        this.routuneType = routuneType;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public List<Exercise> getExcercises() {
        return excercises;
    }

    public void setExcercises(List<Exercise> excercises) {
        this.excercises = excercises;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
