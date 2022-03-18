package com.huawei.agconnect.p1009a.p1010a;

/* renamed from: com.huawei.agconnect.a.a.c */
public class C23403c {

    /* renamed from: a */
    private static final char[] f57719a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static String m84934a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = f57719a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m84935a(String str) {
        return m84936a(str.toCharArray());
    }

    /* renamed from: a */
    private static byte[] m84936a(char[] cArr) {
        if ((cArr.length & 1) == 0) {
            byte[] bArr = new byte[(cArr.length >> 1)];
            int i = 0;
            int i2 = 0;
            while (i < cArr.length) {
                int digit = Character.digit(cArr[i], 16);
                if (digit != -1) {
                    int i3 = i + 1;
                    int digit2 = Character.digit(cArr[i3], 16);
                    if (digit2 != -1) {
                        i = i3 + 1;
                        bArr[i2] = (byte) (((digit << 4) | digit2) & 255);
                        i2++;
                    } else {
                        throw new IllegalArgumentException("Illegal hexadecimal character at index " + i3);
                    }
                } else {
                    throw new IllegalArgumentException("Illegal hexadecimal character at index " + i);
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Odd number of characters.");
    }
}
