package com.example.superboom.ui.activity.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/example/superboom/ui/activity/main/MarvelListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/superboom/ui/adapter/MarvelRecyclerViewAdapter$ItemClickListener;", "()V", "TAG", "", "binding", "Lcom/example/superboom/databinding/ActivityMarvelListBinding;", "marvelRecyclerViewAdapter", "Lcom/example/superboom/ui/adapter/MarvelRecyclerViewAdapter;", "getMarvelRecyclerViewAdapter", "()Lcom/example/superboom/ui/adapter/MarvelRecyclerViewAdapter;", "marvelRecyclerViewAdapter$delegate", "Lkotlin/Lazy;", "recyclerState", "Landroid/os/Parcelable;", "viewModel", "Lcom/example/superboom/viewmodel/list/MarvelListViewModel;", "getViewModel", "()Lcom/example/superboom/viewmodel/list/MarvelListViewModel;", "viewModel$delegate", "initLayout", "", "observeList", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "event", "Lcom/example/superboom/data/MarvelCharacters;", "app_debug"})
public final class MarvelListActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.superboom.ui.adapter.MarvelRecyclerViewAdapter.ItemClickListener {
    private final java.lang.String TAG = "MarvelListActivity";
    private com.example.superboom.databinding.ActivityMarvelListBinding binding;
    private android.os.Parcelable recyclerState;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy marvelRecyclerViewAdapter$delegate = null;
    
    public MarvelListActivity() {
        super();
    }
    
    private final com.example.superboom.viewmodel.list.MarvelListViewModel getViewModel() {
        return null;
    }
    
    private final com.example.superboom.ui.adapter.MarvelRecyclerViewAdapter getMarvelRecyclerViewAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initLayout() {
    }
    
    private final void observeList() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.Nullable()
    com.example.superboom.data.MarvelCharacters event) {
    }
}