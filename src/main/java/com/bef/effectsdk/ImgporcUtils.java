package com.bef.effectsdk;

import android.graphics.Bitmap;
import android.graphics.PointF;

public class ImgporcUtils {
    private static native float nativeCalculateAspectRatio(PointF[] pointFArr, int i, int i2);

    private static native Bitmap nativeCorrectPerspective(Bitmap bitmap, PointF[] pointFArr, int i, int i2, int i3);
}
