package com.ss.android.lark.voip.service.impl.sodium.crypto;

import com.ss.android.lark.voip.service.impl.sodium.encoders.EncoderTmp;
import java.util.Arrays;

public class CryptoUtil {
    public static boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public static byte[] zeros(int i) {
        return new byte[i];
    }

    public static String hexEncode(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        return EncoderTmp.HEX.encode(bArr);
    }

    public static byte[] removeZeros(int i, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, bArr.length);
    }

    public static boolean isValid(int i, String str) {
        if (i == 0) {
            return true;
        }
        throw new RuntimeException(str);
    }

    public static byte[] merge(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] prependZeros(int i, byte[] bArr) {
        byte[] bArr2 = new byte[(bArr.length + i)];
        Arrays.fill(bArr2, (byte) 0);
        System.arraycopy(bArr, 0, bArr2, i, bArr.length);
        return bArr2;
    }

    public static void checkLength(byte[] bArr, int i) {
        if (bArr == null || bArr.length != i) {
            throw new RuntimeException("Invalid size: " + bArr.length);
        }
    }

    public static byte[] slice(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2);
    }
}
