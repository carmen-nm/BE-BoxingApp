package com.ironhack.FPBEBoxing.repository;

import com.ironhack.FPBEBoxing.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
}
