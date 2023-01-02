package com.example.superboom;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.superboom.databinding.ActivityHeroDetailsBindingImpl;
import com.example.superboom.databinding.ActivityImageViewBindingImpl;
import com.example.superboom.databinding.ActivityMarvelListBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYHERODETAILS = 1;

  private static final int LAYOUT_ACTIVITYIMAGEVIEW = 2;

  private static final int LAYOUT_ACTIVITYMARVELLIST = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.superboom.R.layout.activity_hero_details, LAYOUT_ACTIVITYHERODETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.superboom.R.layout.activity_image_view, LAYOUT_ACTIVITYIMAGEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.superboom.R.layout.activity_marvel_list, LAYOUT_ACTIVITYMARVELLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYHERODETAILS: {
          if ("layout/activity_hero_details_0".equals(tag)) {
            return new ActivityHeroDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_hero_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYIMAGEVIEW: {
          if ("layout/activity_image_view_0".equals(tag)) {
            return new ActivityImageViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_image_view is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMARVELLIST: {
          if ("layout/activity_marvel_list_0".equals(tag)) {
            return new ActivityMarvelListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_marvel_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_hero_details_0", com.example.superboom.R.layout.activity_hero_details);
      sKeys.put("layout/activity_image_view_0", com.example.superboom.R.layout.activity_image_view);
      sKeys.put("layout/activity_marvel_list_0", com.example.superboom.R.layout.activity_marvel_list);
    }
  }
}
