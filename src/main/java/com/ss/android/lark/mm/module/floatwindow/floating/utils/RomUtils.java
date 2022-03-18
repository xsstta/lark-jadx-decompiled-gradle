package com.ss.android.lark.mm.module.floatwindow.floating.utils;

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
    public static boolean m183406a() {
        return !TextUtils.isEmpty(m183405a("ro.miui.ui.version.name"));
    }

    /* renamed from: c */
    public static boolean m183408c() {
        return !TextUtils.isEmpty(m183405a("ro.vivo.os.version"));
    }

    /* renamed from: b */
    public static boolean m183407b() {
        String a = m183405a("ro.build.display.id");
        if (a == null) {
            return false;
        }
        if (a.contains("flyme") || a.toLowerCase().contains("flyme")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m183405a(String str) {
        return C46322a.m183410a(str, null);
    }
}
