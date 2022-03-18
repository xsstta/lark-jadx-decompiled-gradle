package com.ss.android.lark.favorite.list;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public class FavoriteListView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FavoriteListView f95597a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FavoriteListView favoriteListView = this.f95597a;
        if (favoriteListView != null) {
            this.f95597a = null;
            favoriteListView.mTitleBar = null;
            favoriteListView.mRootView = null;
            favoriteListView.mSaveMessagWrapper = null;
            favoriteListView.mSaveItemsRv = null;
            favoriteListView.mPtrFrame = null;
            favoriteListView.mEmptyView = null;
            favoriteListView.mDesktopTitleStub = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FavoriteListView_ViewBinding(FavoriteListView favoriteListView, View view) {
        this.f95597a = favoriteListView;
        favoriteListView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        favoriteListView.mRootView = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.root_view, "field 'mRootView'", RelativeLayout.class);
        favoriteListView.mSaveMessagWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.save_message_wrapper, "field 'mSaveMessagWrapper'", LinearLayout.class);
        favoriteListView.mSaveItemsRv = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.save_message_rv, "field 'mSaveItemsRv'", CommonRecyclerView.class);
        favoriteListView.mPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.inbox_ptr_layout, "field 'mPtrFrame'", LKUIPtrClassicFrameLayout.class);
        favoriteListView.mEmptyView = Utils.findRequiredView(view, R.id.empty, "field 'mEmptyView'");
        favoriteListView.mDesktopTitleStub = (ViewStub) Utils.findOptionalViewAsType(view, R.id.desktop_title_stub, "field 'mDesktopTitleStub'", ViewStub.class);
    }
}
