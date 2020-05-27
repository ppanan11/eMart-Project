package com.emart.jpa.repository;

import com.emart.jpa.entity.BuyerEntity;
import com.emart.jpa.entity.SellerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SellerRepository extends JpaRepository<SellerEntity,Integer> {


    SellerEntity findSellerEntitiesByUsername(String username);
}
