package com.ss.android.ugc.effectmanager.common.p3046b.p3047a;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.ss.android.ugc.effectmanager.common.b.a.c */
public class C60506c implements Closeable {

    /* renamed from: a */
    public final Charset f151290a;

    /* renamed from: b */
    private final InputStream f151291b;

    /* renamed from: c */
    private byte[] f151292c;

    /* renamed from: d */
    private int f151293d;

    /* renamed from: e */
    private int f151294e;

    /* renamed from: b */
    public boolean mo207184b() {
        if (this.f151294e == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m235153c() throws IOException {
        InputStream inputStream = this.f151291b;
        byte[] bArr = this.f151292c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f151293d = 0;
            this.f151294e = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f151291b) {
            if (this.f151292c != null) {
                this.f151292c = null;
                this.f151291b.close();
            }
        }
    }

    /* renamed from: a */
    public String mo207183a() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f151291b) {
            if (this.f151292c != null) {
                if (this.f151293d >= this.f151294e) {
                    m235153c();
                }
                for (int i3 = this.f151293d; i3 != this.f151294e; i3++) {
                    byte[] bArr2 = this.f151292c;
                    if (bArr2[i3] == 10) {
                        if (i3 != this.f151293d) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                byte[] bArr3 = this.f151292c;
                                int i4 = this.f151293d;
                                String str = new String(bArr3, i4, i2 - i4, this.f151290a.name());
                                this.f151293d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr32 = this.f151292c;
                        int i42 = this.f151293d;
                        String str2 = new String(bArr32, i42, i2 - i42, this.f151290a.name());
                        this.f151293d = i3 + 1;
                        return str2;
                    }
                }
                C605071 r1 = new ByteArrayOutputStream((this.f151294e - this.f151293d) + 80) {
                    /* class com.ss.android.ugc.effectmanager.common.p3046b.p3047a.C60506c.C605071 */

                    public String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, C60506c.this.f151290a.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    byte[] bArr4 = this.f151292c;
                    int i5 = this.f151293d;
                    r1.write(bArr4, i5, this.f151294e - i5);
                    this.f151294e = -1;
                    m235153c();
                    i = this.f151293d;
                    while (true) {
                        if (i != this.f151294e) {
                            bArr = this.f151292c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f151293d;
                if (i != i6) {
                    r1.write(bArr, i6, i - i6);
                }
                this.f151293d = i + 1;
                return r1.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C60506c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C60506c(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(FileUtils.f151342a.mo207246a())) {
            this.f151291b = inputStream;
            this.f151290a = charset;
            this.f151292c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
