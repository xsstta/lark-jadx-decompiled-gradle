package com.tt.miniapp.streamloader;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.tt.miniapp.streamloader.a */
public class C66862a extends InputStream {

    /* renamed from: a */
    private volatile InputStream f168651a;

    @Override // java.io.InputStream
    public int available() throws IOException {
        m260815a();
        return this.f168651a.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        m260815a();
        this.f168651a.close();
    }

    public boolean markSupported() {
        m260815a();
        return this.f168651a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        m260815a();
        return this.f168651a.read();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        m260815a();
        this.f168651a.reset();
    }

    /* renamed from: a */
    private void m260815a() {
        if (this.f168651a == null) {
            synchronized (this) {
                while (this.f168651a == null) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo232805a(InputStream inputStream) {
        if (inputStream != null) {
            this.f168651a = inputStream;
            synchronized (this) {
                notifyAll();
            }
        }
    }

    public synchronized void mark(int i) {
        m260815a();
        this.f168651a.mark(i);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        m260815a();
        return this.f168651a.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        m260815a();
        return this.f168651a.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        m260815a();
        return this.f168651a.read(bArr, i, i2);
    }
}
