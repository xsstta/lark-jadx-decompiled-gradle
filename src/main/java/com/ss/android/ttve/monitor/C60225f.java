package com.ss.android.ttve.monitor;

import android.content.Context;
import android.os.Build;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ttve.monitor.f */
public class C60225f {

    /* renamed from: a */
    public static List<String> f150321a = new ArrayList<String>() {
        /* class com.ss.android.ttve.monitor.C60225f.C602261 */

        {
            add("os_sdk_int");
            add("external_storage");
            add("screen_height");
            add("screen_width");
            add("storage");
            add("memory");
            add("cpu_core");
            add("cpu_freq");
        }
    };

    /* renamed from: b */
    private static boolean f150322b;

    /* renamed from: c */
    private static boolean f150323c;

    /* renamed from: d */
    private static String f150324d;

    /* renamed from: e */
    private static String f150325e;

    /* renamed from: f */
    private static String f150326f;

    /* renamed from: g */
    private static String f150327g;

    /* renamed from: h */
    private static String f150328h;

    /* renamed from: i */
    private static String f150329i;

    /* renamed from: j */
    private static String f150330j;

    /* renamed from: k */
    private static String f150331k;

    /* renamed from: l */
    private static String f150332l;

    /* renamed from: m */
    private static String f150333m;

    /* renamed from: n */
    private static String f150334n;

    /* renamed from: o */
    private static String f150335o;

    /* renamed from: p */
    private static String f150336p;

    /* renamed from: q */
    private static String f150337q;

    /* renamed from: a */
    public static Map<String, String> m234080a() {
        HashMap hashMap = new HashMap();
        hashMap.put("model", f150324d);
        hashMap.put("cpu", f150325e);
        hashMap.put("cpu_freq", f150326f);
        hashMap.put("cpu_core", f150327g);
        hashMap.put("memory", f150328h);
        hashMap.put("storage", f150329i);
        hashMap.put("external_storage", f150330j);
        hashMap.put("screen_width", f150331k);
        hashMap.put("screen_height", f150332l);
        hashMap.put("os_sdk_int", f150333m);
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, f150334n);
        hashMap.put("abi", f150335o);
        hashMap.put("brand", f150336p);
        if (!f150323c) {
            f150337q = "9.9.0.301";
            f150323c = true;
        }
        hashMap.put("ve_version", f150337q);
        return hashMap;
    }

    /* renamed from: b */
    private static String m234082b() {
        if (Build.VERSION.SDK_INT >= 21) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i++) {
                    sb.append(strArr[i]);
                    if (i != strArr.length - 1) {
                        sb.append(",");
                    }
                }
            }
            return sb.toString();
        }
        return Build.CPU_ABI + "," + Build.CPU_ABI2;
    }

    /* renamed from: a */
    public static void m234081a(Context context) {
        if (!f150322b) {
            synchronized (C60225f.class) {
                if (!f150322b) {
                    m234083b(context.getApplicationContext());
                    f150322b = true;
                }
            }
        }
    }

    /* renamed from: b */
    private static void m234083b(Context context) {
        f150324d = Build.MODEL;
        f150325e = C60221d.m234058a();
        f150326f = C60221d.m234063b();
        f150327g = String.valueOf(C60221d.m234064c());
        f150328h = String.valueOf(C60221d.m234066d());
        f150329i = String.valueOf(C60221d.m234067e());
        f150330j = String.valueOf(C60221d.m234057a(context));
        f150333m = String.valueOf(Build.VERSION.SDK_INT);
        f150331k = String.valueOf(C60221d.m234061b(context));
        f150332l = String.valueOf(C60221d.m234065c(context));
        f150334n = context.getPackageName();
        f150335o = m234082b();
        f150336p = Build.BRAND;
    }
}
