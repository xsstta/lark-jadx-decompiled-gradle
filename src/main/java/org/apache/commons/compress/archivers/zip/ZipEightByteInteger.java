package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import java.math.BigInteger;

public final class ZipEightByteInteger implements Serializable {
    public static final ZipEightByteInteger ZERO = new ZipEightByteInteger(0);
    private static final long serialVersionUID = 1;
    private final BigInteger value;

    public BigInteger getValue() {
        return this.value;
    }

    public byte[] getBytes() {
        return getBytes(this.value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public long getLongValue() {
        return this.value.longValue();
    }

    public String toString() {
        return "ZipEightByteInteger value: " + this.value;
    }

    public ZipEightByteInteger(long j) {
        this(BigInteger.valueOf(j));
    }

    public static long getLongValue(byte[] bArr) {
        return getLongValue(bArr, 0);
    }

    public static BigInteger getValue(byte[] bArr) {
        return getValue(bArr, 0);
    }

    public ZipEightByteInteger(BigInteger bigInteger) {
        this.value = bigInteger;
    }

    public static byte[] getBytes(long j) {
        return getBytes(BigInteger.valueOf(j));
    }

    public ZipEightByteInteger(byte[] bArr) {
        this(bArr, 0);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ZipEightByteInteger)) {
            return false;
        }
        return this.value.equals(((ZipEightByteInteger) obj).getValue());
    }

    public static byte[] getBytes(BigInteger bigInteger) {
        long longValue = bigInteger.longValue();
        byte[] bArr = {(byte) ((int) (255 & longValue)), (byte) ((int) ((65280 & longValue) >> 8)), (byte) ((int) ((16711680 & longValue) >> 16)), (byte) ((int) ((4278190080L & longValue) >> 24)), (byte) ((int) ((1095216660480L & longValue) >> 32)), (byte) ((int) ((280375465082880L & longValue) >> 40)), (byte) ((int) ((71776119061217280L & longValue) >> 48)), (byte) ((int) ((longValue & 9151314442816847872L) >> 56))};
        if (bigInteger.testBit(63)) {
            bArr[7] = (byte) (bArr[7] | Byte.MIN_VALUE);
        }
        return bArr;
    }

    public static long getLongValue(byte[] bArr, int i) {
        return getValue(bArr, i).longValue();
    }

    public ZipEightByteInteger(byte[] bArr, int i) {
        this.value = getValue(bArr, i);
    }

    public static BigInteger getValue(byte[] bArr, int i) {
        int i2 = i + 7;
        BigInteger valueOf = BigInteger.valueOf(((((long) bArr[i2]) << 56) & 9151314442816847872L) + ((((long) bArr[i + 6]) << 48) & 71776119061217280L) + ((((long) bArr[i + 5]) << 40) & 280375465082880L) + ((((long) bArr[i + 4]) << 32) & 1095216660480L) + ((((long) bArr[i + 3]) << 24) & 4278190080L) + ((((long) bArr[i + 2]) << 16) & 16711680) + ((((long) bArr[i + 1]) << 8) & 65280) + (((long) bArr[i]) & 255));
        if ((bArr[i2] & Byte.MIN_VALUE) == -128) {
            return valueOf.setBit(63);
        }
        return valueOf;
    }
}
