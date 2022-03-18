package com.ss.android.lark.inv.export.util;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* access modifiers changed from: package-private */
public class InvKeyboardUtils$1 extends ResultReceiver {
    InvKeyboardUtils$1(Handler handler) {
        super(handler);
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        if (i == 1 || i == 3) {
            C40129q.m159106a();
        }
    }
}
