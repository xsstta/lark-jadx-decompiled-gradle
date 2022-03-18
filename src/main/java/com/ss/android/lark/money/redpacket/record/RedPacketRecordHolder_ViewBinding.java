package com.ss.android.lark.money.redpacket.record;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;

public final class RedPacketRecordHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RedPacketRecordHolder f121187a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RedPacketRecordHolder redPacketRecordHolder = this.f121187a;
        if (redPacketRecordHolder != null) {
            this.f121187a = null;
            redPacketRecordHolder.mUserNameTV = null;
            redPacketRecordHolder.mGrabTimeTV = null;
            redPacketRecordHolder.mAvatarIV = null;
            redPacketRecordHolder.mGrabAmountTV = null;
            redPacketRecordHolder.mLuckyLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RedPacketRecordHolder_ViewBinding(RedPacketRecordHolder redPacketRecordHolder, View view) {
        this.f121187a = redPacketRecordHolder;
        redPacketRecordHolder.mUserNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.record_user_name_tv, "field 'mUserNameTV'", TextView.class);
        redPacketRecordHolder.mGrabTimeTV = (TextView) Utils.findRequiredViewAsType(view, R.id.record_time_tv, "field 'mGrabTimeTV'", TextView.class);
        redPacketRecordHolder.mAvatarIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.record_avatar_iv, "field 'mAvatarIV'", LKUIRoundedImageView.class);
        redPacketRecordHolder.mGrabAmountTV = (TextView) Utils.findRequiredViewAsType(view, R.id.record_amount_tv, "field 'mGrabAmountTV'", TextView.class);
        redPacketRecordHolder.mLuckyLayout = Utils.findRequiredView(view, R.id.record_lucky_layout, "field 'mLuckyLayout'");
    }
}
