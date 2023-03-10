// Generated by data binding compiler. Do not edit!
package com.example.superboom.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.superboom.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMarvelListBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView recyclerMarvelList;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvLoading;

  protected ActivityMarvelListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar progressBar, RecyclerView recyclerMarvelList, Toolbar toolbar,
      TextView tvLoading) {
    super(_bindingComponent, _root, _localFieldCount);
    this.progressBar = progressBar;
    this.recyclerMarvelList = recyclerMarvelList;
    this.toolbar = toolbar;
    this.tvLoading = tvLoading;
  }

  @NonNull
  public static ActivityMarvelListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_marvel_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMarvelListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMarvelListBinding>inflateInternal(inflater, R.layout.activity_marvel_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMarvelListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_marvel_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMarvelListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMarvelListBinding>inflateInternal(inflater, R.layout.activity_marvel_list, null, false, component);
  }

  public static ActivityMarvelListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMarvelListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMarvelListBinding)bind(component, view, R.layout.activity_marvel_list);
  }
}
