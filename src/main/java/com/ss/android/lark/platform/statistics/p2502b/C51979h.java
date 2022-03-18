package com.ss.android.lark.platform.statistics.p2502b;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.lark.sdk.log.Thoth;
import com.larksuite.framework.thread.CoreThreadPool;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.lark.platform.statistics.b.h */
public class C51979h {

    /* renamed from: a */
    private static final Map<String, Long> f129067a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final ExecutorService f129068b = CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("OpenTracer");

    /* renamed from: a */
    public static void m201608a(String str) {
        m201609a(str, (String) null);
    }

    /* renamed from: b */
    public static void m201611b(String str) {
        m201612b(str, (String) null);
    }

    /* renamed from: c */
    public static long m201613c(String str) {
        Long l;
        if (str == null || (l = f129067a.get(str)) == null) {
            return -1;
        }
        return l.longValue();
    }

    /* renamed from: d */
    public static long m201615d(String str) {
        if (str == null) {
            return -1;
        }
        long a = Thoth.m72359a(str);
        f129067a.put(str, Long.valueOf(a));
        Log.d("OpenTracer", "startSpan: " + str + " spanId: " + a);
        return a;
    }

    /* renamed from: b */
    public static void m201610b(long j, String str) {
        Log.d("OpenTracer", "endSpan: " + j);
        Thoth.m72360b(j, str);
    }

    /* renamed from: a */
    public static long m201607a(long j, String str) {
        if (str == null) {
            return -1;
        }
        long a = Thoth.m72358a(j, str);
        f129067a.put(str, Long.valueOf(a));
        Log.d("OpenTracer", "startSpan: " + a + " spanName: " + str + " parentId: " + j);
        return a;
    }

    /* renamed from: b */
    public static void m201612b(String str, String str2) {
        long c = m201613c(str);
        if (c == -1) {
            Log.d("OpenTracer", "endSpan failed!");
            return;
        }
        Log.d("OpenTracer", "endSpan: " + str + " spanId: " + c);
        f129067a.remove(str);
        f129068b.execute(new Runnable(c, str2) {
            /* class com.ss.android.lark.platform.statistics.p2502b.$$Lambda$h$xNvAm3L_YeKrXSWhlq89_RtFbG8 */
            public final /* synthetic */ long f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r3;
            }

            public final void run() {
                C51979h.m201610b(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static void m201609a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            f129068b.execute(new Runnable(str) {
                /* class com.ss.android.lark.platform.statistics.p2502b.$$Lambda$h$yIcZdkl8Ctjhu5z0vKoZZUGct1A */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    C51979h.m201615d(this.f$0);
                }
            });
            return;
        }
        long c = m201613c(str);
        if (c == -1) {
            Log.d("OpenTracer", "startSpan failed!");
        } else {
            f129068b.execute(new Runnable(c, str2) {
                /* class com.ss.android.lark.platform.statistics.p2502b.$$Lambda$h$IYWfOXdBJOz7LT4g4irwsMfwnqY */
                public final /* synthetic */ long f$0;
                public final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r3;
                }

                public final void run() {
                    C51979h.m201607a(this.f$0, this.f$1);
                }
            });
        }
    }
}
