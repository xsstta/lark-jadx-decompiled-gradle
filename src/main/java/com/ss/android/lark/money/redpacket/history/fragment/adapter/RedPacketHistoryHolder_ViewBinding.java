package com.ss.android.lark.money.redpacket.history.fragment.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;

public class RedPacketHistoryHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RedPacketHistoryHolder f121135a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RedPacketHistoryHolder redPacketHistoryHolder = this.f121135a;
        if (redPacketHistoryHolder != null) {
            this.f121135a = null;
            redPacketHistoryHolder.mAvatarIV = null;
            redPacketHistoryHolder.mNameTV = null;
            redPacketHistoryHolder.mDateTV = null;
            redPacketHistoryHolder.mMoneyTV = null;
            redPacketHistoryHolder.mStatusTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RedPacketHistoryHolder_ViewBinding(RedPacketHistoryHolder redPacketHistoryHolder, View view) {
        this.f121135a = redPacketHistoryHolder;
        redPacketHistoryHolder.mAvatarIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.avatar, "field 'mAvatarIV'", LKUIRoundedImageView.class);
        redPacketHistoryHolder.mNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.name, "field 'mNameTV'", TextView.class);
        redPacketHistoryHolder.mDateTV = (TextView) Utils.findRequiredViewAsType(view, R.id.date, "field 'mDateTV'", TextView.class);
        redPacketHistoryHolder.mMoneyTV = (TextView) Utils.findRequiredViewAsType(view, R.id.money, "field 'mMoneyTV'", TextView.class);
        redPacketHistoryHolder.mStatusTV = (TextView) Utils.findRequiredViewAsType(view, R.id.status, "field 'mStatusTV'", TextView.class);
    }
}
