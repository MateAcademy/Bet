package com.trackenshure.dao;

import com.trackenshure.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add(User user) {

    }

    @Override
    public List<User> listUsers() {
        return null;
    }
}
