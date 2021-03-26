package com.neehar.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.neehar.app.model.User;
import com.neehar.app.service.UserService;

@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public User addNewUser(User user) {
        mongoTemplate.save(user);
        return user;
    }
}
