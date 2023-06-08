package com.ironhack.FPBEBoxing.repository;

import com.ironhack.FPBEBoxing.model.Exercise;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ExerciseRepositoryTest {

    @Autowired
    ExerciseRepository exerciseRepository;

    @Test
    void createTest(){
        List<Exercise> myOldExerciseList = exerciseRepository.findAll();

        Exercise myExercise = new Exercise();
        myExercise.setName("Another false name");
        myExercise.setSets(4);
        myExercise.setRepetitions(4);
        exerciseRepository.save(myExercise);
        List<Exercise> myExerciseList = exerciseRepository.findAll();

        int expectedSize = myOldExerciseList.size() + 1;

        assertEquals(expectedSize, myExerciseList.size());
    }
}