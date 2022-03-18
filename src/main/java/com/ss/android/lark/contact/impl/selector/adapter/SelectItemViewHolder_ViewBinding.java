package com.ss.android.lark.contact.impl.selector.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

public class SelectItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SelectItemViewHolder f92994a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SelectItemViewHolder selectItemViewHolder = this.f92994a;
        if (selectItemViewHolder != null) {
            this.f92994a = null;
            selectItemViewHolder.mSelectedCB = null;
            selectItemViewHolder.mSingleAvatorIV = null;
            selectItemViewHolder.mNameTV = null;
            selectItemViewHolder.mTagTV = null;
            selectItemViewHolder.mUserStatus = null;
            selectItemViewHolder.mDescriptionTV = null;
            selectItemViewHolder.mUnregisteredFlagIV = null;
            selectItemViewHolder.mBotTagIV = null;
            selectItemViewHolder.mIconContainer = null;
            selectItemViewHolder.mCloseBT = null;
            selectItemViewHolder.mWorkStatusTV = null;
            selectItemViewHolder.mEmailHitTv = null;
            selectItemViewHolder.mLocalTimeContainer = null;
            selectItemViewHolder.mLocalTimeTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SelectItemViewHolder_ViewBinding(SelectItemViewHolder selectItemViewHolder, View view) {
        this.f92994a = selectItemViewHolder;
        selectItemViewHolder.mSelectedCB = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.selectbox, "field 'mSelectedCB'", UDCheckBox.class);
        selectItemViewHolder.mSingleAvatorIV = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.single_avator, "field 'mSingleAvatorIV'", SelectableRoundedImageView.class);
        selectItemViewHolder.mNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.name, "field 'mNameTV'", TextView.class);
        selectItemViewHolder.mTagTV = (TextView) Utils.findRequiredViewAsType(view, R.id.chat_tag, "field 'mTagTV'", TextView.class);
        selectItemViewHolder.mUserStatus = (UserStatusLinearLayout) Utils.findRequiredViewAsType(view, R.id.user_status, "field 'mUserStatus'", UserStatusLinearLayout.class);
        selectItemViewHolder.mDescriptionTV = (TextView) Utils.findRequiredViewAsType(view, R.id.description, "field 'mDescriptionTV'", TextView.class);
        selectItemViewHolder.mUnregisteredFlagIV = (TextView) Utils.findRequiredViewAsType(view, R.id.unregister_flag, "field 'mUnregisteredFlagIV'", TextView.class);
        selectItemViewHolder.mBotTagIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.bot_tag, "field 'mBotTagIV'", ImageView.class);
        selectItemViewHolder.mIconContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.icon_container, "field 'mIconContainer'", LinearLayout.class);
        selectItemViewHolder.mCloseBT = (ImageView) Utils.findRequiredViewAsType(view, R.id.image_close, "field 'mCloseBT'", ImageView.class);
        selectItemViewHolder.mWorkStatusTV = (TextView) Utils.findRequiredViewAsType(view, R.id.workday_leave, "field 'mWorkStatusTV'", TextView.class);
        selectItemViewHolder.mEmailHitTv = (TextView) Utils.findRequiredViewAsType(view, R.id.emailHitTv, "field 'mEmailHitTv'", TextView.class);
        selectItemViewHolder.mLocalTimeContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.local_time_container, "field 'mLocalTimeContainer'", LinearLayout.class);
        selectItemViewHolder.mLocalTimeTV = (TextView) Utils.findRequiredViewAsType(view, R.id.local_time_text, "field 'mLocalTimeTV'", TextView.class);
    }
}
