package com.ss.android.lark.money.redpacket.history.fragment.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class RedPacketHistoryEmptyHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RedPacketHistoryEmptyHolder f121134a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RedPacketHistoryEmptyHolder redPacketHistoryEmptyHolder = this.f121134a;
        if (redPacketHistoryEmptyHolder != null) {
            this.f121134a = null;
            redPacketHistoryEmptyHolder.mEmptyTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RedPacketHistoryEmptyHolder_ViewBinding(RedPacketHistoryEmptyHolder redPacketHistoryEmptyHolder, View view) {
        this.f121134a = redPacketHistoryEmptyHolder;
        redPacketHistoryEmptyHolder.mEmptyTV = (TextView) Utils.findRequiredViewAsType(view, R.id.empty_tv, "field 'mEmptyTV'", TextView.class);
    }
}
