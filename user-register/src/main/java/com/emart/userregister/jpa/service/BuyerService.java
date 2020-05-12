package com.emart.userregister.jpa.service;

import com.emart.userregister.jpa.entity.BuyerEntity;

import java.util.List;

public interface BuyerService {
    /*
    get Buyer by ID
     */
    BuyerEntity getBuyerById(int id) ;

    /*
    get All buyers list
     */

    List<BuyerEntity> getAllBuyer();

    /*
    insert a user to buyers table
     */

    BuyerEntity inertOneBuyer(BuyerEntity buyerEntity);
}
