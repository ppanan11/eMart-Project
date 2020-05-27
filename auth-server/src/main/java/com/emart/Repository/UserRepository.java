package com.emart.Repository;


import com.emart.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    @Query(nativeQuery=true, value="SELECT id,username,password FROM seller union select id,username,password from buyer")
    List<UserEntity> getUsers();
}
