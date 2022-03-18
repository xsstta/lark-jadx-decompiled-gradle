package com.facebook.react.modules.systeminfo;

import android.os.Build;
import java.util.Locale;

/* renamed from: com.facebook.react.modules.systeminfo.a */
public class C21253a {

    /* renamed from: a */
    private static final String f51773a = "a";

    /* renamed from: b */
    private static String f51774b;

    /* renamed from: b */
    private static boolean m77053b() {
        return Build.FINGERPRINT.contains("vbox");
    }

    /* renamed from: c */
    private static boolean m77054c() {
        return Build.FINGERPRINT.contains("generic");
    }

    /* renamed from: a */
    public static String m77050a() {
        if (m77053b()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r2 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        r2.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006c, code lost:
        if (r2 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006f, code lost:
        r1 = com.facebook.react.modules.systeminfo.C21253a.f51774b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0072, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067 A[SYNTHETIC, Splitter:B:35:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0076 A[SYNTHETIC, Splitter:B:44:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.String m77055d() {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.systeminfo.C21253a.m77055d():java.lang.String");
    }

    /* renamed from: a */
    public static String m77052a(Integer num) {
        return m77051a(num.intValue());
    }

    /* renamed from: a */
    private static String m77051a(int i) {
        String d = m77055d();
        if (d.equals("")) {
            if (m77053b()) {
                d = "10.0.3.2";
            } else if (m77054c()) {
                d = "10.0.2.2";
            } else {
                d = "localhost";
            }
        }
        return String.format(Locale.US, "%s:%d", d, Integer.valueOf(i));
    }
}
