package com.ironhack.FPBEBoxing.controller.impl;

import com.ironhack.FPBEBoxing.controller.interfaces.IUserController;
import com.ironhack.FPBEBoxing.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController implements IUserController {
    @Autowired
    UserService userservice;
}
