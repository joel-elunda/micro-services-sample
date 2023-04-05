package com.microservice16ae001.repository;

import com.microservice16ae001.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, InternalError> {
    public User findUserById(Integer id);
}
