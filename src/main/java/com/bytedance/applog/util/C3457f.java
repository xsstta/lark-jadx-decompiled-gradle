package com.bytedance.applog.util;

import java.security.MessageDigest;
import java.util.Objects;

/* renamed from: com.bytedance.applog.util.f */
public class C3457f {

    /* renamed from: a */
    private static final char[] f10979a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m14600a(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        return m14601a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static String m14602b(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(bArr);
                    return m14600a(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m14599a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return m14600a(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m14601a(byte[] bArr, int i, int i2) {
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
            char[] cArr2 = f10979a;
            cArr[i4] = cArr2[i6 >> 4];
            i4 = i7 + 1;
            cArr[i7] = cArr2[i6 & 15];
        }
        return new String(cArr, 0, i3);
    }
}
