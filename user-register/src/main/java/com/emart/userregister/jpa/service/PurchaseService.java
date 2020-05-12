package com.emart.userregister.jpa.service;


import com.emart.userregister.jpa.entity.PurchasehistoryEntity;

import java.util.List;

public interface PurchaseService {

    /**
     * get all purchasehistory list by a user
     * @param buyerId
     * @return
     */
    List<PurchasehistoryEntity> getPurchaseHistory(Integer buyerId);

    /**
     * add a purchase history after submit order
     * @param purchasehistoryEntity
     * @return
     */
    PurchasehistoryEntity addPurchaseHistory(PurchasehistoryEntity purchasehistoryEntity);
}
