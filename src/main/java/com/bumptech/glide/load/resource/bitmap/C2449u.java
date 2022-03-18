package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.u */
public class C2449u extends FilterInputStream {

    /* renamed from: a */
    private volatile byte[] f8020a;

    /* renamed from: b */
    private int f8021b;

    /* renamed from: c */
    private int f8022c;

    /* renamed from: d */
    private int f8023d;

    /* renamed from: e */
    private int f8024e;

    /* renamed from: f */
    private final AbstractC2278b f8025f;

    public boolean markSupported() {
        return true;
    }

    /* renamed from: c */
    private static IOException m10349c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public synchronized void mo10967a() {
        this.f8022c = this.f8020a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f8020a == null || inputStream == null) {
            throw m10349c();
        }
        return (this.f8021b - this.f8024e) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void mo10969b() {
        if (this.f8020a != null) {
            this.f8025f.mo10671a(this.f8020a);
            this.f8020a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        if (this.f8020a != null) {
            this.f8025f.mo10671a(this.f8020a);
            this.f8020a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f8020a != null) {
            int i = this.f8023d;
            if (-1 != i) {
                this.f8024e = i;
            } else {
                throw new C2450a("Mark has been invalidated, pos: " + this.f8024e + " markLimit: " + this.f8022c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f8020a;
        InputStream inputStream = this.in;
        if (bArr == null || inputStream == null) {
            throw m10349c();
        } else if (this.f8024e >= this.f8021b && m10348a(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr == this.f8020a || (bArr = this.f8020a) != null) {
                int i = this.f8021b;
                int i2 = this.f8024e;
                if (i - i2 <= 0) {
                    return -1;
                }
                this.f8024e = i2 + 1;
                return bArr[i2] & 255;
            }
            throw m10349c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.u$a */
    public static class C2450a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        C2450a(String str) {
            super(str);
        }
    }

    public synchronized void mark(int i) {
        this.f8022c = Math.max(this.f8022c, i);
        this.f8023d = this.f8024e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f8020a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f8021b;
                int i2 = this.f8024e;
                if (((long) (i - i2)) >= j) {
                    this.f8024e = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f8024e = i;
                if (this.f8023d == -1 || j > ((long) this.f8022c)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m10348a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f8021b;
                    int i4 = this.f8024e;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f8024e = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) i3)) - ((long) i4);
                    this.f8024e = i3;
                    return j3;
                }
            } else {
                throw m10349c();
            }
        } else {
            throw m10349c();
        }
    }

    public C2449u(InputStream inputStream, AbstractC2278b bVar) {
        this(inputStream, bVar, 65536);
    }

    /* renamed from: a */
    private int m10348a(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = this.f8023d;
        if (i2 == -1 || this.f8024e - i2 >= (i = this.f8022c)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f8023d = -1;
                this.f8024e = 0;
                this.f8021b = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f8021b == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f8025f.mo10668a(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f8020a = bArr2;
            this.f8025f.mo10671a(bArr);
            bArr = bArr2;
        } else if (i2 > 0) {
            System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
        }
        int i3 = this.f8024e - this.f8023d;
        this.f8024e = i3;
        this.f8023d = 0;
        this.f8021b = 0;
        int read2 = inputStream.read(bArr, i3, bArr.length - i3);
        int i4 = this.f8024e;
        if (read2 > 0) {
            i4 += read2;
        }
        this.f8021b = i4;
        return read2;
    }

    C2449u(InputStream inputStream, AbstractC2278b bVar, int i) {
        super(inputStream);
        this.f8023d = -1;
        this.f8025f = bVar;
        this.f8020a = (byte[]) bVar.mo10668a(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        byte[] bArr2 = this.f8020a;
        if (bArr2 == null) {
            throw m10349c();
        } else if (i2 == 0) {
            return 0;
        } else {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i6 = this.f8024e;
                int i7 = this.f8021b;
                if (i6 < i7) {
                    if (i7 - i6 >= i2) {
                        i5 = i2;
                    } else {
                        i5 = i7 - i6;
                    }
                    System.arraycopy(bArr2, i6, bArr, i, i5);
                    this.f8024e += i5;
                    if (i5 == i2 || inputStream.available() == 0) {
                        return i5;
                    }
                    i += i5;
                    i3 = i2 - i5;
                } else {
                    i3 = i2;
                }
                while (true) {
                    int i8 = -1;
                    if (this.f8023d == -1 && i3 >= bArr2.length) {
                        i4 = inputStream.read(bArr, i, i3);
                        if (i4 == -1) {
                            if (i3 != i2) {
                                i8 = i2 - i3;
                            }
                            return i8;
                        }
                    } else if (m10348a(inputStream, bArr2) == -1) {
                        if (i3 != i2) {
                            i8 = i2 - i3;
                        }
                        return i8;
                    } else if (bArr2 == this.f8020a || (bArr2 = this.f8020a) != null) {
                        int i9 = this.f8021b;
                        int i10 = this.f8024e;
                        if (i9 - i10 >= i3) {
                            i4 = i3;
                        } else {
                            i4 = i9 - i10;
                        }
                        System.arraycopy(bArr2, i10, bArr, i, i4);
                        this.f8024e += i4;
                    } else {
                        throw m10349c();
                    }
                    i3 -= i4;
                    if (i3 == 0) {
                        return i2;
                    }
                    if (inputStream.available() == 0) {
                        return i2 - i3;
                    }
                    i += i4;
                }
            } else {
                throw m10349c();
            }
        }
    }
}
