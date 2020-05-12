package com.emart.userregister.jpa.service.impl;

import com.emart.userregister.jpa.entity.PurchasehistoryEntity;
import com.emart.userregister.jpa.repository.PurchaseRepository;
import com.emart.userregister.jpa.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;


    /**
     * get a purchase history for a buyer
     * @param buyerId
     * @return
     */
    @Override
    public List<PurchasehistoryEntity> getPurchaseHistory(Integer buyerId) {
        return purchaseRepository.findPurchasersEntitiesByBuyerId(buyerId);
    }

    /**
     * add a purchase history for a user
     * @param purchasehistoryEntity
     * @return
     */
    @Override
    public PurchasehistoryEntity addPurchaseHistory(PurchasehistoryEntity purchasehistoryEntity) {
        return purchaseRepository.save(purchasehistoryEntity);
    }
}
