package com.harshad.service;

import com.harshad.exception.ProductException;
import com.harshad.model.Cart;
import com.harshad.model.User;
import com.harshad.request.AddItemRequest;


public interface CartService {

    public Cart createCart(User user);

    public String addCartItem(Long userId, AddItemRequest req) throws ProductException;

    public Cart findUserCart(Long userId);
}