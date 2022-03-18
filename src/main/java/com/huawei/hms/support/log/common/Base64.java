package com.huawei.hms.support.log.common;

import com.ss.ugc.effectplatform.cache.disklrucache.StrictLineReader;

public final class Base64 {
    public static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, StrictLineReader.f164804b, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static final char[] ENCODE_TABLE = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', '='};

    public static String encode(byte[] bArr) {
        return encode(bArr, bArr.length);
    }

    public static int vaildLen(String str) {
        int length = str.length();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt > 255 || DECODE_TABLE[charAt] < 0) {
                length--;
            }
        }
        return length;
    }

    public static byte[] decode(String str) {
        byte b;
        int vaildLen = vaildLen(str);
        int i = (vaildLen / 4) * 3;
        int i2 = vaildLen % 4;
        if (i2 == 3) {
            i += 2;
        }
        if (i2 == 2) {
            i++;
        }
        byte[] bArr = new byte[i];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            char charAt = str.charAt(i6);
            if (charAt > 255) {
                b = -1;
            } else {
                b = DECODE_TABLE[charAt];
            }
            if (b >= 0) {
                i5 += 6;
                i4 = (i4 << 6) | b;
                if (i5 >= 8) {
                    i5 -= 8;
                    bArr[i3] = (byte) (255 & (i4 >> i5));
                    i3++;
                }
            }
        }
        if (i3 != i) {
            return new byte[0];
        }
        return bArr;
    }

    public static String encode(byte[] bArr, int i) {
        boolean z;
        int i2;
        char[] cArr = new char[(((i + 2) / 3) * 4)];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = (bArr[i3] & 255) << 8;
            int i6 = i3 + 1;
            boolean z2 = true;
            if (i6 < i) {
                i5 |= bArr[i6] & 255;
                z = true;
            } else {
                z = false;
            }
            int i7 = i5 << 8;
            int i8 = i3 + 2;
            if (i8 < i) {
                i7 |= bArr[i8] & 255;
            } else {
                z2 = false;
            }
            int i9 = i4 + 3;
            char[] cArr2 = ENCODE_TABLE;
            int i10 = 64;
            if (z2) {
                i2 = i7 & 63;
            } else {
                i2 = 64;
            }
            cArr[i9] = cArr2[i2];
            int i11 = i7 >> 6;
            int i12 = i4 + 2;
            if (z) {
                i10 = i11 & 63;
            }
            cArr[i12] = cArr2[i10];
            int i13 = i11 >> 6;
            cArr[i4 + 1] = cArr2[i13 & 63];
            cArr[i4 + 0] = cArr2[(i13 >> 6) & 63];
            i3 += 3;
            i4 += 4;
        }
        return new String(cArr);
    }
}
