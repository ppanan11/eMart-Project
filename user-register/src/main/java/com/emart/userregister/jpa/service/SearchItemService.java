package com.emart.userregister.jpa.service;


import com.emart.userregister.jpa.entity.ItemsEntity;

import java.util.List;

public interface SearchItemService {


    /**
     * find related items by a given item name
     * @param name
     * @return
     */
    List<ItemsEntity> findItems(String name);


    /**
     * used to get 3 or 4 items displayed on the home page for buyers
     * @return
     */
    List<ItemsEntity> findHomeItems();

    /**
     * search a item
     * @param name
     * @param start
     * @param end
     * @return
     */
    List<ItemsEntity> searchIteams(String name,Integer start,Integer end);
}
