package com.ironhack.FPBEBoxing.service.impl;

import com.ironhack.FPBEBoxing.repository.ExerciseRepository;
import com.ironhack.FPBEBoxing.service.interfaces.IExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService implements IExerciseService {
    @Autowired
    ExerciseRepository exerciseRepository;
}
