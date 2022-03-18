package com.ss.android.ugc.effectmanager.p3044c;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.c.b */
public class C60492b implements Closeable {

    /* renamed from: a */
    public final Charset f151220a;

    /* renamed from: b */
    private final InputStream f151221b;

    /* renamed from: c */
    private byte[] f151222c;

    /* renamed from: d */
    private int f151223d;

    /* renamed from: e */
    private int f151224e;

    /* renamed from: b */
    public boolean mo207107b() {
        if (this.f151224e == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m235067c() throws IOException {
        InputStream inputStream = this.f151221b;
        byte[] bArr = this.f151222c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f151223d = 0;
            this.f151224e = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f151221b) {
            if (this.f151222c != null) {
                this.f151222c = null;
                this.f151221b.close();
            }
        }
    }

    /* renamed from: a */
    public String mo207106a() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f151221b) {
            if (this.f151222c != null) {
                if (this.f151223d >= this.f151224e) {
                    m235067c();
                }
                for (int i3 = this.f151223d; i3 != this.f151224e; i3++) {
                    byte[] bArr2 = this.f151222c;
                    if (bArr2[i3] == 10) {
                        if (i3 != this.f151223d) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                byte[] bArr3 = this.f151222c;
                                int i4 = this.f151223d;
                                String str = new String(bArr3, i4, i2 - i4, this.f151220a.name());
                                this.f151223d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr32 = this.f151222c;
                        int i42 = this.f151223d;
                        String str2 = new String(bArr32, i42, i2 - i42, this.f151220a.name());
                        this.f151223d = i3 + 1;
                        return str2;
                    }
                }
                C604931 r1 = new ByteArrayOutputStream((this.f151224e - this.f151223d) + 80) {
                    /* class com.ss.android.ugc.effectmanager.p3044c.C60492b.C604931 */

                    public String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, C60492b.this.f151220a.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    byte[] bArr4 = this.f151222c;
                    int i5 = this.f151223d;
                    r1.write(bArr4, i5, this.f151224e - i5);
                    this.f151224e = -1;
                    m235067c();
                    i = this.f151223d;
                    while (true) {
                        if (i != this.f151224e) {
                            bArr = this.f151222c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f151223d;
                if (i != i6) {
                    r1.write(bArr, i6, i - i6);
                }
                this.f151223d = i + 1;
                return r1.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C60492b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C60492b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C60494c.f151226a)) {
            this.f151221b = inputStream;
            this.f151220a = charset;
            this.f151222c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
