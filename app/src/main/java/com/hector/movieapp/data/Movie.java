package com.hector.movieapp.data;

import android.support.annotation.NonNull;

import java.io.Serializable;

/**
 * Created by hector on 4/10/17.
 */

public final class Movie implements Serializable {
    private static final long serialVersionUID = -2299108695825123227L;

    private String id;
    private String title;
    private String overview;
    private String poster;
    private String releaseDate;
    private Double voteAverage;

    public Movie(String id, String title, String overview) {
        this.id = id;
        this.title = title;
        this.overview = overview;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }
}
