package com.ss.android.lark.threadtab.view.recommendgroup;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.threadwindow.view.widget.SupportOverlapViewGroup;

public class RecommendGroupHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecommendGroupHolder f138376a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RecommendGroupHolder recommendGroupHolder = this.f138376a;
        if (recommendGroupHolder != null) {
            this.f138376a = null;
            recommendGroupHolder.mTheatChatNameTv = null;
            recommendGroupHolder.mThreadChatAvatarIv = null;
            recommendGroupHolder.mTopicGroupFl = null;
            recommendGroupHolder.mHeaderBackground = null;
            recommendGroupHolder.mRelatedUsersLayout = null;
            recommendGroupHolder.mTvGroupNum = null;
            recommendGroupHolder.mBtnJoinGroup = null;
            recommendGroupHolder.mProgressbar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecommendGroupHolder_ViewBinding(RecommendGroupHolder recommendGroupHolder, View view) {
        this.f138376a = recommendGroupHolder;
        recommendGroupHolder.mTheatChatNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_topic_group_name, "field 'mTheatChatNameTv'", TextView.class);
        recommendGroupHolder.mThreadChatAvatarIv = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.iv_topic_group_avatar, "field 'mThreadChatAvatarIv'", LKUIRoundedImageView.class);
        recommendGroupHolder.mTopicGroupFl = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.fl_topic_group, "field 'mTopicGroupFl'", FrameLayout.class);
        recommendGroupHolder.mHeaderBackground = (RoundedImageView) Utils.findRequiredViewAsType(view, R.id.header_background, "field 'mHeaderBackground'", RoundedImageView.class);
        recommendGroupHolder.mRelatedUsersLayout = (SupportOverlapViewGroup) Utils.findRequiredViewAsType(view, R.id.related_user_avatars, "field 'mRelatedUsersLayout'", SupportOverlapViewGroup.class);
        recommendGroupHolder.mTvGroupNum = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_topic_group_num, "field 'mTvGroupNum'", TextView.class);
        recommendGroupHolder.mBtnJoinGroup = (LKUIButton) Utils.findRequiredViewAsType(view, R.id.btn_join_group, "field 'mBtnJoinGroup'", LKUIButton.class);
        recommendGroupHolder.mProgressbar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.progressbar_loading, "field 'mProgressbar'", ProgressBar.class);
    }
}
