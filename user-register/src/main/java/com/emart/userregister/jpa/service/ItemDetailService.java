package com.emart.userregister.jpa.service;

import com.emart.userregister.jpa.entity.ItemsEntity;

import java.util.List;

public interface ItemDetailService {
    /**
     * get items by name
     * @param name
     * @return
     */
    List<ItemsEntity> getItemByName(String name);

    List<ItemsEntity> getAllItem();


}
