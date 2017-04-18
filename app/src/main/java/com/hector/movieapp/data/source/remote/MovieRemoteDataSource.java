package com.hector.movieapp.data.source.remote;

import android.support.annotation.NonNull;

import com.hector.movieapp.data.Movie;
import com.hector.movieapp.data.source.MoviesDataSource;

/**
 * Created by hector on 4/15/17.
 */

public class MovieRemoteDataSource implements MoviesDataSource {
    @Override
    public void getMovie(@NonNull String movieId, @NonNull GetMovieCallBack callBack) {

    }

    @Override
    public void getMovies(@NonNull LoadMoviesCallback callback) {

    }

    @Override
    public void refreshMovies() {

    }

    @Override
    public void removeMovie(@NonNull String movieId) {

    }

    @Override
    public void saveMovie(@NonNull Movie movie) {

    }
}
