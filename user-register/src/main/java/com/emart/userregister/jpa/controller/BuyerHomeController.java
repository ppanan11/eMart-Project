package com.emart.userregister.jpa.controller;


import com.emart.userregister.jpa.entity.ItemsEntity;
import com.emart.userregister.jpa.service.SearchItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * used to get random 3 items to display on home page.
 */
@RestController
@RequestMapping( value= "/homeitems")
public class BuyerHomeController {

    @Autowired
    private  SearchItemService searchItemService;

    @GetMapping()
    List<ItemsEntity> getHomeItems(){
        return searchItemService.findHomeItems();
    }
}
