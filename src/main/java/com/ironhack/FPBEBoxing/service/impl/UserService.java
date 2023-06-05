package com.ironhack.FPBEBoxing.service.impl;

import com.ironhack.FPBEBoxing.model.Routine;
import com.ironhack.FPBEBoxing.model.User;
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
        if(userOptional.isEmpty()) return;
        user.setId(id);
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        Optional<User> userOptional  = userRepository.findById(id);
        if(userOptional.isEmpty()) return;
        userRepository.deleteById(id);
    }
}
