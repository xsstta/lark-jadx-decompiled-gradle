package com.bytedance.apm6.p177f;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p177f.p179b.C3310a;
import com.bytedance.apm6.p177f.p181d.C3316a;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p191d.AbstractC3338a;
import com.bytedance.apm6.util.p195b.C3350b;
import java.math.BigDecimal;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.apm6.f.c */
public class C3312c {

    /* renamed from: a */
    private long f10561a;

    /* renamed from: b */
    private long f10562b;

    /* renamed from: c */
    private long f10563c;

    /* renamed from: d */
    private long f10564d;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.f.c$a */
    public static class C3313a {

        /* renamed from: a */
        public static final C3312c f10565a = new C3312c();
    }

    C3312c() {
    }

    /* renamed from: a */
    public static C3312c m13787a() {
        return C3313a.f10565a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13541b() {
        m13790d();
        m13791e();
        m13792f();
        m13793g();
    }

    /* renamed from: h */
    private long m13794h() {
        long a = C3315d.m13798a() * 1024;
        if (a > 0) {
            return a;
        }
        return -1;
    }

    /* renamed from: c */
    public static Debug.MemoryInfo m13789c() {
        if (C3318a.m13917w() == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) C3318a.m13917w().getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            return activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0];
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private long m13790d() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-count"));
        long j = parseLong - this.f10561a;
        this.f10561a = parseLong;
        if (C3318a.m13915u()) {
            C3350b.m13932a("APM-Memory", "gcCount:" + parseLong);
        }
        return j;
    }

    /* renamed from: e */
    private long m13791e() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-time"));
        long j = parseLong - this.f10562b;
        this.f10562b = parseLong;
        if (C3318a.m13915u()) {
            C3350b.m13932a("APM-Memory", "gcTime:" + this.f10562b);
        }
        return j;
    }

    /* renamed from: f */
    private long m13792f() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-count"));
        long j = parseLong - this.f10563c;
        this.f10563c = parseLong;
        if (C3318a.m13915u()) {
            C3350b.m13932a("APM-Memory", "blockingGcCount:" + this.f10563c);
        }
        return j;
    }

    /* renamed from: g */
    private long m13793g() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-time"));
        long j = parseLong - this.f10564d;
        this.f10564d = parseLong;
        if (C3318a.m13915u()) {
            C3350b.m13932a("APM-Memory", "blockingGcTime:" + this.f10564d);
        }
        return j;
    }

    /* renamed from: a */
    private long m13786a(Debug.MemoryInfo memoryInfo) {
        return ((long) memoryInfo.dalvikPss) * 1024;
    }

    /* renamed from: a */
    private double m13785a(long j) {
        if (j > 0) {
            return new BigDecimal(j).divide(new BigDecimal(Runtime.getRuntime().maxMemory()), 4, 4).doubleValue();
        }
        return -1.0d;
    }

    /* renamed from: b */
    private long m13788b(Debug.MemoryInfo memoryInfo) {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
        if (!TextUtils.isEmpty(memoryStat)) {
            try {
                return ((long) Integer.parseInt(memoryStat)) * 1024;
            } catch (Exception e) {
                C3350b.m13935b("APM-Memory", "getGraphics", e);
                e.printStackTrace();
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3316a mo13540a(C3310a aVar) {
        boolean z;
        Debug.MemoryInfo c = m13789c();
        if (c == null) {
            return null;
        }
        long a = m13786a(c);
        if (a < 0) {
            return null;
        }
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        double a2 = m13785a(freeMemory);
        long d = m13790d();
        long e = m13791e();
        long f = m13792f();
        long g = m13793g();
        boolean z2 = !((AbstractC3338a) C3336c.m13901a(AbstractC3338a.class)).mo13548a();
        long j = ((long) c.nativePss) * 1024;
        long totalPss = 1024 * ((long) c.getTotalPss());
        long b = m13788b(c);
        long h = m13794h();
        if (a2 > aVar.mo13533b()) {
            z = true;
        } else {
            z = false;
        }
        return new C3316a(d, e, f, g, z2, j, totalPss, freeMemory, a, b, h, a2, z, aVar.mo13537e());
    }
}
