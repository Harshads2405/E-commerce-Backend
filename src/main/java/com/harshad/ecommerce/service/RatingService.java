package com.harshad.ecommerce.service;

import com.harshad.ecommerce.exception.ProductException;
import com.harshad.ecommerce.model.Rating;
import com.harshad.ecommerce.model.User;
import com.harshad.ecommerce.request.RatingRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    Rating createRating(RatingRequest req, User user) throws ProductException;

    List<Rating> getProductsRating(Long productId);
}
