package com.bytedance.lynx.tasm.ui.imageloader;

import android.graphics.Bitmap;
import com.C1711a;

public class BitmapBlur {
    public static native void nativeBlur(Bitmap bitmap, int i);

    static {
        C1711a.m7628a("lynx-imageloader");
    }
}
