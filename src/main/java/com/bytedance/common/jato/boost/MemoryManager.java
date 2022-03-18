package com.bytedance.common.jato.boost;

import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.common.jato.JatoNativeLoader;

public class MemoryManager {
    private static native void nativePagePreFault(int i, int i2, boolean z, boolean z2);

    public static void pagePreFault(int i, int i2, boolean z, boolean z2) {
        if (JatoNativeLoader.loadLibrary()) {
            ByteHook.init();
            nativePagePreFault(i, i2, z, z2);
        }
    }
}
