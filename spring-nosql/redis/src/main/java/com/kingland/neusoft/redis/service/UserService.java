package com.kingland.neusoft.redis.service;

import com.kingland.neusoft.redis.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(int id);

    User addUser(User user);

    User updateUser(User user) throws Exception;
}
