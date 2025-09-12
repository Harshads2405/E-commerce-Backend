package com.harshad.service;


import com.harshad.exception.ProductException;
import com.harshad.model.Rating;
import com.harshad.model.User;
import com.harshad.request.RatingRequest;

import java.util.List;

public interface RatingService {

    public Rating createRating(RatingRequest req, User user) throws ProductException;

    public List<Rating> getProductsRating(Long productId);
}