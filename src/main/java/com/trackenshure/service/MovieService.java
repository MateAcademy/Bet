package com.trackenshure.service;

import com.trackenshure.model.Movie;

import java.util.List;

public interface MovieService {

    Movie add(Movie movie);
    List<Movie> getAll();

}
