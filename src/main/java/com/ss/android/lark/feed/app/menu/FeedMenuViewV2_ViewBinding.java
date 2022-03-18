package com.ss.android.lark.feed.app.menu;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class FeedMenuViewV2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedMenuViewV2 f96527a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FeedMenuViewV2 feedMenuViewV2 = this.f96527a;
        if (feedMenuViewV2 != null) {
            this.f96527a = null;
            feedMenuViewV2.mDrawerFilterRV = null;
            feedMenuViewV2.mFeedTypeRV = null;
            feedMenuViewV2.mFeedTypeDrawer = null;
            feedMenuViewV2.mBackGrayView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedMenuViewV2_ViewBinding(FeedMenuViewV2 feedMenuViewV2, View view) {
        this.f96527a = feedMenuViewV2;
        feedMenuViewV2.mDrawerFilterRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.filter_list, "field 'mDrawerFilterRV'", RecyclerView.class);
        feedMenuViewV2.mFeedTypeRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.feed_type_list, "field 'mFeedTypeRV'", RecyclerView.class);
        feedMenuViewV2.mFeedTypeDrawer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.feed_type_drawer, "field 'mFeedTypeDrawer'", ViewGroup.class);
        feedMenuViewV2.mBackGrayView = Utils.findRequiredView(view, R.id.gray_layer, "field 'mBackGrayView'");
    }
}
