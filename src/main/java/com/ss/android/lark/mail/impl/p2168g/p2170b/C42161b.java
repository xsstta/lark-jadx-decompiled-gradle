package com.ss.android.lark.mail.impl.p2168g.p2170b;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.ss.android.lark.mail.impl.g.b.b */
class C42161b implements Closeable {

    /* renamed from: a */
    public final Charset f107218a;

    /* renamed from: b */
    private final InputStream f107219b;

    /* renamed from: c */
    private byte[] f107220c;

    /* renamed from: d */
    private int f107221d;

    /* renamed from: e */
    private int f107222e;

    /* renamed from: b */
    public boolean mo152147b() {
        if (this.f107222e == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m168253c() throws IOException {
        InputStream inputStream = this.f107219b;
        byte[] bArr = this.f107220c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f107221d = 0;
            this.f107222e = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f107219b) {
            if (this.f107220c != null) {
                this.f107220c = null;
                this.f107219b.close();
            }
        }
    }

    /* renamed from: a */
    public String mo152146a() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f107219b) {
            if (this.f107220c != null) {
                if (this.f107221d >= this.f107222e) {
                    m168253c();
                }
                for (int i3 = this.f107221d; i3 != this.f107222e; i3++) {
                    byte[] bArr2 = this.f107220c;
                    if (bArr2[i3] == 10) {
                        if (i3 != this.f107221d) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                byte[] bArr3 = this.f107220c;
                                int i4 = this.f107221d;
                                String str = new String(bArr3, i4, i2 - i4, this.f107218a.name());
                                this.f107221d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr32 = this.f107220c;
                        int i42 = this.f107221d;
                        String str2 = new String(bArr32, i42, i2 - i42, this.f107218a.name());
                        this.f107221d = i3 + 1;
                        return str2;
                    }
                }
                C421621 r1 = new ByteArrayOutputStream((this.f107222e - this.f107221d) + 80) {
                    /* class com.ss.android.lark.mail.impl.p2168g.p2170b.C42161b.C421621 */

                    public String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, C42161b.this.f107218a.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    byte[] bArr4 = this.f107220c;
                    int i5 = this.f107221d;
                    r1.write(bArr4, i5, this.f107222e - i5);
                    this.f107222e = -1;
                    m168253c();
                    i = this.f107221d;
                    while (true) {
                        if (i != this.f107222e) {
                            bArr = this.f107220c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f107221d;
                if (i != i6) {
                    r1.write(bArr, i6, i - i6);
                }
                this.f107221d = i + 1;
                return r1.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C42161b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C42161b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C42163c.f107224a)) {
            this.f107219b = inputStream;
            this.f107218a = charset;
            this.f107220c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
