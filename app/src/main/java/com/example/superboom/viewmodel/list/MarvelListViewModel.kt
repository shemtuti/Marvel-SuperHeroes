package com.example.superboom.viewmodel.list

import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import androidx.paging.RxPagedListBuilder
import com.example.superboom.data.MarvelCharacters
import com.example.superboom.network.MarvelApi
import com.example.superboom.paging.HeroesDataSourceFactory
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MarvelListViewModel : ViewModel() {
    var characterList: Observable<PagedList<MarvelCharacters>>
    private val compositeDisposable = CompositeDisposable()
    private val pageSize = 20

    private val sourceFactory: HeroesDataSourceFactory =
        HeroesDataSourceFactory(compositeDisposable, MarvelApi.getService())

    init {

        val config = PagedList.Config.Builder()
            .setPageSize(pageSize)
            .setInitialLoadSizeHint(pageSize * 2)
            .setPrefetchDistance(10)
            .setEnablePlaceholders(false)
            .build()

        characterList = RxPagedListBuilder(sourceFactory, config)
            .setFetchScheduler(Schedulers.io())
            .buildObservable()
            .cache()
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}
