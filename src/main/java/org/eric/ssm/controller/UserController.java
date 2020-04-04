package org.eric.ssm.controller;

import org.eric.ssm.dao.entity.User;
import org.eric.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @GetMapping("")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("")
    public User addUser(@RequestBody User user) {
        return userService.insertUser(user);
    }
}
