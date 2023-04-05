package com.microservice16ae001.service;

import com.microservice16ae001.model.User;

import java.util.List;

public interface UserService {
    public User findUser(Integer id);
    public List<User> findAllUers();
}
