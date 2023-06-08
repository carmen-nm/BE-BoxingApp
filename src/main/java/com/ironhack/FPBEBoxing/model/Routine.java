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
    @ManyToMany
    private List<Exercise> exercises;
    private String equipment;

    public Routine() {
    }

    public Routine(String name, String img, RoutineType routineType, Integer duration, List<Exercise> exercises, String equipment) {
        setName(name);
        setImg(img);
        setRoutineType(routineType);
        setDuration(duration);
        setExercises(exercises);
        setEquipment(equipment);
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
        if (name.length() > 30) {
            throw new IllegalArgumentException("The routine name cannot exceed 30 characters.");
        }
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        if (duration < 0 || duration <= 180) {
            throw new IllegalArgumentException("The duration must be greater than 180 and cannot be negative.");
        }
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