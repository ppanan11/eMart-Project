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

    /**
     * find a item
     * @param name
     * @param start
     * @param end
     * @return
     */
    @RequestMapping(value = "/searchitems",method = RequestMethod.GET)
    public List<ItemsEntity> searchItem(@RequestParam("name") String name,@RequestParam("start") Integer start,@RequestParam("end") Integer end){
        return searchItemService.searchIteams(name,start,end);
    }


    @RequestMapping(value = "/homeitem",method = RequestMethod.GET)
    public List<ItemsEntity> homeItems(){
        return searchItemService.findHomeItems();
    }
}
