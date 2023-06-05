package com.ironhack.FPBEBoxing.service.impl;

import com.ironhack.FPBEBoxing.repository.UserRepository;
import com.ironhack.FPBEBoxing.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;
}
