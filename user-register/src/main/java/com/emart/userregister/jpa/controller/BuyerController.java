package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.entity.BuyerEntity;
import com.emart.userregister.jpa.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( value= "/user")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @PostMapping(value = "id/{id}")
    public BuyerEntity getBuyerById(@PathVariable Integer id){
        return buyerService.getBuyerById(id);
    }

    @GetMapping
    public List<BuyerEntity> findAll(){
        return  buyerService.getAllBuyer();
    }


    @PostMapping
    public BuyerEntity insertOneBuyer(@RequestBody BuyerEntity buyerEntity){
        return buyerService.inertOneBuyer(buyerEntity);
    }
}
