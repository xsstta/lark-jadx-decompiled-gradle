package com.p938d.p939a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
/* renamed from: com.d.a.b */
public class C20952b implements Closeable {

    /* renamed from: a */
    public final Charset f51316a;

    /* renamed from: b */
    private final InputStream f51317b;

    /* renamed from: c */
    private byte[] f51318c;

    /* renamed from: d */
    private int f51319d;

    /* renamed from: e */
    private int f51320e;

    /* renamed from: b */
    private void m76333b() throws IOException {
        InputStream inputStream = this.f51317b;
        byte[] bArr = this.f51318c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f51319d = 0;
            this.f51320e = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f51317b) {
            if (this.f51318c != null) {
                this.f51318c = null;
                this.f51317b.close();
            }
        }
    }

    /* renamed from: a */
    public String mo70824a() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f51317b) {
            if (this.f51318c != null) {
                if (this.f51319d >= this.f51320e) {
                    m76333b();
                }
                for (int i3 = this.f51319d; i3 != this.f51320e; i3++) {
                    byte[] bArr2 = this.f51318c;
                    if (bArr2[i3] == 10) {
                        if (i3 != this.f51319d) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                byte[] bArr3 = this.f51318c;
                                int i4 = this.f51319d;
                                String str = new String(bArr3, i4, i2 - i4, this.f51316a.name());
                                this.f51319d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr32 = this.f51318c;
                        int i42 = this.f51319d;
                        String str2 = new String(bArr32, i42, i2 - i42, this.f51316a.name());
                        this.f51319d = i3 + 1;
                        return str2;
                    }
                }
                C209531 r1 = new ByteArrayOutputStream((this.f51320e - this.f51319d) + 80) {
                    /* class com.p938d.p939a.C20952b.C209531 */

                    public String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, C20952b.this.f51316a.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    byte[] bArr4 = this.f51318c;
                    int i5 = this.f51319d;
                    r1.write(bArr4, i5, this.f51320e - i5);
                    this.f51320e = -1;
                    m76333b();
                    i = this.f51319d;
                    while (true) {
                        if (i != this.f51320e) {
                            bArr = this.f51318c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f51319d;
                if (i != i6) {
                    r1.write(bArr, i6, i - i6);
                }
                this.f51319d = i + 1;
                return r1.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C20952b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C20952b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C20954c.f51322a)) {
            this.f51317b = inputStream;
            this.f51316a = charset;
            this.f51318c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
