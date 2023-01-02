package com.example.superboom.paging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJL\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001dH\u0002J*\u0010\u001e\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001dH\u0016J*\u0010!\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001dH\u0016J*\u0010\"\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001bH\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/example/superboom/paging/HeroesDataSource;", "Landroidx/paging/PageKeyedDataSource;", "", "Lcom/example/superboom/data/MarvelCharacters;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "marvelApi", "Lcom/example/superboom/network/MarvelApi;", "(Lio/reactivex/disposables/CompositeDisposable;Lcom/example/superboom/network/MarvelApi;)V", "apikey", "", "getApikey", "()Ljava/lang/String;", "setApikey", "(Ljava/lang/String;)V", "hash", "getHash", "setHash", "ts", "getTs", "setTs", "createObservable", "", "requestedPage", "adjacentPage", "requestedLoadSize", "initialCallback", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "callback", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadAfter", "params", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "loadBefore", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "app_debug"})
public final class HeroesDataSource extends androidx.paging.PageKeyedDataSource<java.lang.Integer, com.example.superboom.data.MarvelCharacters> {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final com.example.superboom.network.MarvelApi marvelApi = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ts;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apikey = "063a6d6037d47e442ee28f91d4f287ea";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String hash;
    
    public HeroesDataSource(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.example.superboom.network.MarvelApi marvelApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTs() {
        return null;
    }
    
    public final void setTs(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApikey() {
        return null;
    }
    
    public final void setApikey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHash() {
        return null;
    }
    
    public final void setHash(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, com.example.superboom.data.MarvelCharacters> callback) {
    }
    
    @java.lang.Override()
    public void loadAfter(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.example.superboom.data.MarvelCharacters> callback) {
    }
    
    @java.lang.Override()
    public void loadBefore(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.example.superboom.data.MarvelCharacters> callback) {
    }
    
    private final void createObservable(int requestedPage, int adjacentPage, int requestedLoadSize, androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, com.example.superboom.data.MarvelCharacters> initialCallback, androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.example.superboom.data.MarvelCharacters> callback) {
    }
}