package com.ss.android.lark.locationmessage.ui.navigation;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class NavigateView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NavigateView f105758a;

    @Override // butterknife.Unbinder
    public void unbind() {
        NavigateView navigateView = this.f105758a;
        if (navigateView != null) {
            this.f105758a = null;
            navigateView.mIvBack = null;
            navigateView.mIvMore = null;
            navigateView.mContainerLayout = null;
            navigateView.mIvLocatePosition = null;
            navigateView.mTvNavigateTitle = null;
            navigateView.mTvNavigateDesc = null;
            navigateView.mIvGoToNavigate = null;
            navigateView.mViewTitleBar = null;
            navigateView.mBottomLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NavigateView_ViewBinding(NavigateView navigateView, View view) {
        this.f105758a = navigateView;
        navigateView.mIvBack = (ImageView) Utils.findRequiredViewAsType(view, R.id.message_location_iv_back, "field 'mIvBack'", ImageView.class);
        navigateView.mIvMore = (ImageView) Utils.findRequiredViewAsType(view, R.id.message_location_iv_more, "field 'mIvMore'", ImageView.class);
        navigateView.mContainerLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.location_ll_map_container, "field 'mContainerLayout'", LinearLayout.class);
        navigateView.mIvLocatePosition = (ImageView) Utils.findRequiredViewAsType(view, R.id.location_iv_locate_position, "field 'mIvLocatePosition'", ImageView.class);
        navigateView.mTvNavigateTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.location_tv_navigate_title, "field 'mTvNavigateTitle'", TextView.class);
        navigateView.mTvNavigateDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.location_tv_navigate_desc, "field 'mTvNavigateDesc'", TextView.class);
        navigateView.mIvGoToNavigate = (ImageView) Utils.findRequiredViewAsType(view, R.id.location_iv_go_to_navigate, "field 'mIvGoToNavigate'", ImageView.class);
        navigateView.mViewTitleBar = Utils.findRequiredView(view, R.id.message_location_title_bar, "field 'mViewTitleBar'");
        navigateView.mBottomLayout = Utils.findRequiredView(view, R.id.location_message_bottom_layout, "field 'mBottomLayout'");
    }
}
