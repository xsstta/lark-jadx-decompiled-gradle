package com.bytedance.ee.util.common;

import android.os.Handler;

/* renamed from: com.bytedance.ee.util.common.a */
public class C13603a {

    /* renamed from: a */
    private Handler f35765a;

    /* renamed from: a */
    public Handler mo50544a() {
        return this.f35765a;
    }

    public C13603a(Handler handler) {
        this.f35765a = handler;
    }

    /* renamed from: a */
    public void mo50545a(Runnable runnable) {
        this.f35765a.post(runnable);
    }

    /* renamed from: a */
    public void mo50546a(Runnable runnable, long j) {
        this.f35765a.postDelayed(runnable, j);
    }
}
