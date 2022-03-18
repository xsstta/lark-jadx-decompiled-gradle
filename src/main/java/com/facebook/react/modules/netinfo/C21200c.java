package com.facebook.react.modules.netinfo;

/* renamed from: com.facebook.react.modules.netinfo.c */
public class C21200c {
    /* renamed from: a */
    public static void m76954a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - i) - 1];
            bArr[(bArr.length - i) - 1] = b;
        }
    }
}
