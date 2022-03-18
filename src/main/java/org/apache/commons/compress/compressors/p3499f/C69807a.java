package org.apache.commons.compress.compressors.p3499f;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.p3493a.C69752f;
import org.apache.commons.compress.p3493a.C69753g;
import org.tukaani.xz.C70095p;
import org.tukaani.xz.MemoryLimitException;

/* renamed from: org.apache.commons.compress.compressors.f.a */
public class C69807a extends AbstractC69780a {

    /* renamed from: a */
    private final C69752f f174436a;

    /* renamed from: b */
    private final InputStream f174437b;

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f174437b.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.f174437b.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i;
        int read = this.f174437b.read();
        if (read == -1) {
            i = 0;
        } else {
            i = 1;
        }
        mo244818a(i);
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return C69753g.m267721a(this.f174437b, j);
    }

    /* renamed from: a */
    public static boolean m267883a(byte[] bArr, int i) {
        if (bArr != null && i >= 3 && bArr[0] == 93 && bArr[1] == 0 && bArr[2] == 0) {
            return true;
        }
        return false;
    }

    public C69807a(InputStream inputStream, int i) throws IOException {
        try {
            C69752f fVar = new C69752f(inputStream);
            this.f174436a = fVar;
            this.f174437b = new C70095p(fVar, i);
        } catch (MemoryLimitException e) {
            throw new org.apache.commons.compress.MemoryLimitException((long) e.getMemoryNeeded(), e.getMemoryLimit(), e);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f174437b.read(bArr, i, i2);
        mo244818a(read);
        return read;
    }
}
