package com.facebook.jni;

import com.C1711a;
import com.facebook.soloader.SoLoader;

public class Countable {
    private long mInstance;

    public native void dispose();

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        dispose();
        super.finalize();
    }

    static {
        try {
            SoLoader.loadLibrary("fbrn");
        } catch (Throwable unused) {
            C1711a.m7628a("fbrn");
        }
    }
}
