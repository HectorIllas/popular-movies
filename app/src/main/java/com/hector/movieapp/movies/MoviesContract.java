package com.hector.movieapp.movies;

import android.support.annotation.NonNull;

import com.hector.movieapp.BasePresenter;
import com.hector.movieapp.BaseView;
import com.hector.movieapp.data.Movie;

import java.util.List;

/**
 * This class specifies the contract between the view and the presenter.
 */
public interface MoviesContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

        void showMovies(List<Movie> movies);

        void showMovieDetailsUi(String movieId);
    }

    interface Presenter extends BasePresenter {

        void result(int requestCode, int resultCode);

        void loadMovies(boolean forceUpdate);

        void openMovieDetails(@NonNull Movie requestedMovie);
    }
}
