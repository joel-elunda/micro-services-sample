package com.microservice16ae001.controller;

import com.microservice16ae001.model.User;
import com.microservice16ae001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("/get_user")
public class UserController {

    @Autowired
    private UserService userService;

    @GET
    @RequestMapping("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getLibrary(@PathVariable("userId") String userId) {
        return userService.findUser(Integer.parseInt(userId));
    }

}
