package com.android.volley.toolbox;

import com.huawei.hms.feature.dynamic.DynamicModule;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.android.volley.toolbox.o */
public class C1973o extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C1949d f6688a;

    @Override // java.lang.Object
    public void finalize() {
        this.f6688a.mo9830a(this.buf);
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6688a.mo9830a(this.buf);
        this.buf = null;
        super.close();
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream
    public synchronized void write(int i) {
        m8697a(1);
        super.write(i);
    }

    /* renamed from: a */
    private void m8697a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] a = this.f6688a.mo9831a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f6688a.mo9830a(this.buf);
            this.buf = a;
        }
    }

    public C1973o(C1949d dVar, int i) {
        this.f6688a = dVar;
        this.buf = dVar.mo9831a(Math.max(i, (int) DynamicModule.f58006b));
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m8697a(i2);
        super.write(bArr, i, i2);
    }
}
