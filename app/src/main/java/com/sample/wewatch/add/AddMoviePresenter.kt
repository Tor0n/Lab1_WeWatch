package com.sample.wewatch.add

import com.sample.wewatch.model.LocalDataSource
import com.sample.wewatch.model.Movie

class AddMoviePresenter(
    private var viewInterface: AddMovieContract.ViewInterface,
    private var dataSource: LocalDataSource
) : AddMovieContract.PresenterInterface {
    override fun addMovie(
        title: String,
        releaseDate: String,
        posterPath: String) {
        //1
        if (title.isEmpty()) {
            viewInterface.displayError ("Название фильма не может быть пустым")
        } else {
            //2
            //val movie = Movie(title, releaseDate, posterPath)
            val movie = Movie(id = null,imdbID = null, title, posterPath,overview = null, releaseDate, watched = false)
            dataSource.insert(movie)
            viewInterface.returnToMain()
        }

    }
}