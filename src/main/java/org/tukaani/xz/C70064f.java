package org.tukaani.xz;

import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: org.tukaani.xz.f */
public class C70064f extends C70062e {

    /* renamed from: a */
    private long f175113a;

    public C70064f(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public long mo246758a() {
        return this.f175113a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            long j = this.f175113a;
            if (j >= 0) {
                this.f175113a = j + 1;
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read > 0) {
            long j = this.f175113a;
            if (j >= 0) {
                this.f175113a = j + ((long) read);
            }
        }
        return read;
    }
}
