package com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

public class AtSelectableViewHolder extends RecyclerView.ViewHolder {
    @BindView(6345)
    public UDCheckBox mAtSelectCheckBox;
    @BindView(6540)
    public ImageView mCustomStatus;
    @BindView(6583)
    public View mDividerView;
    @BindView(7008)
    public TextView mNameTV;
    @BindView(7417)
    public TextView mOwnerTV;
    @BindView(7304)
    public View mShadow;
    @BindView(7315)
    public SelectableRoundedImageView mSingleAvatarIV;
    @BindView(7390)
    public TextView mTagWrapper;
    @BindView(7561)
    public UserStatusLinearLayout mUserStatus;
    @BindView(7631)
    public TextView mWorkStatus;

    public AtSelectableViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
