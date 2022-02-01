package com.trackenshure;

import com.trackenshure.model.Movie;
import com.trackenshure.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("com.trackenshure");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        movieService.getAll().forEach(System.out::println);

        // Add a new Movie
        Movie movie = new Movie();
        movie.setTitle("Fast and Furious");
        movie = movieService.add(movie);

        movieService.getAll().forEach(System.out::println);
    }
}
