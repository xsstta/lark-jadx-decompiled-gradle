package com.bytedance.ies.xelement.picker.p823f;

import android.os.Handler;
import android.os.Message;
import com.bytedance.ies.xelement.picker.view.WheelView;

/* renamed from: com.bytedance.ies.xelement.picker.f.b */
public final class HandlerC14518b extends Handler {

    /* renamed from: a */
    private final WheelView f38331a;

    public HandlerC14518b(WheelView wheelView) {
        this.f38331a = wheelView;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1000) {
            this.f38331a.invalidate();
        } else if (i == 2000) {
            this.f38331a.mo53424a(WheelView.ACTION.FLING);
        } else if (i == 3000) {
            this.f38331a.mo53426b();
        }
    }
}
