package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.entity.ItemsEntity;
import com.emart.userregister.jpa.service.SearchItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SearchItemController {
    @Autowired
    private  SearchItemService searchItemService;

    /**
     * controller to return a list for the given search name
     * @param itemname
     * @return
     */
    @RequestMapping( value= "/searchitem",method = RequestMethod.GET)
    public List<ItemsEntity> getSearchIteams(@RequestParam("itemname") String itemname){
        return searchItemService.findItems(itemname);
    }


}
