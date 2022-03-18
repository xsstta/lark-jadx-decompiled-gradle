package com.ss.android.ttve.nativePort;

public class TELogcat {
    private static native void nativeLog(byte b, String str, String str2);

    private static native void nativeSetLogLevel(byte b);

    static {
        TENativeLibsLoader.m234147c();
    }

    public static void setLogLevel(byte b) {
        nativeSetLogLevel(b);
    }

    public static void Log(byte b, String str, String str2) {
        nativeLog(b, str, str2);
    }
}
