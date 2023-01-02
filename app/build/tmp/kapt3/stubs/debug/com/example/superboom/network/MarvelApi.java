package com.example.superboom.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ=\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nH\'\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/example/superboom/network/MarvelApi;", "", "allCharacters", "Lio/reactivex/Observable;", "Lcom/example/superboom/network/response/Response;", "ts", "", "apiKey", "hash", "offset", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/Observable;", "Companion", "app_debug"})
public abstract interface MarvelApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.superboom.network.MarvelApi.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "v1/public/characters")
    public abstract io.reactivex.Observable<com.example.superboom.network.response.Response> allCharacters(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ts")
    java.lang.String ts, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "hash")
    java.lang.String hash, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/superboom/network/MarvelApi$Companion;", "", "()V", "getService", "Lcom/example/superboom/network/MarvelApi;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.superboom.network.MarvelApi getService() {
            return null;
        }
    }
}