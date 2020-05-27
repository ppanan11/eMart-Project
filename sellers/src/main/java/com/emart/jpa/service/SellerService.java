package com.emart.jpa.service;

import com.emart.jpa.entity.SellerEntity;

public interface SellerService {

    /**
     * get a buyer by given username
     * @param username
     * @return
     */
    SellerEntity getSellerByUsername(String username);


    /**
     * register a seller
     * @param seller
     * @return
     */
    SellerEntity registerSeller(SellerEntity seller);

}
