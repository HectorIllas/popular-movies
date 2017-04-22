package com.hector.movieapp.movies;

import android.support.annotation.NonNull;

import com.hector.movieapp.data.Movie;
import com.hector.movieapp.data.source.MoviesRepository;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by hector on 4/15/17.
 */

public class MoviesPresenter implements MoviesContract.Presenter {

    private final MoviesRepository moviesRepository;
    private final MoviesContract.View moviesView;
    private boolean firstLoad  = true;

    public MoviesPresenter(@NonNull MoviesRepository moviesRepository, @NonNull MoviesContract.View moviesView) {
        this.moviesRepository = checkNotNull(moviesRepository, "moviesRepository cannot be null");
        this.moviesView = checkNotNull(moviesView, "moviesView cannot be null");

        moviesView.setPresenter(this);
    }

    @Override
    public void result(int requestCode, int resultCode) {
        //If a favorite movie was successfully added, show a snackbar
        loadMovies();
    }

    @Override
    public void loadMovies(boolean forceUpdate) {

    }

    @Override
    public void openMovieDetails(@NonNull Movie requestedMovie) {

    }

    @Override
    public void start() {
        loadMovies(false);
    }
}
