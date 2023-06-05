package com.ironhack.FPBEBoxing.controller.impl;

import com.ironhack.FPBEBoxing.controller.interfaces.IExerciseController;
import com.ironhack.FPBEBoxing.model.Exercise;
import com.ironhack.FPBEBoxing.service.impl.ExerciseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExerciseController implements IExerciseController {
    @Autowired
    ExerciseService exerciseService;

    @GetMapping("/exercises")
    @ResponseStatus(HttpStatus.OK)
    public List<Exercise> getAllExercises(){
        return exerciseService.getAllExercises();
    }

    @GetMapping("/exercises/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Exercise getExerciseById(@PathVariable(name="id") Integer id){
        return exerciseService.getExerciseById(id);
    }

    @PostMapping("/exercises")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveExercise(@RequestBody @Valid Exercise exercise){
        exerciseService.saveExercise(exercise);
    }

    @PutMapping("/exercises/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateExercise(@RequestBody @Valid Exercise exercise, @PathVariable Integer id){
        exerciseService.updateExercise(exercise, id);
    }

    @DeleteMapping("/exercises/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteExercise(@PathVariable Integer id){
        exerciseService.deleteExercise(id);
    }



}
