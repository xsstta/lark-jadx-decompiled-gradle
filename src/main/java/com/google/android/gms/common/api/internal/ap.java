package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.HandlerC21909h;

/* access modifiers changed from: package-private */
public final class ap extends HandlerC21909h {

    /* renamed from: a */
    private final /* synthetic */ aj f52670a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ap(aj ajVar, Looper looper) {
        super(looper);
        this.f52670a = ajVar;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f52670a.m78378q();
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            this.f52670a.m78377p();
        }
    }
}
