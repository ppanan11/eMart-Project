package com.emart.userregister.jpa.controller;


import com.emart.userregister.jpa.entity.UserEntity;
import com.emart.userregister.jpa.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    UsersService usersService;

    @RequestMapping( value= "/users",method = RequestMethod.GET)
    public List<UserEntity> getUsers(){

        return  usersService.getUsers();
    }


}
