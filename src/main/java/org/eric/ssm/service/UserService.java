package org.eric.ssm.service;

import org.eric.ssm.dao.entity.User;

import java.util.List;

public interface UserService {
    User getUser(int id);

    List<User> getUsers();

    User insertUser(User user);
}
