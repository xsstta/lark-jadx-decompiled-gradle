package com.ss.android.lark.chatsetting.impl.group.ownership.group_search;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public final class GroupSearchEnableView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GroupSearchEnableView f89641a;

    @Override // butterknife.Unbinder
    public void unbind() {
        GroupSearchEnableView groupSearchEnableView = this.f89641a;
        if (groupSearchEnableView != null) {
            this.f89641a = null;
            groupSearchEnableView.mTitleBar = null;
            groupSearchEnableView.mEnableBtn = null;
            groupSearchEnableView.mGroupInfoLayout = null;
            groupSearchEnableView.mGroupPhotoLayout = null;
            groupSearchEnableView.mGroupPhotoTitle = null;
            groupSearchEnableView.mGroupPhoto = null;
            groupSearchEnableView.mGroupNameLayout = null;
            groupSearchEnableView.mGroupNameTitle = null;
            groupSearchEnableView.mGroupName = null;
            groupSearchEnableView.mGroupDescLayout = null;
            groupSearchEnableView.mGroupDescTitle = null;
            groupSearchEnableView.mGroupDesc = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GroupSearchEnableView_ViewBinding(GroupSearchEnableView groupSearchEnableView, View view) {
        this.f89641a = groupSearchEnableView;
        groupSearchEnableView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        groupSearchEnableView.mEnableBtn = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.group_search_enable_btn, "field 'mEnableBtn'", LKUISwitchButton.class);
        groupSearchEnableView.mGroupInfoLayout = Utils.findRequiredView(view, R.id.group_info_layout, "field 'mGroupInfoLayout'");
        groupSearchEnableView.mGroupPhotoLayout = Utils.findRequiredView(view, R.id.rl_group_photo_region, "field 'mGroupPhotoLayout'");
        groupSearchEnableView.mGroupPhotoTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_photo_desc, "field 'mGroupPhotoTitle'", TextView.class);
        groupSearchEnableView.mGroupPhoto = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.iv_group_photo, "field 'mGroupPhoto'", LKUIRoundedImageView2.class);
        groupSearchEnableView.mGroupNameLayout = Utils.findRequiredView(view, R.id.rl_group_name_region, "field 'mGroupNameLayout'");
        groupSearchEnableView.mGroupNameTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_name_desc, "field 'mGroupNameTitle'", TextView.class);
        groupSearchEnableView.mGroupName = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_name, "field 'mGroupName'", TextView.class);
        groupSearchEnableView.mGroupDescLayout = Utils.findRequiredView(view, R.id.ll_describe_region, "field 'mGroupDescLayout'");
        groupSearchEnableView.mGroupDescTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_about, "field 'mGroupDescTitle'", TextView.class);
        groupSearchEnableView.mGroupDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_describe, "field 'mGroupDesc'", TextView.class);
    }
}
