package org.apache.commons.compress.p3493a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.commons.compress.a.b */
public class C69747b extends InputStream {

    /* renamed from: a */
    private final InputStream f174215a;

    /* renamed from: b */
    private long f174216b;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j = this.f174216b;
        if (j <= 0) {
            return -1;
        }
        this.f174216b = j - 1;
        return this.f174215a.read();
    }

    public C69747b(InputStream inputStream, long j) {
        this.f174215a = inputStream;
        this.f174216b = j;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f174216b;
        if (j == 0) {
            return -1;
        }
        if (((long) i2) > j) {
            i2 = (int) j;
        }
        int read = this.f174215a.read(bArr, i, i2);
        if (read >= 0) {
            this.f174216b -= (long) read;
        }
        return read;
    }
}
