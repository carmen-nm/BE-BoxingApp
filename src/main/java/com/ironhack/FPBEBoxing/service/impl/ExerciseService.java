package com.ironhack.FPBEBoxing.service.impl;

import com.ironhack.FPBEBoxing.model.Exercise;
import com.ironhack.FPBEBoxing.repository.ExerciseRepository;
import com.ironhack.FPBEBoxing.service.interfaces.IExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService implements IExerciseService {

    @Autowired
    ExerciseRepository exerciseRepository;

    @Override
    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }

    @Override
    public Exercise getExerciseById(Integer id) {
        Optional<Exercise> exerciseOptional = exerciseRepository.findById(id);
        if(exerciseOptional.isEmpty())throw new ResponseStatusException(HttpStatus.NOT_FOUND, "exercise " + id + " not found");
        return  exerciseOptional.get();
    }

    @Override
    public void saveExercise(Exercise exercise) {
        exerciseRepository.save(exercise);
    }

    @Override
    public void updateExercise(Exercise exercise, Integer id) {
        Optional<Exercise> exerciseOptional = exerciseRepository.findById(id);
        if(exerciseOptional.isEmpty()) return;
        exercise.setId(id);
        exerciseRepository.save(exercise);
    }

    @Override
    public void deleteExercise(Integer id) {
        Optional<Exercise> exerciseOptional  = exerciseRepository.findById(id);
        if(exerciseOptional.isEmpty()) return;
        exerciseRepository.deleteById(id);
    }
}
