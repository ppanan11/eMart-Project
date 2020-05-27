package com.emart.jpa.service;

import com.emart.jpa.entity.ItemsEntity;

import java.util.List;

public interface AddItemService {

    /**
     * add a item
     * @return
     */
    ItemsEntity addItem(ItemsEntity itemsEntity);


    /**
     * get items
     * @return
     */
    List<ItemsEntity> getItems();
}
