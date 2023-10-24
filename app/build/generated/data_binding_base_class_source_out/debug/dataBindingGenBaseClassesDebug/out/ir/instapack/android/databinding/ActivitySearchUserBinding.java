// Generated by data binding compiler. Do not edit!
package ir.instapack.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ir.instapack.android.R;
import ir.instapack.android.services.searchUser.SearchUserViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySearchUserBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backgroundImage;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final ImageView icSearch;

  @NonNull
  public final FrameLayout loadingView;

  @NonNull
  public final TextView noItemExist;

  @NonNull
  public final RecyclerView recyclerViewSearchUsers;

  @NonNull
  public final EditText searchEditText;

  @NonNull
  public final LinearLayout searchLoadingView;

  @NonNull
  public final TextView searchResultsTitle;

  @Bindable
  protected SearchUserViewModel mViewModel;

  protected ActivitySearchUserBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView backgroundImage, CoordinatorLayout coordinatorLayout, ImageView icSearch,
      FrameLayout loadingView, TextView noItemExist, RecyclerView recyclerViewSearchUsers,
      EditText searchEditText, LinearLayout searchLoadingView, TextView searchResultsTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backgroundImage = backgroundImage;
    this.coordinatorLayout = coordinatorLayout;
    this.icSearch = icSearch;
    this.loadingView = loadingView;
    this.noItemExist = noItemExist;
    this.recyclerViewSearchUsers = recyclerViewSearchUsers;
    this.searchEditText = searchEditText;
    this.searchLoadingView = searchLoadingView;
    this.searchResultsTitle = searchResultsTitle;
  }

  public abstract void setViewModel(@Nullable SearchUserViewModel viewModel);

  @Nullable
  public SearchUserViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivitySearchUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_search_user, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySearchUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySearchUserBinding>inflateInternal(inflater, R.layout.activity_search_user, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySearchUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_search_user, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySearchUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySearchUserBinding>inflateInternal(inflater, R.layout.activity_search_user, null, false, component);
  }

  public static ActivitySearchUserBinding bind(@NonNull View view) {
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
  public static ActivitySearchUserBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySearchUserBinding)bind(component, view, R.layout.activity_search_user);
  }
}