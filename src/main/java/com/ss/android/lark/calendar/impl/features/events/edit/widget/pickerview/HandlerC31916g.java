package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview;

import android.os.Handler;
import android.os.Message;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.WheelView;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.g */
public final class HandlerC31916g extends Handler {

    /* renamed from: a */
    final WheelView f81528a;

    HandlerC31916g(WheelView wheelView) {
        this.f81528a = wheelView;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1000) {
            this.f81528a.invalidate();
        } else if (i == 2000) {
            this.f81528a.mo116464a(WheelView.ACTION.FLING);
        } else if (i == 3000) {
            this.f81528a.mo116468c();
        }
    }
}
