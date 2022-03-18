package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.util.c */
public final class C2558c extends FilterInputStream {

    /* renamed from: a */
    private final long f8271a;

    /* renamed from: b */
    private int f8272b;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f8271a - ((long) this.f8272b), (long) this.in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        int i;
        read = super.read();
        if (read >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        m10871a(i);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private int m10871a(int i) throws IOException {
        if (i >= 0) {
            this.f8272b += i;
        } else if (this.f8271a - ((long) this.f8272b) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f8271a + ", but read: " + this.f8272b);
        }
        return i;
    }

    private C2558c(InputStream inputStream, long j) {
        super(inputStream);
        this.f8271a = j;
    }

    /* renamed from: a */
    public static InputStream m10872a(InputStream inputStream, long j) {
        return new C2558c(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return m10871a(super.read(bArr, i, i2));
    }
}
