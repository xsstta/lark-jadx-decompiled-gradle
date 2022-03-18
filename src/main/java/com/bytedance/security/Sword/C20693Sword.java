package com.bytedance.security.Sword;

import com.C1711a;

/* renamed from: com.bytedance.security.Sword.Sword */
public class C20693Sword {
    public static native byte[] GenKeySeed();

    public static native int GetCryptoMethod();

    public static native int IsSupportedMethod(int i);

    public static native byte[] WBCKGenKeySeed();

    public static native int WBCKGetCryptoMethod();

    public static native byte[] WBCKPacked(byte[] bArr, int i, byte[] bArr2, int i2);

    public static native byte[] WBCKPackedNaked(byte[] bArr, int i, byte[] bArr2, int i2);

    public static native byte[] WBCKUnpacked(byte[] bArr, int i, byte[] bArr2);

    public static native String clientPacked(byte[] bArr, int i);

    public static native String clientPackedNaked(byte[] bArr, int i, int i2, byte[] bArr2);

    public static native byte[] clientUnpacked(byte[] bArr, int i);

    public static native byte[] clientUnpackedNaked(byte[] bArr, int i, int i2, byte[] bArr2);

    static {
        try {
            C1711a.m7628a("bdsword");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }
}
