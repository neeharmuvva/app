package com.neehar.app.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neehar.app.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
