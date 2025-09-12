package com.harshad.ecommerce.service;

import com.harshad.ecommerce.model.OrderItem;
import org.springframework.stereotype.Service;

@Service
public interface OrderItemService {
    OrderItem createOrderItem(OrderItem orderItem);
}
