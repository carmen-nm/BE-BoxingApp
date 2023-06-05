package com.ironhack.FPBEBoxing.controller.impl;

import com.ironhack.FPBEBoxing.controller.interfaces.IExerciseController;
import com.ironhack.FPBEBoxing.service.impl.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExerciseController implements IExerciseController {
    @Autowired
    ExerciseService exerciseService;
}
