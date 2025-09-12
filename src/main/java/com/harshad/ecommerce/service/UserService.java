package com.harshad.ecommerce.service;

import com.harshad.ecommerce.exception.UserException;
import com.harshad.ecommerce.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findUserById(Long userId) throws UserException;

    User findUserProfileByJwt(String jwt) throws UserException;
}
