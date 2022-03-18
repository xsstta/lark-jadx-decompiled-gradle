package com.ss.android.lark.money.redpacket.record;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;

public final class RedPacketRecordHeader_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RedPacketRecordHeader f121186a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RedPacketRecordHeader redPacketRecordHeader = this.f121186a;
        if (redPacketRecordHeader != null) {
            this.f121186a = null;
            redPacketRecordHeader.avatarIV = null;
            redPacketRecordHeader.senderTv = null;
            redPacketRecordHeader.subjectTv = null;
            redPacketRecordHeader.moneyLayout = null;
            redPacketRecordHeader.moneyTV = null;
            redPacketRecordHeader.withdrawTV = null;
            redPacketRecordHeader.withdrawLayout = null;
            redPacketRecordHeader.withdrawIV = null;
            redPacketRecordHeader.expiredTV = null;
            redPacketRecordHeader.recordDivider = null;
            redPacketRecordHeader.recordTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RedPacketRecordHeader_ViewBinding(RedPacketRecordHeader redPacketRecordHeader, View view) {
        this.f121186a = redPacketRecordHeader;
        redPacketRecordHeader.avatarIV = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.red_packet_avatar, "field 'avatarIV'", LKUIRoundedImageView2.class);
        redPacketRecordHeader.senderTv = (TextView) Utils.findRequiredViewAsType(view, R.id.red_packet_sender_tv, "field 'senderTv'", TextView.class);
        redPacketRecordHeader.subjectTv = (TextView) Utils.findRequiredViewAsType(view, R.id.red_packet_subject_tv, "field 'subjectTv'", TextView.class);
        redPacketRecordHeader.moneyLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.red_packet_money_layout, "field 'moneyLayout'", ViewGroup.class);
        redPacketRecordHeader.moneyTV = (TextView) Utils.findRequiredViewAsType(view, R.id.red_packet_money_tv, "field 'moneyTV'", TextView.class);
        redPacketRecordHeader.withdrawTV = (TextView) Utils.findRequiredViewAsType(view, R.id.red_packet_withdraw_tv, "field 'withdrawTV'", TextView.class);
        redPacketRecordHeader.withdrawLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.red_packet_withdraw_layout, "field 'withdrawLayout'", ViewGroup.class);
        redPacketRecordHeader.withdrawIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.red_packet_withdraw_iv, "field 'withdrawIV'", ImageView.class);
        redPacketRecordHeader.expiredTV = (TextView) Utils.findRequiredViewAsType(view, R.id.red_packet_expired_tv, "field 'expiredTV'", TextView.class);
        redPacketRecordHeader.recordDivider = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.red_packet_record_divider_layout, "field 'recordDivider'", ViewGroup.class);
        redPacketRecordHeader.recordTV = (TextView) Utils.findRequiredViewAsType(view, R.id.red_packet_record_tv, "field 'recordTV'", TextView.class);
    }
}
