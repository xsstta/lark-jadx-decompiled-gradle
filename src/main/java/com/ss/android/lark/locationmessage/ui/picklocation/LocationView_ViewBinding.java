package com.ss.android.lark.locationmessage.ui.picklocation;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.locationmessage.widget.LoadingView;
import com.ss.android.lark.locationmessage.widget.SearchBar;
import com.ss.android.lark.ui.CommonTitleBar;

public class LocationView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LocationView f105825a;

    @Override // butterknife.Unbinder
    public void unbind() {
        LocationView locationView = this.f105825a;
        if (locationView != null) {
            this.f105825a = null;
            locationView.mTitleBar = null;
            locationView.mSearchBar = null;
            locationView.mContentLayout = null;
            locationView.mMapContainerLayout = null;
            locationView.mContainerLayout = null;
            locationView.mIvLocationIcon = null;
            locationView.mNearByListView = null;
            locationView.mRecommendLayout = null;
            locationView.mRecommendListView = null;
            locationView.mIvLocatePosition = null;
            locationView.mNearbyLoading = null;
            locationView.mRecommendLoading = null;
            locationView.mRecommendLineView = null;
            locationView.mRecommendEmptyView = null;
            locationView.mAppBarLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LocationView_ViewBinding(LocationView locationView, View view) {
        this.f105825a = locationView;
        locationView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.location_title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        locationView.mSearchBar = (SearchBar) Utils.findRequiredViewAsType(view, R.id.search_bar, "field 'mSearchBar'", SearchBar.class);
        locationView.mContentLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.fl_set_location_map, "field 'mContentLayout'", RelativeLayout.class);
        locationView.mMapContainerLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.location_fl_map_container, "field 'mMapContainerLayout'", FrameLayout.class);
        locationView.mContainerLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.map_container, "field 'mContainerLayout'", LinearLayout.class);
        locationView.mIvLocationIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_location_icon, "field 'mIvLocationIcon'", ImageView.class);
        locationView.mNearByListView = (ListView) Utils.findRequiredViewAsType(view, R.id.lv_nearby, "field 'mNearByListView'", ListView.class);
        locationView.mRecommendLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.location_fl_recommend, "field 'mRecommendLayout'", FrameLayout.class);
        locationView.mRecommendListView = (ListView) Utils.findRequiredViewAsType(view, R.id.lv_recommend, "field 'mRecommendListView'", ListView.class);
        locationView.mIvLocatePosition = (ImageView) Utils.findRequiredViewAsType(view, R.id.location_iv_locate_position, "field 'mIvLocatePosition'", ImageView.class);
        locationView.mNearbyLoading = (LoadingView) Utils.findRequiredViewAsType(view, R.id.location_nearby_loading, "field 'mNearbyLoading'", LoadingView.class);
        locationView.mRecommendLoading = (LoadingView) Utils.findRequiredViewAsType(view, R.id.location_recommend_loading, "field 'mRecommendLoading'", LoadingView.class);
        locationView.mRecommendLineView = Utils.findRequiredView(view, R.id.location_line_recommend, "field 'mRecommendLineView'");
        locationView.mRecommendEmptyView = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.location_ll_empty_view, "field 'mRecommendEmptyView'", LinearLayout.class);
        locationView.mAppBarLayout = (AppBarLayout) Utils.findRequiredViewAsType(view, R.id.appbar, "field 'mAppBarLayout'", AppBarLayout.class);
    }
}
