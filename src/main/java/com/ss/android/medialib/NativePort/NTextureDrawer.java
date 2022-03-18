package com.ss.android.medialib.NativePort;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;

public class NTextureDrawer {

    /* renamed from: a */
    private static final String f147388a = "NTextureDrawer";

    private native long nativeCreateHandler();

    private native void nativeDrawTexture(long j, int i);

    private native void nativeRelease(long j);

    private native void nativeSetDebug(long j, boolean z);

    private native void nativeSetFlipScale(long j, float f, float f2);

    private native void nativeSetRotation(long j, float f);

    private native void nativeSetWidthHeight(long j, int i, int i2);

    static {
        TENativeLibsLoader.m234148d();
    }
}
