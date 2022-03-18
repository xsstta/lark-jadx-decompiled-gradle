package com.facebook.hermes.instrumentation;

import com.C1711a;
import com.facebook.soloader.SoLoader;

public class HermesSamplingProfiler {
    public static native void disable();

    public static native void dumpSampledTraceToFile(String str);

    public static native void enable();

    private HermesSamplingProfiler() {
    }

    static {
        try {
            SoLoader.loadLibrary("jsijniprofiler");
        } catch (Throwable unused) {
            C1711a.m7628a("jsijniprofiler");
        }
    }
}
