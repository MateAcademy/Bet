package com.trackenshure.service.impl;

import com.trackenshure.dao.MovieDao;
import com.trackenshure.model.Movie;
import com.trackenshure.service.MovieService;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDao movieDao;
    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public List<Movie> getAll() {
        return movieDao.getAll();
    }
}
