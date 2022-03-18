package com.bytedance.crash.p218b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.AbstractC3749f;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.util.C3930ad;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3969y;
import com.huawei.hms.feature.dynamic.DynamicModule;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.e */
public class C3700e {

    /* renamed from: a */
    public static String f11392a = null;

    /* renamed from: b */
    private static long f11393b = -1;

    /* renamed from: c */
    private static boolean f11394c;

    /* renamed from: d */
    private static FileObserver f11395d;

    /* renamed from: e */
    private static ActivityManager.ProcessErrorStateInfo f11396e;

    /* renamed from: c */
    public static void m15246c() {
    }

    /* renamed from: b */
    public static boolean m15245b() {
        return f11394c;
    }

    /* renamed from: a */
    public static JSONObject m15242a() {
        try {
            return m15243a(C3930ad.m16301a(Looper.getMainLooper().getThread().getStackTrace()));
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m15243a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", str);
            return jSONObject;
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: a */
    static String m15240a(Context context, int i) {
        return m15241a(context, i, null);
    }

    /* renamed from: a */
    public static void m15244a(final String str, final AbstractC3749f fVar) {
        FileObserver fileObserver = f11395d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserverC37011 r0 = new FileObserver(136, str) {
            /* class com.bytedance.crash.p218b.C3700e.FileObserverC37011 */

            public void onEvent(int i, String str) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        C3700e.f11392a = fVar.mo15272a(str, str);
                    } catch (Throwable th) {
                        C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                    }
                }
            }
        };
        f11395d = r0;
        r0.startWatching();
    }

    /* renamed from: a */
    static String m15241a(Context context, int i, int[] iArr) {
        if (C3969y.m16550a((int) DynamicModule.f58006b)) {
            f11394c = false;
            return "TEST_ANR_INFO";
        } else if (SystemClock.uptimeMillis() - f11393b < 5000) {
            return null;
        } else {
            try {
                ActivityManager.ProcessErrorStateInfo a = C3933b.m16326a(context, i);
                if (a != null && (Process.myPid() == a.pid || (iArr != null && a.processName.contains(context.getPackageName())))) {
                    ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f11396e;
                    if (processErrorStateInfo == null || !C3692a.m15206a(processErrorStateInfo, a)) {
                        f11396e = a;
                        f11392a = null;
                        f11393b = SystemClock.uptimeMillis();
                        f11394c = false;
                        if (iArr != null) {
                            iArr[0] = a.pid;
                        }
                        return C3692a.m15205a(a);
                    }
                    f11393b = SystemClock.uptimeMillis();
                    return null;
                }
            } catch (Throwable unused) {
            }
            String str = f11392a;
            if (str == null) {
                return null;
            }
            if (iArr != null) {
                iArr[0] = Process.myPid();
            }
            f11394c = true;
            f11392a = null;
            f11393b = SystemClock.uptimeMillis();
            return str;
        }
    }
}
