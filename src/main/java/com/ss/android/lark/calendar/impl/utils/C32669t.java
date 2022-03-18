package com.ss.android.lark.calendar.impl.utils;

import android.os.SystemClock;

/* renamed from: com.ss.android.lark.calendar.impl.utils.t */
public class C32669t {

    /* renamed from: a */
    private long f83812a;

    /* renamed from: b */
    private Runnable f83813b;

    /* renamed from: c */
    private long f83814c = 1000;

    /* renamed from: a */
    public void mo120361a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f83812a >= this.f83814c) {
            this.f83812a = elapsedRealtime;
            Runnable runnable = this.f83813b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C32669t(Runnable runnable) {
        this.f83813b = runnable;
    }
}
