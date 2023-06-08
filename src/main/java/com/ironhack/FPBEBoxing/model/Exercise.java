package com.ironhack.FPBEBoxing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String img;
    private Integer sets;
    private Integer repetitions;

    public Exercise() {
    }

    public Exercise(String name, String img, Integer sets, Integer repetitions) {
        setName(name);
        setImg(img);
        setSets(sets);
        setRepetitions(repetitions);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 30) {
            throw new IllegalArgumentException("The exercise name cannot exceed 30 characters.");
        }
        this.name = name;
    }

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        if (sets < 0 || sets >= 101) {
            throw new IllegalArgumentException("The sets must be greater than or equal to 0 and less than 101.");
        }
        this.sets = sets;
    }

    public Integer getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(Integer repetitions) {
        if (repetitions < 0 || repetitions >= 101) {
            throw new IllegalArgumentException("The repetitions must be greater than or equal to 0 and less than 101.");
        }
        this.repetitions = repetitions;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}