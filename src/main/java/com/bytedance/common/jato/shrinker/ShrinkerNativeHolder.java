package com.bytedance.common.jato.shrinker;

import com.bytedance.common.jato.JatoNativeLoader;

/* access modifiers changed from: package-private */
public class ShrinkerNativeHolder {
    private static boolean sInited;

    static native int shrinkHeapNative(int i);

    static native int shrinkMallocNative(int i, int i2);

    static native int shrinkRegionNative(int i);

    static native int shrinkWebviewNative();

    ShrinkerNativeHolder() {
    }

    static synchronized boolean ensureInited() {
        boolean z;
        synchronized (ShrinkerNativeHolder.class) {
            if (!sInited && JatoNativeLoader.loadLibrary()) {
                sInited = true;
            }
            z = sInited;
        }
        return z;
    }
}
