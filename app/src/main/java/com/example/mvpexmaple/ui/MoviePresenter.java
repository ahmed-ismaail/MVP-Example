package com.example.mvpexmaple.ui;

import com.example.mvpexmaple.model.MovieModel;

public class MoviePresenter {
    MovieView movieView;

    public MoviePresenter(MovieView movieView) {
        this.movieView = movieView;
    }

    public MovieModel getMovieModel(){
        return new MovieModel("Gladiator","1999","good Movie",1);
    }

    public void presenterGetMovieName(){
        movieView.getMovieName(getMovieModel().getName());
    }
}
