package com.ss.android.floatbubble.util;

import android.text.TextUtils;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RomUtils {

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RomName {
    }

    /* renamed from: a */
    public static boolean m104301a() {
        return !TextUtils.isEmpty(m104300a("ro.miui.ui.version.name"));
    }

    /* renamed from: c */
    public static boolean m104303c() {
        return !TextUtils.isEmpty(m104300a("ro.build.version.emui"));
    }

    /* renamed from: d */
    public static boolean m104304d() {
        return !TextUtils.isEmpty(m104300a("ro.vivo.os.version"));
    }

    /* renamed from: e */
    public static boolean m104305e() {
        return !TextUtils.isEmpty(m104300a("ro.smartisan.version"));
    }

    /* renamed from: b */
    public static boolean m104302b() {
        String a = m104300a("ro.build.display.id");
        if (a == null) {
            return false;
        }
        if (a.contains("flyme") || a.toLowerCase().contains("flyme")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m104300a(String str) {
        return C28467b.m104311a(str, null);
    }
}
