package com.ss.android.lark.feed.app.delayed.mvp;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.view.DesktopSecondaryTitleView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public class DelayedFeedView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DelayedFeedView f96189a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DelayedFeedView delayedFeedView = this.f96189a;
        if (delayedFeedView != null) {
            this.f96189a = null;
            delayedFeedView.mTitleBar = null;
            delayedFeedView.mDesktopTitleBar = null;
            delayedFeedView.mDelayedFeedRV = null;
            delayedFeedView.mContentFl = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DelayedFeedView_ViewBinding(DelayedFeedView delayedFeedView, View view) {
        this.f96189a = delayedFeedView;
        delayedFeedView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.common_title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        delayedFeedView.mDesktopTitleBar = (DesktopSecondaryTitleView) Utils.findRequiredViewAsType(view, R.id.desktop_title_bar, "field 'mDesktopTitleBar'", DesktopSecondaryTitleView.class);
        delayedFeedView.mDelayedFeedRV = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.box_feed_rv, "field 'mDelayedFeedRV'", CommonRecyclerView.class);
        delayedFeedView.mContentFl = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.content_fl, "field 'mContentFl'", ViewGroup.class);
    }
}
