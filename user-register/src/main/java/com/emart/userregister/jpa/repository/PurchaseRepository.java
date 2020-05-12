package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.PurchasehistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<PurchasehistoryEntity,Integer> {

    List<PurchasehistoryEntity> findPurchasersEntitiesByBuyerId(Integer buyerId);
}
