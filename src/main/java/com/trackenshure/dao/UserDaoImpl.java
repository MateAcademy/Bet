package com.trackenshure.dao;

import com.trackenshure.model.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
//import javax.persistence.TypedQuery;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
//@Primary
@Repository
public class UserDaoImpl implements UserDao{

    //private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void add(User user) {
 //       sessionFactory.openSession().save(user);
    }

    @Override
    public List<User> listUsers() {
//        TypeQuery<User> query = sessionFactory.openSession()
//                .createQuery("from User", User.class);
//        return query.getResultList();
        return null;
    }
}
