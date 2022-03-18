package org.tukaani.xz;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.tukaani.xz.p3525c.C70058b;

/* renamed from: org.tukaani.xz.i */
public class C70088i extends InputStream {

    /* renamed from: a */
    private InputStream f175168a;

    /* renamed from: b */
    private final C70058b f175169b;

    /* renamed from: c */
    private IOException f175170c;

    /* renamed from: d */
    private final byte[] f175171d = new byte[1];

    public C70088i(InputStream inputStream, int i) {
        Objects.requireNonNull(inputStream);
        this.f175168a = inputStream;
        this.f175169b = new C70058b(i);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f175168a;
        if (inputStream != null) {
            IOException iOException = this.f175170c;
            if (iOException == null) {
                return inputStream.available();
            }
            throw iOException;
        }
        throw new XZIOException("Stream closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        InputStream inputStream = this.f175168a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f175168a = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f175171d, 0, 1) == -1) {
            return -1;
        }
        return this.f175171d[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.f175168a;
        if (inputStream != null) {
            IOException iOException = this.f175170c;
            if (iOException == null) {
                try {
                    int read = inputStream.read(bArr, i, i2);
                    if (read == -1) {
                        return -1;
                    }
                    this.f175169b.mo246733a(bArr, i, read);
                    return read;
                } catch (IOException e) {
                    this.f175170c = e;
                    throw e;
                }
            } else {
                throw iOException;
            }
        } else {
            throw new XZIOException("Stream closed");
        }
    }
}
