package com.ss.android.lark.fastqrcode;

import com.C1711a;

public class EnigmaQRCode {

    /* renamed from: a */
    public static int f95159a = 0;

    /* renamed from: b */
    public static int f95160b = 1;

    /* renamed from: c */
    public static int f95161c = 2;

    /* renamed from: d */
    public static int f95162d = 3;

    /* renamed from: e */
    public static int f95163e = 4;

    public static native long _createHandler();

    public static native int _decode(long j, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, byte[] bArr2, int[] iArr, float[] fArr);

    public static native int _releaseHandle(long j);

    public static native int _setDecodeHint(long j, int i, long j2);

    static {
        C1711a.m7628a("lkqrscan");
    }
}
