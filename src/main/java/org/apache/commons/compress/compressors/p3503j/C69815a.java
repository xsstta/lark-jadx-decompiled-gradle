package org.apache.commons.compress.compressors.p3503j;

import com.github.luben.zstd.ZstdInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.p3493a.C69752f;
import org.apache.commons.compress.p3493a.C69753g;

/* renamed from: org.apache.commons.compress.compressors.j.a */
public class C69815a extends AbstractC69780a {

    /* renamed from: a */
    private final C69752f f174462a;

    /* renamed from: b */
    private final ZstdInputStream f174463b;

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f174463b.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.f174463b.close();
    }

    public boolean markSupported() {
        return this.f174463b.markSupported();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.f174463b.reset();
    }

    public String toString() {
        return this.f174463b.toString();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i;
        int read = this.f174463b.read();
        if (read == -1) {
            i = 0;
        } else {
            i = 1;
        }
        mo244818a(i);
        return read;
    }

    public void mark(int i) {
        this.f174463b.mark(i);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return this.f174463b.read(bArr);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return C69753g.m267721a((InputStream) this.f174463b, j);
    }

    public C69815a(InputStream inputStream) throws IOException {
        C69752f fVar = new C69752f(inputStream);
        this.f174462a = fVar;
        this.f174463b = new ZstdInputStream(fVar);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f174463b.read(bArr, i, i2);
        mo244818a(read);
        return read;
    }
}
