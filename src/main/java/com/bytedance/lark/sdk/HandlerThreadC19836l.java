package com.bytedance.lark.sdk;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.bytedance.lark.sdk.l */
public class HandlerThreadC19836l extends HandlerThread {

    /* renamed from: a */
    private volatile Handler f48409a;

    /* renamed from: a */
    public Handler mo67197a() {
        return this.f48409a;
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        this.f48409a = new Handler(getLooper());
    }

    public HandlerThreadC19836l(String str) {
        super(str);
    }
}
