package com.emart.userregister.jpa.service.impl;

import com.emart.userregister.jpa.entity.ItemsEntity;
import com.emart.userregister.jpa.repository.SearchIteamRepository;
import com.emart.userregister.jpa.service.SearchItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this is the implements function for items related
 */
@Service
public class SearchItemImpl implements SearchItemService {

    @Autowired
    SearchIteamRepository searchIteamRepository;


    /**
     * this is used to search all related items by a given name
     * @param name
     * @return
     */
    @Override
    public List<ItemsEntity> findItems(String name) {

        return searchIteamRepository.findByItemNameLike(name);
    }

    /**
     * implement to random get 3 or 4 items
     * @return
     */
    @Override
    public List<ItemsEntity> findHomeItems() {
        return searchIteamRepository.findHomeItems();
    }
}
