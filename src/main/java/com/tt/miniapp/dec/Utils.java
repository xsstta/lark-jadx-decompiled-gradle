package com.tt.miniapp.dec;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.Buffer;

final class Utils {
    private static final byte[] BYTE_ZEROES = new byte[1024];
    private static final int[] INT_ZEROES = new int[1024];

    Utils() {
    }

    static void closeInput(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    static void flipBuffer(Buffer buffer) {
        buffer.flip();
    }

    static byte[] toUsAsciiBytes(String str) {
        try {
            return str.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    static void fillBytesWithZeroes(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int min = Math.min(i + 1024, i2) - i;
            System.arraycopy(BYTE_ZEROES, 0, bArr, i, min);
            i += min;
        }
    }

    static void fillIntsWithZeroes(int[] iArr, int i, int i2) {
        while (i < i2) {
            int min = Math.min(i + 1024, i2) - i;
            System.arraycopy(INT_ZEROES, 0, iArr, i, min);
            i += min;
        }
    }

    static void copyBytesWithin(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(bArr, i2, bArr, i, i3 - i2);
    }

    static int readInput(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (IOException e) {
            throw new BrotliRuntimeException("Failed to read input", e);
        }
    }
}
