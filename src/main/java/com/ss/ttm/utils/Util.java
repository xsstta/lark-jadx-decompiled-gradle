package com.ss.ttm.utils;

import android.os.Build;

public final class Util {
    public static final String BARND = Build.BRAND;
    public static final String DEVICE;
    public static final String DEVICE_DEBUG_INFO;
    public static final String HARDWARE = Build.HARDWARE;
    public static final String MANUFACTURER;
    public static final String MODEL;
    public static final int SDK_INT;

    static {
        int i = Build.VERSION.SDK_INT;
        SDK_INT = i;
        String str = Build.DEVICE;
        DEVICE = str;
        String str2 = Build.MANUFACTURER;
        MANUFACTURER = str2;
        String str3 = Build.MODEL;
        MODEL = str3;
        DEVICE_DEBUG_INFO = str + ", " + str3 + ", " + str2 + ", " + i;
    }
}
