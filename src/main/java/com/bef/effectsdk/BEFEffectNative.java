package com.bef.effectsdk;

import com.C1711a;
import java.util.Arrays;
import java.util.List;

public class BEFEffectNative {

    /* renamed from: a */
    private static final List<String> f7084a;

    private static native long nativeCreateHandle(boolean z);

    private static native int nativeDestroyHandle(long j);

    private static native String nativeGetEffectSDKVersion();

    private static native int nativeInitResourceFinder(long j, ResourceFinder resourceFinder, int i, int i2, String str);

    private static native int nativeProcessAlgorithm(long j, int i, int i2, int i3, double d);

    private static native int nativeProcessFrame(long j, int i, int i2, int i3, int i4, double d);

    private static native int nativeReleaseResourceFinder(long j, ResourceFinder resourceFinder);

    private static native int nativeSendMessage(long j, long j2, long j3, long j4, String str);

    private static native void nativeSetCameraPosition(long j, boolean z);

    private static native void nativeSetFrameOrientation(long j, int i);

    private static native void nativeSetOrientation(long j, int i);

    private static native int nativeSetStickerPath(long j, String str);

    private static native int nativeTouchEvent(long j, int i, int[] iArr, float[] fArr, float[] fArr2);

    static {
        List<String> asList = Arrays.asList("effect");
        f7084a = asList;
        try {
            for (String str : asList) {
                C1711a.m7628a(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
