package org.eric.ssm.service.impl;

import org.eric.ssm.dao.UserDao;
import org.eric.ssm.dao.entity.User;
import org.eric.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getUsers() {
        return userDao.findAllUsers();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public User insertUser(User user) {
        userDao.insertUser(user);
        return user;
    }
}
