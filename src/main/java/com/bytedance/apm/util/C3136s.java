package com.bytedance.apm.util;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.monitor.util.C20172c;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: com.bytedance.apm.util.s */
public class C3136s {

    /* renamed from: a */
    public static boolean f10076a;

    /* renamed from: b */
    public static boolean f10077b;

    /* renamed from: c */
    private static final CharSequence f10078c = "sony";

    /* renamed from: d */
    private static final CharSequence f10079d = "amigo";

    /* renamed from: e */
    private static final CharSequence f10080e = "funtouch";

    /* renamed from: f */
    private static String f10081f;

    /* renamed from: g */
    private static Method f10082g;

    /* renamed from: i */
    public static boolean m13061i() {
        return !TextUtils.isEmpty(m13052a("ro.letv.release.version"));
    }

    /* renamed from: s */
    public static boolean m13071s() {
        try {
            if (Class.forName("miui.os.Build") != null) {
                f10076a = true;
                return true;
            }
        } catch (Exception unused) {
        }
        return f10076a;
    }

    /* renamed from: a */
    public static String m13051a() {
        if (f10077b && !TextUtils.isEmpty(f10081f)) {
            return f10081f;
        }
        String t = m13072t();
        f10081f = t;
        return t;
    }

    /* renamed from: b */
    public static String m13053b() {
        return m13052a("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* renamed from: e */
    public static boolean m13057e() {
        String a = m13052a("ro.vivo.os.build.display.id");
        if (TextUtils.isEmpty(a) || !a.toLowerCase(Locale.getDefault()).contains(f10080e)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m13058f() {
        if (TextUtils.isEmpty(Build.DISPLAY) || !Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(f10079d)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static String m13059g() {
        return Build.DISPLAY + "_" + m13052a("ro.gn.sv.version");
    }

    /* renamed from: l */
    public static String m13064l() {
        String str = Build.DISPLAY;
        if (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    public static boolean m13065m() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m13067o() {
        if (Build.DISPLAY.contains("Flyme") || "flyme".equals(Build.USER)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static String m13069q() {
        if (Build.VERSION.SDK_INT >= 21) {
            return m13052a("ro.build.version.emui");
        }
        return m13070r();
    }

    /* renamed from: c */
    public static boolean m13055c() {
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
    public static String m13056d() {
        return m13052a("ro.vivo.os.build.display.id") + "_" + m13052a("ro.vivo.product.version");
    }

    /* renamed from: h */
    public static String m13060h() {
        if (!m13061i()) {
            return "";
        }
        return "eui_" + m13052a("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* renamed from: j */
    public static String m13062j() {
        if (!m13071s()) {
            return "";
        }
        return "miui_" + m13052a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* renamed from: k */
    public static String m13063k() {
        String q = m13069q();
        if (q == null || !q.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        return q + "_" + Build.DISPLAY;
    }

    /* renamed from: n */
    public static String m13066n() {
        if (!m13065m()) {
            return "";
        }
        return "coloros_" + m13052a("ro.build.version.opporom") + "_" + Build.DISPLAY;
    }

    /* renamed from: p */
    public static boolean m13068p() {
        try {
            if ((TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith("hua")) && (TextUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase().startsWith("hua"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: r */
    public static String m13070r() {
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

    /* renamed from: t */
    private static String m13072t() {
        if (m13071s()) {
            return m13062j();
        }
        if (m13067o()) {
            return m13064l();
        }
        if (m13065m()) {
            return m13066n();
        }
        String k = m13063k();
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        if (m13057e()) {
            return m13056d();
        }
        if (m13058f()) {
            return m13059g();
        }
        if (m13055c()) {
            return m13053b();
        }
        String h = m13060h();
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        f10077b = true;
        return Build.DISPLAY;
    }

    /* renamed from: b */
    private static String m13054b(String str) {
        try {
            if (f10082g == null) {
                f10082g = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            }
            return (String) f10082g.invoke(null, str);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private static String m13052a(String str) {
        String b = m13054b(str);
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
                C20172c.m73614a(bufferedReader2);
                return str2;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C20172c.m73614a(bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            C20172c.m73614a(bufferedReader);
            return str2;
        }
    }
}
