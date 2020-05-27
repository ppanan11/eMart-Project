package com.emart.userregister.jpa.service;

import com.emart.userregister.jpa.entity.UserEntity;

import java.util.List;

public interface UsersService {

    List<UserEntity> getUsers();
}
