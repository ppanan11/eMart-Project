package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.entity.PurchasehistoryEntity;
import com.emart.userregister.jpa.service.PurchaseService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    /**
     * get a purchase history list for a buyer
     * @param buyerId
     * @return
     */
    @RequestMapping( value= "/purchase",method = RequestMethod.GET)
    public List<PurchasehistoryEntity> getPurchaseHistory(@RequestParam("buyerId") Integer buyerId){
        return purchaseService.getPurchaseHistory(buyerId);
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
