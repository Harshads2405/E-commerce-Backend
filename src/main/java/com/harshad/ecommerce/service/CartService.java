package com.harshad.ecommerce.service;

import com.harshad.ecommerce.exception.ProductException;
import com.harshad.ecommerce.model.Cart;
import com.harshad.ecommerce.model.User;
import com.harshad.ecommerce.request.AddItemRequest;
import org.springframework.stereotype.Service;

@Service
public interface CartService {
    Cart createCart(User user);

    String addCartItem(Long userId, AddItemRequest req) throws ProductException;

    Cart findUserCart(Long userId);
}
