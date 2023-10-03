package com.sample.wewatch.main

import com.sample.wewatch.model.Movie

class MainContract {
    //TODO: добавить методы интерфейса для Presenter
    interface PresenterInterface {
        fun getMyMoviesList()
        fun stop()
        fun onDeleteTapped(selectedMovies: HashSet<*>)
    }
    interface ViewInterface {
        fun displayMovies (movieList:List<Movie>)
        fun displayNoMovies ()
        fun displayMessage (message: String)
        fun displayError (message: String)
    }
}