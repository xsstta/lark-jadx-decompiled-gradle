package com.lynx.tasm.base;

import android.os.Build;
import android.util.Log;
import com.lynx.tasm.LynxEnv;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LLog {

    /* renamed from: a */
    private static int f65861a = -1;

    /* renamed from: b */
    private static ConcurrentHashMap<Integer, AbstractC26616d> f65862b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static Integer f65863c = 0;

    /* renamed from: d */
    private static int f65864d = Integer.MIN_VALUE;

    /* renamed from: e */
    private static int[] f65865e;

    /* renamed from: f */
    private static long f65866f = 0;

    /* renamed from: a */
    public static void m96418a(RuntimeException runtimeException) {
    }

    /* renamed from: a */
    public static void m96420a(boolean z) {
    }

    private static native void initALogNative(long j, boolean z);

    private static native void setHasLoggingDelegate(boolean z);

    private static native void setNativeMinLogLevel(int i);

    private static long getALogPtr() {
        return f65866f;
    }

    /* renamed from: a */
    public static void m96413a() {
        m96414a(m96421b());
    }

    /* renamed from: c */
    public static void m96424c() {
        m96418a((RuntimeException) null);
    }

    private static boolean sdkAboveAndroidN() {
        if (Build.VERSION.SDK_INT > 24) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m96421b() {
        AbstractC26616d dVar = f65862b.get(Integer.valueOf(f65861a));
        if (dVar != null) {
            return dVar.mo53794b();
        }
        return 4;
    }

    /* renamed from: e */
    private static void m96428e() {
        if (f65865e == null) {
            int[] iArr = new int[9];
            f65865e = iArr;
            iArr[2] = -1;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 1;
            iArr[6] = 2;
            iArr[7] = 3;
            iArr[8] = 5;
        }
    }

    /* renamed from: d */
    private static void m96426d() {
        for (Map.Entry<Integer, AbstractC26616d> entry : f65862b.entrySet()) {
            AbstractC26616d value = entry.getValue();
            if (!(entry.getValue() instanceof AbstractC26615c)) {
                int i = f65864d;
                if (i == Integer.MIN_VALUE) {
                    f65864d = value.mo53794b();
                } else {
                    f65864d = Math.min(i, value.mo53794b());
                }
            }
        }
        m96414a(f65864d);
    }

    /* renamed from: a */
    public static void m96414a(int i) {
        if (LynxEnv.m96123e().mo94107n()) {
            m96428e();
            setNativeMinLogLevel(f65865e[i]);
            if (f65864d != i) {
                f65864d = i;
            }
        }
    }

    /* renamed from: a */
    public static void m96417a(long j) {
        boolean z;
        if (Build.VERSION.SDK_INT > 24) {
            z = true;
        } else {
            z = false;
        }
        f65866f = j;
        initALogNative(j, z);
    }

    /* renamed from: b */
    public static synchronized void m96422b(int i) {
        synchronized (LLog.class) {
            f65862b.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static synchronized int m96412a(AbstractC26613a aVar) {
        synchronized (LLog.class) {
            if (aVar == null) {
                return -1;
            }
            Integer valueOf = Integer.valueOf(f65863c.intValue() + 1);
            f65863c = valueOf;
            if (aVar.mo53791a() == 1) {
                int i = f65861a;
                if (i != -1) {
                    f65862b.remove(Integer.valueOf(i));
                }
                f65861a = valueOf.intValue();
                m96426d();
            } else if (!(aVar instanceof AbstractC26615c)) {
                int i2 = f65864d;
                if (i2 == Integer.MIN_VALUE) {
                    f65864d = aVar.mo53794b();
                } else {
                    f65864d = Math.min(i2, aVar.mo53794b());
                }
                m96414a(f65864d);
            }
            f65862b.put(valueOf, aVar);
            if (LynxEnv.m96123e().mo94107n()) {
                setHasLoggingDelegate(true);
            }
            return valueOf.intValue();
        }
    }

    /* renamed from: b */
    public static void m96423b(String str, String str2) {
        m96415a(3, str, str2);
    }

    /* renamed from: d */
    public static void m96427d(String str, String str2) {
        m96415a(5, str, str2);
    }

    /* renamed from: e */
    public static void m96429e(String str, String str2) {
        m96415a(6, str, str2);
    }

    /* renamed from: f */
    public static void m96430f(String str, String str2) {
        m96415a(8, str, str2);
    }

    /* renamed from: c */
    public static void m96425c(String str, String str2) {
        m96415a(4, str, str2);
    }

    /* renamed from: a */
    public static void m96419a(String str, String str2) {
        m96415a(2, str, str2);
    }

    /* renamed from: a */
    public static void m96415a(int i, String str, String str2) {
        m96416a(i, str, str2, LogSource.JAVA, null, 0);
    }

    private static void log(int i, String str, String str2, int i2, long j, int i3) {
        LogSource logSource;
        if (i2 == 1) {
            try {
                logSource = LogSource.JS;
            } catch (Throwable th) {
                Log.e("lynx", "" + th.getMessage());
                return;
            }
        } else {
            logSource = LogSource.Native;
        }
        if (i != 7) {
            m96416a(i, str, str2, logSource, Long.valueOf(j), i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m96416a(int r4, java.lang.String r5, java.lang.String r6, com.lynx.tasm.base.LogSource r7, java.lang.Long r8, int r9) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.base.LLog.m96416a(int, java.lang.String, java.lang.String, com.lynx.tasm.base.LogSource, java.lang.Long, int):void");
    }
}
