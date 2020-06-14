package com.emart.userregister.jpa.service;

import com.emart.userregister.jpa.entity.CartEntity;

import javax.transaction.Transactional;
import java.util.List;

public interface CartService {

    /**
     * cart service to get all items in cart by a given user
     * @param username
     * @return
     */
    List findCartByUser(String username);

    /**
     * add a item to  cart
     * @param cart
     * @return
     */
    CartEntity addToCart(CartEntity cart);

    /**
     * remove a item to  cart
     * @param cart
     * @return
     */
     boolean removeFromCart(CartEntity cart);

    /**
     * update a item to  cart
     * @param
     * @return
     */
    boolean updateCart(CartEntity cartEntity);

    /**
     * remove all for a user
     * @param buyer_username
     * @return
     */
    @Transactional
    Integer deleteCart(String buyer_username);
}
