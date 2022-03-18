package com.bef.effectsdk.algorithm;

import android.graphics.Bitmap;

public class GeneralObjDetector {

    /* renamed from: a */
    public final int f7152a = 1;

    /* renamed from: b */
    public final int f7153b = 1;

    private native long nativeCreate();

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, long j2, int i);

    private native int nativeInitWithPath(long j, String str, int i);

    private native GeneralObjDetectResult nativeProcess(long j, Bitmap bitmap, int i);

    private native int nativeSetParamF(long j, int i, float f);

    private native int nativeSetParamS(long j, int i, String str);
}
