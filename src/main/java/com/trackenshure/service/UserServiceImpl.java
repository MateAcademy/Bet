package com.trackenshure.service;

import com.trackenshure.dao.UserDao;
import com.trackenshure.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
