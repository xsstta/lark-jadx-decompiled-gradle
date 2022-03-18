package org.apache.commons.compress.p3493a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: org.apache.commons.compress.a.g */
public final class C69753g {

    /* renamed from: a */
    private static final byte[] f174220a = new byte[4096];

    /* renamed from: a */
    public static void m267724a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static byte[] m267725a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m267722a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static int m267719a(InputStream inputStream, byte[] bArr) throws IOException {
        return m267720a(inputStream, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static long m267722a(InputStream inputStream, OutputStream outputStream) throws IOException {
        return m267723a(inputStream, outputStream, 8024);
    }

    /* renamed from: a */
    public static long m267721a(InputStream inputStream, long j) throws IOException {
        int a;
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip == 0) {
                break;
            }
            j2 -= skip;
        }
        while (j2 > 0 && (a = m267720a(inputStream, f174220a, 0, (int) Math.min(j2, 4096L))) >= 1) {
            j2 -= (long) a;
        }
        return j - j2;
    }

    /* renamed from: a */
    public static long m267723a(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        if (i >= 1) {
            byte[] bArr = new byte[i];
            long j = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (-1 == read) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += (long) read;
            }
        } else {
            throw new IllegalArgumentException("buffersize must be bigger than 0");
        }
    }

    /* renamed from: a */
    public static int m267720a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i2 + i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        while (i3 != i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        return i3;
    }
}
