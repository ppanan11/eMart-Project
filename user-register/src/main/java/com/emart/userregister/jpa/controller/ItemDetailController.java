package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.entity.ItemsEntity;
import com.emart.userregister.jpa.service.ItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemDetailController {
    @Autowired
    private ItemDetailService itemsService;

    @RequestMapping( value= "/item",method = RequestMethod.GET)
    public List<ItemsEntity> getItemByName(@RequestParam("name") String name){
        return itemsService.getItemByName(name);
    }

    @RequestMapping( value= "/items",method = RequestMethod.GET)
    public List<ItemsEntity> getAllItems(){
        return itemsService.getAllItem();
    }


}
