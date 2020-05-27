package com.emart.userregister.jpa.service;

import com.emart.userregister.jpa.entity.CartEntity;

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
     * @param cart
     * @return
     */
    boolean updateCart(CartEntity cartEntity);
}
