package org.apache.commons.compress.p3493a;

import java.io.DataInput;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: org.apache.commons.compress.a.c */
public final class C69748c {

    /* renamed from: org.apache.commons.compress.a.c$a */
    public interface AbstractC69749a {
        /* renamed from: a */
        int mo244680a() throws IOException;
    }

    /* renamed from: a */
    public static long m267711a(byte[] bArr) {
        return m267712a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private static final void m267713a(int i) {
        if (i > 8) {
            throw new IllegalArgumentException("can't read more than eight bytes into a long value");
        }
    }

    /* renamed from: a */
    public static long m267709a(DataInput dataInput, int i) throws IOException {
        m267713a(i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j |= ((long) dataInput.readUnsignedByte()) << (i2 * 8);
        }
        return j;
    }

    /* renamed from: a */
    public static long m267710a(AbstractC69749a aVar, int i) throws IOException {
        m267713a(i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long a = (long) aVar.mo244680a();
            if (a != -1) {
                j |= a << (i2 * 8);
            } else {
                throw new IOException("premature end of data");
            }
        }
        return j;
    }

    /* renamed from: a */
    public static long m267712a(byte[] bArr, int i, int i2) {
        m267713a(i2);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= (((long) bArr[i + i3]) & 255) << (i3 * 8);
        }
        return j;
    }

    /* renamed from: a */
    public static void m267714a(OutputStream outputStream, long j, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            outputStream.write((int) (255 & j));
            j >>= 8;
        }
    }

    /* renamed from: a */
    public static void m267715a(byte[] bArr, long j, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = (byte) ((int) (255 & j));
            j >>= 8;
        }
    }
}
