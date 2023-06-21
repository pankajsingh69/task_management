package com.taskmanagement.taskmanagement.Service;

import com.taskmanagement.taskmanagement.Model.User;

import java.util.List;

public interface UserService {
        User createUser(User user);
        User updateUser(String id, User user);
        void deleteUser(String id);
        User getUserById(String id);
        List<User> getAllUsers();
}

