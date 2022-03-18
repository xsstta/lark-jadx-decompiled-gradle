package com.facebook.yoga;

import com.facebook.soloader.SoLoader;

public class YogaJNI {
    public static int JNI_FAST_CALLS = 4;
    public static boolean useFastCall;

    private static native void jni_bindNativeMethods(boolean z);

    static boolean init() {
        if (!SoLoader.loadLibrary("eeyoga")) {
            return false;
        }
        jni_bindNativeMethods(useFastCall);
        return true;
    }
}
