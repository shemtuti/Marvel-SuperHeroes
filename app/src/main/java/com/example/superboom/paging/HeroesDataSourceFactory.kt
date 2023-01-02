package com.example.superboom.paging

import androidx.paging.DataSource
import com.example.superboom.data.MarvelCharacters
import com.example.superboom.network.MarvelApi
import io.reactivex.disposables.CompositeDisposable

class HeroesDataSourceFactory(private val compositeDisposable: CompositeDisposable, private val marvelApi: MarvelApi) : DataSource.Factory<Int, MarvelCharacters>() {

    override fun create(): DataSource<Int, MarvelCharacters> {
        return HeroesDataSource(compositeDisposable,marvelApi)
    }
}