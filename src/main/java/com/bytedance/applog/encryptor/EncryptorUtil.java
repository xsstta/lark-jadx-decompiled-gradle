package com.bytedance.applog.encryptor;

import com.C1711a;

public class EncryptorUtil {
    private static native byte[] ttEncrypt(byte[] bArr, int i);

    static {
        try {
            C1711a.m7628a("EncryptorP");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static byte[] m14355a(byte[] bArr, int i) {
        if (bArr != null && i > 0) {
            try {
                if (bArr.length == i) {
                    return ttEncrypt(bArr, i);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
