package com.ss.android.lark.feed.app.menu;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class FeedMenuView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedMenuView f96528a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FeedMenuView feedMenuView = this.f96528a;
        if (feedMenuView != null) {
            this.f96528a = null;
            feedMenuView.mDrawerFilterRV = null;
            feedMenuView.mFeedTypeRV = null;
            feedMenuView.mFeedTypeDrawer = null;
            feedMenuView.mBackGrayView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedMenuView_ViewBinding(FeedMenuView feedMenuView, View view) {
        this.f96528a = feedMenuView;
        feedMenuView.mDrawerFilterRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.filter_list, "field 'mDrawerFilterRV'", RecyclerView.class);
        feedMenuView.mFeedTypeRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.feed_type_list, "field 'mFeedTypeRV'", RecyclerView.class);
        feedMenuView.mFeedTypeDrawer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.feed_type_drawer, "field 'mFeedTypeDrawer'", ViewGroup.class);
        feedMenuView.mBackGrayView = view.findViewById(R.id.gray_layer);
    }
}
