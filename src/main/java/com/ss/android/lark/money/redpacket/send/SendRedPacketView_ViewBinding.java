package com.ss.android.lark.money.redpacket.send;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class SendRedPacketView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SendRedPacketView f121232a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SendRedPacketView sendRedPacketView = this.f121232a;
        if (sendRedPacketView != null) {
            this.f121232a = null;
            sendRedPacketView.vTitleBar = null;
            sendRedPacketView.vEditAmount = null;
            sendRedPacketView.vTextTotalMoney = null;
            sendRedPacketView.vTextAmountName = null;
            sendRedPacketView.vTextAmountWarning = null;
            sendRedPacketView.vEditCount = null;
            sendRedPacketView.vLayoutCountTips = null;
            sendRedPacketView.vTextGroupMemberNum = null;
            sendRedPacketView.vTextCountWarning = null;
            sendRedPacketView.vLayoutAmountTips = null;
            sendRedPacketView.vLayoutState = null;
            sendRedPacketView.vTextCurrentChangeState = null;
            sendRedPacketView.vLayoutCount = null;
            sendRedPacketView.vBtnCreateRedPacket = null;
            sendRedPacketView.vEditComment = null;
            sendRedPacketView.vCoverLayout = null;
            sendRedPacketView.vCoverMiddlePartIv = null;
            sendRedPacketView.vCoverNameTv = null;
            sendRedPacketView.vCoverForeground = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SendRedPacketView_ViewBinding(SendRedPacketView sendRedPacketView, View view) {
        this.f121232a = sendRedPacketView;
        sendRedPacketView.vTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'vTitleBar'", CommonTitleBar.class);
        sendRedPacketView.vEditAmount = (EditText) Utils.findRequiredViewAsType(view, R.id.et_amount, "field 'vEditAmount'", EditText.class);
        sendRedPacketView.vTextTotalMoney = (TextView) Utils.findRequiredViewAsType(view, R.id.text_total_money, "field 'vTextTotalMoney'", TextView.class);
        sendRedPacketView.vTextAmountName = (TextView) Utils.findRequiredViewAsType(view, R.id.text_amount_name, "field 'vTextAmountName'", TextView.class);
        sendRedPacketView.vTextAmountWarning = (TextView) Utils.findRequiredViewAsType(view, R.id.text_amount_warning, "field 'vTextAmountWarning'", TextView.class);
        sendRedPacketView.vEditCount = (EditText) Utils.findRequiredViewAsType(view, R.id.et_count, "field 'vEditCount'", EditText.class);
        sendRedPacketView.vLayoutCountTips = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.layout_count_tips, "field 'vLayoutCountTips'", ViewGroup.class);
        sendRedPacketView.vTextGroupMemberNum = (TextView) Utils.findRequiredViewAsType(view, R.id.text_group_member_num, "field 'vTextGroupMemberNum'", TextView.class);
        sendRedPacketView.vTextCountWarning = (TextView) Utils.findRequiredViewAsType(view, R.id.text_count_warning, "field 'vTextCountWarning'", TextView.class);
        sendRedPacketView.vLayoutAmountTips = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.layout_amount_tips, "field 'vLayoutAmountTips'", ViewGroup.class);
        sendRedPacketView.vLayoutState = Utils.findRequiredView(view, R.id.layout_state, "field 'vLayoutState'");
        sendRedPacketView.vTextCurrentChangeState = (TextView) Utils.findRequiredViewAsType(view, R.id.text_current_change_state, "field 'vTextCurrentChangeState'", TextView.class);
        sendRedPacketView.vLayoutCount = Utils.findRequiredView(view, R.id.layout_count, "field 'vLayoutCount'");
        sendRedPacketView.vBtnCreateRedPacket = Utils.findRequiredView(view, R.id.btn_create_red_packet, "field 'vBtnCreateRedPacket'");
        sendRedPacketView.vEditComment = (EditText) Utils.findRequiredViewAsType(view, R.id.et_comment, "field 'vEditComment'", EditText.class);
        sendRedPacketView.vCoverLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.layout_cover, "field 'vCoverLayout'", ViewGroup.class);
        sendRedPacketView.vCoverMiddlePartIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.middle_part_cover, "field 'vCoverMiddlePartIv'", ImageView.class);
        sendRedPacketView.vCoverNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.name_cover, "field 'vCoverNameTv'", TextView.class);
        sendRedPacketView.vCoverForeground = (ImageView) Utils.findRequiredViewAsType(view, R.id.foreground_cover, "field 'vCoverForeground'", ImageView.class);
    }
}
