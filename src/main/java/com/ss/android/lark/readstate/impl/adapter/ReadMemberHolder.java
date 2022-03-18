package com.ss.android.lark.readstate.impl.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

class ReadMemberHolder extends RecyclerView.ViewHolder {
    @BindView(5851)
    ImageView atImage;
    @BindView(5992)
    ImageView dingImage;
    @BindView(5997)
    View divider;
    @BindView(6283)
    public TextView mNameTV;
    @BindView(6473)
    public LKUIRoundedImageView mSingleAvatarIV;
    @BindView(6352)
    TextView readState;
    @BindView(6464)
    View shadow;
    @BindView(6653)
    UserStatusLinearLayout userStatus;

    ReadMemberHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
