package com.emart.jpa.service.impl;

import com.emart.jpa.repository.PurchasehistoryRepository;
import com.emart.jpa.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    PurchasehistoryRepository purchasehistoryRepository;

    /**
     * impl for the function getReport
     * @param username
     * @return
     */
    @Override
    public List getReportForSeller(String username) {
        return purchasehistoryRepository.getPurchasehistory(username);
    }
}
