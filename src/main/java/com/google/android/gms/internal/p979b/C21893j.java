package com.google.android.gms.internal.p979b;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.b.j */
final class C21893j extends FilterInputStream {

    /* renamed from: a */
    private long f53302a;

    /* renamed from: b */
    private long f53303b = -1;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.f53302a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f53302a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f53302a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f53303b != -1) {
            this.in.reset();
            this.f53302a = this.f53303b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f53303b = this.f53302a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.f53302a));
        this.f53302a -= skip;
        return skip;
    }

    C21893j(InputStream inputStream, long j) {
        super(inputStream);
        C21888e.m79198a(inputStream);
        this.f53302a = 1048577;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f53302a;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f53302a -= (long) read;
        }
        return read;
    }
}
