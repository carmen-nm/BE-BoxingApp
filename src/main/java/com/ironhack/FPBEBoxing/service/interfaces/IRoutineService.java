package com.ironhack.FPBEBoxing.service.interfaces;

import com.ironhack.FPBEBoxing.model.Routine;

import java.util.List;

public interface IRoutineService {
    List<Routine> getAllRoutines();

    Routine getRoutineById(Integer id);

    void saveRoutine(Routine routine);

    void updateRoutine(Routine routine, Integer id);

    void deleteRoutine(Integer id);
}
