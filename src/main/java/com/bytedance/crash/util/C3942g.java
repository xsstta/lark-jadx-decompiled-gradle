package com.bytedance.crash.util;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.crash.upload.CrashUploader;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.crash.util.g */
public class C3942g {

    /* renamed from: a */
    private static boolean f12044a = false;

    /* renamed from: b */
    private static int f12045b = -1;

    /* renamed from: c */
    private static final Pattern f12046c = Pattern.compile("^0-([\\d]+)$");

    /* renamed from: a */
    public static String m16365a() {
        return m16367b("ro.build.version.emui");
    }

    /* renamed from: c */
    public static boolean m16369c() {
        if (!f12044a) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    CrashUploader.f11892a = true;
                    f12044a = true;
                    return CrashUploader.f11892a;
                }
            } catch (Exception unused) {
            }
            f12044a = true;
        }
        return CrashUploader.f11892a;
    }

    /* renamed from: d */
    public static boolean m16370d() {
        if (Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m16368b() {
        try {
            if ((TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase(Locale.getDefault()).startsWith("hua")) && (TextUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase(Locale.getDefault()).startsWith("hua"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static String m16367b(String str) {
        return C3927aa.m16279a(str);
    }

    /* renamed from: a */
    public static boolean m16366a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m16365a();
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        if (TextUtils.isEmpty(str) || (!lowerCase.startsWith("emotionui") && !lowerCase.startsWith("magicui"))) {
            return m16368b();
        }
        return true;
    }
}
