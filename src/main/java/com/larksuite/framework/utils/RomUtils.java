package com.larksuite.framework.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.log.Log;
import com.ss.ttm.player.MediaPlayer;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class RomUtils {

    /* renamed from: a */
    private static final String[] f64803a = {"huawei"};

    /* renamed from: b */
    private static final String[] f64804b = {"vivo"};

    /* renamed from: c */
    private static final String[] f64805c = {"xiaomi"};

    /* renamed from: d */
    private static final String[] f64806d = {"oppo"};

    /* renamed from: e */
    private static final String[] f64807e = {"leeco", "letv"};

    /* renamed from: f */
    private static final String[] f64808f = {"360", "qiku"};

    /* renamed from: g */
    private static final String[] f64809g = {"zte"};

    /* renamed from: h */
    private static final String[] f64810h = {"oneplus"};

    /* renamed from: i */
    private static final String[] f64811i = {"nubia"};

    /* renamed from: j */
    private static final String[] f64812j = {"coolpad", "yulong"};

    /* renamed from: k */
    private static final String[] f64813k = {"lg", "lge"};

    /* renamed from: l */
    private static final String[] f64814l = {"google"};

    /* renamed from: m */
    private static final String[] f64815m = {"samsung"};

    /* renamed from: n */
    private static final String[] f64816n = {"meizu"};

    /* renamed from: o */
    private static final String[] f64817o = {"lenovo"};

    /* renamed from: p */
    private static final String[] f64818p = {"smartisan"};

    /* renamed from: q */
    private static final String[] f64819q = {"htc"};

    /* renamed from: r */
    private static final String[] f64820r = {"sony"};

    /* renamed from: s */
    private static final String[] f64821s = {"gionee", "amigo"};

    /* renamed from: t */
    private static final String[] f64822t = {"motorola"};

    /* renamed from: u */
    private static C26241a f64823u;

    /* renamed from: v */
    private static boolean f64824v = true;

    public enum RomType {
        UNKNOWN(0),
        ROM_EMUI(1),
        ROM_VIVO(2),
        ROM_MIUI(3),
        ROM_OPPO(4),
        ROM_LEECO(5),
        ROM_360(6),
        ROM_ZTE(7),
        ROM_ONEPLUS(8),
        ROM_NUBIA(9),
        ROM_COOLPAD(10),
        ROM_LG(11),
        ROM_GOOGLE(12),
        ROM_SAMSUNG(13),
        ROM_FLYME(14),
        ROM_LENOVO(15),
        ROM_SMARTISAN(16),
        ROM_HTC(17),
        ROM_SONY(18),
        ROM_GIONEE(19),
        ROM_MOTOROLA(20);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static RomType valueOf(int i) {
            return forNumber(i);
        }

        public static RomType forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return ROM_EMUI;
                case 2:
                    return ROM_VIVO;
                case 3:
                    return ROM_MIUI;
                case 4:
                    return ROM_OPPO;
                case 5:
                    return ROM_LEECO;
                case 6:
                    return ROM_360;
                case 7:
                    return ROM_ZTE;
                case 8:
                    return ROM_ONEPLUS;
                case 9:
                    return ROM_NUBIA;
                case 10:
                    return ROM_COOLPAD;
                case 11:
                    return ROM_LG;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return ROM_GOOGLE;
                case 13:
                    return ROM_SAMSUNG;
                case 14:
                    return ROM_FLYME;
                case 15:
                    return ROM_LENOVO;
                case 16:
                    return ROM_SMARTISAN;
                case 17:
                    return ROM_HTC;
                case 18:
                    return ROM_SONY;
                case 19:
                    return ROM_GIONEE;
                case 20:
                    return ROM_MOTOROLA;
                default:
                    return UNKNOWN;
            }
        }

        private RomType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.larksuite.framework.utils.RomUtils$a */
    public static class C26241a {

        /* renamed from: a */
        public String f64825a = "";

        /* renamed from: b */
        public String f64826b = "";

        /* renamed from: c */
        RomType f64827c = RomType.UNKNOWN;

        /* renamed from: a */
        public String mo93344a() {
            return this.f64826b;
        }

        /* renamed from: d */
        public RomType mo93347d() {
            return this.f64827c;
        }

        /* renamed from: c */
        public String mo93346c() {
            if (RomUtils.m94944c()) {
                String[] split = this.f64826b.split("_");
                if (split.length > 1) {
                    return split[1];
                }
            }
            return "";
        }

        /* renamed from: b */
        public String mo93345b() {
            if (RomUtils.m94944c()) {
                String[] split = this.f64826b.split("_");
                return this.f64825a + "_" + split[0];
            }
            return this.f64825a + "_" + this.f64826b;
        }

        public String toString() {
            return "RomInfo{name=" + this.f64825a + ", version=" + this.f64826b + "}";
        }
    }

    /* renamed from: j */
    public static RomType m94955j() {
        return m94954i().f64827c;
    }

    /* renamed from: k */
    public static String m94956k() {
        return m94939b("ro.build.version.emui");
    }

    /* renamed from: n */
    public static String m94959n() {
        return Build.MODEL.trim();
    }

    /* renamed from: a */
    public static boolean m94933a() {
        return f64803a[0].equals(m94954i().f64825a);
    }

    /* renamed from: c */
    public static boolean m94944c() {
        return f64805c[0].equals(m94954i().f64825a);
    }

    /* renamed from: d */
    public static boolean m94946d() {
        return f64806d[0].equals(m94954i().f64825a);
    }

    /* renamed from: e */
    public static boolean m94948e() {
        return f64810h[0].equals(m94954i().f64825a);
    }

    /* renamed from: f */
    public static boolean m94950f() {
        return f64815m[0].equals(m94954i().f64825a);
    }

    /* renamed from: g */
    public static boolean m94952g() {
        return f64816n[0].equals(m94954i().f64825a);
    }

    /* renamed from: o */
    private static String m94960o() {
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

    /* renamed from: p */
    private static String m94961p() {
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

    /* renamed from: b */
    public static boolean m94940b() {
        return f64804b[0].equals(m94954i().f64825a);
    }

    /* renamed from: h */
    public static boolean m94953h() {
        if (f64818p[0].equals(m94954i().f64825a) || m94962q()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static String m94957l() {
        return Build.BRAND + " " + Build.MODEL;
    }

    /* renamed from: m */
    public static String m94958m() {
        return "Android " + Build.VERSION.RELEASE;
    }

    /* renamed from: q */
    private static boolean m94962q() {
        try {
            Integer num = (Integer) Class.forName("android.app.SmtPCUtils").getDeclaredMethod("getProductType", new Class[0]).invoke(null, new Object[0]);
            if (num != null && num.intValue() == 1) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.m165383e("RomUtils", "TNT detected failed " + e.getMessage());
            return false;
        }
    }

    /* renamed from: i */
    public static C26241a m94954i() {
        C26241a aVar = f64823u;
        if (aVar != null) {
            return aVar;
        }
        f64823u = new C26241a();
        String p = m94961p();
        String o = m94960o();
        String[] strArr = f64803a;
        if (m94936a(p, o, strArr)) {
            f64823u.f64825a = strArr[0];
            f64823u.f64827c = RomType.ROM_EMUI;
            String c = m94943c("ro.build.version.emui");
            String[] split = c.split("_");
            if (split.length > 1) {
                f64823u.f64826b = split[1];
            } else {
                f64823u.f64826b = c;
            }
            return f64823u;
        }
        String[] strArr2 = f64804b;
        if (m94936a(p, o, strArr2)) {
            f64823u.f64825a = strArr2[0];
            f64823u.f64827c = RomType.ROM_VIVO;
            f64823u.f64826b = m94943c("ro.vivo.os.build.display.id");
            return f64823u;
        }
        String[] strArr3 = f64805c;
        if (m94936a(p, o, strArr3)) {
            f64823u.f64825a = strArr3[0];
            f64823u.f64827c = RomType.ROM_MIUI;
            String c2 = m94943c("ro.miui.ui.version.name");
            String c3 = m94943c("ro.build.version.incremental");
            C26241a aVar2 = f64823u;
            aVar2.f64826b = c2 + "_" + c3;
            return f64823u;
        }
        String[] strArr4 = f64806d;
        if (m94936a(p, o, strArr4)) {
            f64823u.f64825a = strArr4[0];
            f64823u.f64827c = RomType.ROM_OPPO;
            f64823u.f64826b = m94943c("ro.build.version.opporom");
            return f64823u;
        }
        String[] strArr5 = f64807e;
        if (m94936a(p, o, strArr5)) {
            f64823u.f64825a = strArr5[0];
            f64823u.f64827c = RomType.ROM_LEECO;
            f64823u.f64826b = m94943c("ro.letv.release.version");
            return f64823u;
        }
        String[] strArr6 = f64808f;
        if (m94936a(p, o, strArr6)) {
            f64823u.f64825a = strArr6[0];
            f64823u.f64827c = RomType.ROM_360;
            f64823u.f64826b = m94943c("ro.build.uiversion");
            return f64823u;
        }
        String[] strArr7 = f64809g;
        if (m94936a(p, o, strArr7)) {
            f64823u.f64825a = strArr7[0];
            f64823u.f64827c = RomType.ROM_ZTE;
            f64823u.f64826b = m94943c("ro.build.MiFavor_version");
            return f64823u;
        }
        String[] strArr8 = f64810h;
        if (m94936a(p, o, strArr8)) {
            f64823u.f64825a = strArr8[0];
            f64823u.f64827c = RomType.ROM_ONEPLUS;
            f64823u.f64826b = m94943c("ro.rom.version");
            return f64823u;
        }
        String[] strArr9 = f64811i;
        if (m94936a(p, o, strArr9)) {
            f64823u.f64825a = strArr9[0];
            f64823u.f64827c = RomType.ROM_NUBIA;
            f64823u.f64826b = m94943c("ro.build.rom.id");
            return f64823u;
        }
        String[] strArr10 = f64812j;
        if (m94936a(p, o, strArr10)) {
            f64823u.f64825a = strArr10[0];
            f64823u.f64827c = RomType.ROM_COOLPAD;
        } else {
            String[] strArr11 = f64813k;
            if (m94936a(p, o, strArr11)) {
                f64823u.f64825a = strArr11[0];
                f64823u.f64827c = RomType.ROM_LG;
            } else {
                String[] strArr12 = f64814l;
                if (m94936a(p, o, strArr12)) {
                    f64823u.f64825a = strArr12[0];
                    f64823u.f64827c = RomType.ROM_GOOGLE;
                } else {
                    String[] strArr13 = f64815m;
                    if (m94936a(p, o, strArr13)) {
                        f64823u.f64825a = strArr13[0];
                        f64823u.f64827c = RomType.ROM_SAMSUNG;
                    } else {
                        String[] strArr14 = f64816n;
                        if (m94936a(p, o, strArr14)) {
                            f64823u.f64825a = strArr14[0];
                            f64823u.f64827c = RomType.ROM_FLYME;
                        } else {
                            String[] strArr15 = f64817o;
                            if (m94936a(p, o, strArr15)) {
                                f64823u.f64825a = strArr15[0];
                                f64823u.f64827c = RomType.ROM_LENOVO;
                            } else {
                                String[] strArr16 = f64818p;
                                if (m94936a(p, o, strArr16)) {
                                    f64823u.f64825a = strArr16[0];
                                    f64823u.f64827c = RomType.ROM_SMARTISAN;
                                } else {
                                    String[] strArr17 = f64819q;
                                    if (m94936a(p, o, strArr17)) {
                                        f64823u.f64825a = strArr17[0];
                                        f64823u.f64827c = RomType.ROM_HTC;
                                    } else {
                                        String[] strArr18 = f64820r;
                                        if (m94936a(p, o, strArr18)) {
                                            f64823u.f64825a = strArr18[0];
                                            f64823u.f64827c = RomType.ROM_SONY;
                                        } else {
                                            String[] strArr19 = f64821s;
                                            if (m94936a(p, o, strArr19)) {
                                                f64823u.f64825a = strArr19[0];
                                                f64823u.f64827c = RomType.ROM_GIONEE;
                                            } else {
                                                String[] strArr20 = f64822t;
                                                if (m94936a(p, o, strArr20)) {
                                                    f64823u.f64825a = strArr20[0];
                                                    f64823u.f64827c = RomType.ROM_MOTOROLA;
                                                } else {
                                                    f64823u.f64825a = o;
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
        f64823u.f64826b = m94943c("");
        return f64823u;
    }

    /* renamed from: b */
    public static String m94939b(String str) {
        return C26265c.m95079a().mo93374a(str);
    }

    /* renamed from: d */
    private static String m94945d(String str) {
        String g = m94951g(str);
        if (!TextUtils.isEmpty(g)) {
            return g;
        }
        String e = m94947e(str);
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        return m94949f(str);
    }

    /* renamed from: f */
    private static String m94949f(String str) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m94935a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m94956k();
        }
        if ((TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("emotionui")) && !m94933a()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static String m94943c(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = m94945d(str);
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

    /* renamed from: g */
    private static String m94951g(String str) {
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
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m94947e(java.lang.String r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.RomUtils.m94947e(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m94934a(Context context, Window window) {
        return m94937a(true, context, window);
    }

    /* renamed from: b */
    public static boolean m94941b(Context context, Window window) {
        return m94937a(false, context, window);
    }

    /* renamed from: b */
    static boolean m94942b(boolean z, Window window) {
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            if (z) {
                declaredField.set(attributes, Integer.valueOf(declaredField.getInt(attributes) | MediaPlayer.MEDIA_PLAYER_OPTION_APPID));
            } else {
                declaredField.set(attributes, Integer.valueOf(declaredField.getInt(attributes) & -513));
            }
            window.setAttributes(attributes);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    static boolean m94938a(boolean z, Window window) {
        int i;
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m94936a(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (m94938a(r4, r6) != false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d A[Catch:{ all -> 0x005c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m94937a(boolean r4, android.content.Context r5, android.view.Window r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 21
            if (r0 < r2) goto L_0x0061
            if (r5 == 0) goto L_0x0061
            if (r6 != 0) goto L_0x000c
            goto L_0x0061
        L_0x000c:
            boolean r5 = com.larksuite.framework.utils.RomUtils.f64824v     // Catch:{ all -> 0x005c }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != 0) goto L_0x0016
            r6.clearFlags(r0)     // Catch:{ all -> 0x005c }
            return r1
        L_0x0016:
            boolean r5 = m94944c()     // Catch:{ all -> 0x005c }
            r2 = 23
            r3 = 1
            if (r5 == 0) goto L_0x0027
            boolean r5 = m94938a(r4, r6)     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0039
        L_0x0025:
            r1 = 1
            goto L_0x0039
        L_0x0027:
            boolean r5 = m94952g()     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0039
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x005c }
            if (r5 < r2) goto L_0x0038
            boolean r5 = m94942b(r4, r6)     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0039
            goto L_0x0025
        L_0x0038:
            return r1
        L_0x0039:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x005c }
            if (r5 < r2) goto L_0x0053
            android.view.View r5 = r6.getDecorView()     // Catch:{ all -> 0x005c }
            int r2 = r5.getSystemUiVisibility()     // Catch:{ all -> 0x005c }
            if (r4 == 0) goto L_0x004d
            r4 = r2 | 8192(0x2000, float:1.14794E-41)
            r5.setSystemUiVisibility(r4)     // Catch:{ all -> 0x005c }
            goto L_0x0052
        L_0x004d:
            r4 = r2 & -8193(0xffffffffffffdfff, float:NaN)
            r5.setSystemUiVisibility(r4)     // Catch:{ all -> 0x005c }
        L_0x0052:
            r1 = 1
        L_0x0053:
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r6.clearFlags(r4)     // Catch:{ all -> 0x005c }
            r6.addFlags(r0)     // Catch:{ all -> 0x005c }
            goto L_0x0061
        L_0x005c:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.RomUtils.m94937a(boolean, android.content.Context, android.view.Window):boolean");
    }
}
