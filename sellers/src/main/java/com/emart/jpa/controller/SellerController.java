package com.emart.jpa.controller;

import com.emart.jpa.entity.BuyerEntity;
import com.emart.jpa.entity.SellerEntity;
import com.emart.jpa.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SellerController {

    @Autowired
    private SellerService sellerService;

    /**
     * get the seller info by username
     * @param username
     * @return
     */
    @RequestMapping(value = "/getseller",method = RequestMethod.GET)
    SellerEntity getSellerByUsername(@RequestParam("username") String username){
        return sellerService.getSellerByUsername(username);
    }

    /**
     * register a seller controller
     * @param sellerEntity
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    SellerEntity registerSeller(@RequestBody SellerEntity sellerEntity){
        return sellerService.registerSeller(sellerEntity);
    }
}
