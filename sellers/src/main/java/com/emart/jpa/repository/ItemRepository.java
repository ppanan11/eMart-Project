package com.emart.jpa.repository;

import com.emart.jpa.entity.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemsEntity,Integer> {
}
