package com.lark.falcon.engine.inspect.p1062a;

import com.lark.falcon.engine.p1059c.C23970a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.lark.falcon.engine.inspect.a.a */
public class C23978a extends InputStream {

    /* renamed from: a */
    private final InputStream[] f59327a;

    /* renamed from: b */
    private int f59328b;

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        m87679a(this.f59328b);
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private boolean m87680a() {
        int i = this.f59328b;
        if (i + 1 >= this.f59327a.length) {
            return false;
        }
        this.f59328b = i + 1;
        return true;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f59327a[this.f59328b].available();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read;
        do {
            read = this.f59327a[this.f59328b].read();
            if (read != -1) {
                break;
            }
        } while (m87680a());
        return read;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        int read = read(new byte[((int) j)]);
        if (read >= 0) {
            return (long) read;
        }
        return -1;
    }

    public C23978a(InputStream[] inputStreamArr) {
        if (inputStreamArr == null || inputStreamArr.length < 2) {
            throw new IllegalArgumentException("Streams must be non-null and have more than 1 entry");
        }
        this.f59327a = inputStreamArr;
        this.f59328b = 0;
    }

    /* renamed from: a */
    private void m87679a(int i) throws IOException {
        IOException iOException = null;
        int i2 = 0;
        while (true) {
            InputStream[] inputStreamArr = this.f59327a;
            if (i2 < inputStreamArr.length) {
                try {
                    inputStreamArr[i2].close();
                } catch (IOException e) {
                    e = e;
                    if (!(i2 == i || iOException == null)) {
                        e = iOException;
                    }
                    if (!(iOException == null || iOException == e)) {
                        C23970a.m87619a("CompositeInputStream", "Suppressing exception", iOException);
                    }
                    iOException = e;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        do {
            read = this.f59327a[this.f59328b].read(bArr, i, i2);
            if (read != -1) {
                break;
            }
        } while (m87680a());
        return read;
    }
}
