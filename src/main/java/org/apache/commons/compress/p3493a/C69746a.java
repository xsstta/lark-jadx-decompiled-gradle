package org.apache.commons.compress.p3493a;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: org.apache.commons.compress.a.a */
public class C69746a implements Closeable {

    /* renamed from: a */
    private static final long[] f174210a = new long[64];

    /* renamed from: b */
    private final C69752f f174211b;

    /* renamed from: c */
    private final ByteOrder f174212c;

    /* renamed from: d */
    private long f174213d;

    /* renamed from: e */
    private int f174214e;

    /* renamed from: b */
    public int mo244672b() {
        return this.f174214e;
    }

    /* renamed from: a */
    public void mo244671a() {
        this.f174213d = 0;
        this.f174214e = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f174211b.close();
    }

    /* renamed from: e */
    public long mo244676e() {
        return this.f174211b.mo244686a();
    }

    /* renamed from: c */
    public long mo244673c() throws IOException {
        return ((long) this.f174214e) + (((long) this.f174211b.available()) * 8);
    }

    /* renamed from: d */
    public void mo244675d() {
        int i = this.f174214e % 8;
        if (i > 0) {
            m267701c(i);
        }
    }

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = f174210a;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    /* renamed from: c */
    private long m267701c(int i) {
        long j;
        if (this.f174212c == ByteOrder.LITTLE_ENDIAN) {
            long j2 = this.f174213d;
            j = j2 & f174210a[i];
            this.f174213d = j2 >>> i;
        } else {
            j = (this.f174213d >> (this.f174214e - i)) & f174210a[i];
        }
        this.f174214e -= i;
        return j;
    }

    /* renamed from: d */
    private boolean m267702d(int i) throws IOException {
        while (true) {
            int i2 = this.f174214e;
            if (i2 >= i || i2 >= 57) {
                return false;
            }
            long read = (long) this.f174211b.read();
            if (read < 0) {
                return true;
            }
            if (this.f174212c == ByteOrder.LITTLE_ENDIAN) {
                this.f174213d = (read << this.f174214e) | this.f174213d;
            } else {
                long j = this.f174213d << 8;
                this.f174213d = j;
                this.f174213d = read | j;
            }
            this.f174214e += 8;
        }
    }

    /* renamed from: a */
    public long mo244670a(int i) throws IOException {
        if (i < 0 || i > 63) {
            throw new IllegalArgumentException("count must not be negative or greater than 63");
        } else if (m267702d(i)) {
            return -1;
        } else {
            if (this.f174214e < i) {
                return m267700b(i);
            }
            return m267701c(i);
        }
    }

    /* renamed from: b */
    private long m267700b(int i) throws IOException {
        long j;
        int i2 = i - this.f174214e;
        int i3 = 8 - i2;
        long read = (long) this.f174211b.read();
        if (read < 0) {
            return read;
        }
        if (this.f174212c == ByteOrder.LITTLE_ENDIAN) {
            long[] jArr = f174210a;
            this.f174213d = ((jArr[i2] & read) << this.f174214e) | this.f174213d;
            j = (read >>> i2) & jArr[i3];
        } else {
            long j2 = this.f174213d << i2;
            this.f174213d = j2;
            long[] jArr2 = f174210a;
            this.f174213d = j2 | ((read >>> i3) & jArr2[i2]);
            j = read & jArr2[i3];
        }
        long j3 = this.f174213d & f174210a[i];
        this.f174213d = j;
        this.f174214e = i3;
        return j3;
    }

    public C69746a(InputStream inputStream, ByteOrder byteOrder) {
        this.f174211b = new C69752f(inputStream);
        this.f174212c = byteOrder;
    }
}
