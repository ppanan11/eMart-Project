package com.emart.userregister.jpa.service.impl;

import com.emart.userregister.jpa.entity.UserEntity;
import com.emart.userregister.jpa.repository.UserRepository;
import com.emart.userregister.jpa.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UsersService {

@Autowired
    UserRepository userRepository;


    @Override
    public List<UserEntity> getUsers() {
        return userRepository.getUsers();
    }
}
