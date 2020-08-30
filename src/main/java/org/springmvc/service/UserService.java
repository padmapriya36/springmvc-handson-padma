package org.springmvc.service;

import org.springmvc.model.Login;
import org.springmvc.model.User;

public interface UserService {

  int register(User user);

  User getUser(String username);

  User validateUser(Login login);
}
