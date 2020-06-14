package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.PurchasehistoryEntity;
import com.emart.userregister.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<PurchasehistoryEntity,Integer> {

//    List<PurchasehistoryEntity> findPurchasersEntitiesByBuyerId(Integer buyerId);

    /**
     * repository to get purchase history list for a user
     * @param username
     * @return
     */
    List findAllByBuyerUsername(@Param("username") String username);


    /**
     * get history info for a user
     * @return
     */
    @Query(nativeQuery=true, value="select b.item_name,b.price,a.number_of_items,a.date_time from purchasehistory a,items b where a.buyer_username=:username and a.item_id=b.id")
    List getHistoryByUsername(@Param("username") String username);
    
}
