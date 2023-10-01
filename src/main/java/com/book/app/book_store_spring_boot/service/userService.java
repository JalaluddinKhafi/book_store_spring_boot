package com.book.app.book_store_spring_boot.service;

import com.book.app.book_store_spring_boot.entity.User;
import com.book.app.book_store_spring_boot.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    userRepository user_repository;

    public User  registerUser(User user){
       return user_repository.save(user);

    }
    public User findBuyUsername(String username){
        return user_repository.findByUserName(username);
    }
}
