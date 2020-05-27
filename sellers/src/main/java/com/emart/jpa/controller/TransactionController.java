package com.emart.jpa.controller;


import com.emart.jpa.entity.TransactionsEntity;
import com.emart.jpa.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;


    /**
     * get the transactions by sellers' id
     * @param id
     * @return
     */
    @RequestMapping(value="/transaction",method = RequestMethod.GET)
    public List<TransactionsEntity> getTransactionByBuyer(@RequestParam("id") Integer id){
        return transactionService.getTransactionsByBuyer(id);
    }

}
