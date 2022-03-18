package com.larksuite.framework.callback;

import android.os.Handler;

/* renamed from: com.larksuite.framework.callback.a */
public class C25967a {

    /* renamed from: a */
    private Handler f64290a;

    /* renamed from: a */
    public Handler mo92344a() {
        return this.f64290a;
    }

    public C25967a(Handler handler) {
        this.f64290a = handler;
    }

    /* renamed from: a */
    public void mo92345a(Runnable runnable) {
        this.f64290a.post(runnable);
    }

    /* renamed from: a */
    public void mo92346a(Runnable runnable, long j) {
        this.f64290a.postDelayed(runnable, j);
    }
}
