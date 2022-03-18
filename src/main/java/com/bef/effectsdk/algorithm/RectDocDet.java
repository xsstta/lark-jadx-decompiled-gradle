package com.bef.effectsdk.algorithm;

import android.graphics.Bitmap;

public class RectDocDet {
    private native long nativeCreate();

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, long j2, int i);

    private native int nativeInitWithPath(long j, String str, int i);

    private native RectDocDetResult nativeProcess(long j, Bitmap bitmap, int i);

    private native int nativeSetParamF(long j, int i, float f);
}
