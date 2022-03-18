package com.ss.android.lark.profile.func.group_profile.mvp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class GroupProfileView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GroupProfileView f129745a;

    @Override // butterknife.Unbinder
    public void unbind() {
        GroupProfileView groupProfileView = this.f129745a;
        if (groupProfileView != null) {
            this.f129745a = null;
            groupProfileView.mGroupAvatar = null;
            groupProfileView.mGroupNameTV = null;
            groupProfileView.mGroupCountTV = null;
            groupProfileView.mGroupDescTV = null;
            groupProfileView.mGroupOwnerAvatar = null;
            groupProfileView.mTitleBar = null;
            groupProfileView.mGroupNameLayout = null;
            groupProfileView.mGroupDescribeLayout = null;
            groupProfileView.mDivideLineBetweenDescribeAndOwner = null;
            groupProfileView.mGroupOwnerLayout = null;
            groupProfileView.mDivideLineOnOwnerBottom = null;
            groupProfileView.mTipContainer = null;
            groupProfileView.mTipTv = null;
            groupProfileView.mBtnFieldContainer = null;
            groupProfileView.mBtnField = null;
            groupProfileView.mDivideLIneNameLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GroupProfileView_ViewBinding(GroupProfileView groupProfileView, View view) {
        this.f129745a = groupProfileView;
        groupProfileView.mGroupAvatar = (ImageView) Utils.findRequiredViewAsType(view, R.id.group_avatar, "field 'mGroupAvatar'", ImageView.class);
        groupProfileView.mGroupNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_name_tv, "field 'mGroupNameTV'", TextView.class);
        groupProfileView.mGroupCountTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_count_tv, "field 'mGroupCountTV'", TextView.class);
        groupProfileView.mGroupDescTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_description_detail_tv, "field 'mGroupDescTV'", TextView.class);
        groupProfileView.mGroupOwnerAvatar = (ImageView) Utils.findRequiredViewAsType(view, R.id.group_owner_avator, "field 'mGroupOwnerAvatar'", ImageView.class);
        groupProfileView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        groupProfileView.mGroupNameLayout = Utils.findRequiredView(view, R.id.group_name_layout, "field 'mGroupNameLayout'");
        groupProfileView.mGroupDescribeLayout = Utils.findRequiredView(view, R.id.group_description_layout, "field 'mGroupDescribeLayout'");
        groupProfileView.mDivideLineBetweenDescribeAndOwner = Utils.findRequiredView(view, R.id.divide_chat_describe_to_owner, "field 'mDivideLineBetweenDescribeAndOwner'");
        groupProfileView.mGroupOwnerLayout = Utils.findRequiredView(view, R.id.group_member_layout, "field 'mGroupOwnerLayout'");
        groupProfileView.mDivideLineOnOwnerBottom = Utils.findRequiredView(view, R.id.divide_chat_owner_bottom, "field 'mDivideLineOnOwnerBottom'");
        groupProfileView.mTipContainer = Utils.findRequiredView(view, R.id.ll_tip_container, "field 'mTipContainer'");
        groupProfileView.mTipTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_tip, "field 'mTipTv'", TextView.class);
        groupProfileView.mBtnFieldContainer = Utils.findRequiredView(view, R.id.ll_join_chat_container, "field 'mBtnFieldContainer'");
        groupProfileView.mBtnField = (TextView) Utils.findRequiredViewAsType(view, R.id.group_chat_join_btn, "field 'mBtnField'", TextView.class);
        groupProfileView.mDivideLIneNameLayout = Utils.findRequiredView(view, R.id.divide_name_layout, "field 'mDivideLIneNameLayout'");
    }
}
