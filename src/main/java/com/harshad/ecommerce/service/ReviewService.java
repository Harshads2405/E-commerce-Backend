package com.harshad.ecommerce.service;

import com.harshad.ecommerce.exception.ProductException;
import com.harshad.ecommerce.model.Review;
import com.harshad.ecommerce.model.User;
import com.harshad.ecommerce.request.ReviewRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {
    Review createReview(ReviewRequest req, User user) throws ProductException;

    List<Review> getAllReview(Long productId);
}
