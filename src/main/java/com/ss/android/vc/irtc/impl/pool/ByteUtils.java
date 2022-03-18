package com.ss.android.vc.irtc.impl.pool;

public class ByteUtils {
    public static long byteArrayToLong(byte[] bArr) {
        return (((long) bArr[0]) & 255) | ((((long) bArr[1]) << 8) & 65280) | ((((long) bArr[2]) << 16) & 16711680) | ((((long) bArr[3]) << 24) & 4278190080L) | ((((long) bArr[4]) << 32) & 1095216660480L) | ((((long) bArr[5]) << 40) & 280375465082880L) | ((((long) bArr[6]) << 48) & 71776119061217280L) | ((((long) bArr[7]) << 56) & -72057594037927936L);
    }

    public static void longToByteArray(long j, byte[] bArr) {
        bArr[0] = (byte) ((int) (j & 255));
        bArr[1] = (byte) ((int) ((j >> 8) & 255));
        bArr[2] = (byte) ((int) ((j >> 16) & 255));
        bArr[3] = (byte) ((int) ((j >> 24) & 255));
        bArr[4] = (byte) ((int) ((j >> 32) & 255));
        bArr[5] = (byte) ((int) ((j >> 40) & 255));
        bArr[6] = (byte) ((int) ((j >> 48) & 255));
        bArr[7] = (byte) ((int) ((j >> 56) & 255));
    }
}
