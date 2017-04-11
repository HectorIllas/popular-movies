package com.hector.movieapp.data.dummy;

import com.hector.movieapp.data.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hector on 4/10/17.
 */

public class DummyMovies {
    private static final int COUNT = 25;

    public static final List<Movie> MOVIES = new ArrayList<Movie>();
    public static final Map<String, Movie> MOVIE_MAP = new HashMap<String, Movie>();

    static {
        for (int i = 1; i <= COUNT; i++) {
            addMovie(createDummyMovie(i));
        }
    }

    private static void addMovie(Movie dummyMovie) {
        MOVIES.add(dummyMovie);
        MOVIE_MAP.put(dummyMovie.getId(), dummyMovie);
    }

    private static Movie createDummyMovie(int position) {
        return new Movie(String.valueOf(position), "Movie Title " + position, "Poster " + position);
    }

}
