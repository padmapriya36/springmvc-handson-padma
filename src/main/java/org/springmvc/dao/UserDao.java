package org.springmvc.dao;

import org.springmvc.model.Login;
import org.springmvc.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

  int register(User user);

  User validateUser(Login login);

  User getUser(String username);
}
