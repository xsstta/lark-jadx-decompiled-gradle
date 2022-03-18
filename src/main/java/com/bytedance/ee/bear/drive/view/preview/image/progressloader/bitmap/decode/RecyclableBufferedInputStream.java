package com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode;

import com.bytedance.ee.log.C13479a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a */
    private volatile byte[] f19597a;

    /* renamed from: b */
    private int f19598b;

    /* renamed from: c */
    private int f19599c;

    /* renamed from: d */
    private int f19600d = -1;

    /* renamed from: e */
    private int f19601e;

    public boolean markSupported() {
        return true;
    }

    /* renamed from: b */
    private static IOException m29235b() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public synchronized void mo28537a() {
        this.f19599c = this.f19597a.length;
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.f19597a = null;
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f19597a == null || inputStream == null) {
            throw m29235b();
        }
        return (this.f19598b - this.f19601e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f19597a != null) {
            int i = this.f19600d;
            if (-1 != i) {
                this.f19601e = i;
            } else {
                throw new InvalidMarkException("Mark has been invalidated");
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f19597a;
        InputStream inputStream = this.in;
        if (bArr == null || inputStream == null) {
            throw m29235b();
        } else if (this.f19601e >= this.f19598b && m29234a(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr == this.f19597a || (bArr = this.f19597a) != null) {
                int i = this.f19598b;
                int i2 = this.f19601e;
                if (i - i2 <= 0) {
                    return -1;
                }
                this.f19601e = i2 + 1;
                return bArr[i2] & 255;
            }
            throw m29235b();
        }
    }

    public static class InvalidMarkException extends RuntimeException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public synchronized void mark(int i) {
        this.f19599c = Math.max(this.f19599c, i);
        this.f19600d = this.f19601e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        byte[] bArr = this.f19597a;
        InputStream inputStream = this.in;
        if (bArr == null) {
            throw m29235b();
        } else if (j < 1) {
            return 0;
        } else {
            if (inputStream != null) {
                int i = this.f19598b;
                int i2 = this.f19601e;
                if (((long) (i - i2)) >= j) {
                    this.f19601e = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = (long) (i - i2);
                this.f19601e = i;
                if (this.f19600d == -1 || j > ((long) this.f19599c)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m29234a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f19598b;
                    int i4 = this.f19601e;
                    long j3 = j - j2;
                    if (((long) (i3 - i4)) >= j3) {
                        this.f19601e = (int) (((long) i4) + j3);
                        return j;
                    }
                    long j4 = (j2 + ((long) i3)) - ((long) i4);
                    this.f19601e = i3;
                    return j4;
                }
            } else {
                throw m29235b();
            }
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.f19597a = bArr;
    }

    /* renamed from: a */
    private int m29234a(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = this.f19600d;
        if (i2 == -1 || this.f19601e - i2 >= (i = this.f19599c)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f19600d = -1;
                this.f19601e = 0;
                this.f19598b = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f19598b == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            C13479a.m54772d("BufferedIs", "allocate buffer of length: " + i);
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f19597a = bArr2;
            bArr = bArr2;
        } else if (i2 > 0) {
            System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
        }
        int i3 = this.f19601e - this.f19600d;
        this.f19601e = i3;
        this.f19600d = 0;
        this.f19598b = 0;
        int read2 = inputStream.read(bArr, i3, bArr.length - i3);
        int i4 = this.f19601e;
        if (read2 > 0) {
            i4 += read2;
        }
        this.f19598b = i4;
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        byte[] bArr2 = this.f19597a;
        if (bArr2 == null) {
            throw m29235b();
        } else if (i2 == 0) {
            return 0;
        } else {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i6 = this.f19601e;
                int i7 = this.f19598b;
                if (i6 < i7) {
                    if (i7 - i6 >= i2) {
                        i5 = i2;
                    } else {
                        i5 = i7 - i6;
                    }
                    System.arraycopy(bArr2, i6, bArr, i, i5);
                    this.f19601e += i5;
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
                    if (this.f19600d == -1 && i3 >= bArr2.length) {
                        i4 = inputStream.read(bArr, i, i3);
                        if (i4 == -1) {
                            if (i3 != i2) {
                                i8 = i2 - i3;
                            }
                            return i8;
                        }
                    } else if (m29234a(inputStream, bArr2) == -1) {
                        if (i3 != i2) {
                            i8 = i2 - i3;
                        }
                        return i8;
                    } else if (bArr2 == this.f19597a || (bArr2 = this.f19597a) != null) {
                        int i9 = this.f19598b;
                        int i10 = this.f19601e;
                        if (i9 - i10 >= i3) {
                            i4 = i3;
                        } else {
                            i4 = i9 - i10;
                        }
                        System.arraycopy(bArr2, i10, bArr, i, i4);
                        this.f19601e += i4;
                    } else {
                        throw m29235b();
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
                throw m29235b();
            }
        }
    }
}
