package com.example.superboom.viewmodel.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0014R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/superboom/viewmodel/list/MarvelListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "characterList", "Lio/reactivex/Observable;", "Landroidx/paging/PagedList;", "Lcom/example/superboom/data/MarvelCharacters;", "getCharacterList", "()Lio/reactivex/Observable;", "setCharacterList", "(Lio/reactivex/Observable;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "pageSize", "", "sourceFactory", "Lcom/example/superboom/paging/HeroesDataSourceFactory;", "onCleared", "", "app_debug"})
public final class MarvelListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.Observable<androidx.paging.PagedList<com.example.superboom.data.MarvelCharacters>> characterList;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final int pageSize = 20;
    private final com.example.superboom.paging.HeroesDataSourceFactory sourceFactory = null;
    
    public MarvelListViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<androidx.paging.PagedList<com.example.superboom.data.MarvelCharacters>> getCharacterList() {
        return null;
    }
    
    public final void setCharacterList(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<androidx.paging.PagedList<com.example.superboom.data.MarvelCharacters>> p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}