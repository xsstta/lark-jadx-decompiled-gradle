package com.bytedance.crash.nativecrash;

import android.content.Context;
import android.os.Build;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.util.C3929ac;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.NativeTools;
import java.io.File;

public class NativeImpl {

    /* renamed from: a */
    public static long f11648a = 100;

    /* renamed from: b */
    private static volatile boolean f11649b;

    /* renamed from: c */
    private static volatile boolean f11650c;

    /* renamed from: d */
    private static String f11651d;

    /* renamed from: e */
    private static boolean f11652e;

    private static native void CoredumpNativeInit(int i);

    /* renamed from: a */
    public static void m15683a(long j) {
    }

    /* renamed from: c */
    public static void m15692c(long j) {
    }

    /* renamed from: d */
    public static void m15693d() {
    }

    private static native boolean doCheckNativeCrash();

    private static native int doCreateCallbackThread();

    private static native void doDelayCheck();

    private static native String doGetCrashHeader(String str);

    private static native long doGetNpthCatchAddr();

    private static native void doPthreadKeyMonitorInit(int i);

    private static native void doRebuildTombstone(String str, String str2, String str3);

    private static native void doSetAlogFlushAddr(long j);

    private static native void doSetCoredumpConfig(String[] strArr);

    private static native void doSetDumpEnvInfoAddr(long j);

    private static native void doSetMallocInfoFunctionAddress(long j);

    private static native void doSetNativeCallbackAddr(long j);

    private static native void doSetUploadEnd();

    private static native int doStartNativeCrashMonitor(int i, String str, String str2, String str3, long j, long j2);

    /* renamed from: c */
    public static int m15691c() {
        if (!f11649b) {
            return -1;
        }
        return doCreateCallbackThread();
    }

    /* renamed from: e */
    public static boolean m15694e() {
        if (!f11649b) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static void m15695f() {
        if (f11649b) {
            doSetUploadEnd();
        }
    }

    /* renamed from: g */
    public static void m15696g() {
        if (f11649b) {
            doDelayCheck();
        }
    }

    /* renamed from: h */
    public static long m15697h() {
        if (!f11649b) {
            return 0;
        }
        return doGetNpthCatchAddr();
    }

    /* renamed from: b */
    public static void m15689b() {
        if (f11649b) {
            C3866n.m16016b().mo15509a(new Runnable() {
                /* class com.bytedance.crash.nativecrash.NativeImpl.RunnableC37861 */

                public void run() {
                    NativeImpl.f11648a = (long) (((double) NativeImpl.f11648a) * 1.4d);
                    NativeImpl.m15696g();
                    if (NativeImpl.f11648a <= 3600000) {
                        C3866n.m16016b().mo15509a(this, NativeImpl.f11648a);
                    }
                }
            }, f11648a);
        }
    }

    /* renamed from: a */
    public static boolean m15686a() {
        if (f11650c) {
            return f11649b;
        }
        f11650c = true;
        if (!f11649b) {
            f11649b = C3929ac.m16296a("npth");
            if (f11649b) {
                f11649b = C3929ac.m16296a("npth_tools");
                doSetDumpEnvInfoAddr(NativeTools.m16236b().mo15623k());
            }
        }
        return f11649b;
    }

    /* renamed from: a */
    public static void m15682a(int i) {
        try {
            doPthreadKeyMonitorInit(i);
        } catch (Throwable unused) {
        }
    }

    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    /* renamed from: a */
    public static String m15681a(String str) {
        if (!f11649b) {
            return null;
        }
        return doGetCrashHeader(str);
    }

    /* renamed from: b */
    public static void m15690b(long j) {
        if (f11649b) {
            try {
                doSetAlogFlushAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m15684a(File file) {
        if (f11649b) {
            doRebuildTombstone(C3962t.m16496d(file).getAbsolutePath(), C3962t.m16492c(file).getAbsolutePath(), C3962t.m16500e(file).getAbsolutePath());
        }
    }

    /* renamed from: b */
    public static String m15688b(Context context) {
        String str = f11651d;
        if (str != null) {
            return str;
        }
        if (new File(context.getApplicationInfo().nativeLibraryDir, "libnpth_dumper.so").exists()) {
            f11651d = context.getApplicationInfo().nativeLibraryDir;
        } else {
            f11651d = C3807h.m15768a();
            f11652e = true;
            C3807h.m15773b("npth_dumper", "3.1.6-rc.53-lark.oversea");
        }
        return f11651d;
    }

    /* renamed from: a */
    public static boolean m15687a(Context context) {
        if (!m15686a()) {
            return true;
        }
        try {
            doStartNativeCrashMonitor(Build.VERSION.SDK_INT, m15688b(context), C3962t.m16522p(context) + "/npth", C3774m.m15606g(), C3774m.m15600b(), C3774m.m15612m());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m15685a(String str, String str2) {
        C3774m.m15598a(str + ".so", str2);
        if (f11652e) {
            C3807h.m15773b(str, str2);
        }
    }
}
