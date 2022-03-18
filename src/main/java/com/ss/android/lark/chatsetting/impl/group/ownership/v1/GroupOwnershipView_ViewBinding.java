package com.ss.android.lark.chatsetting.impl.group.ownership.v1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class GroupOwnershipView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GroupOwnershipView f89981a;

    @Override // butterknife.Unbinder
    public void unbind() {
        GroupOwnershipView groupOwnershipView = this.f89981a;
        if (groupOwnershipView != null) {
            this.f89981a = null;
            groupOwnershipView.mCommonTitleBar = null;
            groupOwnershipView.mGroupManagerScrollView = null;
            groupOwnershipView.mInvitationSettingTitle = null;
            groupOwnershipView.mTransferToChatBtn = null;
            groupOwnershipView.mGroupTransferToLayout = null;
            groupOwnershipView.mGroupTransferTitleTv = null;
            groupOwnershipView.mOwnerEditGroupInfoStatusTv = null;
            groupOwnershipView.mOwnerEditGroupInfoDescTv = null;
            groupOwnershipView.mGroupNewMessageLayout = null;
            groupOwnershipView.mOwnerMentionAllLayout = null;
            groupOwnershipView.mOwnerMentionAllStatus = null;
            groupOwnershipView.mOwnerMentionAllTv = null;
            groupOwnershipView.mPostSettingLayout = null;
            groupOwnershipView.mPostSettingContent = null;
            groupOwnershipView.mPostSettingTitleTv = null;
            groupOwnershipView.mChatAdminLayout = null;
            groupOwnershipView.mAddChatAdminTv = null;
            groupOwnershipView.mChatAdminsNumTv = null;
            groupOwnershipView.mChatAdminGv = null;
            groupOwnershipView.mMembershipApprovalLayout = null;
            groupOwnershipView.mMembershipApprovalDivider = null;
            groupOwnershipView.mMemberShipApprovalTv = null;
            groupOwnershipView.mMemberShipApprovalTipTv = null;
            groupOwnershipView.mRedDot = null;
            groupOwnershipView.mApprovalStateTv = null;
            groupOwnershipView.mLeaveGroupMessageSetting = null;
            groupOwnershipView.mLeaveGroupSettingDetail = null;
            groupOwnershipView.mLeaveGroupMessageSettingTitleTv = null;
            groupOwnershipView.mJoinGroupMessageSetting = null;
            groupOwnershipView.mJoinGroupSettingDetail = null;
            groupOwnershipView.mJoinGroupMessageSettingTitleTv = null;
            groupOwnershipView.mGroupMailSettingLayout = null;
            groupOwnershipView.mGroupMailSettingDivider = null;
            groupOwnershipView.mGroupMailDetail = null;
            groupOwnershipView.mMailGroupSettingTitle = null;
            groupOwnershipView.mSeeHistoryMessageLayout = null;
            groupOwnershipView.mSeeHistorySwitchBtn = null;
            groupOwnershipView.mSharingHistoryLayout = null;
            groupOwnershipView.mShareHistoryTitleTv = null;
            groupOwnershipView.mJoinLeaveHistoryLayout = null;
            groupOwnershipView.mJoinLeaveHistoryTv = null;
            groupOwnershipView.mOnlyOwnerAddMemberLayout = null;
            groupOwnershipView.mGroupOwnerAddNewMemberTipTv = null;
            groupOwnershipView.mAddMemberAndShareStatus = null;
            groupOwnershipView.mGroupAllowAnonymityLayout = null;
            groupOwnershipView.mGroupAllowAnonymitySwitchBtn = null;
            groupOwnershipView.mGroupAllowAnonymityTv = null;
            groupOwnershipView.mGroupAllowAnonymityTipTv = null;
            groupOwnershipView.mAllowSearchLayout = null;
            groupOwnershipView.mAllowSearchStateTv = null;
            groupOwnershipView.mAllowSearchMask = null;
            groupOwnershipView.mVcPermissionLayout = null;
            groupOwnershipView.mVcPermissionTip = null;
            groupOwnershipView.mBuzzPermissionLayout = null;
            groupOwnershipView.mBuzzPermissionTip = null;
            groupOwnershipView.mPinPermissionLayout = null;
            groupOwnershipView.mPinPermissionTip = null;
            groupOwnershipView.mApplyGroupLimitLayout = null;
            groupOwnershipView.mPinTopPermissionLayout = null;
            groupOwnershipView.mPinTopPermissionTip = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GroupOwnershipView_ViewBinding(GroupOwnershipView groupOwnershipView, View view) {
        this.f89981a = groupOwnershipView;
        groupOwnershipView.mCommonTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mCommonTitleBar'", CommonTitleBar.class);
        groupOwnershipView.mGroupManagerScrollView = (ScrollView) Utils.findRequiredViewAsType(view, R.id.group_manage_scrollview, "field 'mGroupManagerScrollView'", ScrollView.class);
        groupOwnershipView.mInvitationSettingTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.invitationSettingTitle, "field 'mInvitationSettingTitle'", TextView.class);
        groupOwnershipView.mTransferToChatBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.transfer_to_chat, "field 'mTransferToChatBtn'", TextView.class);
        groupOwnershipView.mGroupTransferToLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.group_transfer_to, "field 'mGroupTransferToLayout'", RelativeLayout.class);
        groupOwnershipView.mGroupTransferTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_transfer_title, "field 'mGroupTransferTitleTv'", TextView.class);
        groupOwnershipView.mOwnerEditGroupInfoStatusTv = (TextView) Utils.findRequiredViewAsType(view, R.id.owner_edit_group_info_status, "field 'mOwnerEditGroupInfoStatusTv'", TextView.class);
        groupOwnershipView.mOwnerEditGroupInfoDescTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_owner_edit_group_info_desc, "field 'mOwnerEditGroupInfoDescTv'", TextView.class);
        groupOwnershipView.mGroupNewMessageLayout = Utils.findRequiredView(view, R.id.group_new_message_switch, "field 'mGroupNewMessageLayout'");
        groupOwnershipView.mOwnerMentionAllLayout = Utils.findRequiredView(view, R.id.owner_mention_all_layout, "field 'mOwnerMentionAllLayout'");
        groupOwnershipView.mOwnerMentionAllStatus = (TextView) Utils.findRequiredViewAsType(view, R.id.owner_mention_all_status, "field 'mOwnerMentionAllStatus'", TextView.class);
        groupOwnershipView.mOwnerMentionAllTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_owner_mention_all, "field 'mOwnerMentionAllTv'", TextView.class);
        groupOwnershipView.mPostSettingLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.post_setting_layout, "field 'mPostSettingLayout'", ViewGroup.class);
        groupOwnershipView.mPostSettingContent = (TextView) Utils.findRequiredViewAsType(view, R.id.post_setting_content, "field 'mPostSettingContent'", TextView.class);
        groupOwnershipView.mPostSettingTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.post_setting_title, "field 'mPostSettingTitleTv'", TextView.class);
        groupOwnershipView.mChatAdminLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.chat_admin_layout, "field 'mChatAdminLayout'", ViewGroup.class);
        groupOwnershipView.mAddChatAdminTv = (TextView) Utils.findRequiredViewAsType(view, R.id.add_chat_admin_tv, "field 'mAddChatAdminTv'", TextView.class);
        groupOwnershipView.mChatAdminsNumTv = (TextView) Utils.findRequiredViewAsType(view, R.id.chat_admin_num_tv, "field 'mChatAdminsNumTv'", TextView.class);
        groupOwnershipView.mChatAdminGv = (GridView) Utils.findRequiredViewAsType(view, R.id.chat_admin_gv, "field 'mChatAdminGv'", GridView.class);
        groupOwnershipView.mMembershipApprovalLayout = Utils.findRequiredView(view, R.id.membership_approval_layout, "field 'mMembershipApprovalLayout'");
        groupOwnershipView.mMembershipApprovalDivider = Utils.findRequiredView(view, R.id.membership_approval_divider, "field 'mMembershipApprovalDivider'");
        groupOwnershipView.mMemberShipApprovalTv = (TextView) Utils.findRequiredViewAsType(view, R.id.membership_approval_tv, "field 'mMemberShipApprovalTv'", TextView.class);
        groupOwnershipView.mMemberShipApprovalTipTv = (TextView) Utils.findRequiredViewAsType(view, R.id.membership_approval_tv_tip, "field 'mMemberShipApprovalTipTv'", TextView.class);
        groupOwnershipView.mRedDot = Utils.findRequiredView(view, R.id.chat_apply_badge, "field 'mRedDot'");
        groupOwnershipView.mApprovalStateTv = (TextView) Utils.findRequiredViewAsType(view, R.id.membership_approval_is_open_tv, "field 'mApprovalStateTv'", TextView.class);
        groupOwnershipView.mLeaveGroupMessageSetting = Utils.findRequiredView(view, R.id.leave_group_message_setting, "field 'mLeaveGroupMessageSetting'");
        groupOwnershipView.mLeaveGroupSettingDetail = (TextView) Utils.findRequiredViewAsType(view, R.id.leave_group_message_setting_detail, "field 'mLeaveGroupSettingDetail'", TextView.class);
        groupOwnershipView.mLeaveGroupMessageSettingTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_leave_group_message_setting_title, "field 'mLeaveGroupMessageSettingTitleTv'", TextView.class);
        groupOwnershipView.mJoinGroupMessageSetting = Utils.findRequiredView(view, R.id.join_group_message_setting, "field 'mJoinGroupMessageSetting'");
        groupOwnershipView.mJoinGroupSettingDetail = (TextView) Utils.findRequiredViewAsType(view, R.id.join_group_message_setting_detail, "field 'mJoinGroupSettingDetail'", TextView.class);
        groupOwnershipView.mJoinGroupMessageSettingTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_join_group_message_setting_title, "field 'mJoinGroupMessageSettingTitleTv'", TextView.class);
        groupOwnershipView.mGroupMailSettingLayout = Utils.findRequiredView(view, R.id.mail_group_setting_layout, "field 'mGroupMailSettingLayout'");
        groupOwnershipView.mGroupMailSettingDivider = Utils.findRequiredView(view, R.id.mail_group_setting_divider, "field 'mGroupMailSettingDivider'");
        groupOwnershipView.mGroupMailDetail = (TextView) Utils.findRequiredViewAsType(view, R.id.mail_group_setting_content, "field 'mGroupMailDetail'", TextView.class);
        groupOwnershipView.mMailGroupSettingTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.mail_group_setting_title, "field 'mMailGroupSettingTitle'", TextView.class);
        groupOwnershipView.mSeeHistoryMessageLayout = Utils.findRequiredView(view, R.id.seeHistoryMessageLayout, "field 'mSeeHistoryMessageLayout'");
        groupOwnershipView.mSeeHistorySwitchBtn = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.switch_button_see_history_message, "field 'mSeeHistorySwitchBtn'", LKUISwitchButton.class);
        groupOwnershipView.mSharingHistoryLayout = Utils.findRequiredView(view, R.id.sharing_history_layout, "field 'mSharingHistoryLayout'");
        groupOwnershipView.mShareHistoryTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.sharing_history_title, "field 'mShareHistoryTitleTv'", TextView.class);
        groupOwnershipView.mJoinLeaveHistoryLayout = Utils.findRequiredView(view, R.id.join_leave_history_layout, "field 'mJoinLeaveHistoryLayout'");
        groupOwnershipView.mJoinLeaveHistoryTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_join_leave_history, "field 'mJoinLeaveHistoryTv'", TextView.class);
        groupOwnershipView.mOnlyOwnerAddMemberLayout = Utils.findRequiredView(view, R.id.onlyOwnerAddMemberLayout, "field 'mOnlyOwnerAddMemberLayout'");
        groupOwnershipView.mGroupOwnerAddNewMemberTipTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_owner_add_new_member, "field 'mGroupOwnerAddNewMemberTipTv'", TextView.class);
        groupOwnershipView.mAddMemberAndShareStatus = (TextView) Utils.findRequiredViewAsType(view, R.id.add_member_share_status, "field 'mAddMemberAndShareStatus'", TextView.class);
        groupOwnershipView.mGroupAllowAnonymityLayout = Utils.findRequiredView(view, R.id.group_allow_anonymity_layout, "field 'mGroupAllowAnonymityLayout'");
        groupOwnershipView.mGroupAllowAnonymitySwitchBtn = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.group_allow_anonymity_button, "field 'mGroupAllowAnonymitySwitchBtn'", LKUISwitchButton.class);
        groupOwnershipView.mGroupAllowAnonymityTv = (TextView) Utils.findRequiredViewAsType(view, R.id.group_allow_anonymity_tv, "field 'mGroupAllowAnonymityTv'", TextView.class);
        groupOwnershipView.mGroupAllowAnonymityTipTv = (TextView) Utils.findRequiredViewAsType(view, R.id.group_allow_anonymity_tip_tv, "field 'mGroupAllowAnonymityTipTv'", TextView.class);
        groupOwnershipView.mAllowSearchLayout = Utils.findRequiredView(view, R.id.allow_search_layout, "field 'mAllowSearchLayout'");
        groupOwnershipView.mAllowSearchStateTv = (TextView) Utils.findRequiredViewAsType(view, R.id.allow_search_is_open_tv, "field 'mAllowSearchStateTv'", TextView.class);
        groupOwnershipView.mAllowSearchMask = Utils.findRequiredView(view, R.id.allow_search_mask, "field 'mAllowSearchMask'");
        groupOwnershipView.mVcPermissionLayout = Utils.findRequiredView(view, R.id.vc_permission_layout, "field 'mVcPermissionLayout'");
        groupOwnershipView.mVcPermissionTip = (TextView) Utils.findRequiredViewAsType(view, R.id.vc_permission_tip, "field 'mVcPermissionTip'", TextView.class);
        groupOwnershipView.mBuzzPermissionLayout = Utils.findRequiredView(view, R.id.buzz_permission_layout, "field 'mBuzzPermissionLayout'");
        groupOwnershipView.mBuzzPermissionTip = (TextView) Utils.findRequiredViewAsType(view, R.id.buzz_permission_tip, "field 'mBuzzPermissionTip'", TextView.class);
        groupOwnershipView.mPinPermissionLayout = Utils.findRequiredView(view, R.id.pin_permission_layout, "field 'mPinPermissionLayout'");
        groupOwnershipView.mPinPermissionTip = (TextView) Utils.findRequiredViewAsType(view, R.id.pin_permission_tip, "field 'mPinPermissionTip'", TextView.class);
        groupOwnershipView.mApplyGroupLimitLayout = Utils.findRequiredView(view, R.id.item_manage_group_apply_limit, "field 'mApplyGroupLimitLayout'");
        groupOwnershipView.mPinTopPermissionLayout = Utils.findRequiredView(view, R.id.pin_top_permission_layout, "field 'mPinTopPermissionLayout'");
        groupOwnershipView.mPinTopPermissionTip = (TextView) Utils.findRequiredViewAsType(view, R.id.pin_top_permission_tip, "field 'mPinTopPermissionTip'", TextView.class);
    }
}
