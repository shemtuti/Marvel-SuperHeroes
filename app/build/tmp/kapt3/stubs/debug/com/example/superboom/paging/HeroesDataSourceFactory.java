package com.example.superboom.paging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/superboom/paging/HeroesDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/example/superboom/data/MarvelCharacters;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "marvelApi", "Lcom/example/superboom/network/MarvelApi;", "(Lio/reactivex/disposables/CompositeDisposable;Lcom/example/superboom/network/MarvelApi;)V", "create", "Landroidx/paging/DataSource;", "app_debug"})
public final class HeroesDataSourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, com.example.superboom.data.MarvelCharacters> {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final com.example.superboom.network.MarvelApi marvelApi = null;
    
    public HeroesDataSourceFactory(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.example.superboom.network.MarvelApi marvelApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, com.example.superboom.data.MarvelCharacters> create() {
        return null;
    }
}