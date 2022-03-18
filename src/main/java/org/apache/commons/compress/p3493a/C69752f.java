package org.apache.commons.compress.p3493a;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.commons.compress.a.f */
public class C69752f extends FilterInputStream {

    /* renamed from: a */
    private long f174219a;

    /* renamed from: a */
    public long mo244686a() {
        return this.f174219a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = this.in.read();
        if (read >= 0) {
            mo244687a(1);
        }
        return read;
    }

    public C69752f(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo244687a(long j) {
        if (j != -1) {
            this.f174219a += j;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read >= 0) {
            mo244687a((long) read);
        }
        return read;
    }
}
