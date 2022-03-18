package com.ss.android.ad.splash.utils;

import java.security.MessageDigest;
import java.util.Objects;

/* renamed from: com.ss.android.ad.splash.utils.b */
public class C27472b {

    /* renamed from: a */
    static final char[] f68685a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m100295a(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        return m100296a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static String m100294a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return m100295a(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m100296a(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 * 2;
        char[] cArr = new char[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i5 + i] & 255;
            int i7 = i4 + 1;
            char[] cArr2 = f68685a;
            cArr[i4] = cArr2[i6 >> 4];
            i4 = i7 + 1;
            cArr[i7] = cArr2[i6 & 15];
        }
        return new String(cArr, 0, i3);
    }
}
