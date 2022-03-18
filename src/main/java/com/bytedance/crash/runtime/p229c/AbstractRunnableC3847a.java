package com.bytedance.crash.runtime.p229c;

import android.os.Handler;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.runtime.c.a */
public abstract class AbstractRunnableC3847a implements Runnable {

    /* renamed from: a */
    private final Handler f11817a;

    /* renamed from: b */
    private final long f11818b;

    /* renamed from: c */
    private final long f11819c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo15452a() {
        return this.f11819c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15453a(long j) {
        if (j > 0) {
            this.f11817a.postDelayed(this, j);
        } else {
            this.f11817a.post(this);
        }
    }

    AbstractRunnableC3847a(Handler handler, long j, long j2) {
        this.f11817a = handler;
        this.f11818b = j;
        this.f11819c = j2;
    }
}
