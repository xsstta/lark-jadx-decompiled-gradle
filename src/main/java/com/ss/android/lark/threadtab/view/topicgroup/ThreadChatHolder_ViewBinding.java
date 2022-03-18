package com.ss.android.lark.threadtab.view.topicgroup;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;

public class ThreadChatHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ThreadChatHolder f138378a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ThreadChatHolder threadChatHolder = this.f138378a;
        if (threadChatHolder != null) {
            this.f138378a = null;
            threadChatHolder.mTheatChatNameTv = null;
            threadChatHolder.mThreadChatAvatarIv = null;
            threadChatHolder.mTopicGroupLl = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ThreadChatHolder_ViewBinding(ThreadChatHolder threadChatHolder, View view) {
        this.f138378a = threadChatHolder;
        threadChatHolder.mTheatChatNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_topic_group_name, "field 'mTheatChatNameTv'", TextView.class);
        threadChatHolder.mThreadChatAvatarIv = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.iv_topic_group_avatar, "field 'mThreadChatAvatarIv'", LKUIRoundedImageView.class);
        threadChatHolder.mTopicGroupLl = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cl_topic_group, "field 'mTopicGroupLl'", LinearLayout.class);
    }
}
