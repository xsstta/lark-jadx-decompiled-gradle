package com.ss.android.lark.contact.impl.selector.adapter;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

public class SelectItemViewHolder extends RecyclerView.ViewHolder {
    @BindView(6916)
    public ImageView mBotTagIV;
    @BindView(7383)
    public ImageView mCloseBT;
    @BindView(7133)
    public TextView mDescriptionTV;
    @BindView(7225)
    public TextView mEmailHitTv;
    @BindView(7369)
    public LinearLayout mIconContainer;
    @BindView(7617)
    public LinearLayout mLocalTimeContainer;
    @BindView(7618)
    public TextView mLocalTimeTV;
    @BindView(7730)
    public TextView mNameTV;
    @BindView(8041)
    public UDCheckBox mSelectedCB;
    @BindView(JosStatusCodes.RTN_CODE_PARAMS_ERROR)
    public SelectableRoundedImageView mSingleAvatorIV;
    @BindView(6991)
    public TextView mTagTV;
    @BindView(8392)
    public TextView mUnregisteredFlagIV;
    @BindView(8404)
    public UserStatusLinearLayout mUserStatus;
    @BindView(8515)
    public TextView mWorkStatusTV;
}
