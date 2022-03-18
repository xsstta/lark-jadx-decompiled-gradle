package com.ss.android.ugc.effectmanager.p3042a;

import android.os.SystemClock;

/* renamed from: com.ss.android.ugc.effectmanager.a.i */
public class C60482i {

    /* renamed from: a */
    private long f151167a;

    /* renamed from: b */
    public long mo207065b() {
        return SystemClock.uptimeMillis() - this.f151167a;
    }

    /* renamed from: a */
    public static C60482i m235012a() {
        return new C60482i(SystemClock.uptimeMillis());
    }

    C60482i(long j) {
        this.f151167a = j;
    }
}
