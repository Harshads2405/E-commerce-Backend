package com.harshad.service;

import com.harshad.exception.CartItemException;
import com.harshad.exception.UserException;
import com.harshad.model.Cart;
import com.harshad.model.CartItem;
import com.harshad.model.Product;

public interface CartItemService
{
    public CartItem createCartItem(CartItem cartItem);

    public CartItem updateCartItem(Long userId,Long id,CartItem cartItem) throws CartItemException, UserException;

    public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);

    public void removecartItem(Long userId,Long cartItemId) throws CartItemException,UserException;

    public CartItem findCartItemById(Long cartItemId) throws CartItemException;
}