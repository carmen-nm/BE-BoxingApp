package com.ironhack.FPBEBoxing.repository;

import com.ironhack.FPBEBoxing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
}
