package com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

public class AtSelectableViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AtSelectableViewHolder f114028a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AtSelectableViewHolder atSelectableViewHolder = this.f114028a;
        if (atSelectableViewHolder != null) {
            this.f114028a = null;
            atSelectableViewHolder.mAtSelectCheckBox = null;
            atSelectableViewHolder.mSingleAvatarIV = null;
            atSelectableViewHolder.mNameTV = null;
            atSelectableViewHolder.mOwnerTV = null;
            atSelectableViewHolder.mDividerView = null;
            atSelectableViewHolder.mCustomStatus = null;
            atSelectableViewHolder.mTagWrapper = null;
            atSelectableViewHolder.mUserStatus = null;
            atSelectableViewHolder.mWorkStatus = null;
            atSelectableViewHolder.mShadow = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AtSelectableViewHolder_ViewBinding(AtSelectableViewHolder atSelectableViewHolder, View view) {
        this.f114028a = atSelectableViewHolder;
        atSelectableViewHolder.mAtSelectCheckBox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.at_select_box, "field 'mAtSelectCheckBox'", UDCheckBox.class);
        atSelectableViewHolder.mSingleAvatarIV = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.single_avator, "field 'mSingleAvatarIV'", SelectableRoundedImageView.class);
        atSelectableViewHolder.mNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.name, "field 'mNameTV'", TextView.class);
        atSelectableViewHolder.mOwnerTV = (TextView) Utils.findRequiredViewAsType(view, R.id.text_owner, "field 'mOwnerTV'", TextView.class);
        atSelectableViewHolder.mDividerView = Utils.findRequiredView(view, R.id.divider, "field 'mDividerView'");
        atSelectableViewHolder.mCustomStatus = (ImageView) Utils.findRequiredViewAsType(view, R.id.custom_status, "field 'mCustomStatus'", ImageView.class);
        atSelectableViewHolder.mTagWrapper = (TextView) Utils.findRequiredViewAsType(view, R.id.tag_wrapper, "field 'mTagWrapper'", TextView.class);
        atSelectableViewHolder.mUserStatus = (UserStatusLinearLayout) Utils.findRequiredViewAsType(view, R.id.user_status, "field 'mUserStatus'", UserStatusLinearLayout.class);
        atSelectableViewHolder.mWorkStatus = (TextView) Utils.findRequiredViewAsType(view, R.id.workday_leave, "field 'mWorkStatus'", TextView.class);
        atSelectableViewHolder.mShadow = Utils.findRequiredView(view, R.id.shadow, "field 'mShadow'");
    }
}
