package com.ss.android.ttve.nativePort;

public class TEGLGlobalContext {
    public static native void nativeSetGLVersion(int i);

    public static native void nativeSetMaxRenderSize(int i, int i2);

    static {
        TENativeLibsLoader.m234143a();
    }
}
