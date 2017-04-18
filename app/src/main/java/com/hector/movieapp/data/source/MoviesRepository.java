package com.hector.movieapp.data.source;

import android.support.annotation.NonNull;

import com.hector.movieapp.data.Movie;

import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by hector on 4/15/17.
 */
public class MoviesRepository implements MoviesDataSource {

    private static MoviesRepository INSTANCE = null;
    private final MoviesDataSource movieRemoteDataSource;
    Map<String, Movie> cachedMovies;
    boolean isCahedDirty = false;

    public MoviesRepository(@NonNull MoviesDataSource movieRemoteDataSource) {
        this.movieRemoteDataSource = checkNotNull(movieRemoteDataSource);
    }

    public static MoviesRepository getInstance(MoviesDataSource movieRemoteDataSource) {
        if(INSTANCE == null) {
            INSTANCE = new MoviesRepository(movieRemoteDataSource);
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

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
