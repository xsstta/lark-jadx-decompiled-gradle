package com.ss.android.lark.pin.impl.v3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.impl.view.SearchBarView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import com.ss.android.lark.widget.spin.SpinView;

public class ChatPinView2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChatPinView2 f128246a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ChatPinView2 chatPinView2 = this.f128246a;
        if (chatPinView2 != null) {
            this.f128246a = null;
            chatPinView2.mPinRV = null;
            chatPinView2.mSearchRV = null;
            chatPinView2.mSearchBarLayout = null;
            chatPinView2.mSearchBarCTL = null;
            chatPinView2.mTitleBar = null;
            chatPinView2.mRootView = null;
            chatPinView2.mContainer = null;
            chatPinView2.mEmptyView = null;
            chatPinView2.mSearchView = null;
            chatPinView2.mSearchET = null;
            chatPinView2.mSearchClearBtn = null;
            chatPinView2.mLoadingView = null;
            chatPinView2.mLoadingIcon = null;
            chatPinView2.mPlaceHolderView = null;
            chatPinView2.mDesktopAllPinTitleBar = null;
            chatPinView2.mDesktopAllPinAlertIcon = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChatPinView2_ViewBinding(ChatPinView2 chatPinView2, View view) {
        this.f128246a = chatPinView2;
        chatPinView2.mPinRV = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.rv_pin, "field 'mPinRV'", CommonRecyclerView.class);
        chatPinView2.mSearchRV = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.rv_search_pin, "field 'mSearchRV'", CommonRecyclerView.class);
        chatPinView2.mSearchBarLayout = (AppBarLayout) Utils.findRequiredViewAsType(view, R.id.search_bar_layout, "field 'mSearchBarLayout'", AppBarLayout.class);
        chatPinView2.mSearchBarCTL = (CollapsingToolbarLayout) Utils.findRequiredViewAsType(view, R.id.search_bar_CTL, "field 'mSearchBarCTL'", CollapsingToolbarLayout.class);
        chatPinView2.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        chatPinView2.mRootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.root_view, "field 'mRootView'", ViewGroup.class);
        chatPinView2.mContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.pin_container, "field 'mContainer'", ViewGroup.class);
        chatPinView2.mEmptyView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.empty_layout, "field 'mEmptyView'", ViewGroup.class);
        chatPinView2.mSearchView = (SearchBarView) Utils.findRequiredViewAsType(view, R.id.search_view, "field 'mSearchView'", SearchBarView.class);
        chatPinView2.mSearchET = (EditText) Utils.findRequiredViewAsType(view, R.id.search_ET, "field 'mSearchET'", EditText.class);
        chatPinView2.mSearchClearBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.search_clear_btn, "field 'mSearchClearBtn'", ImageView.class);
        chatPinView2.mLoadingView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.loading_layout, "field 'mLoadingView'", ViewGroup.class);
        chatPinView2.mLoadingIcon = (SpinView) Utils.findRequiredViewAsType(view, R.id.loading_icon, "field 'mLoadingIcon'", SpinView.class);
        chatPinView2.mPlaceHolderView = Utils.findRequiredView(view, R.id.place_holder, "field 'mPlaceHolderView'");
        chatPinView2.mDesktopAllPinTitleBar = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.all_pin_lkp_titlebar, "field 'mDesktopAllPinTitleBar'", ConstraintLayout.class);
        chatPinView2.mDesktopAllPinAlertIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_all_pin_alert, "field 'mDesktopAllPinAlertIcon'", ImageView.class);
    }
}
