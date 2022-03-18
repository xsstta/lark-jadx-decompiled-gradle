package com.ss.android.ttve.monitor;

public class ApplogUtilsInvoker {
    public static native void nativeInit();

    public static void onNativeCallback_onAppLogJson(String str, String str2, String str3) {
        C60217b.m234042a(str, str2, str3);
    }

    public static void onNativeCallback_onAppLogClientJson(String str, String str2, String str3, boolean z) {
        C60217b.m234043a(str, str2, str3, z);
    }
}
