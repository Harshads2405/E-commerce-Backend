package com.harshad.service;

import com.harshad.exception.ProductException;
import com.harshad.model.Review;
import com.harshad.model.User;
import com.harshad.request.ReviewRequest;

import java.util.List;

public interface ReviewService {

    public Review createReview(ReviewRequest req, User user) throws ProductException;
    public List<Review> getAllReview(Long productId);
}