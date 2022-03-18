package com.ss.android.ttve.monitor;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import java.util.HashMap;
import java.util.Map;

public class TEMonitorInvoker {
    public static native Map<String, String> nativeGetMap();

    public static native Map<String, String> nativeGetMapByType(int i);

    public static native void nativeInit();

    public static native void nativeMonitorPerf(int i);

    public static native void nativeMonitorPerfWithType(int i);

    public static native void nativePerfDouble(int i, String str, double d);

    public static native void nativePerfDouble(String str, double d);

    public static native void nativePerfLong(int i, String str, long j);

    public static native void nativePerfLong(String str, long j);

    public static native void nativePerfRational(String str, float f, float f2);

    public static native void nativePerfString(int i, String str, String str2);

    public static native void nativePerfString(String str, String str2);

    public static native void nativeReset();

    public static native void nativeReset(int i);

    static {
        TENativeLibsLoader.m234147c();
    }

    public static void onNativeCallback_onMonitorLogFloat(String str, String str2, float f) {
        C60229h.m234101a(str, str2, f);
    }

    public static void onNativeCallback_onMonitorLogInt(String str, String str2, long j) {
        C60229h.m234102a(str, str2, j);
    }

    public static void onNativeCallback_onMonitorLogJson(String str, String str2, String str3) {
        C60229h.m234097a(str, str2, str3);
    }

    public static void onNativeCallback_onMonitorLogMap(String str, String str2, HashMap hashMap) {
        C60229h.m234103a(str, str2, hashMap);
    }
}
