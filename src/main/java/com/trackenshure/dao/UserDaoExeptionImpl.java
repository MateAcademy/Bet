package com.trackenshure.dao;

import com.trackenshure.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoExeptionImpl implements UserDao{
    @Override
    public void add(User user) {
        throw new RuntimeException("I am new implementation");
    }

    @Override
    public List<User> listUsers() {
        return null;
    }
}
