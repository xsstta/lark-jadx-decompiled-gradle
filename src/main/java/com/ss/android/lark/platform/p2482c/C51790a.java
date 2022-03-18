package com.ss.android.lark.platform.p2482c;

import android.os.SystemClock;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.platform.statistics.p2502b.C51973e;

/* renamed from: com.ss.android.lark.platform.c.a */
public class C51790a {

    /* renamed from: a */
    private static long f128733a;

    /* renamed from: b */
    private static long f128734b;

    /* renamed from: c */
    private static long f128735c;

    /* renamed from: a */
    public static long m200787a() {
        return SystemClock.elapsedRealtime() - f128733a;
    }

    /* renamed from: b */
    public static long m200789b() {
        return SystemClock.elapsedRealtime() - f128734b;
    }

    /* renamed from: c */
    public static long m200790c() {
        return SystemClock.elapsedRealtime() - f128735c;
    }

    static {
        long k = C51973e.m201593k() - (SystemClock.uptimeMillis() - SystemClock.elapsedRealtime());
        f128733a = k;
        f128734b = k;
        f128735c = k;
    }

    /* renamed from: a */
    public static void m200788a(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
        if (aVar2.mo105887c()) {
            f128734b = SystemClock.elapsedRealtime();
        } else {
            f128735c = SystemClock.elapsedRealtime();
        }
    }
}
