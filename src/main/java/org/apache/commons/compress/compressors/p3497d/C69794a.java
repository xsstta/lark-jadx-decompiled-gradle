package org.apache.commons.compress.compressors.p3497d;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.p3493a.C69753g;

/* renamed from: org.apache.commons.compress.compressors.d.a */
public class C69794a extends AbstractC69780a {

    /* renamed from: a */
    private InputStream f174378a;

    /* renamed from: b */
    private C69795b f174379b;

    /* renamed from: c */
    private long f174380c;

    /* renamed from: d */
    private final byte[] f174381d;

    /* renamed from: b */
    private void m267839b() {
        C69753g.m267724a(this.f174379b);
        this.f174379b = null;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        C69795b bVar = this.f174379b;
        if (bVar != null) {
            return bVar.mo244857b();
        }
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        try {
            m267839b();
            InputStream inputStream = this.f174378a;
            if (inputStream != null) {
                inputStream.close();
                this.f174378a = null;
            }
        } catch (Throwable th) {
            if (this.f174378a != null) {
                this.f174378a.close();
                this.f174378a = null;
            }
            throw th;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read;
        do {
            read = read(this.f174381d);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        if (read == 1) {
            return this.f174381d[0] & 255;
        }
        throw new IllegalStateException("Invalid return value from read: " + read);
    }

    public C69794a(InputStream inputStream) {
        this(new C69795b(inputStream));
        this.f174378a = inputStream;
    }

    C69794a(C69795b bVar) {
        this.f174381d = new byte[1];
        this.f174379b = bVar;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        C69795b bVar = this.f174379b;
        if (bVar == null) {
            return -1;
        }
        int a = bVar.mo244854a(bArr, i, i2);
        this.f174380c = this.f174379b.mo244855a();
        mo244818a(a);
        if (a == -1) {
            m267839b();
        }
        return a;
    }
}
