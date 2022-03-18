package com.ss.android.lark.platform.statistics.p2502b;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.platform.statistics.b.e */
public class C51973e {

    /* renamed from: a */
    private static long f129045a;

    /* renamed from: b */
    private static boolean f129046b;

    /* renamed from: c */
    private static long f129047c;

    /* renamed from: d */
    private static long f129048d;

    /* renamed from: e */
    private static long f129049e;

    /* renamed from: f */
    private static volatile boolean f129050f;

    /* renamed from: g */
    private static volatile boolean f129051g;

    /* renamed from: h */
    private static AtomicBoolean f129052h = new AtomicBoolean(false);

    /* renamed from: g */
    public static void m201589g() {
        f129050f = true;
    }

    /* renamed from: d */
    public static boolean m201586d() {
        return f129046b;
    }

    /* renamed from: e */
    public static boolean m201587e() {
        return f129051g;
    }

    /* renamed from: f */
    public static boolean m201588f() {
        return f129050f;
    }

    /* renamed from: j */
    public static long m201592j() {
        return f129049e;
    }

    /* renamed from: k */
    public static long m201593k() {
        return f129048d;
    }

    /* renamed from: l */
    public static long m201594l() {
        return f129047c;
    }

    /* renamed from: c */
    public static void m201585c() {
        f129045a = System.currentTimeMillis();
    }

    /* renamed from: h */
    public static void m201590h() {
        f129052h.compareAndSet(false, true);
    }

    /* renamed from: i */
    public static boolean m201591i() {
        return f129052h.get();
    }

    /* renamed from: a */
    public static void m201583a() {
        f129048d = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        f129049e = currentTimeMillis;
        f129047c = currentTimeMillis;
    }

    /* renamed from: b */
    public static void m201584b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - 5000 > f129045a) {
            f129046b = true;
            f129047c = currentTimeMillis;
        }
    }

    /* renamed from: m */
    public static long m201595m() {
        if (Build.VERSION.SDK_INT >= 24) {
            return f129048d - Process.getStartUptimeMillis();
        }
        return 0;
    }
}
