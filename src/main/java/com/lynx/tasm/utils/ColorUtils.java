package com.lynx.tasm.utils;

public class ColorUtils {
    private static native int nativeParse(String str);

    private static native boolean nativeValidate(String str);

    /* renamed from: a */
    public static int m97896a(String str) {
        return nativeParse(str);
    }

    /* renamed from: b */
    public static boolean m97897b(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return nativeValidate(str);
    }
}
