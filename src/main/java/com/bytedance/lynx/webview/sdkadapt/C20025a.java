package com.bytedance.lynx.webview.sdkadapt;

import android.text.TextUtils;
import com.bytedance.lynx.webview.internal.C19958i;
import com.bytedance.lynx.webview.internal.C19986s;
import com.bytedance.lynx.webview.internal.C19996t;
import com.bytedance.lynx.webview.internal.LoadEventType;

/* renamed from: com.bytedance.lynx.webview.sdkadapt.a */
public class C20025a {

    /* renamed from: a */
    private static String f48947a;

    /* renamed from: a */
    public static void m73069a(String str) {
        f48947a = str;
    }

    /* renamed from: c */
    public static boolean m73072c(String str) {
        return m73075f(str).startsWith("062");
    }

    /* renamed from: d */
    public static String m73073d(String str) {
        if (m73071b(str)) {
            return "ttwebview_res.apk";
        }
        return "libbytedanceweb.apk";
    }

    /* renamed from: b */
    public static boolean m73071b(String str) {
        if (Integer.parseInt(m73075f(str).substring(0, 3)) >= Integer.parseInt("075")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m73074e(String str) {
        if (str.length() == 10 && str.endsWith("0010001")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static String m73075f(String str) {
        C19996t c = C19986s.m72924a().mo67862c(str);
        if (c != null) {
            return c.mo67875b();
        }
        String str2 = f48947a;
        if (str2 != null) {
            return str2;
        }
        throw new RuntimeException("load soVersion error!");
    }

    /* renamed from: a */
    public static boolean m73070a(String str, C19958i.C19969b bVar) {
        if (TextUtils.isEmpty(str) || m73074e(str)) {
            return true;
        }
        bVar.mo67797a(LoadEventType.CheckSoVersion_has_cachesoVersionCode);
        if (str.length() >= 10) {
            bVar.mo67797a(LoadEventType.CheckSoVersion_not_old_soVersion);
            if (str.compareToIgnoreCase("0621130004009") < 0 || str.length() != Version.f48945f.length() || str.substring(3, 6).compareToIgnoreCase("113") < 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
