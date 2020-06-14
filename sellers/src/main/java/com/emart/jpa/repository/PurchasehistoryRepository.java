package com.emart.jpa.repository;

import com.emart.jpa.entity.PurchasehistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchasehistoryRepository extends JpaRepository<PurchasehistoryEntity,Integer> {

    /**
     * get the transaction  report for a buyer
     * @param username
     * @return
     */
    @Query(nativeQuery=true, value="select a.item_name,a.price,b.number_of_items,b.buyer_username,b.date_time from items a,purchasehistory b where b.item_id=a.id and b.seller_username=:username")
    List getPurchasehistory(@Param("username") String username);
}
