package com.emart.jpa.service.impl;

import com.emart.jpa.entity.BuyerEntity;
import com.emart.jpa.entity.SellerEntity;
import com.emart.jpa.repository.SellerRepository;
import com.emart.jpa.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    SellerRepository sellerRepository;
    /**
     * get buyer info by username
     * @param username
     * @return
     */
    @Override
    public SellerEntity getSellerByUsername(String username) {
        return sellerRepository.findSellerEntitiesByUsername(username);
    }

    @Override
    public SellerEntity registerSeller(SellerEntity seller) {
        return sellerRepository.save(seller);
    }
}
