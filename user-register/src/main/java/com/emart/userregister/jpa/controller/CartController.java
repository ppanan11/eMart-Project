package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.entity.CartEntity;
import com.emart.userregister.jpa.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * get cart data by a given username
     * @param username
     * @return
     */
    @RequestMapping( value= "/cart",method = RequestMethod.GET)
    public List getCartByUser(@RequestParam("username") String username){
        return  cartService.findCartByUser(username);
    }

    /**
     * add a item to cart
     * @param cartEntity
     * @return
     */
    @RequestMapping(value = "/addcart",method = RequestMethod.POST)
    public CartEntity addToCart(@RequestBody CartEntity cartEntity){
        return cartService.addToCart(cartEntity);
    }

    /**
     * delete a item from cart
     * @param cartEntity
     * @return
     */
    @RequestMapping(value = "/deletecart",method = RequestMethod.DELETE)
    public boolean deleteFromCart(@RequestBody CartEntity cartEntity){
        return cartService.removeFromCart(cartEntity);
    }

    /**
     * update the count of a item
     * @param cartEntity
     * @return
     */
    @RequestMapping(value = "/updatecart",method = RequestMethod.PUT)
    public boolean updateCart(@RequestBody CartEntity cartEntity){
        return cartService.updateCart(cartEntity);
    }
}
