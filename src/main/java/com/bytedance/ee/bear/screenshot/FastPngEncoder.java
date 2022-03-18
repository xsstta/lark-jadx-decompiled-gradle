package com.bytedance.ee.bear.screenshot;

import android.graphics.Bitmap;
import com.C1711a;

public class FastPngEncoder {

    /* renamed from: a */
    private long f28749a;

    /* renamed from: b */
    private boolean f28750b;

    private native long nativeDestroy(long j);

    private native long nativeInit(String str, int i, int i2, int i3, int i4, int i5);

    private static native boolean nativeIsBitmapAnyLineBlackOrWhite(Bitmap bitmap);

    private native void nativeWriteBitmap(long j, Bitmap bitmap, int i, int i2, boolean z);

    static {
        C1711a.m7628a("fastpngencoder");
    }

    /* renamed from: a */
    public void mo40674a() {
        if (!this.f28750b) {
            this.f28750b = true;
            this.f28749a = nativeDestroy(this.f28749a);
        }
    }

    /* renamed from: b */
    public static boolean m44576b(Bitmap bitmap) {
        return nativeIsBitmapAnyLineBlackOrWhite(bitmap);
    }

    /* renamed from: a */
    public void mo40675a(Bitmap bitmap) {
        if (!this.f28750b) {
            nativeWriteBitmap(this.f28749a, bitmap, 0, bitmap.getHeight(), false);
            return;
        }
        throw new IllegalStateException("Native instance is destroyed!");
    }

    public FastPngEncoder(String str, int i, int i2) {
        this.f28749a = nativeInit(str, i, i2, 3, 8, 0);
    }

    /* renamed from: a */
    public void mo40676a(Bitmap bitmap, int i, int i2) {
        if (!this.f28750b) {
            nativeWriteBitmap(this.f28749a, bitmap, i, i2, true);
            mo40674a();
            return;
        }
        throw new IllegalStateException("Native instance is destroyed!");
    }
}
