package com.emart.jpa.controller;

import com.emart.jpa.entity.ItemsEntity;
import com.emart.jpa.service.AddItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddItemController {
    @Autowired
    AddItemService addItemService;

    /**
     * add a item
     * @param itemsEntity
     * @return
     */
    @RequestMapping(value = "/addItem",method = RequestMethod.POST)
    ItemsEntity addItem(@RequestBody ItemsEntity itemsEntity){
        return addItemService.addItem(itemsEntity);
    }

    @RequestMapping(value = "/getItems",method = RequestMethod.GET)
    List<ItemsEntity> getItems(){
        return addItemService.getItems();
    }
}
