package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.react.modules.network.d */
public class C21216d extends FilterOutputStream {

    /* renamed from: a */
    private long f51704a;

    /* renamed from: a */
    public long mo72049a() {
        return this.f51704a;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    public C21216d(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(int i) throws IOException {
        this.out.write(i);
        this.f51704a++;
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.f51704a += (long) i2;
    }
}
