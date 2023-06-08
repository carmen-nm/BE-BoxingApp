package com.ironhack.FPBEBoxing.service.interfaces;

import com.ironhack.FPBEBoxing.model.Exercise;

import java.util.List;

public interface IExerciseService {
    List<Exercise> getAllExercises();

    Exercise getExerciseById(Integer id);

    Exercise saveExercise(Exercise exercise);

    void updateExercise(Exercise exercise, Integer id);

    void deleteExercise(Integer id);
}
