package com.bytedance.common.jato.dex;

import com.bytedance.common.jato.JatoNativeLoader;

public class DexTricksNativeHolder {
    private static boolean sInited;

    private static native int dvmVerifyEnableNative();

    private static native int dvmVerifyNoneNative();

    private static native int verifyEnableNative();

    private static native int verifyNoneNative(int i, int i2);

    protected static int dvmVerifyEnable() {
        if (ensureInited()) {
            return dvmVerifyEnableNative();
        }
        return -1;
    }

    protected static int dvmVerifyNone() {
        if (ensureInited()) {
            return dvmVerifyNoneNative();
        }
        return -1;
    }

    protected static int verifyEnable() {
        if (ensureInited()) {
            return verifyEnableNative();
        }
        return -1;
    }

    private static synchronized boolean ensureInited() {
        boolean z;
        synchronized (DexTricksNativeHolder.class) {
            if (!sInited && JatoNativeLoader.loadLibrary()) {
                sInited = true;
            }
            z = sInited;
        }
        return z;
    }

    protected static int verifyNone(int i, int i2) {
        if (ensureInited()) {
            return verifyNoneNative(i, i2);
        }
        return -1;
    }
}
