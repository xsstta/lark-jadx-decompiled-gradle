package org.apache.commons.compress.compressors.p3496c;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.p3493a.C69752f;
import org.apache.commons.compress.p3493a.C69753g;

/* renamed from: org.apache.commons.compress.compressors.c.a */
public class C69791a extends AbstractC69780a {

    /* renamed from: a */
    private final C69752f f174373a;

    /* renamed from: b */
    private final InputStream f174374b;

    /* renamed from: c */
    private final Inflater f174375c;

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f174374b.available();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i;
        int read = this.f174374b.read();
        if (read == -1) {
            i = 0;
        } else {
            i = 1;
        }
        mo244818a(i);
        return read;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        try {
            this.f174374b.close();
        } finally {
            this.f174375c.end();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return C69753g.m267721a(this.f174374b, j);
    }

    public C69791a(InputStream inputStream) {
        this(inputStream, new C69792b());
    }

    public C69791a(InputStream inputStream, C69792b bVar) {
        Inflater inflater = new Inflater(!bVar.mo244849a());
        this.f174375c = inflater;
        C69752f fVar = new C69752f(inputStream);
        this.f174373a = fVar;
        this.f174374b = new InflaterInputStream(fVar, inflater);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f174374b.read(bArr, i, i2);
        mo244818a(read);
        return read;
    }
}
