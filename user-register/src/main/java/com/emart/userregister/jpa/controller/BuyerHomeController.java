package com.emart.userregister.jpa.controller;


import com.emart.userregister.jpa.entity.ItemsEntity;
import com.emart.userregister.jpa.service.SearchItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BuyerHomeController {

    @Autowired
    private  SearchItemService searchItemService;

    /**
     * used to get random 3 items to display on home page.
     */
    @RequestMapping( value= "/homeitems",method = RequestMethod.GET)
    List<ItemsEntity> getHomeItems(){
        return searchItemService.findHomeItems();
    }
}
