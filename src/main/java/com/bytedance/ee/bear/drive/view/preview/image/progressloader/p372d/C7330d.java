package com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.d.d */
public class C7330d extends FilterInputStream {

    /* renamed from: a */
    private int f19616a = Integer.MIN_VALUE;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        this.f19616a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.f19616a;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m29282a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m29283b(1);
        return read;
    }

    public C7330d(InputStream inputStream) {
        super(inputStream);
    }

    public void mark(int i) {
        super.mark(i);
        this.f19616a = i;
    }

    /* renamed from: a */
    private long m29282a(long j) {
        int i = this.f19616a;
        if (i == 0) {
            return -1;
        }
        if (i == Integer.MIN_VALUE || j <= ((long) i)) {
            return j;
        }
        return (long) i;
    }

    /* renamed from: b */
    private void m29283b(long j) {
        int i = this.f19616a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f19616a = (int) (((long) i) - j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long a = m29282a(j);
        if (a == -1) {
            return -1;
        }
        long skip = super.skip(a);
        m29283b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int a = (int) m29282a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m29283b((long) read);
        return read;
    }
}
