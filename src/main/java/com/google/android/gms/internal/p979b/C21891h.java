package com.google.android.gms.internal.p979b;

import bytekn.foundation.io.file.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.google.android.gms.internal.b.h */
public final class C21891h {

    /* renamed from: a */
    private static final OutputStream f53300a = new C21890g();

    /* renamed from: a */
    public static byte[] m79200a(InputStream inputStream) throws IOException {
        C21888e.m79198a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i2 = 0;
        while (i2 < 2147483639) {
            int min = Math.min(i, ByteArrayOutputStream.f5812a - i2);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return m79201a(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            i = C21896l.m79206a(i, 2);
        }
        if (inputStream.read() == -1) {
            return m79201a(arrayDeque, (int) ByteArrayOutputStream.f5812a);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: a */
    public static InputStream m79199a(InputStream inputStream, long j) {
        return new C21893j(inputStream, 1048577);
    }

    /* renamed from: a */
    private static byte[] m79201a(Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] removeFirst = deque.removeFirst();
            int min = Math.min(i2, removeFirst.length);
            System.arraycopy(removeFirst, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
