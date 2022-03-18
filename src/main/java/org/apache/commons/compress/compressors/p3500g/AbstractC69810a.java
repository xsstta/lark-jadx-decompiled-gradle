package org.apache.commons.compress.compressors.p3500g;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.apache.commons.compress.MemoryLimitException;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.p3493a.C69746a;

/* renamed from: org.apache.commons.compress.compressors.g.a */
public abstract class AbstractC69810a extends AbstractC69780a {

    /* renamed from: a */
    protected final C69746a f174442a;

    /* renamed from: b */
    private final byte[] f174443b = new byte[1];

    /* renamed from: c */
    private int f174444c = -1;

    /* renamed from: d */
    private int f174445d = 9;

    /* renamed from: e */
    private byte f174446e;

    /* renamed from: f */
    private int f174447f = -1;

    /* renamed from: g */
    private int f174448g;

    /* renamed from: h */
    private int[] f174449h;

    /* renamed from: i */
    private byte[] f174450i;

    /* renamed from: j */
    private byte[] f174451j;

    /* renamed from: k */
    private int f174452k;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo244882a(int i, byte b) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo244886b() throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo244897h() {
        this.f174447f = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo244893e() {
        return this.f174445d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo244898i() {
        return this.f174444c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo244899j() {
        return this.f174448g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.f174442a.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo244895f() {
        mo244892d(9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo244896g() {
        this.f174445d++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo244888c() throws IOException {
        int i = this.f174445d;
        if (i <= 31) {
            return (int) this.f174442a.mo244670a(i);
        }
        throw new IllegalArgumentException("code size must not be bigger than 31");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo244891d() throws IOException {
        int i = this.f174447f;
        if (i != -1) {
            return mo244882a(i, this.f174446e);
        }
        throw new IOException("The first code can't be a reference to its preceding code");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = read(this.f174443b);
        if (read < 0) {
            return read;
        }
        return this.f174443b[0] & 255;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo244892d(int i) {
        this.f174445d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo244887b(int i) {
        this.f174444c = 1 << (i - 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo244894e(int i) {
        this.f174448g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo244889c(int i) {
        int i2 = 1 << i;
        this.f174449h = new int[i2];
        this.f174450i = new byte[i2];
        this.f174451j = new byte[i2];
        this.f174452k = i2;
        for (int i3 = 0; i3 < 256; i3++) {
            this.f174449h[i3] = -1;
            this.f174450i[i3] = (byte) i3;
        }
    }

    protected AbstractC69810a(InputStream inputStream, ByteOrder byteOrder) {
        this.f174442a = new C69746a(inputStream, byteOrder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo244884a(int i, boolean z) throws IOException {
        int i2 = i;
        while (i2 >= 0) {
            byte[] bArr = this.f174451j;
            int i3 = this.f174452k - 1;
            this.f174452k = i3;
            bArr[i3] = this.f174450i[i2];
            i2 = this.f174449h[i2];
        }
        int i4 = this.f174447f;
        if (i4 != -1 && !z) {
            mo244882a(i4, this.f174451j[this.f174452k]);
        }
        this.f174447f = i;
        byte[] bArr2 = this.f174451j;
        int i5 = this.f174452k;
        this.f174446e = bArr2[i5];
        return i5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo244885a(int i, int i2) throws MemoryLimitException {
        if (i2 > -1) {
            long j = (((long) (1 << i)) * 6) >> 10;
            if (j > ((long) i2)) {
                throw new MemoryLimitException(j, i2);
            }
        }
        mo244889c(i);
    }

    /* renamed from: a */
    private int m267887a(byte[] bArr, int i, int i2) {
        int length = this.f174451j.length - this.f174452k;
        if (length <= 0) {
            return 0;
        }
        int min = Math.min(length, i2);
        System.arraycopy(this.f174451j, this.f174452k, bArr, i, min);
        this.f174452k += min;
        return min;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo244883a(int i, byte b, int i2) {
        int i3 = this.f174448g;
        if (i3 >= i2) {
            return -1;
        }
        this.f174449h[i3] = i;
        this.f174450i[i3] = b;
        this.f174448g = i3 + 1;
        return i3;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int a = m267887a(bArr, i, i2);
        while (true) {
            int i3 = i2 - a;
            if (i3 > 0) {
                int b = mo244886b();
                if (b >= 0) {
                    a += m267887a(bArr, i + a, i3);
                } else if (a <= 0) {
                    return b;
                } else {
                    mo244818a(a);
                    return a;
                }
            } else {
                mo244818a(a);
                return a;
            }
        }
    }
}
