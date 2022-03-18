package com.bytedance.apm6.util;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: com.bytedance.apm6.util.h */
public class C3358h {

    /* renamed from: a */
    public static boolean f10643a;

    /* renamed from: b */
    public static boolean f10644b;

    /* renamed from: c */
    private static final CharSequence f10645c = "sony";

    /* renamed from: d */
    private static final CharSequence f10646d = "amigo";

    /* renamed from: e */
    private static final CharSequence f10647e = "funtouch";

    /* renamed from: f */
    private static String f10648f;

    /* renamed from: g */
    private static Method f10649g;

    /* renamed from: i */
    public static boolean m13979i() {
        return !TextUtils.isEmpty(m13970a("ro.letv.release.version"));
    }

    /* renamed from: r */
    public static boolean m13988r() {
        try {
            if (Class.forName("miui.os.Build") != null) {
                f10643a = true;
                return true;
            }
        } catch (Exception unused) {
        }
        return f10643a;
    }

    /* renamed from: a */
    public static String m13969a() {
        if (f10644b && !TextUtils.isEmpty(f10648f)) {
            return f10648f;
        }
        String s = m13989s();
        f10648f = s;
        return s;
    }

    /* renamed from: b */
    public static String m13971b() {
        return m13970a("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* renamed from: e */
    public static boolean m13975e() {
        String a = m13970a("ro.vivo.os.build.display.id");
        if (TextUtils.isEmpty(a) || !a.toLowerCase(Locale.getDefault()).contains(f10647e)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m13976f() {
        if (TextUtils.isEmpty(Build.DISPLAY) || !Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(f10646d)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static String m13977g() {
        return Build.DISPLAY + "_" + m13970a("ro.gn.sv.version");
    }

    /* renamed from: l */
    public static String m13982l() {
        String str = Build.DISPLAY;
        if (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    public static boolean m13983m() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m13985o() {
        if (Build.DISPLAY.contains("Flyme") || "flyme".equals(Build.USER)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static String m13986p() {
        if (Build.VERSION.SDK_INT >= 21) {
            return m13970a("ro.build.version.emui");
        }
        return m13987q();
    }

    /* renamed from: c */
    public static boolean m13973c() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static String m13974d() {
        return m13970a("ro.vivo.os.build.display.id") + "_" + m13970a("ro.vivo.product.version");
    }

    /* renamed from: h */
    public static String m13978h() {
        if (!m13979i()) {
            return "";
        }
        return "eui_" + m13970a("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* renamed from: j */
    public static String m13980j() {
        if (!m13988r()) {
            return "";
        }
        return "miui_" + m13970a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* renamed from: k */
    public static String m13981k() {
        String p = m13986p();
        if (p == null || !p.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        return p + "_" + Build.DISPLAY;
    }

    /* renamed from: n */
    public static String m13984n() {
        if (!m13983m()) {
            return "";
        }
        return "coloros_" + m13970a("ro.build.version.opporom") + "_" + Build.DISPLAY;
    }

    /* renamed from: q */
    public static String m13987q() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "ro.build.version.emui");
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: s */
    private static String m13989s() {
        if (m13988r()) {
            return m13980j();
        }
        if (m13985o()) {
            return m13982l();
        }
        if (m13983m()) {
            return m13984n();
        }
        String k = m13981k();
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        if (m13975e()) {
            return m13974d();
        }
        if (m13976f()) {
            return m13977g();
        }
        if (m13973c()) {
            return m13971b();
        }
        String h = m13978h();
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        f10644b = true;
        return Build.DISPLAY;
    }

    /* renamed from: b */
    private static String m13972b(String str) {
        try {
            if (f10649g == null) {
                f10649g = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            }
            return (String) f10649g.invoke(null, str);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private static String m13970a(String str) {
        String b = m13972b(str);
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        String str2 = "";
        BufferedReader bufferedReader = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            Process exec = runtime.exec("getprop " + str);
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
            try {
                str2 = bufferedReader2.readLine();
                exec.destroy();
                C3354d.m13949a(bufferedReader2);
                return str2;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C3354d.m13949a(bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            C3354d.m13949a(bufferedReader);
            return str2;
        }
    }
}
