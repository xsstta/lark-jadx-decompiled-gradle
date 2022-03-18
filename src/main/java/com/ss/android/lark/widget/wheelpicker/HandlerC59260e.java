package com.ss.android.lark.widget.wheelpicker;

import android.os.Handler;
import android.os.Message;
import com.ss.android.lark.widget.wheelpicker.WheelView;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.widget.wheelpicker.e */
public final class HandlerC59260e extends Handler {

    /* renamed from: a */
    final WheelView f147213a;

    HandlerC59260e(WheelView wheelView) {
        this.f147213a = wheelView;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1000) {
            this.f147213a.invalidate();
        } else if (i == 2000) {
            this.f147213a.mo201484a(WheelView.ACTION.FLING);
        } else if (i == 3000) {
            this.f147213a.mo201489e();
        }
    }
}
