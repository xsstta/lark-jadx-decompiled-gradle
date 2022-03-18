package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC21635e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.HandlerC21909h;

/* access modifiers changed from: package-private */
public final class bs extends HandlerC21909h {

    /* renamed from: a */
    private final /* synthetic */ bq f52723a;

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            AbstractC21635e<?> eVar = (AbstractC21635e) message.obj;
            synchronized (this.f52723a.f52716e) {
                if (eVar == null) {
                    this.f52723a.f52713b.m78484a((bq) new Status(13, "Transform returned null"));
                } else if (eVar instanceof bl) {
                    this.f52723a.f52713b.m78484a((bq) ((bl) eVar).mo73395d());
                } else {
                    this.f52723a.f52713b.mo73402a(eVar);
                }
            }
        } else if (i != 1) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(70);
            sb.append("TransformationResultHandler received unknown message type: ");
            sb.append(i2);
            Log.e("TransformedResultImpl", sb.toString());
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            Log.e("TransformedResultImpl", valueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(valueOf) : new String("Runtime exception on the transformation worker thread: "));
            throw runtimeException;
        }
    }
}
