package org.apache.commons.compress.p3493a;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.Checksum;

/* renamed from: org.apache.commons.compress.a.d */
public class C69750d extends InputStream {

    /* renamed from: a */
    private final InputStream f174217a;

    /* renamed from: b */
    private final Checksum f174218b;

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.f174217a.read();
        if (read >= 0) {
            this.f174218b.update(read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (read() >= 0) {
            return 1;
        }
        return 0;
    }

    public C69750d(Checksum checksum, InputStream inputStream) {
        Objects.requireNonNull(checksum, "Parameter checksum must not be null");
        Objects.requireNonNull(inputStream, "Parameter in must not be null");
        this.f174218b = checksum;
        this.f174217a = inputStream;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f174217a.read(bArr, i, i2);
        if (read >= 0) {
            this.f174218b.update(bArr, i, read);
        }
        return read;
    }
}
