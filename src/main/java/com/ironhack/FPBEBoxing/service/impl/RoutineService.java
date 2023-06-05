package com.ironhack.FPBEBoxing.service.impl;

import com.ironhack.FPBEBoxing.model.Exercise;
import com.ironhack.FPBEBoxing.model.Routine;
import com.ironhack.FPBEBoxing.repository.RoutineRepository;
import com.ironhack.FPBEBoxing.service.interfaces.IRoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class RoutineService implements IRoutineService {
    @Autowired
    RoutineRepository routineRepository;

    @Override
    public List<Routine> getAllRoutines() {
        return routineRepository.findAll();
    }

    @Override
    public Routine getRoutineById(Integer id) {
        Optional<Routine> routineOptional = routineRepository.findById(id);
        if(routineOptional.isEmpty())throw new ResponseStatusException(HttpStatus.NOT_FOUND, "routine " + id + " not found");
        return  routineOptional.get();
    }

    @Override
    public void saveRoutine(Routine routine) {
        routineRepository.save(routine);
    }

    @Override
    public void updateRoutine(Routine routine, Integer id) {
        Optional<Routine> routineOptional = routineRepository.findById(id);
        if(routineOptional.isEmpty()) return;
        routine.setId(id);
        routineRepository.save(routine);
    }

    @Override
    public void deleteRoutine(Integer id) {
        Optional<Routine> routineOptional  = routineRepository.findById(id);
        if(routineOptional.isEmpty()) return;
        routineRepository.deleteById(id);
    }
}
