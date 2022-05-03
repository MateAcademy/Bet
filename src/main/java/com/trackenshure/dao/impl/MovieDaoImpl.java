package com.trackenshure.dao.impl;

import com.trackenshure.util.HibernateUtil;
import com.trackenshure.dao.MovieDao;
import com.trackenshure.lib.Dao;
import com.trackenshure.model.Movie;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Dao
public class MovieDaoImpl implements MovieDao {

    //private static final Logger LOGGER = Logger.getLogger(MovieDaoImpl.class);


    //Please add the Hibernate based implementation;

    @Override
    public Movie add(Movie movie) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Long itemId = (Long)session.save(movie);
            transaction.commit();
//            movie.setId(itemId);
            return movie;
        }catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't insert Movie entity", e);
        }
    }

    @Override
    public List<Movie> getAll() {
        //HQL
        //CriteriaQuery

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();

        }catch (Exception e) {

        }
        return Collections.EMPTY_LIST;
    }
}
