package com.bumptech.glide.load.p083a;

import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.a.c */
public final class C2146c extends OutputStream {

    /* renamed from: a */
    private final OutputStream f7444a;

    /* renamed from: b */
    private byte[] f7445b;

    /* renamed from: c */
    private AbstractC2278b f7446c;

    /* renamed from: d */
    private int f7447d;

    /* renamed from: a */
    private void m9351a() throws IOException {
        int i = this.f7447d;
        if (i > 0) {
            this.f7444a.write(this.f7445b, 0, i);
            this.f7447d = 0;
        }
    }

    /* renamed from: b */
    private void m9352b() throws IOException {
        if (this.f7447d == this.f7445b.length) {
            m9351a();
        }
    }

    /* renamed from: c */
    private void m9353c() {
        byte[] bArr = this.f7445b;
        if (bArr != null) {
            this.f7446c.mo10671a(bArr);
            this.f7445b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m9351a();
        this.f7444a.flush();
    }

    /* JADX INFO: finally extract failed */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f7444a.close();
            m9353c();
        } catch (Throwable th) {
            this.f7444a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f7445b;
        int i2 = this.f7447d;
        this.f7447d = i2 + 1;
        bArr[i2] = (byte) i;
        m9352b();
    }

    public C2146c(OutputStream outputStream, AbstractC2278b bVar) {
        this(outputStream, bVar, 65536);
    }

    C2146c(OutputStream outputStream, AbstractC2278b bVar, int i) {
        this.f7444a = outputStream;
        this.f7446c = bVar;
        this.f7445b = (byte[]) bVar.mo10668a(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f7447d;
            if (i6 != 0 || i4 < this.f7445b.length) {
                int min = Math.min(i4, this.f7445b.length - i6);
                System.arraycopy(bArr, i5, this.f7445b, this.f7447d, min);
                this.f7447d += min;
                i3 += min;
                m9352b();
            } else {
                this.f7444a.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
