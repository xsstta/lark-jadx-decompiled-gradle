package com.bytedance.lynx.webview.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Environment;
import android.os.Trace;
import android.text.TextUtils;
import com.bytedance.lynx.webview.internal.C20011y;
import com.bytedance.lynx.webview.internal.DownloadEventType;
import com.bytedance.lynx.webview.internal.EventType;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: com.bytedance.lynx.webview.util.d */
public final class C20043d {
    /* renamed from: b */
    private static boolean m73140b() {
        if (m73141c() > 100) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static long m73141c() {
        return (Environment.getDataDirectory().getFreeSpace() / 1024) / 1024;
    }

    /* renamed from: a */
    public static boolean m73137a() {
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str : Build.SUPPORTED_ABIS) {
                sb.append(str);
                sb.append('#');
            }
        } else {
            sb.append(Build.CPU_ABI);
        }
        String lowerCase = sb.toString().toLowerCase(Locale.getDefault());
        if (TextUtils.isEmpty(lowerCase) || lowerCase.contains("x86") || !lowerCase.contains("arm")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static Method m73142d() {
        Method method = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Trace.beginSection("getAddAssetPathMethod1");
                method = AssetManager.class.getDeclaredMethod("addAssetPathAsSharedLibrary", String.class);
                method.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
            Trace.endSection();
            return method;
        }
        try {
            Trace.beginSection("getAddAssetPathMethod2");
            method = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
            method.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
        Trace.endSection();
        return method;
    }

    /* renamed from: a */
    public static boolean m73138a(Context context) {
        if (!C20049h.m73170b(context)) {
            C20011y.m72976a();
            if (C20011y.f48893a.get() == 0) {
                C20011y.m72976a().mo67939v().mo67811a(EventType.DISABLED_BY_NO_WIFI);
                return false;
            }
        }
        C20026a.m73079a(DownloadEventType.HasDownloadEnv_wifi_enable);
        C20011y.m72976a();
        if (C20011y.f48893a.get() > 0) {
            C20011y.m72976a();
            C20011y.f48893a.getAndDecrement();
        } else if (C20011y.m72976a().mo67910O()) {
            C20011y.m72976a().mo67939v().mo67811a(EventType.DISABLED_BY_APP_NOT_STABLE);
            return false;
        }
        if (!m73140b()) {
            C20011y.m72976a().mo67939v().mo67811a(EventType.DISABLED_BY_NO_MEMORY);
            return false;
        }
        C20026a.m73079a(DownloadEventType.HasDownloadEnv_memory_enable);
        return true;
    }

    /* renamed from: a */
    public static boolean m73139a(Context context, String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Trace.beginSection("addResource");
            Method d = m73142d();
            C20048g.m73161a("getAddAssetPathMethod m = " + d);
            if (d != null) {
                int intValue = ((Integer) d.invoke(context.getAssets(), str)).intValue();
                C20048g.m73161a("invoke ret = " + intValue + " , success for " + context);
                if (intValue > 0) {
                    z = true;
                }
                Trace.endSection();
                return z;
            }
        } catch (Exception e) {
            C20048g.m73162b("[init host res] : invoke method error ! ", e.toString());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        Trace.endSection();
        return false;
    }
}
