package com.microservice16ae001.service;

import com.microservice16ae001.model.User;
import com.microservice16ae001.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImplementation implements UserService {

    User user;

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unused")
    @Autowired
    private UserDAO userDAO;

    public UserServiceImplementation(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User findUser(Integer id) {
        return new User();
    }

    @Override
    public List<User> findAllUers() {
        List<User> users = (List<User>) findAllUers();
        return users;
    }
}
