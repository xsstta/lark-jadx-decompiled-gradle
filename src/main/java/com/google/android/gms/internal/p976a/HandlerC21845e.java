package com.google.android.gms.internal.p976a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.a.e */
public class HandlerC21845e extends Handler {

    /* renamed from: a */
    private static AbstractC21847g f53254a;

    public HandlerC21845e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo73919a(Message message) {
        super.dispatchMessage(message);
    }

    public HandlerC21845e(Looper looper) {
        super(looper);
    }

    public final void dispatchMessage(Message message) {
        AbstractC21847g gVar = f53254a;
        if (gVar == null) {
            mo73919a(message);
            return;
        }
        Object a = gVar.mo73922a(this, message);
        try {
            mo73919a(message);
            gVar.mo73924a(this, message, a);
        } catch (Throwable th) {
            gVar.mo73924a(this, message, a);
            throw th;
        }
    }

    /* renamed from: a */
    private void m79156a(Message message, long j) {
        AbstractC21847g gVar = f53254a;
        if (gVar != null) {
            gVar.mo73923a(this, message, j);
        }
    }

    public boolean sendMessageAtTime(Message message, long j) {
        m79156a(message, j);
        return super.sendMessageAtTime(message, j);
    }

    public HandlerC21845e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
