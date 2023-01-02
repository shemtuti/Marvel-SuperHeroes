package com.example.superboom.paging

import android.util.Log
import androidx.paging.PageKeyedDataSource
import com.example.superboom.data.MarvelCharacters
import com.example.superboom.network.MarvelApi
import com.example.superboom.util.Constants

import io.reactivex.disposables.CompositeDisposable

class HeroesDataSource(
    private val compositeDisposable: CompositeDisposable,
    private val marvelApi: MarvelApi
) : PageKeyedDataSource<Int, MarvelCharacters>() {

    var ts = Constants.timeStamp
    var apikey = Constants.API_KEY
    var hash = Constants.hash()

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, MarvelCharacters>
    ) {
        val numberOfItems = params.requestedLoadSize
        createObservable(0, 1, numberOfItems, callback, null)
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, MarvelCharacters>) {
        val page = params.key
        val numberOfItems = params.requestedLoadSize
        createObservable(page, page + 1, numberOfItems, null, callback)
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, MarvelCharacters>) {
        val page = params.key
        val numberOfItems = params.requestedLoadSize
        createObservable(page, page - 1, numberOfItems, null, callback)
    }


    private fun createObservable(requestedPage: Int,
                                 adjacentPage: Int,
                                 requestedLoadSize: Int,
                                 initialCallback: LoadInitialCallback<Int, MarvelCharacters>?,
                                 callback: LoadCallback<Int, MarvelCharacters>?) {
        compositeDisposable.add(
            marvelApi.allCharacters(ts,apikey,hash,requestedPage * requestedLoadSize)
                .subscribe(
                    { response ->
                        Log.d("HeroDataSource", "Loading page: $requestedPage")
                        initialCallback?.onResult(response.data.results, null, adjacentPage)
                        callback?.onResult(response.data.results, adjacentPage)
                    },
                    { t ->
                        Log.d("HeroDataSource", "Error loading page: $requestedPage", t)
                    }
                )
        );
    }
}