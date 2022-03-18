package com.huawei.hms.utils;

public final class HEX {

    /* renamed from: a */
    public static final char[] f58954a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final char[] f58955b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, false);
    }

    public static char[] encodeHex(byte[] bArr, boolean z) {
        char[] cArr;
        if (z) {
            cArr = f58955b;
        } else {
            cArr = f58954a;
        }
        return m86986a(bArr, cArr);
    }

    public static String encodeHexString(byte[] bArr, boolean z) {
        return new String(encodeHex(bArr, z));
    }

    /* renamed from: a */
    public static char[] m86986a(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }
}
