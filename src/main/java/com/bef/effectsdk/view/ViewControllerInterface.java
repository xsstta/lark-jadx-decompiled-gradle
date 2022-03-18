package com.bef.effectsdk.view;

import com.C1711a;
import java.util.Arrays;
import java.util.List;

public class ViewControllerInterface {

    /* renamed from: a */
    private static final List<String> f7265a;

    interface NativeMessageListener {
    }

    private static native int nativeAddMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native int nativeAttachEffect(long j, long j2);

    private static native void nativeCreateHandle(long[] jArr);

    private static native int nativeCreateTexture(int i, int i2, int i3, int i4, int i5);

    private static native int nativeDeleteTexture(int i);

    private static native int nativeDestroy(long j);

    private static native int nativeInit(long j, int i, int i2);

    private static native int nativePostMessage(long j, long j2, long j3, long j4, String str);

    private static native int nativeProcess(long j, int i, int i2, int i3, float[] fArr, float[] fArr2, double d);

    private static native int nativeRemoveMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native int nativeSetRenderCacheTexture(long j, String str, String str2);

    private static native int nativeSetRenderCacheTextureWithBuffer(long j, String str, byte[] bArr, int i, int i2);

    private static native int nativeSetResourceFinder(long j, long j2, long j3);

    private static native int nativeSetStickerPath(long j, String str);

    private static native int nativeTouchEvent(long j, int i, int[] iArr, float[] fArr, float[] fArr2);

    /* renamed from: a */
    public static int m9074a(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 0, iArr, fArr, fArr2);
    }

    /* renamed from: a */
    public static int m9072a(long j, String str, String str2) {
        return nativeSetRenderCacheTexture(j, str, str2);
    }

    /* renamed from: a */
    public static int m9073a(long j, String str, byte[] bArr, int i, int i2) {
        return nativeSetRenderCacheTextureWithBuffer(j, str, bArr, i, i2);
    }

    static {
        List<String> asList = Arrays.asList("effect");
        f7265a = asList;
        try {
            for (String str : asList) {
                C1711a.m7628a(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m9075a(long[] jArr) {
        nativeCreateHandle(jArr);
    }

    /* renamed from: a */
    public static int m9063a(int i) {
        return nativeDeleteTexture(i);
    }

    /* renamed from: a */
    public static int m9064a(long j) {
        return nativeDestroy(j);
    }

    /* renamed from: b */
    public static int m9076b(long j, NativeMessageListener nativeMessageListener) {
        return nativeRemoveMessageListener(j, nativeMessageListener);
    }

    /* renamed from: a */
    public static int m9067a(long j, long j2) {
        return nativeAttachEffect(j, j2);
    }

    /* renamed from: a */
    public static int m9070a(long j, NativeMessageListener nativeMessageListener) {
        return nativeAddMessageListener(j, nativeMessageListener);
    }

    /* renamed from: a */
    public static int m9071a(long j, String str) {
        return nativeSetStickerPath(j, str);
    }

    /* renamed from: a */
    public static int m9065a(long j, int i, int i2) {
        return nativeInit(j, i, i2);
    }

    /* renamed from: a */
    public static int m9068a(long j, long j2, long j3) {
        return nativeSetResourceFinder(j, j2, j3);
    }

    /* renamed from: b */
    public static int m9077b(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 2, iArr, fArr, fArr2);
    }

    /* renamed from: c */
    public static int m9078c(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 1, iArr, fArr, fArr2);
    }

    /* renamed from: a */
    public static int m9069a(long j, long j2, long j3, long j4, String str) {
        return nativePostMessage(j, j2, j3, j4, str);
    }

    /* renamed from: a */
    public static int m9066a(long j, int i, int i2, int i3, float[] fArr, float[] fArr2, double d) {
        return nativeProcess(j, i, i2, i3, fArr, fArr2, d);
    }
}
