package com.emart.userregister.jpa.service.impl;

import com.emart.userregister.jpa.entity.CartEntity;
import com.emart.userregister.jpa.repository.CartRepository;
import com.emart.userregister.jpa.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;


    /**
     * implement cartservice
     * @param username
     * @return
     */
    @Override
    public List findCartByUser(String username) {
        return cartRepository.findCartEntitiesByBuyerUsername(username);
    }

    @Override
    public CartEntity addToCart(CartEntity cart) {
        return cartRepository.save(cart);
    }

    /**
     * remove a W
     * @param cart
     * @return
     */
    @Override
    public boolean removeFromCart(CartEntity cart) {
        try {
            cartRepository.delete(cart);
            return true;
        }catch (Exception e){
            return false;
        }
    }


    /**
     * update count of a item in cart
     * @param cartEntity
     * @return
     */
    @Override
    public boolean updateCart(CartEntity cartEntity) {
        return cartRepository.updateCart(cartEntity.getCount(),cartEntity.getBuyerUsername(),cartEntity.getItemId());
    }

    @Override
    @Transactional
    public Integer deleteCart(String buyer_username) {
        return cartRepository.deleteAllByBuyerUsername(buyer_username);
    }


}
