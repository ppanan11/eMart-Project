package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.entity.ItemsEntity;
import com.emart.userregister.jpa.service.ItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( value= "/item")
public class ItemDetailController {
    @Autowired
    private ItemDetailService itemsService;

    @GetMapping(value="/{name}")
    public List<ItemsEntity> getItemByName(@PathVariable String name){
        return itemsService.getItemByName(name);
    }

    @GetMapping()
    public List<ItemsEntity> getAllItems(){
        return itemsService.getAllItem();
    }


}
