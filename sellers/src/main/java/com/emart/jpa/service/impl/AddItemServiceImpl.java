package com.emart.jpa.service.impl;

import com.emart.jpa.entity.ItemsEntity;
import com.emart.jpa.repository.ItemRepository;
import com.emart.jpa.service.AddItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddItemServiceImpl implements AddItemService {
    @Autowired
    ItemRepository itemRepository;


    @Override
    public ItemsEntity addItem(ItemsEntity itemsEntity) {
        return itemRepository.save(itemsEntity);
    }

    @Override
    public List<ItemsEntity> getItems() {
        return itemRepository.findAll();
    }
}
