package com.hector.movieapp.data.source;

import android.support.annotation.NonNull;

import com.hector.movieapp.data.Movie;

import java.util.List;

/**
 * Created by hector on 4/15/17.
 */
public interface MoviesDataSource {

    interface LoadMoviesCallback{

        void pmDataNotAvailable();

        void onMoviesLoaded(List<Movie> movies);
    }

    interface GetMovieCallBack {

        void onDataNotAvailable();

        void onMovieLoaded(Movie movie);
    }

    void getMovie(@NonNull String movieId, @NonNull GetMovieCallBack callBack);

    void getMovies(@NonNull LoadMoviesCallback callback);

    void refreshMovies();

    void removeMovie(@NonNull String movieId);

    void saveMovie(@NonNull Movie movie);
}
