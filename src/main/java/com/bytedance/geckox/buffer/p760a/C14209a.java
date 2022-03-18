package com.bytedance.geckox.buffer.p760a;

import com.bytedance.geckox.buffer.AbstractC14208a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.geckox.buffer.a.a */
public class C14209a extends InputStream {

    /* renamed from: a */
    private AbstractC14208a f37363a;

    /* renamed from: b */
    private long f37364b;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
    }

    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.f37363a.mo52103d();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f37363a.mo52101b(this.f37364b);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long b = this.f37363a.mo52100b() - this.f37363a.mo52102c();
        if (b > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) b;
    }

    public C14209a(AbstractC14208a aVar) {
        this.f37363a = aVar;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return this.f37363a.mo52094a(j);
    }

    public synchronized void mark(int i) {
        this.f37364b = (long) i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return this.f37363a.mo52098b(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f37363a.mo52099b(bArr, i, i2);
    }
}
