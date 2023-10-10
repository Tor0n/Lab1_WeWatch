package com.sample.wewatch.search

import com.sample.wewatch.model.TmdbResponse

class SearchContract {
    interface PresenterInterface {
        fun getSearchResults(query: String)
        fun stop()
    }
    interface ViewInterface {
        fun displayResult(tmdbResponse: TmdbResponse)
        fun displayError(message: String)
    }
}