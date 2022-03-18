package com.facebook.jni;

import com.C1711a;
import com.facebook.soloader.SoLoader;

public class ThreadScopeSupport {
    private static native void runStdFunctionImpl(long j);

    static {
        try {
            SoLoader.loadLibrary("fbrn");
        } catch (Throwable unused) {
            C1711a.m7628a("fbrn");
        }
    }

    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
