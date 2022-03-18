package com.bytedance.crash.util;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

/* renamed from: com.bytedance.crash.util.aa */
public class C3927aa {

    /* renamed from: a */
    private static final CharSequence f12023a = "sony";

    /* renamed from: b */
    private static final CharSequence f12024b = "amigo";

    /* renamed from: c */
    private static final CharSequence f12025c = "funtouch";

    /* renamed from: d */
    private static int f12026d = -1;

    /* renamed from: j */
    public static boolean m16288j() {
        return !TextUtils.isEmpty(m16279a("ro.letv.release.version"));
    }

    /* renamed from: b */
    public static String m16280b() {
        return m16279a("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* renamed from: f */
    public static boolean m16284f() {
        String a = m16279a("ro.vivo.os.build.display.id");
        if (TextUtils.isEmpty(a) || !a.toLowerCase(Locale.getDefault()).contains(f12025c)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m16285g() {
        if (TextUtils.isEmpty(Build.DISPLAY) || !Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(f12024b)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static String m16286h() {
        return Build.DISPLAY + "_" + m16279a("ro.gn.sv.version");
    }

    /* renamed from: m */
    public static String m16291m() {
        String str = Build.DISPLAY;
        if (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) {
            return "";
        }
        return str;
    }

    /* renamed from: n */
    public static boolean m16292n() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m16281c() {
        int i = f12026d;
        if (i == -1) {
            try {
                if (Class.forName("ohos.utils.system.SystemCapability") != null) {
                    f12026d = 1;
                } else {
                    f12026d = 0;
                }
            } catch (Throwable unused) {
                f12026d = 0;
            }
            if (f12026d == 1) {
                return true;
            }
            return false;
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m16282d() {
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

    /* renamed from: e */
    public static String m16283e() {
        return m16279a("ro.vivo.os.build.display.id") + "_" + m16279a("ro.vivo.product.version");
    }

    /* renamed from: i */
    public static String m16287i() {
        if (!m16288j()) {
            return "";
        }
        return "eui_" + m16279a("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* renamed from: k */
    public static String m16289k() {
        if (!C3942g.m16369c()) {
            return "";
        }
        return "miui_" + m16279a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* renamed from: l */
    public static String m16290l() {
        String a = C3942g.m16365a();
        if (a == null || !a.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        return a + "_" + Build.DISPLAY;
    }

    /* renamed from: o */
    public static String m16293o() {
        if (!m16292n()) {
            return "";
        }
        return "coloros_" + m16279a("ro.build.version.opporom") + "_" + Build.DISPLAY;
    }

    /* renamed from: a */
    public static String m16278a() {
        if (C3942g.m16369c()) {
            return m16289k();
        }
        if (C3942g.m16370d()) {
            return m16291m();
        }
        if (m16292n()) {
            return m16293o();
        }
        String l = m16290l();
        if (!TextUtils.isEmpty(l)) {
            return l;
        }
        if (m16284f()) {
            return m16283e();
        }
        if (m16285g()) {
            return m16286h();
        }
        if (m16282d()) {
            return m16280b();
        }
        String i = m16287i();
        if (!TextUtils.isEmpty(i)) {
            return i;
        }
        return Build.DISPLAY;
    }

    /* renamed from: a */
    public static String m16279a(String str) {
        String str2 = "";
        BufferedReader bufferedReader = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            Process exec = runtime.exec("getprop " + str);
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
            try {
                str2 = bufferedReader2.readLine();
                exec.destroy();
                C3954p.m16437a(bufferedReader2);
                return str2;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C3954p.m16437a(bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            C3954p.m16437a(bufferedReader);
            return str2;
        }
    }
}
