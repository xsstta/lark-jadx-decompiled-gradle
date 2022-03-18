package com.ss.android.lark.feed.app.conversationbox.mvp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.view.DesktopSecondaryTitleView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public class ConversationBoxView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ConversationBoxView f96070a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ConversationBoxView conversationBoxView = this.f96070a;
        if (conversationBoxView != null) {
            this.f96070a = null;
            conversationBoxView.mBoxLayout = null;
            conversationBoxView.mTitleBar = null;
            conversationBoxView.mBoxFeedRV = null;
            conversationBoxView.mContentFl = null;
            conversationBoxView.mDesktopTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ConversationBoxView_ViewBinding(ConversationBoxView conversationBoxView, View view) {
        this.f96070a = conversationBoxView;
        conversationBoxView.mBoxLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.conversation_box_layout, "field 'mBoxLayout'", LinearLayout.class);
        conversationBoxView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.common_title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        conversationBoxView.mBoxFeedRV = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.box_feed_rv, "field 'mBoxFeedRV'", CommonRecyclerView.class);
        conversationBoxView.mContentFl = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.content_fl, "field 'mContentFl'", ViewGroup.class);
        conversationBoxView.mDesktopTitleBar = (DesktopSecondaryTitleView) Utils.findRequiredViewAsType(view, R.id.desktop_title_bar, "field 'mDesktopTitleBar'", DesktopSecondaryTitleView.class);
    }
}
