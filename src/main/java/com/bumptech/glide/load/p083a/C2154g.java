package com.bumptech.glide.load.p083a;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.g */
public final class C2154g extends FilterInputStream {

    /* renamed from: a */
    private static final byte[] f7451a;

    /* renamed from: b */
    private static final int f7452b;

    /* renamed from: c */
    private static final int f7453c;

    /* renamed from: d */
    private final byte f7454d;

    /* renamed from: e */
    private int f7455e;

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f7451a = bArr;
        int length = bArr.length;
        f7452b = length;
        f7453c = length + 2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f7455e;
        if (i3 < 2 || i3 > (i2 = f7453c)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f7454d;
        } else {
            i = f7451a[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f7455e++;
        }
        return i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f7455e = (int) (((long) this.f7455e) + skip);
        }
        return skip;
    }

    public C2154g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f7454d = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f7455e;
        int i5 = f7453c;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f7454d;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f7451a, this.f7455e - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f7455e += i3;
        }
        return i3;
    }
}
