package com.ss.android.lark.create.groupchat.impl.p2p.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.ui.CommonTitleBar;

public class GroupChatStructureBaseView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GroupChatStructureBaseView f93826a;

    @Override // butterknife.Unbinder
    public void unbind() {
        GroupChatStructureBaseView groupChatStructureBaseView = this.f93826a;
        if (groupChatStructureBaseView != null) {
            this.f93826a = null;
            groupChatStructureBaseView.mChatterPicker = null;
            groupChatStructureBaseView.mP2pBuildGroupTipTV = null;
            groupChatStructureBaseView.mTitleBar = null;
            groupChatStructureBaseView.mSelectCountTV = null;
            groupChatStructureBaseView.mConfirmBT = null;
            groupChatStructureBaseView.mBottomDetailLayout = null;
            groupChatStructureBaseView.mSyncMsgLL = null;
            groupChatStructureBaseView.mSyncMsgCB = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GroupChatStructureBaseView_ViewBinding(GroupChatStructureBaseView groupChatStructureBaseView, View view) {
        this.f93826a = groupChatStructureBaseView;
        groupChatStructureBaseView.mChatterPicker = (ChatterPicker) Utils.findRequiredViewAsType(view, R.id.p2p_create_group_chatter_picker, "field 'mChatterPicker'", ChatterPicker.class);
        groupChatStructureBaseView.mP2pBuildGroupTipTV = (TextView) Utils.findRequiredViewAsType(view, R.id.p2p_build_group_tip, "field 'mP2pBuildGroupTipTV'", TextView.class);
        groupChatStructureBaseView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        groupChatStructureBaseView.mSelectCountTV = (TextView) Utils.findRequiredViewAsType(view, R.id.select_count, "field 'mSelectCountTV'", TextView.class);
        groupChatStructureBaseView.mConfirmBT = (TextView) Utils.findRequiredViewAsType(view, R.id.confirm, "field 'mConfirmBT'", TextView.class);
        groupChatStructureBaseView.mBottomDetailLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.show_bottom, "field 'mBottomDetailLayout'", ViewGroup.class);
        groupChatStructureBaseView.mSyncMsgLL = Utils.findRequiredView(view, R.id.sync_msg_ll, "field 'mSyncMsgLL'");
        groupChatStructureBaseView.mSyncMsgCB = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.sync_msg_cb, "field 'mSyncMsgCB'", UDCheckBox.class);
    }
}
