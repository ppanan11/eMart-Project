package com.emart.Controller;

import com.emart.Entity.UserEntity;
import com.emart.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/loginusers")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<UserEntity> getUsers(){

        return  userService.getUsers();
    }
}
