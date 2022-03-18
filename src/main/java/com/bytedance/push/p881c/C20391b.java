package com.bytedance.push.p881c;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.push.c.b */
final class C20391b extends InputStream {

    /* renamed from: a */
    private final InputStream f49840a;

    /* renamed from: b */
    private long f49841b;

    /* renamed from: c */
    private long f49842c;

    /* renamed from: d */
    private long f49843d;

    /* renamed from: e */
    private long f49844e;

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f49840a.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.f49840a.close();
    }

    public boolean markSupported() {
        return this.f49840a.markSupported();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        mo68777a(this.f49844e);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.f49840a.read();
        if (read != -1) {
            this.f49841b++;
        }
        return read;
    }

    public C20391b(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public void mark(int i) {
        this.f49844e = mo68776a(i);
    }

    /* renamed from: a */
    public long mo68776a(int i) {
        long j = this.f49841b + ((long) i);
        if (this.f49843d < j) {
            m74290b(j);
        }
        return this.f49841b;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int read = this.f49840a.read(bArr);
        if (read != -1) {
            this.f49841b += (long) read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = this.f49840a.skip(j);
        this.f49841b += skip;
        return skip;
    }

    /* renamed from: a */
    public void mo68777a(long j) throws IOException {
        if (this.f49841b > this.f49843d || j < this.f49842c) {
            throw new IOException("Cannot reset");
        }
        this.f49840a.reset();
        m74289a(this.f49842c, j);
        this.f49841b = j;
    }

    /* renamed from: b */
    private void m74290b(long j) {
        try {
            long j2 = this.f49842c;
            long j3 = this.f49841b;
            if (j2 >= j3 || j3 > this.f49843d) {
                this.f49842c = j3;
                this.f49840a.mark((int) (j - j3));
            } else {
                this.f49840a.reset();
                this.f49840a.mark((int) (j - this.f49842c));
                m74289a(this.f49842c, this.f49841b);
            }
            this.f49843d = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    public C20391b(InputStream inputStream, int i) {
        this.f49844e = -1;
        this.f49840a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i) : inputStream;
    }

    /* renamed from: a */
    private void m74289a(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f49840a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f49840a.read(bArr, i, i2);
        if (read != -1) {
            this.f49841b += (long) read;
        }
        return read;
    }
}
