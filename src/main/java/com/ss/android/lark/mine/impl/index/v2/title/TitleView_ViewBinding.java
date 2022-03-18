package com.ss.android.lark.mine.impl.index.v2.title;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

public final class TitleView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TitleView f115512a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TitleView titleView = this.f115512a;
        if (titleView != null) {
            this.f115512a = null;
            titleView.mAvatarIV = null;
            titleView.mNameContainer = null;
            titleView.mNameTV = null;
            titleView.mTenantDesc = null;
            titleView.mDepartmentTV = null;
            titleView.mStatus = null;
            titleView.mWorkStatusTV = null;
            titleView.mZenSettingIcon = null;
            titleView.mZenSetting = null;
            titleView.mTenantCertification = null;
            titleView.personalStatusLayout = null;
            titleView.emptyStatus = null;
            titleView.personalStatusGroup = null;
            titleView.statusTitle = null;
            titleView.statusAvatar = null;
            titleView.statusEndTime = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TitleView_ViewBinding(TitleView titleView, View view) {
        this.f115512a = titleView;
        titleView.mAvatarIV = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.avatar, "field 'mAvatarIV'", LKUIRoundedImageView2.class);
        titleView.mNameContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.name_container, "field 'mNameContainer'", ViewGroup.class);
        titleView.mNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.name, "field 'mNameTV'", TextView.class);
        titleView.mTenantDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.tenant_desc, "field 'mTenantDesc'", TextView.class);
        titleView.mDepartmentTV = (TextView) Utils.findRequiredViewAsType(view, R.id.department, "field 'mDepartmentTV'", TextView.class);
        titleView.mStatus = (UserStatusLinearLayout) Utils.findRequiredViewAsType(view, R.id.status, "field 'mStatus'", UserStatusLinearLayout.class);
        titleView.mWorkStatusTV = (TextView) Utils.findRequiredViewAsType(view, R.id.workday_leave, "field 'mWorkStatusTV'", TextView.class);
        titleView.mZenSettingIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.do_not_disturb_icon, "field 'mZenSettingIcon'", ImageView.class);
        titleView.mZenSetting = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.do_not_disturb, "field 'mZenSetting'", ConstraintLayout.class);
        titleView.mTenantCertification = (TextView) Utils.findRequiredViewAsType(view, R.id.tenant_certification, "field 'mTenantCertification'", TextView.class);
        titleView.personalStatusLayout = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.layout_personal_status, "field 'personalStatusLayout'", ConstraintLayout.class);
        titleView.emptyStatus = (TextView) Utils.findRequiredViewAsType(view, R.id.text_empty_status, "field 'emptyStatus'", TextView.class);
        titleView.personalStatusGroup = (Group) Utils.findRequiredViewAsType(view, R.id.group_personal_status, "field 'personalStatusGroup'", Group.class);
        titleView.statusTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title_status, "field 'statusTitle'", TextView.class);
        titleView.statusAvatar = (ImageView) Utils.findRequiredViewAsType(view, R.id.status_avatar, "field 'statusAvatar'", ImageView.class);
        titleView.statusEndTime = (TextView) Utils.findRequiredViewAsType(view, R.id.text_status_end_time, "field 'statusEndTime'", TextView.class);
    }
}
