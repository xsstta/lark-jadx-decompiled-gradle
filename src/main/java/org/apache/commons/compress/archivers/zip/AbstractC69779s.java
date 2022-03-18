package org.apache.commons.compress.archivers.zip;

import java.math.BigInteger;

/* renamed from: org.apache.commons.compress.archivers.zip.s */
public abstract class AbstractC69779s {

    /* renamed from: a */
    private static final byte[] f174319a = ZipLong.getBytes(8448);

    /* renamed from: a */
    public static int m267782a(byte b) {
        return b >= 0 ? b : b + 256;
    }

    /* renamed from: a */
    public static long m267783a(int i) {
        return i < 0 ? ((long) i) + 4294967296L : (long) i;
    }

    /* renamed from: b */
    static byte[] m267788b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m267786a(byte[] bArr) {
        int length = bArr.length - 1;
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            int i2 = length - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    /* renamed from: a */
    static long m267784a(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return bigInteger.longValue();
        }
        throw new NumberFormatException("The BigInteger cannot fit inside a 64 bit java long: [" + bigInteger + "]");
    }

    /* renamed from: b */
    public static byte m267787b(int i) {
        if (i > 255 || i < 0) {
            throw new IllegalArgumentException("Can only convert non-negative integers between [0,255] to byte: [" + i + "]");
        } else if (i < 128) {
            return (byte) i;
        } else {
            return (byte) (i - 256);
        }
    }

    /* renamed from: a */
    static BigInteger m267785a(long j) {
        int i = (j > -2147483648L ? 1 : (j == -2147483648L ? 0 : -1));
        if (i >= 0) {
            if (j < 0 && i >= 0) {
                j = m267783a((int) j);
            }
            return BigInteger.valueOf(j);
        }
        throw new IllegalArgumentException("Negative longs < -2^31 not permitted: [" + j + "]");
    }
}
