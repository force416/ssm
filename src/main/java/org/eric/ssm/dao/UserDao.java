package org.eric.ssm.dao;

import org.eric.ssm.dao.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAllUsers();

    User getUserById(int id);

    int insertUser(User user);
}
