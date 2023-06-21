package com.taskmanagement.taskmanagement.Service;

import com.taskmanagement.taskmanagement.Model.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public interface UserCacheServiceImpl extends UserCacheService{
    @Override
    @Cacheable(value = "users", key = "#id")
    public User getUserById(String id) {
        // Implementation for retrieving a user from the database
    }

    @Override
    @CacheEvict(value = "users", key = "#user.id")
    public User updateUser(User user) {
        // Implementation for updating a user in the database
    }

    // Other methods for caching user data
}

