package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartRepository extends JpaRepository<CartEntity,Integer> {


    /**
     *
     * get the cart data by a given username
     * @param username
     * @return
     */
    @Query(nativeQuery=true, value="select a.buyer_username,a.item_name,a.count,b.price,a.id from cart a,items b where a.buyer_username=:username and a.item_id=b.id")
    List findCartEntitiesByBuyerUsername(@Param("username") String username);


    /**
     * update count in the cart
     * @return
     */
    @Query(nativeQuery=true, value="update cart set count = :number where buyerUsername=:username and item_id=:item_id")
    Boolean updateCart(@Param("number") Integer number,@Param("username") String username,@Param("item_id") Integer item_id);
}
