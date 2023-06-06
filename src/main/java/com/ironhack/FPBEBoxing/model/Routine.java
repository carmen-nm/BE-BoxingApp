package com.ironhack.FPBEBoxing.model;

import com.ironhack.FPBEBoxing.classes.RoutineType;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Routine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String img;
    @Enumerated(EnumType.STRING)
    private RoutineType routineType;
    private Integer duration;
    @OneToMany
    private List<Exercise> exercises;
    private String equipment;

    public Routine() {
    }

    public Routine(String name, String img, RoutineType routineType, Integer duration, List<Exercise> excercises, String equipment) {
        this.name = name;
        this.img = img;
        this.routineType = routineType;
        this.duration = duration;
        this.exercises = excercises;
        this.equipment = equipment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoutineType getRoutineType() {
        return routineType;
    }

    public void setRoutineType(RoutineType routineType) {
        this.routineType = routineType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
