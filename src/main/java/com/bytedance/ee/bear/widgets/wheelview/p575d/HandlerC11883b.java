package com.bytedance.ee.bear.widgets.wheelview.p575d;

import android.os.Handler;
import android.os.Message;
import com.bytedance.ee.bear.widgets.wheelview.view.WheelView;

/* renamed from: com.bytedance.ee.bear.widgets.wheelview.d.b */
public final class HandlerC11883b extends Handler {

    /* renamed from: a */
    private final WheelView f32137a;

    public HandlerC11883b(WheelView wheelView) {
        this.f32137a = wheelView;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1000) {
            this.f32137a.invalidate();
        } else if (i == 2000) {
            this.f32137a.mo45702a(WheelView.ACTION.FLING);
        } else if (i == 3000) {
            this.f32137a.mo45704c();
        }
    }
}
