package com.ironhack.FPBEBoxing.service.interfaces;

import com.ironhack.FPBEBoxing.model.Exercise;
import com.ironhack.FPBEBoxing.model.Routine;

import java.util.List;

public interface IRoutineService {
    List<Routine> getAllRoutines();

    Routine getRoutineById(Integer id);

    Routine saveRoutine(Routine routine);

    void updateRoutine(Routine routine, Integer id);

    void deleteRoutine(Integer id);

    void addRoutineExercises(Integer routineId, Integer exerciseId);

    void deleteRoutineExercises(Integer id, Integer exerciseId);
}
