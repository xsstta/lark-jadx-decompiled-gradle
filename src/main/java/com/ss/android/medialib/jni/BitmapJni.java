package com.ss.android.medialib.jni;

import android.graphics.Bitmap;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;

public class BitmapJni {
    private static native int nativeCompressBitmap(Bitmap bitmap, String str, int i);

    static {
        TENativeLibsLoader.m234148d();
    }

    public static int compressBitmap(Bitmap bitmap, String str, int i) {
        return nativeCompressBitmap(bitmap, str, i);
    }
}
