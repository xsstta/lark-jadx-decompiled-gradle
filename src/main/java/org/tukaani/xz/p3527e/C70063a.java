package org.tukaani.xz.p3527e;

import java.io.DataInputStream;
import java.io.IOException;
import org.tukaani.xz.C70046a;
import org.tukaani.xz.CorruptedInputException;

/* renamed from: org.tukaani.xz.e.a */
public final class C70063a {

    /* renamed from: a */
    private final byte[] f175105a;

    /* renamed from: b */
    private final int f175106b;

    /* renamed from: c */
    private int f175107c;

    /* renamed from: d */
    private int f175108d;

    /* renamed from: e */
    private int f175109e;

    /* renamed from: f */
    private int f175110f;

    /* renamed from: g */
    private int f175111g;

    /* renamed from: h */
    private int f175112h;

    public C70063a(int i, byte[] bArr, C70046a aVar) {
        this.f175106b = i;
        byte[] a = aVar.mo246722a(i, false);
        this.f175105a = a;
        if (bArr != null) {
            int min = Math.min(bArr.length, i);
            this.f175108d = min;
            this.f175109e = min;
            this.f175107c = min;
            System.arraycopy(bArr, bArr.length - min, a, 0, min);
        }
    }

    /* renamed from: a */
    public int mo246746a(byte[] bArr, int i) {
        int i2 = this.f175108d;
        int i3 = this.f175107c;
        int i4 = i2 - i3;
        if (i2 == this.f175106b) {
            this.f175108d = 0;
        }
        System.arraycopy(this.f175105a, i3, bArr, i, i4);
        this.f175107c = this.f175108d;
        return i4;
    }

    /* renamed from: a */
    public void mo246747a() {
        this.f175107c = 0;
        this.f175108d = 0;
        this.f175109e = 0;
        this.f175110f = 0;
        this.f175105a[this.f175106b - 1] = 0;
    }

    /* renamed from: a */
    public void mo246748a(byte b) {
        byte[] bArr = this.f175105a;
        int i = this.f175108d;
        int i2 = i + 1;
        this.f175108d = i2;
        bArr[i] = b;
        if (this.f175109e < i2) {
            this.f175109e = i2;
        }
    }

    /* renamed from: a */
    public void mo246749a(int i) {
        int i2 = this.f175106b;
        int i3 = this.f175108d;
        if (i2 - i3 <= i) {
            this.f175110f = i2;
        } else {
            this.f175110f = i3 + i;
        }
    }

    /* renamed from: a */
    public void mo246750a(int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i >= this.f175109e) {
            throw new CorruptedInputException();
        }
        int min = Math.min(this.f175110f - this.f175108d, i2);
        this.f175111g = i2 - min;
        this.f175112h = i;
        int i4 = this.f175108d;
        int i5 = (i4 - i) - 1;
        if (i >= i4) {
            i5 += this.f175106b;
        }
        do {
            byte[] bArr = this.f175105a;
            int i6 = this.f175108d;
            i3 = i6 + 1;
            this.f175108d = i3;
            int i7 = i5 + 1;
            bArr[i6] = bArr[i5];
            i5 = i7 == this.f175106b ? 0 : i7;
            min--;
        } while (min > 0);
        if (this.f175109e < i3) {
            this.f175109e = i3;
        }
    }

    /* renamed from: a */
    public void mo246751a(DataInputStream dataInputStream, int i) throws IOException {
        int min = Math.min(this.f175106b - this.f175108d, i);
        dataInputStream.readFully(this.f175105a, this.f175108d, min);
        int i2 = this.f175108d + min;
        this.f175108d = i2;
        if (this.f175109e < i2) {
            this.f175109e = i2;
        }
    }

    /* renamed from: a */
    public void mo246752a(C70046a aVar) {
        aVar.mo246721a(this.f175105a);
    }

    /* renamed from: b */
    public int mo246753b(int i) {
        int i2 = this.f175108d;
        int i3 = (i2 - i) - 1;
        if (i >= i2) {
            i3 += this.f175106b;
        }
        return this.f175105a[i3] & 255;
    }

    /* renamed from: b */
    public boolean mo246754b() {
        return this.f175108d < this.f175110f;
    }

    /* renamed from: c */
    public boolean mo246755c() {
        return this.f175111g > 0;
    }

    /* renamed from: d */
    public int mo246756d() {
        return this.f175108d;
    }

    /* renamed from: e */
    public void mo246757e() throws IOException {
        int i = this.f175111g;
        if (i > 0) {
            mo246750a(this.f175112h, i);
        }
    }
}
