package com.ss.android.lark.search.impl.binder.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

public class SearchChatterViewHolder extends RecyclerView.ViewHolder {
    @BindView(6736)
    public LKUIRoundedImageView mAtAvatarIV;
    @BindView(7021)
    public LKUIBadgeView mBadge;
    @BindView(6664)
    public TextView mBotTagTV;
    @BindView(6839)
    public ImageView mDelayTag;
    @BindView(7017)
    public EllipsizedEmojiconTextView mDescriptionTV;
    @BindView(6885)
    public View mDoNotDisturbTag;
    @BindView(7020)
    public TextView mMailTv;
    @BindView(7022)
    public TextView mNameTV;
    @BindView(7409)
    public ImageView mPersonalCardIV;
    @BindView(7628)
    public ImageView mSecretChatTagIV;
    @BindView(7016)
    public LKUIRoundedImageView mSingleAvatarIV;
    @BindView(6735)
    public TextView mTagTV;
    @BindView(7951)
    public View mUnRegisteredFlagTV;
    @BindView(7963)
    public UserStatusLinearLayout mUserStatus;
    @BindView(8056)
    public TextView mWorkStatusTV;

    public SearchChatterViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
