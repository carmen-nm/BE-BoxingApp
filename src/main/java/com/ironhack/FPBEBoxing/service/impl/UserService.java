package com.ironhack.FPBEBoxing.service.impl;

import com.ironhack.FPBEBoxing.model.Exercise;
import com.ironhack.FPBEBoxing.model.Routine;
import com.ironhack.FPBEBoxing.model.User;
import com.ironhack.FPBEBoxing.repository.RoutineRepository;
import com.ironhack.FPBEBoxing.repository.UserRepository;
import com.ironhack.FPBEBoxing.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoutineRepository routineRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isEmpty())throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User " + id + " not found");
        return  userOptional.get();
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user, Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        user.setId(id);
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        Optional<User> userOptional  = userRepository.findById(id);
        if(userOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        userRepository.deleteById(id);
    }

    @Override
    public User userLogin(String username, String password) {
        Optional<User> userOptional  = userRepository.findByUsernameAndPassword(username, password);
        if(userOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");

        return userOptional.get();
    }

    @Override
    public void addUserRoutines(Integer userId, Integer routineId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "user " + userId + " not found");
        User user = userOptional.get();

        Optional<Routine> routineOptional = routineRepository.findById(routineId);
        if(routineOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "routine " + routineId + " not found");
        Routine routine = routineOptional.get();

        user.getRoutines().add(routine);

        userRepository.save(user);
    }

    @Override
    public void deleteUserRoutines(Integer userId, Integer routineId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "user " + userId + " not found");
        User user = userOptional.get();

        Optional<Routine> routineOptional = routineRepository.findById(routineId);
        if(routineOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "routine " + routineId + " not found");
        Routine routine = routineOptional.get();

        List<Routine> routines = user.getRoutines();
        routines.removeIf(e -> e.getId().equals(routineId));

        userRepository.save(user);
    }
}
