package org.tukaani.xz;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.tukaani.xz.p3530h.AbstractC70086f;

/* renamed from: org.tukaani.xz.r */
class C70097r extends InputStream {

    /* renamed from: a */
    static final /* synthetic */ boolean f175195a = true;

    /* renamed from: b */
    private InputStream f175196b;

    /* renamed from: c */
    private final AbstractC70086f f175197c;

    /* renamed from: d */
    private final byte[] f175198d = new byte[4096];

    /* renamed from: e */
    private int f175199e;

    /* renamed from: f */
    private int f175200f;

    /* renamed from: g */
    private int f175201g;

    /* renamed from: h */
    private boolean f175202h;

    /* renamed from: i */
    private IOException f175203i;

    /* renamed from: j */
    private final byte[] f175204j = new byte[1];

    C70097r(InputStream inputStream, AbstractC70086f fVar) {
        Objects.requireNonNull(inputStream);
        if (f175195a || fVar != null) {
            this.f175196b = inputStream;
            this.f175197c = fVar;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    static int m268864a() {
        return 5;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f175196b != null) {
            IOException iOException = this.f175203i;
            if (iOException == null) {
                return this.f175200f;
            }
            throw iOException;
        }
        throw new XZIOException("Stream closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        InputStream inputStream = this.f175196b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f175196b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f175204j, 0, 1) == -1) {
            return -1;
        }
        return this.f175204j[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f175196b != null) {
                IOException iOException = this.f175203i;
                if (iOException == null) {
                    int i4 = 0;
                    while (true) {
                        try {
                            int min = Math.min(this.f175200f, i2);
                            System.arraycopy(this.f175198d, this.f175199e, bArr, i, min);
                            int i5 = this.f175199e + min;
                            this.f175199e = i5;
                            int i6 = this.f175200f - min;
                            this.f175200f = i6;
                            i += min;
                            i2 -= min;
                            i4 += min;
                            int i7 = this.f175201g;
                            if (i5 + i6 + i7 == 4096) {
                                byte[] bArr2 = this.f175198d;
                                System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                                this.f175199e = 0;
                            }
                            if (i2 == 0) {
                                break;
                            } else if (this.f175202h) {
                                break;
                            } else {
                                boolean z = f175195a;
                                if (!z) {
                                    if (this.f175200f != 0) {
                                        throw new AssertionError();
                                    }
                                }
                                int i8 = this.f175199e;
                                int i9 = this.f175200f;
                                int i10 = this.f175201g;
                                int read = this.f175196b.read(this.f175198d, i8 + i9 + i10, 4096 - ((i8 + i9) + i10));
                                if (read == -1) {
                                    this.f175202h = f175195a;
                                    this.f175200f = this.f175201g;
                                    this.f175201g = 0;
                                } else {
                                    int i11 = this.f175201g + read;
                                    this.f175201g = i11;
                                    int a = this.f175197c.mo246787a(this.f175198d, this.f175199e, i11);
                                    this.f175200f = a;
                                    if (!z) {
                                        if (a > this.f175201g) {
                                            throw new AssertionError();
                                        }
                                    }
                                    this.f175201g -= a;
                                }
                            }
                        } catch (IOException e) {
                            this.f175203i = e;
                            throw e;
                        }
                    }
                    if (i4 > 0) {
                        return i4;
                    }
                    return -1;
                }
                throw iOException;
            }
            throw new XZIOException("Stream closed");
        }
    }
}
