package com.facebook.jni;

import com.C1711a;
import com.facebook.soloader.SoLoader;

public class CpuCapabilitiesJni {
    public static native boolean nativeDeviceSupportsNeon();

    public static native boolean nativeDeviceSupportsVFPFP16();

    public static native boolean nativeDeviceSupportsX86();

    static {
        try {
            SoLoader.loadLibrary("fbrn");
        } catch (Throwable unused) {
            C1711a.m7628a("fbrn");
        }
    }
}
