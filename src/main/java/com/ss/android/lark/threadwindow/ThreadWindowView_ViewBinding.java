package com.ss.android.lark.threadwindow;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import net.lucode.hackware.magicindicator.MagicIndicator;

public class ThreadWindowView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ThreadWindowView f138487a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ThreadWindowView threadWindowView = this.f138487a;
        if (threadWindowView != null) {
            this.f138487a = null;
            threadWindowView.mTitleBar = null;
            threadWindowView.mTitleBarLayout = null;
            threadWindowView.mFrameContainer = null;
            threadWindowView.mBannerView = null;
            threadWindowView.mWindowContainer = null;
            threadWindowView.mClAnnouncementView = null;
            threadWindowView.mIvGroupAvatar = null;
            threadWindowView.mTvGroupName = null;
            threadWindowView.mTvGroupIcon = null;
            threadWindowView.mTvGroupDesc = null;
            threadWindowView.mTvGroupNum = null;
            threadWindowView.mNumDescDivider = null;
            threadWindowView.mIvNewAnnounceIcon = null;
            threadWindowView.mTvNewAnnounce = null;
            threadWindowView.mFlTitleAnnounce = null;
            threadWindowView.mIvGroupAvatarBackground = null;
            threadWindowView.mTitleBarBackgroundView = null;
            threadWindowView.mTitleAnnounceLayout = null;
            threadWindowView.mFlTitleAnnounceBg = null;
            threadWindowView.mTopicViewPager = null;
            threadWindowView.mFilterTabBackground = null;
            threadWindowView.mShareGroupLayout = null;
            threadWindowView.mAppBarLayout = null;
            threadWindowView.mTlTopicIndicator = null;
            threadWindowView.mSecondToDivider = null;
            threadWindowView.mRLSecondLevelTab = null;
            threadWindowView.mFlSecondLevelTab = null;
            threadWindowView.mTlSecondLevelTopicIndicator = null;
            threadWindowView.mPostTopicLayout = null;
            threadWindowView.mPostTopicIv = null;
            threadWindowView.mCreateNewTopicLayout = null;
            threadWindowView.mCreateNewTopicText = null;
            threadWindowView.mCreateNewTopicCloseIv = null;
            threadWindowView.mGroupContentLayout = null;
            threadWindowView.mThreadDoneLayout = null;
            threadWindowView.mJoinTopicGroup = null;
            threadWindowView.mJoinTopicGroupBtn = null;
            threadWindowView.mJoinProgressBar = null;
            threadWindowView.mJoinTopicGroupLayout = null;
            threadWindowView.mJoinTopicGroupTip = null;
            threadWindowView.mSubscribeStatusIv = null;
            threadWindowView.mSubscribeTipIv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ThreadWindowView_ViewBinding(ThreadWindowView threadWindowView, View view) {
        this.f138487a = threadWindowView;
        threadWindowView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        threadWindowView.mTitleBarLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.fl_title_bar_layout, "field 'mTitleBarLayout'", ViewGroup.class);
        threadWindowView.mFrameContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.frame_container, "field 'mFrameContainer'", ViewGroup.class);
        threadWindowView.mBannerView = (UDNotice) Utils.findRequiredViewAsType(view, R.id.notice, "field 'mBannerView'", UDNotice.class);
        threadWindowView.mWindowContainer = Utils.findRequiredView(view, R.id.window_container, "field 'mWindowContainer'");
        threadWindowView.mClAnnouncementView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.view_announcement, "field 'mClAnnouncementView'", ViewGroup.class);
        threadWindowView.mIvGroupAvatar = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.iv_group_avatar, "field 'mIvGroupAvatar'", LKUIRoundedImageView.class);
        threadWindowView.mTvGroupName = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_name, "field 'mTvGroupName'", TextView.class);
        threadWindowView.mTvGroupIcon = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_icon, "field 'mTvGroupIcon'", TextView.class);
        threadWindowView.mTvGroupDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_desc, "field 'mTvGroupDesc'", TextView.class);
        threadWindowView.mTvGroupNum = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_num, "field 'mTvGroupNum'", TextView.class);
        threadWindowView.mNumDescDivider = Utils.findRequiredView(view, R.id.num_desc_divider, "field 'mNumDescDivider'");
        threadWindowView.mIvNewAnnounceIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_new_announce_icon, "field 'mIvNewAnnounceIcon'", ImageView.class);
        threadWindowView.mTvNewAnnounce = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_new_announce, "field 'mTvNewAnnounce'", TextView.class);
        threadWindowView.mFlTitleAnnounce = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.fl_title_announce, "field 'mFlTitleAnnounce'", ViewGroup.class);
        threadWindowView.mIvGroupAvatarBackground = Utils.findRequiredView(view, R.id.iv_group_avatar_background, "field 'mIvGroupAvatarBackground'");
        threadWindowView.mTitleBarBackgroundView = Utils.findRequiredView(view, R.id.titlebar_background, "field 'mTitleBarBackgroundView'");
        threadWindowView.mTitleAnnounceLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_title_announce, "field 'mTitleAnnounceLayout'", LinearLayout.class);
        threadWindowView.mFlTitleAnnounceBg = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.fl_title_announce_bg, "field 'mFlTitleAnnounceBg'", FrameLayout.class);
        threadWindowView.mTopicViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.vp_topics, "field 'mTopicViewPager'", ViewPager.class);
        threadWindowView.mFilterTabBackground = Utils.findRequiredView(view, R.id.filter_tab_background, "field 'mFilterTabBackground'");
        threadWindowView.mShareGroupLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_share_group, "field 'mShareGroupLayout'", ViewGroup.class);
        threadWindowView.mAppBarLayout = (AppBarLayout) Utils.findRequiredViewAsType(view, R.id.appbarlayout, "field 'mAppBarLayout'", AppBarLayout.class);
        threadWindowView.mTlTopicIndicator = (MagicIndicator) Utils.findRequiredViewAsType(view, R.id.tl_topic_indicator, "field 'mTlTopicIndicator'", MagicIndicator.class);
        threadWindowView.mSecondToDivider = Utils.findRequiredView(view, R.id.v_top_divider, "field 'mSecondToDivider'");
        threadWindowView.mRLSecondLevelTab = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.rl_second_level_tab, "field 'mRLSecondLevelTab'", RelativeLayout.class);
        threadWindowView.mFlSecondLevelTab = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.fl_second_level_tab, "field 'mFlSecondLevelTab'", FrameLayout.class);
        threadWindowView.mTlSecondLevelTopicIndicator = (MagicIndicator) Utils.findRequiredViewAsType(view, R.id.tl_second_level_indicator, "field 'mTlSecondLevelTopicIndicator'", MagicIndicator.class);
        threadWindowView.mPostTopicLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.post_topic_layout, "field 'mPostTopicLayout'", ViewGroup.class);
        threadWindowView.mPostTopicIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_post_topic, "field 'mPostTopicIv'", ImageView.class);
        threadWindowView.mCreateNewTopicLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.create_new_topic_layout, "field 'mCreateNewTopicLayout'", ViewGroup.class);
        threadWindowView.mCreateNewTopicText = (TextView) Utils.findRequiredViewAsType(view, R.id.create_new_topic_text, "field 'mCreateNewTopicText'", TextView.class);
        threadWindowView.mCreateNewTopicCloseIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.create_new_topic_close_iv, "field 'mCreateNewTopicCloseIv'", ImageView.class);
        threadWindowView.mGroupContentLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_group_content, "field 'mGroupContentLayout'", LinearLayout.class);
        threadWindowView.mThreadDoneLayout = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_thread_done, "field 'mThreadDoneLayout'", ImageView.class);
        threadWindowView.mJoinTopicGroup = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_join_topic_group, "field 'mJoinTopicGroup'", ViewGroup.class);
        threadWindowView.mJoinTopicGroupBtn = (LKUIButton) Utils.findRequiredViewAsType(view, R.id.btn_join_topic_group, "field 'mJoinTopicGroupBtn'", LKUIButton.class);
        threadWindowView.mJoinProgressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.progressbar_loading, "field 'mJoinProgressBar'", ProgressBar.class);
        threadWindowView.mJoinTopicGroupLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.join_topic_group_layout, "field 'mJoinTopicGroupLayout'", ViewGroup.class);
        threadWindowView.mJoinTopicGroupTip = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_join_topic_group_tip, "field 'mJoinTopicGroupTip'", TextView.class);
        threadWindowView.mSubscribeStatusIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_subscribe_status, "field 'mSubscribeStatusIv'", ImageView.class);
        threadWindowView.mSubscribeTipIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_subscribe_tip, "field 'mSubscribeTipIv'", ImageView.class);
    }
}
