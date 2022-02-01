package com.trackenshure.dao;

import com.trackenshure.model.Movie;

import java.util.List;

public interface MovieDao {
    Movie add(Movie movie);

    List<Movie> getAll();

    //@Dao
    class MovieDaoImpl {
        //private final static Logger LOGGER = Logger.getLogger(MovieDaoImpl.class);

        //Please add the Hibernate based implementation;
    }
}
