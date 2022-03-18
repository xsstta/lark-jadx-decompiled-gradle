package org.apache.commons.compress.compressors.p3501h;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.p3493a.C69752f;
import org.apache.commons.compress.p3493a.C69753g;
import org.tukaani.xz.C70098s;
import org.tukaani.xz.C70099t;
import org.tukaani.xz.C70100u;
import org.tukaani.xz.MemoryLimitException;

/* renamed from: org.apache.commons.compress.compressors.h.a */
public class C69811a extends AbstractC69780a {

    /* renamed from: a */
    private final C69752f f174453a;

    /* renamed from: b */
    private final InputStream f174454b;

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f174454b.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.f174454b.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.f174454b.read();
            int i = -1;
            if (read != -1) {
                i = 1;
            }
            mo244818a(i);
            return read;
        } catch (MemoryLimitException e) {
            throw new org.apache.commons.compress.MemoryLimitException((long) e.getMemoryNeeded(), e.getMemoryLimit(), e);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return C69753g.m267721a(this.f174454b, j);
        } catch (MemoryLimitException e) {
            throw new org.apache.commons.compress.MemoryLimitException((long) e.getMemoryNeeded(), e.getMemoryLimit(), e);
        }
    }

    /* renamed from: a */
    public static boolean m267905a(byte[] bArr, int i) {
        if (i < C70099t.f175216a.length) {
            return false;
        }
        for (int i2 = 0; i2 < C70099t.f175216a.length; i2++) {
            if (bArr[i2] != C70099t.f175216a[i2]) {
                return false;
            }
        }
        return true;
    }

    public C69811a(InputStream inputStream, boolean z, int i) throws IOException {
        C69752f fVar = new C69752f(inputStream);
        this.f174453a = fVar;
        if (z) {
            this.f174454b = new C70100u(fVar, i);
        } else {
            this.f174454b = new C70098s(fVar, i);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.f174454b.read(bArr, i, i2);
            mo244818a(read);
            return read;
        } catch (MemoryLimitException e) {
            throw new org.apache.commons.compress.MemoryLimitException((long) e.getMemoryNeeded(), e.getMemoryLimit(), e);
        }
    }
}
