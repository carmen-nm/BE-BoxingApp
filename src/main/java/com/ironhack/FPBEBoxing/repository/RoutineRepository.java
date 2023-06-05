package com.ironhack.FPBEBoxing.repository;

import com.ironhack.FPBEBoxing.model.Routine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutineRepository extends JpaRepository<Routine, Integer> {
}
