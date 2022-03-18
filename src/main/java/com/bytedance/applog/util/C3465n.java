package com.bytedance.applog.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.bytedance.applog.util.n */
public class C3465n {

    /* renamed from: a */
    private static final CharSequence f10984a = "sony";

    /* renamed from: b */
    private static final CharSequence f10985b = "amigo";

    /* renamed from: c */
    private static final CharSequence f10986c = "funtouch";

    /* renamed from: k */
    public static boolean m14647k() {
        return !TextUtils.isEmpty(m14638b("ro.letv.release.version"));
    }

    /* renamed from: s */
    private static String m14655s() {
        if (Build.MANUFACTURER == null) {
            return "";
        }
        return Build.MANUFACTURER.trim();
    }

    /* renamed from: c */
    public static String m14639c() {
        return m14638b("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* renamed from: f */
    public static boolean m14642f() {
        if ((TextUtils.isEmpty(Build.DISPLAY) || !Build.DISPLAY.contains("Flyme")) && !"flyme".equals(Build.USER)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m14643g() {
        String b = m14638b("ro.vivo.os.build.display.id");
        if (TextUtils.isEmpty(b) || !b.toLowerCase().contains(f10986c)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m14644h() {
        if (TextUtils.isEmpty(Build.DISPLAY) || !Build.DISPLAY.toLowerCase().contains(f10985b)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static String m14645i() {
        return Build.DISPLAY + "_" + m14638b("ro.gn.sv.version");
    }

    /* renamed from: m */
    public static boolean m14649m() {
        try {
            if (Class.forName("miui.os.Build").getName().length() > 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: p */
    public static String m14652p() {
        String str = Build.DISPLAY;
        if (str == null || !str.toLowerCase().contains("flyme")) {
            return "";
        }
        return str;
    }

    /* renamed from: q */
    public static boolean m14653q() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase().contains("oppo");
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f A[SYNTHETIC, Splitter:B:15:0x002f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14634a() {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "getprop ro.build.version.emui"
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ all -> 0x0028 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0028 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0028 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ all -> 0x0028 }
            r3.<init>(r1)     // Catch:{ all -> 0x0028 }
            r1 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0026 }
            r2.close()     // Catch:{ all -> 0x0026 }
            r2.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            return r0
        L_0x0026:
            r1 = move-exception
            goto L_0x002a
        L_0x0028:
            r1 = move-exception
            r2 = r0
        L_0x002a:
            com.bytedance.applog.util.C3469r.m14667a(r1)     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0032
            r2.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        L_0x0033:
            r0 = move-exception
            if (r2 == 0) goto L_0x0039
            r2.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.util.C3465n.m14634a():java.lang.String");
    }

    /* renamed from: d */
    public static boolean m14640d() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m14641e() {
        return m14638b("ro.vivo.os.build.display.id") + "_" + m14638b("ro.vivo.product.version");
    }

    /* renamed from: j */
    public static String m14646j() {
        if (!m14647k()) {
            return "";
        }
        return "eui_" + m14638b("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* renamed from: l */
    public static boolean m14648l() {
        if ((TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith("huawei")) && (TextUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase().startsWith("huawei"))) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static String m14650n() {
        if (!m14649m()) {
            return "";
        }
        return "miui_" + m14638b("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* renamed from: o */
    public static String m14651o() {
        String a = m14634a();
        if (a == null || !a.toLowerCase().contains("emotionui")) {
            return "";
        }
        return a + "_" + Build.DISPLAY;
    }

    /* renamed from: r */
    public static String m14654r() {
        if (!m14653q()) {
            return "";
        }
        return "coloros_" + m14638b("ro.build.version.opporom") + "_" + Build.DISPLAY;
    }

    /* renamed from: b */
    public static String m14637b() {
        if (m14649m()) {
            return m14650n();
        }
        if (m14642f()) {
            return m14652p();
        }
        if (m14653q()) {
            return m14654r();
        }
        String o = m14651o();
        if (!TextUtils.isEmpty(o)) {
            return o;
        }
        if (m14643g()) {
            return m14641e();
        }
        if (m14644h()) {
            return m14645i();
        }
        if (m14640d()) {
            return m14639c();
        }
        String j = m14646j();
        if (!TextUtils.isEmpty(j)) {
            return j;
        }
        return Build.DISPLAY;
    }

    /* renamed from: a */
    public static boolean m14635a(Context context) {
        return m14655s().toUpperCase().contains("HUAWEI");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[SYNTHETIC, Splitter:B:13:0x003c] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m14638b(java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r3.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r4 = "getprop "
            r3.append(r4)     // Catch:{ all -> 0x0039 }
            r3.append(r5)     // Catch:{ all -> 0x0039 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0039 }
            java.lang.Process r5 = r2.exec(r5)     // Catch:{ all -> 0x0039 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0039 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0039 }
            java.io.InputStream r4 = r5.getInputStream()     // Catch:{ all -> 0x0039 }
            r3.<init>(r4)     // Catch:{ all -> 0x0039 }
            r4 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0037 }
            r5.destroy()     // Catch:{ all -> 0x0037 }
            r2.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            return r0
        L_0x0037:
            r1 = r2
            goto L_0x003a
        L_0x0039:
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.util.C3465n.m14638b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m14636a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m14634a();
        }
        if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("emotionui")) {
            return m14648l();
        }
        return true;
    }
}
