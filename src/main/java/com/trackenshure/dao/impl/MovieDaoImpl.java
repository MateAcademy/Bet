package com.trackenshure.dao.impl;

import com.trackenshure.HibernateUtil;
import com.trackenshure.dao.MovieDao;
import com.trackenshure.model.Movie;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSeeeionFactory().openSession()) {
            transaction = session.beginTransaction();
            Long itemId = (Long)session.save(movie);
            transaction.commit();
            movie.setId(itemId);
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
        return Collections.EMPTY_LIST;
    }
}
