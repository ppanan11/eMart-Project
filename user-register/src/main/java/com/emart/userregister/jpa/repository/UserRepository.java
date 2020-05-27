package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.ItemsEntity;
import com.emart.userregister.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    @Query(nativeQuery=true, value="SELECT id,username,password FROM seller union select id,username,password from buyer")
    List<UserEntity> getUsers();
}
