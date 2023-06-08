package com.ironhack.FPBEBoxing.controller.impl;

import com.ironhack.FPBEBoxing.controller.interfaces.IRoutineController;
import com.ironhack.FPBEBoxing.model.Routine;
import com.ironhack.FPBEBoxing.service.impl.RoutineService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoutineController implements IRoutineController {
    @Autowired
    RoutineService routineService;

    @GetMapping("/routines")
    @ResponseStatus(HttpStatus.OK)
    public List<Routine> getAllRoutines() {
        return routineService.getAllRoutines();
    }

    @GetMapping("/routines/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Routine getRoutineById(@PathVariable(name="id") Integer id){
        return routineService.getRoutineById(id);
    }

    @PostMapping("/routines")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveRoutine(@RequestBody @Valid Routine routine){
        routineService.saveRoutine(routine);
    }

    @PutMapping("/routines/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateRoutine(@RequestBody @Valid Routine routine, @PathVariable Integer id){
        routineService.updateRoutine(routine, id);
    }

    @DeleteMapping("/routines/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRoutine(@PathVariable Integer id){
        routineService.deleteRoutine(id);
    }

    @PatchMapping("/routines/{id}/{exerciseId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addRoutineExercises(@PathVariable Integer id, @PathVariable Integer exerciseId){
        routineService.addRoutineExercises(id, exerciseId);
    }

}
