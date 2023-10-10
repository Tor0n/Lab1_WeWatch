package com.sample.wewatch.search

import com.sample.wewatch.model.RemoteDataSource

class SearchPresenter (
    private var viewInterface: SearchContract.ViewInterface,
    private var dataSource: RemoteDataSource):  SearchContract.PresenterInterface {
    private val TAG = "SearchPresenter"

    }