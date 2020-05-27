package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.entity.BuyerEntity;
import com.emart.userregister.jpa.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping( value= "/user")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    /**
     * get buyer info
     * @param id
     * @return
     */
    @RequestMapping(value = "/id",method = RequestMethod.GET)
    public BuyerEntity getBuyerById(@RequestParam("id") Integer id){
        return buyerService.getBuyerById(id);
    }

    /**
     * get all buyers
     * @return
     */
    @RequestMapping(value = "/buyers",method = RequestMethod.GET)
    public List<BuyerEntity> findAll(){
        return  buyerService.getAllBuyer();
    }


    /**
     * insert a buyer info
     * @param buyerEntity
     * @return
     */
    @RequestMapping(value = "/buyer",method = RequestMethod.POST)
    public BuyerEntity insertOneBuyer(@RequestBody BuyerEntity buyerEntity){
        return buyerService.inertOneBuyer(buyerEntity);
    }
}
