package com.example.superboom.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0014\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/superboom/ui/adapter/MarvelRecyclerViewAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/example/superboom/data/MarvelCharacters;", "Lcom/example/superboom/ui/adapter/MarvelRecyclerViewAdapter$MarvelListViewHolder;", "()V", "mItemClickListener", "Lcom/example/superboom/ui/adapter/MarvelRecyclerViewAdapter$ItemClickListener;", "addItemClickListener", "", "listener", "clickListener", "character", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ItemClickListener", "MarvelListViewHolder", "app_debug"})
public final class MarvelRecyclerViewAdapter extends androidx.paging.PagedListAdapter<com.example.superboom.data.MarvelCharacters, com.example.superboom.ui.adapter.MarvelRecyclerViewAdapter.MarvelListViewHolder> {
    private com.example.superboom.ui.adapter.MarvelRecyclerViewAdapter.ItemClickListener mItemClickListener;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.superboom.ui.adapter.MarvelRecyclerViewAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.superboom.data.MarvelCharacters> characterDiff = null;
    
    public MarvelRecyclerViewAdapter() {
        super(null);
    }
    
    public final void addItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.superboom.ui.adapter.MarvelRecyclerViewAdapter.ItemClickListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.superboom.ui.adapter.MarvelRecyclerViewAdapter.MarvelListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.superboom.ui.adapter.MarvelRecyclerViewAdapter.MarvelListViewHolder holder, int position) {
    }
    
    private final void clickListener(com.example.superboom.data.MarvelCharacters character) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/example/superboom/ui/adapter/MarvelRecyclerViewAdapter$MarvelListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imgThumbnail", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImgThumbnail", "()Landroid/widget/ImageView;", "lnHero", "Landroid/widget/LinearLayout;", "getLnHero", "()Landroid/widget/LinearLayout;", "tvDescription", "Landroid/widget/TextView;", "getTvDescription", "()Landroid/widget/TextView;", "tvName", "getTvName", "app_debug"})
    public static final class MarvelListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView imgThumbnail = null;
        private final android.widget.TextView tvName = null;
        private final android.widget.TextView tvDescription = null;
        private final android.widget.LinearLayout lnHero = null;
        
        public MarvelListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.ImageView getImgThumbnail() {
            return null;
        }
        
        public final android.widget.TextView getTvName() {
            return null;
        }
        
        public final android.widget.TextView getTvDescription() {
            return null;
        }
        
        public final android.widget.LinearLayout getLnHero() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/superboom/ui/adapter/MarvelRecyclerViewAdapter$ItemClickListener;", "", "onItemClick", "", "event", "Lcom/example/superboom/data/MarvelCharacters;", "app_debug"})
    public static abstract interface ItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.Nullable()
        com.example.superboom.data.MarvelCharacters event);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/superboom/ui/adapter/MarvelRecyclerViewAdapter$Companion;", "", "()V", "characterDiff", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/superboom/data/MarvelCharacters;", "getCharacterDiff", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.superboom.data.MarvelCharacters> getCharacterDiff() {
            return null;
        }
    }
}