package org.apache.commons.compress.compressors.lz77support;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.p3493a.C69748c;
import org.apache.commons.compress.p3493a.C69752f;
import org.apache.commons.compress.p3493a.C69753g;

/* renamed from: org.apache.commons.compress.compressors.lz77support.a */
public abstract class AbstractC69833a extends AbstractC69780a {

    /* renamed from: a */
    protected final C69748c.AbstractC69749a f174543a = new C69748c.AbstractC69749a() {
        /* class org.apache.commons.compress.compressors.lz77support.AbstractC69833a.C698341 */

        @Override // org.apache.commons.compress.p3493a.C69748c.AbstractC69749a
        /* renamed from: a */
        public int mo244680a() throws IOException {
            return AbstractC69833a.this.mo244970c();
        }
    };

    /* renamed from: b */
    private final int f174544b;

    /* renamed from: c */
    private final byte[] f174545c;

    /* renamed from: d */
    private int f174546d;

    /* renamed from: e */
    private int f174547e;

    /* renamed from: f */
    private final C69752f f174548f;

    /* renamed from: g */
    private long f174549g;

    /* renamed from: h */
    private int f174550h;

    /* renamed from: i */
    private int f174551i;

    /* renamed from: j */
    private final byte[] f174552j = new byte[1];

    @Override // java.io.InputStream
    public int available() {
        return this.f174546d - this.f174547e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.f174548f.close();
    }

    /* renamed from: d */
    private void m268000d() {
        byte[] bArr = this.f174545c;
        int i = this.f174544b;
        System.arraycopy(bArr, i, bArr, 0, i * 2);
        int i2 = this.f174546d;
        int i3 = this.f174544b;
        this.f174546d = i2 - i3;
        this.f174547e -= i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo244969b() {
        if (this.f174549g > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo244970c() throws IOException {
        int read = this.f174548f.read();
        if (read == -1) {
            return -1;
        }
        mo244818a(1);
        return read & 255;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f174552j, 0, 1) == -1) {
            return -1;
        }
        return this.f174552j[0] & 255;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo244971c(long j) {
        this.f174549g = j;
    }

    /* renamed from: b */
    private void m267997b(int i) throws IOException {
        int i2;
        int min = Math.min((int) Math.min((long) i, this.f174549g), this.f174545c.length - this.f174546d);
        if (min > 0) {
            i2 = C69753g.m267720a(this.f174548f, this.f174545c, this.f174546d, min);
        } else {
            i2 = 0;
        }
        mo244818a(i2);
        if (min == i2) {
            this.f174546d += min;
            this.f174549g -= (long) min;
            return;
        }
        throw new IOException("Premature end of stream reading literal");
    }

    /* renamed from: a */
    public void mo244966a(byte[] bArr) {
        if (this.f174546d == 0) {
            int min = Math.min(this.f174544b, bArr.length);
            System.arraycopy(bArr, bArr.length - min, this.f174545c, 0, min);
            this.f174546d += min;
            this.f174547e += min;
            return;
        }
        throw new IllegalStateException("the stream has already been read from, can't prefill anymore");
    }

    /* renamed from: c */
    private void m267999c(int i) {
        int min = Math.min((int) Math.min((long) i, this.f174549g), this.f174545c.length - this.f174546d);
        if (min != 0) {
            int i2 = this.f174550h;
            if (i2 == 1) {
                byte[] bArr = this.f174545c;
                int i3 = this.f174546d;
                Arrays.fill(bArr, i3, i3 + min, bArr[i3 - 1]);
                this.f174546d += min;
            } else if (min < i2) {
                byte[] bArr2 = this.f174545c;
                int i4 = this.f174546d;
                System.arraycopy(bArr2, i4 - i2, bArr2, i4, min);
                this.f174546d += min;
            } else {
                int i5 = min / i2;
                for (int i6 = 0; i6 < i5; i6++) {
                    byte[] bArr3 = this.f174545c;
                    int i7 = this.f174546d;
                    int i8 = this.f174550h;
                    System.arraycopy(bArr3, i7 - i8, bArr3, i7, i8);
                    this.f174546d += this.f174550h;
                }
                int i9 = this.f174550h;
                int i10 = min - (i5 * i9);
                if (i10 > 0) {
                    byte[] bArr4 = this.f174545c;
                    int i11 = this.f174546d;
                    System.arraycopy(bArr4, i11 - i9, bArr4, i11, i10);
                    this.f174546d += i10;
                }
            }
        }
        this.f174549g -= (long) min;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo244965a(int i, long j) {
        this.f174550h = i;
        this.f174549g = j;
    }

    public AbstractC69833a(InputStream inputStream, int i) throws IOException {
        this.f174548f = new C69752f(inputStream);
        this.f174544b = i;
        this.f174545c = new byte[(i * 3)];
        this.f174547e = 0;
        this.f174546d = 0;
        this.f174549g = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo244964a(byte[] bArr, int i, int i2) throws IOException {
        int available = available();
        if (i2 > available) {
            m267997b(i2 - available);
        }
        return m267998c(bArr, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo244968b(byte[] bArr, int i, int i2) {
        int available = available();
        if (i2 > available) {
            m267999c(i2 - available);
        }
        return m267998c(bArr, i, i2);
    }

    /* renamed from: c */
    private int m267998c(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, available());
        if (min > 0) {
            System.arraycopy(this.f174545c, this.f174547e, bArr, i, min);
            int i3 = this.f174547e + min;
            this.f174547e = i3;
            if (i3 > this.f174544b * 2) {
                m268000d();
            }
        }
        this.f174551i += min;
        return min;
    }
}
