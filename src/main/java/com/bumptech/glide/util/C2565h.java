package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.util.h */
public class C2565h extends FilterInputStream {

    /* renamed from: a */
    private int f8284a = Integer.MIN_VALUE;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f8284a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.f8284a;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m10891a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m10892b(1);
        return read;
    }

    public C2565h(InputStream inputStream) {
        super(inputStream);
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f8284a = i;
    }

    /* renamed from: a */
    private long m10891a(long j) {
        int i = this.f8284a;
        if (i == 0) {
            return -1;
        }
        if (i == Integer.MIN_VALUE || j <= ((long) i)) {
            return j;
        }
        return (long) i;
    }

    /* renamed from: b */
    private void m10892b(long j) {
        int i = this.f8284a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f8284a = (int) (((long) i) - j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long a = m10891a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        m10892b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int a = (int) m10891a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m10892b((long) read);
        return read;
    }
}
