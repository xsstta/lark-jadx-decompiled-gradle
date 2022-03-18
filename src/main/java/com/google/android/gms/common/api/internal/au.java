package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.HandlerC21909h;

/* access modifiers changed from: package-private */
public final class au extends HandlerC21909h {

    /* renamed from: a */
    private final /* synthetic */ as f52688a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    au(as asVar, Looper looper) {
        super(looper);
        this.f52688a = asVar;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((AbstractC21654at) message.obj).mo73379a(this.f52688a);
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
