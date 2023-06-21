package com.taskmanagement.taskmanagement.Repository;

import com.taskmanagement.taskmanagement.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}

