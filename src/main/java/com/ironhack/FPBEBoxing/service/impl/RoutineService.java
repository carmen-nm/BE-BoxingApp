package com.ironhack.FPBEBoxing.service.impl;

import com.ironhack.FPBEBoxing.repository.RoutineRepository;
import com.ironhack.FPBEBoxing.service.interfaces.IRoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoutineService implements IRoutineService {
    @Autowired
    RoutineRepository routineRepository;
}
