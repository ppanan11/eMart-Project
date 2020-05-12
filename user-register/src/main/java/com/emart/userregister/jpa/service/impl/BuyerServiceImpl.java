package com.emart.userregister.jpa.service.impl;

import com.emart.userregister.jpa.entity.BuyerEntity;
import com.emart.userregister.jpa.repository.BuyerRepository;
import com.emart.userregister.jpa.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;

    /*
    implement to get a user by id
     */

    @Override
    public BuyerEntity getBuyerById(int id) {

        return buyerRepository.findById(id).get();
    }

   /*
   implement the service to get all buyers info
    */



    @Override
    public List<BuyerEntity> getAllBuyer(){

        return (List<BuyerEntity>) buyerRepository.findAll();
    }

    /*
    implement to insert a buyer

        private String username;
    private String password;
    private String emailid;
    private Integer mobileNumber;
     */

    @Override
    public BuyerEntity inertOneBuyer(BuyerEntity buyerEntity){
        return buyerRepository.save(buyerEntity);
    }
}
