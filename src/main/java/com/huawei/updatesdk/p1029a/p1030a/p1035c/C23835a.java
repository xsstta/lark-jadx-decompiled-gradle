package com.huawei.updatesdk.p1029a.p1030a.p1035c;

/* renamed from: com.huawei.updatesdk.a.a.c.a */
public class C23835a {

    /* renamed from: a */
    private static char[] f59041a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', '='};

    /* renamed from: a */
    public static String m87121a(byte[] bArr) {
        return m87122a(bArr, bArr.length);
    }

    /* renamed from: a */
    public static String m87122a(byte[] bArr, int i) {
        boolean z;
        char[] cArr = new char[(((i + 2) / 3) * 4)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = (bArr[i2] & 255) << 8;
            int i5 = i2 + 1;
            boolean z2 = true;
            if (i5 < i) {
                i4 |= bArr[i5] & 255;
                z = true;
            } else {
                z = false;
            }
            int i6 = i4 << 8;
            int i7 = i2 + 2;
            if (i7 < i) {
                i6 |= bArr[i7] & 255;
            } else {
                z2 = false;
            }
            int i8 = i3 + 3;
            char[] cArr2 = f59041a;
            int i9 = 64;
            cArr[i8] = cArr2[z2 ? i6 & 63 : 64];
            int i10 = i6 >> 6;
            int i11 = i3 + 2;
            if (z) {
                i9 = i10 & 63;
            }
            cArr[i11] = cArr2[i9];
            int i12 = i10 >> 6;
            cArr[i3 + 1] = cArr2[i12 & 63];
            cArr[i3 + 0] = cArr2[(i12 >> 6) & 63];
            i2 += 3;
            i3 += 4;
        }
        return String.valueOf(cArr);
    }
}
