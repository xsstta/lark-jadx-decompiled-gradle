package com.ss.android.lark.feed.app;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.view.InboxContainerView;

public class FeedListView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedListView f95762a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FeedListView feedListView = this.f95762a;
        if (feedListView != null) {
            this.f95762a = null;
            feedListView.mRootView = null;
            feedListView.mStatusBarBlur = null;
            feedListView.mStatusBarBlurV2 = null;
            feedListView.mMainContentContainer = null;
            feedListView.mInboxContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedListView_ViewBinding(FeedListView feedListView, View view) {
        this.f95762a = feedListView;
        feedListView.mRootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.feed_root_view, "field 'mRootView'", ViewGroup.class);
        feedListView.mStatusBarBlur = Utils.findRequiredView(view, R.id.status_blur, "field 'mStatusBarBlur'");
        feedListView.mStatusBarBlurV2 = Utils.findRequiredView(view, R.id.status_blur_v2, "field 'mStatusBarBlurV2'");
        feedListView.mMainContentContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.main_content, "field 'mMainContentContainer'", FrameLayout.class);
        feedListView.mInboxContainer = (InboxContainerView) Utils.findRequiredViewAsType(view, R.id.inbox_container, "field 'mInboxContainer'", InboxContainerView.class);
    }
}
