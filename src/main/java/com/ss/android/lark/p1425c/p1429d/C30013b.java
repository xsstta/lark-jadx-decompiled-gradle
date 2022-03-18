package com.ss.android.lark.p1425c.p1429d;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* renamed from: com.ss.android.lark.c.d.b */
public final class C30013b {

    /* renamed from: a */
    private static final String[] f74853a = {"huawei"};

    /* renamed from: b */
    private static final String[] f74854b = {"vivo"};

    /* renamed from: c */
    private static final String[] f74855c = {"xiaomi"};

    /* renamed from: d */
    private static final String[] f74856d = {"oppo"};

    /* renamed from: e */
    private static final String[] f74857e = {"leeco", "letv"};

    /* renamed from: f */
    private static final String[] f74858f = {"360", "qiku"};

    /* renamed from: g */
    private static final String[] f74859g = {"zte"};

    /* renamed from: h */
    private static final String[] f74860h = {"oneplus"};

    /* renamed from: i */
    private static final String[] f74861i = {"nubia"};

    /* renamed from: j */
    private static final String[] f74862j = {"coolpad", "yulong"};

    /* renamed from: k */
    private static final String[] f74863k = {"lg", "lge"};

    /* renamed from: l */
    private static final String[] f74864l = {"google"};

    /* renamed from: m */
    private static final String[] f74865m = {"samsung"};

    /* renamed from: n */
    private static final String[] f74866n = {"meizu"};

    /* renamed from: o */
    private static final String[] f74867o = {"lenovo"};

    /* renamed from: p */
    private static final String[] f74868p = {"smartisan"};

    /* renamed from: q */
    private static final String[] f74869q = {"htc"};

    /* renamed from: r */
    private static final String[] f74870r = {"sony"};

    /* renamed from: s */
    private static final String[] f74871s = {"gionee", "amigo"};

    /* renamed from: t */
    private static final String[] f74872t = {"motorola"};

    /* renamed from: u */
    private static C30014a f74873u;

    /* renamed from: a */
    public static boolean m110982a() {
        return f74857e[0].equals(m110986c().f74874a);
    }

    /* renamed from: b */
    public static boolean m110985b() {
        return f74865m[0].equals(m110986c().f74874a);
    }

    /* renamed from: d */
    private static String m110988d() {
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                return str.toLowerCase();
            }
            return "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: e */
    private static String m110990e() {
        try {
            String str = Build.BRAND;
            if (!TextUtils.isEmpty(str)) {
                return str.toLowerCase();
            }
            return "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: com.ss.android.lark.c.d.b$a */
    public static class C30014a {

        /* renamed from: a */
        public String f74874a;

        /* renamed from: b */
        public String f74875b;

        public String toString() {
            return "RomInfo{name=" + this.f74874a + ", version=" + this.f74875b + "}";
        }
    }

    /* renamed from: c */
    public static C30014a m110986c() {
        C30014a aVar = f74873u;
        if (aVar != null) {
            return aVar;
        }
        f74873u = new C30014a();
        String e = m110990e();
        String d = m110988d();
        String[] strArr = f74853a;
        if (m110983a(e, d, strArr)) {
            f74873u.f74874a = strArr[0];
            String a = m110981a("ro.build.version.emui");
            String[] split = a.split("_");
            if (split.length > 1) {
                f74873u.f74875b = split[1];
            } else {
                f74873u.f74875b = a;
            }
            return f74873u;
        }
        String[] strArr2 = f74854b;
        if (m110983a(e, d, strArr2)) {
            f74873u.f74874a = strArr2[0];
            f74873u.f74875b = m110981a("ro.vivo.os.build.display.id");
            return f74873u;
        }
        String[] strArr3 = f74855c;
        if (m110983a(e, d, strArr3)) {
            f74873u.f74874a = strArr3[0];
            f74873u.f74875b = m110981a("ro.build.version.incremental");
            return f74873u;
        }
        String[] strArr4 = f74856d;
        if (m110983a(e, d, strArr4)) {
            f74873u.f74874a = strArr4[0];
            f74873u.f74875b = m110981a("ro.build.version.opporom");
            return f74873u;
        }
        String[] strArr5 = f74857e;
        if (m110983a(e, d, strArr5)) {
            f74873u.f74874a = strArr5[0];
            f74873u.f74875b = m110981a("ro.letv.release.version");
            return f74873u;
        }
        String[] strArr6 = f74858f;
        if (m110983a(e, d, strArr6)) {
            f74873u.f74874a = strArr6[0];
            f74873u.f74875b = m110981a("ro.build.uiversion");
            return f74873u;
        }
        String[] strArr7 = f74859g;
        if (m110983a(e, d, strArr7)) {
            f74873u.f74874a = strArr7[0];
            f74873u.f74875b = m110981a("ro.build.MiFavor_version");
            return f74873u;
        }
        String[] strArr8 = f74860h;
        if (m110983a(e, d, strArr8)) {
            f74873u.f74874a = strArr8[0];
            f74873u.f74875b = m110981a("ro.rom.version");
            return f74873u;
        }
        String[] strArr9 = f74861i;
        if (m110983a(e, d, strArr9)) {
            f74873u.f74874a = strArr9[0];
            f74873u.f74875b = m110981a("ro.build.rom.id");
            return f74873u;
        }
        String[] strArr10 = f74862j;
        if (m110983a(e, d, strArr10)) {
            f74873u.f74874a = strArr10[0];
        } else {
            String[] strArr11 = f74863k;
            if (m110983a(e, d, strArr11)) {
                f74873u.f74874a = strArr11[0];
            } else {
                String[] strArr12 = f74864l;
                if (m110983a(e, d, strArr12)) {
                    f74873u.f74874a = strArr12[0];
                } else {
                    String[] strArr13 = f74865m;
                    if (m110983a(e, d, strArr13)) {
                        f74873u.f74874a = strArr13[0];
                    } else {
                        String[] strArr14 = f74866n;
                        if (m110983a(e, d, strArr14)) {
                            f74873u.f74874a = strArr14[0];
                        } else {
                            String[] strArr15 = f74867o;
                            if (m110983a(e, d, strArr15)) {
                                f74873u.f74874a = strArr15[0];
                            } else {
                                String[] strArr16 = f74868p;
                                if (m110983a(e, d, strArr16)) {
                                    f74873u.f74874a = strArr16[0];
                                } else {
                                    String[] strArr17 = f74869q;
                                    if (m110983a(e, d, strArr17)) {
                                        f74873u.f74874a = strArr17[0];
                                    } else {
                                        String[] strArr18 = f74870r;
                                        if (m110983a(e, d, strArr18)) {
                                            f74873u.f74874a = strArr18[0];
                                        } else {
                                            String[] strArr19 = f74871s;
                                            if (m110983a(e, d, strArr19)) {
                                                f74873u.f74874a = strArr19[0];
                                            } else {
                                                String[] strArr20 = f74872t;
                                                if (m110983a(e, d, strArr20)) {
                                                    f74873u.f74874a = strArr20[0];
                                                } else {
                                                    f74873u.f74874a = d;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        f74873u.f74875b = m110981a("");
        return f74873u;
    }

    /* renamed from: d */
    private static String m110989d(String str) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static String m110981a(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = m110984b(str);
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2) || str2.equals("unknown")) {
            try {
                String str3 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str3.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return "unknown";
        }
        return str2;
    }

    /* renamed from: b */
    private static String m110984b(String str) {
        String c = m110987c(str);
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        String d = m110989d(str);
        if (TextUtils.isEmpty(d) && Build.VERSION.SDK_INT < 28) {
            return m110991e(str);
        }
        return d;
    }

    /* renamed from: e */
    private static String m110991e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[SYNTHETIC, Splitter:B:18:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m110987c(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            r2.<init>()     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            r2.append(r4)     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.lang.Process r4 = r1.exec(r4)     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.lang.String r4 = r1.readLine()     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            if (r4 == 0) goto L_0x0034
            r1.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            return r4
        L_0x0034:
            r1.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004a
        L_0x0038:
            r4 = move-exception
            r0 = r1
            goto L_0x003e
        L_0x003b:
            r0 = r1
            goto L_0x0045
        L_0x003d:
            r4 = move-exception
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            throw r4
        L_0x0044:
        L_0x0045:
            if (r0 == 0) goto L_0x004a
            r0.close()
        L_0x004a:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.p1425c.p1429d.C30013b.m110987c(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static boolean m110983a(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }
}
