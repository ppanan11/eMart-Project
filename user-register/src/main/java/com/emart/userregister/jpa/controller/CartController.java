package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.entity.CartEntity;
import com.emart.userregister.jpa.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( value= "/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * get cart data by a given username
     * @param username
     * @return
     */
    @GetMapping(value="/{username}")
    public List<CartEntity> getCartByUser(@PathVariable String username){
        return  cartService.findCartByUser(username);
    }

    /**
     * add a item to cart
     * @param cartEntity
     * @return
     */
    @PostMapping(value = "add")
    public CartEntity addToCart(CartEntity cartEntity){
        return cartService.addToCart(cartEntity);
    }

    /**
     * delete a item from cart
     * @param cartEntity
     * @return
     */
    @DeleteMapping(value = "delete")
    public boolean deleteFromCart(CartEntity cartEntity){
        return cartService.removeFromCart(cartEntity);
    }

    /**
     * update the count of a item
     * @param cartEntity
     * @return
     */
    @PutMapping(value = "update")
    public boolean updateCart(CartEntity cartEntity){
        return cartService.updateCart(cartEntity);
    }
}
