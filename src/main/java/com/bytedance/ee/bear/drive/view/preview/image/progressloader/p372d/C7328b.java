package com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.d.b */
public final class C7328b extends FilterInputStream {

    /* renamed from: a */
    private final long f19611a;

    /* renamed from: b */
    private int f19612b;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        return m29276a(super.read());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f19611a - ((long) this.f19612b), (long) this.in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private int m29276a(int i) throws IOException {
        if (i >= 0) {
            this.f19612b += i;
        } else if (this.f19611a - ((long) this.f19612b) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f19611a + ", but read: " + this.f19612b);
        }
        return i;
    }

    C7328b(InputStream inputStream, long j) {
        super(inputStream);
        this.f19611a = j;
    }

    /* renamed from: a */
    public static InputStream m29277a(InputStream inputStream, long j) {
        return new C7328b(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return m29276a(super.read(bArr, i, i2));
    }
}
