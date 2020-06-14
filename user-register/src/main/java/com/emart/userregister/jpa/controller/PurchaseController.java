package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.entity.PurchasehistoryEntity;
import com.emart.userregister.jpa.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    /**
     * get a purchase history list for a buyer
     * @param
     * @return
     */
    @RequestMapping( value= "/purchase",method = RequestMethod.GET)
    public List getPurchaseHistory(@RequestParam("username") String username){
        return purchaseService.getPurchaseHistory(username);
    }

    /**
     * add a history after order was submiited
     * @param purchasehistoryEntity
     * @return
     */
    @RequestMapping(value = "/addpurchase",method = RequestMethod.POST)
    public PurchasehistoryEntity addPurchaseHistory(@RequestBody PurchasehistoryEntity purchasehistoryEntity){
        return purchaseService.addPurchaseHistory(purchasehistoryEntity);
    }
}
