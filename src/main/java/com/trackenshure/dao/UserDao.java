package com.trackenshure.dao;

import com.trackenshure.model.User;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
public interface UserDao{

    List<User> getAll();
    void add(User user);
}
