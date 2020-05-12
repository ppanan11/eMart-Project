package com.emart.userregister.jpa.service.impl;

import com.emart.userregister.jpa.entity.ItemsEntity;
import com.emart.userregister.jpa.repository.ItemDetailRepository;
import com.emart.userregister.jpa.service.ItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemDetailServiceImpl implements ItemDetailService {
    @Autowired
    private ItemDetailRepository itemRepository;

    /**
     * implement to get items list
     * @param name
     * @return
     */
    @Override
    public List<ItemsEntity> getItemByName(String name) {

        return itemRepository.findItemsEntitiesByItemName(name);
    }

    @Override
    public List<ItemsEntity> getAllItem() {
        return itemRepository.findAll();
    }
}
