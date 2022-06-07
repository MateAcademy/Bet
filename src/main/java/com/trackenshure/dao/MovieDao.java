package com.trackenshure.dao;

import com.trackenshure.model.Movie;

import java.util.List;

public interface MovieDao {

    Movie add(Movie movie);
    List<Movie> getAll();

}
