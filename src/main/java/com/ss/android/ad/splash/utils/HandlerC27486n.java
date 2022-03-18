package com.ss.android.ad.splash.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ad.splash.utils.n */
public class HandlerC27486n extends Handler {

    /* renamed from: a */
    private WeakReference<AbstractC27487a> f68704a;

    /* renamed from: com.ss.android.ad.splash.utils.n$a */
    public interface AbstractC27487a {
        /* renamed from: a */
        void mo97152a(Message message);
    }

    public void handleMessage(Message message) {
        AbstractC27487a aVar = this.f68704a.get();
        if (aVar != null && message != null) {
            aVar.mo97152a(message);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandlerC27486n(com.ss.android.ad.splash.utils.HandlerC27486n.AbstractC27487a r2) {
        /*
            r1 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L_0x000b
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            goto L_0x000f
        L_0x000b:
            android.os.Looper r0 = android.os.Looper.myLooper()
        L_0x000f:
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.utils.HandlerC27486n.<init>(com.ss.android.ad.splash.utils.n$a):void");
    }

    public HandlerC27486n(Looper looper, AbstractC27487a aVar) {
        super(looper);
        this.f68704a = new WeakReference<>(aVar);
    }
}
