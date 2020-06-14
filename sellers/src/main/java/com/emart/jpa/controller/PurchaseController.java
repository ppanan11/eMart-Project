package com.emart.jpa.controller;


import com.emart.jpa.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PurchaseController {


    @Autowired
    PurchaseService purchaseService;

    @RequestMapping(value = "/getReport",method = RequestMethod.GET)
    List getReport(@RequestParam("username") String username){
        return purchaseService.getReportForSeller(username);
    }
}
