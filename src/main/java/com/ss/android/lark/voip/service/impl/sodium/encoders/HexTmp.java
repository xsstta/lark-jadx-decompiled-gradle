package com.ss.android.lark.voip.service.impl.sodium.encoders;

public class HexTmp implements EncoderTmp {
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public String toString() {
        return super.toString() + "[charsetName=" + CHARSET + "]";
    }

    private static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    @Override // com.ss.android.lark.voip.service.impl.sodium.encoders.EncoderTmp
    public byte[] decode(String str) {
        char[] cArr;
        if (str != null) {
            cArr = str.toCharArray();
        } else {
            cArr = new char[0];
        }
        return decodeHex(cArr);
    }

    @Override // com.ss.android.lark.voip.service.impl.sodium.encoders.EncoderTmp
    public String encode(byte[] bArr) {
        return new String(encodeHex(bArr));
    }

    private static byte[] decodeHex(char[] cArr) {
        int i;
        int i2 = 0;
        if (cArr == null) {
            i = 0;
        } else {
            i = cArr.length;
        }
        if ((i & 1) == 0) {
            byte[] bArr = new byte[(i >> 1)];
            int i3 = 0;
            while (i2 < i) {
                int i4 = i2 + 1;
                i2 = i4 + 1;
                bArr[i3] = (byte) (((toDigit(cArr[i2], i2) << 4) | toDigit(cArr[i4], i4)) & 255);
                i3++;
            }
            return bArr;
        }
        throw new RuntimeException("Odd number of characters.");
    }

    private static char[] encodeHex(byte[] bArr, boolean z) {
        char[] cArr;
        if (z) {
            cArr = DIGITS_LOWER;
        } else {
            cArr = DIGITS_UPPER;
        }
        return encodeHex(bArr, cArr);
    }

    private static char[] encodeHex(byte[] bArr, char[] cArr) {
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

    private static int toDigit(char c, int i) {
        int digit = Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        throw new RuntimeException("Illegal hexadecimal character " + c + " at index " + i);
    }
}
