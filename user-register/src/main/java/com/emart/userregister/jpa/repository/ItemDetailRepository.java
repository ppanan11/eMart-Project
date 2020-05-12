package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemDetailRepository extends JpaRepository<ItemsEntity,Integer> {

    /**
     * DAO to get the list by the item name
     * @param name
     * @return
     */
    List<ItemsEntity> findItemsEntitiesByItemName(String name);
}
