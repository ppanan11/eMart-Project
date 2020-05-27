package com.emart.Service.Impl;

import com.emart.Entity.UserEntity;
import com.emart.Repository.UserRepository;
import com.emart.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public List<UserEntity> getUsers() {
        return userRepository.getUsers();
    }

}
