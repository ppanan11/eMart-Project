package com.emart.userregister.jpa.service;


import com.emart.userregister.jpa.entity.PurchasehistoryEntity;

import java.util.List;

public interface PurchaseService {

    /**
     * get all purchasehistory list by a user
     * @param
     * @return
     */
    List getPurchaseHistory(String username);

    /**
     * add a purchase history after submit order
     * @param purchasehistoryEntity
     * @return
     */
    PurchasehistoryEntity addPurchaseHistory(PurchasehistoryEntity purchasehistoryEntity);


}
