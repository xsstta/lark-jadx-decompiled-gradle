package com.ss.android.lark.threadtab.view.recommendgroup;

import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.ss.android.lark.threadwindow.view.widget.SupportOverlapViewGroup;

public class RecommendGroupHolder extends RecyclerView.ViewHolder {
    @BindView(7318)
    public LKUIButton mBtnJoinGroup;
    @BindView(7805)
    public RoundedImageView mHeaderBackground;
    @BindView(8450)
    public ProgressBar mProgressbar;
    @BindView(8539)
    public SupportOverlapViewGroup mRelatedUsersLayout;
    @BindView(9159)
    public TextView mTheatChatNameTv;
    @BindView(7938)
    public LKUIRoundedImageView mThreadChatAvatarIv;
    @BindView(7732)
    public FrameLayout mTopicGroupFl;
    @BindView(9160)
    public TextView mTvGroupNum;
}
