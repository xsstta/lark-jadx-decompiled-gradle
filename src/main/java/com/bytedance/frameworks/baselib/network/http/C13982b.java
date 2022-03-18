package com.bytedance.frameworks.baselib.network.http;

import com.bytedance.retrofit2.client.AbstractC20594b;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b */
public class C13982b extends InputStream {

    /* renamed from: a */
    private InputStream f36544a;

    /* renamed from: b */
    private AbstractC20594b f36545b;

    public C13982b() {
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f36544a;
        if (inputStream != null) {
            return inputStream.available();
        }
        return super.available();
    }

    public boolean markSupported() {
        InputStream inputStream = this.f36544a;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return super.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.f36544a;
        if (inputStream != null) {
            return inputStream.read();
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        try {
            InputStream inputStream = this.f36544a;
            if (inputStream != null) {
                inputStream.close();
            }
            AbstractC20594b bVar = this.f36545b;
            if (bVar != null) {
                bVar.mo51525b();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.close();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        InputStream inputStream = this.f36544a;
        if (inputStream != null) {
            inputStream.reset();
        } else {
            super.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        InputStream inputStream = this.f36544a;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return super.skip(j);
    }

    public synchronized void mark(int i) {
        InputStream inputStream = this.f36544a;
        if (inputStream != null) {
            inputStream.mark(i);
        } else {
            super.mark(i);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.f36544a;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return super.read(bArr);
    }

    public C13982b(InputStream inputStream, AbstractC20594b bVar) {
        this.f36544a = inputStream;
        this.f36545b = bVar;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream = this.f36544a;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        return super.read(bArr, i, i2);
    }
}
