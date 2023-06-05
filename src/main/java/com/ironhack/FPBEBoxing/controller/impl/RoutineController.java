package com.ironhack.FPBEBoxing.controller.impl;

import com.ironhack.FPBEBoxing.controller.interfaces.IRoutineController;
import com.ironhack.FPBEBoxing.service.impl.RoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RoutineController implements IRoutineController {
    @Autowired
    RoutineService routineService;
}
