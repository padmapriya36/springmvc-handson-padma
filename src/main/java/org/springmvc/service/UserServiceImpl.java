package org.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springmvc.dao.UserDao;
import org.springmvc.model.Login;
import org.springmvc.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

  public User getUser(String username) {
    return userDao.getUser(username);
  }

}
