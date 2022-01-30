package com.trackenshure.service;

import com.trackenshure.model.User;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
public interface UserService {
    void add(User user);

    List<User> listUsers();
}
