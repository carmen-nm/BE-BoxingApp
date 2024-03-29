package com.ironhack.FPBEBoxing.service.interfaces;

import com.ironhack.FPBEBoxing.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();

    User getUserById(Integer id);

    void saveUser(User user);

    void updateUser(User user, Integer id);

    void deleteUser(Integer id);

    User userLogin(String username, String password);

    void addUserRoutines(Integer id, Integer routineId);

    void deleteUserRoutines(Integer id, Integer routineId);
}
