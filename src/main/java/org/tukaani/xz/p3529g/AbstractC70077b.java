package org.tukaani.xz.p3529g;

import java.io.IOException;

/* renamed from: org.tukaani.xz.g.b */
public abstract class AbstractC70077b extends AbstractC70076a {

    /* renamed from: a */
    int f175146a;

    /* renamed from: b */
    int f175147b;

    /* renamed from: a */
    public int mo246778a(int i) throws IOException {
        int i2 = 0;
        do {
            mo246780a();
            int i3 = this.f175146a >>> 1;
            this.f175146a = i3;
            int i4 = this.f175147b;
            int i5 = (i4 - i3) >>> 31;
            this.f175147b = i4 - (i3 & (i5 - 1));
            i2 = (i2 << 1) | (1 - i5);
            i--;
        } while (i != 0);
        return i2;
    }

    /* renamed from: a */
    public int mo246779a(short[] sArr, int i) throws IOException {
        mo246780a();
        short s = sArr[i];
        int i2 = this.f175146a;
        int i3 = (i2 >>> 11) * s;
        int i4 = this.f175147b;
        if ((i4 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i3)) {
            this.f175146a = i3;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.f175146a = i2 - i3;
        this.f175147b = i4 - i3;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    /* renamed from: a */
    public abstract void mo246780a() throws IOException;

    /* renamed from: b */
    public int mo246781b(short[] sArr) throws IOException {
        int i = 1;
        do {
            i = mo246779a(sArr, i) | (i << 1);
        } while (i < sArr.length);
        return i - sArr.length;
    }

    /* renamed from: c */
    public int mo246782c(short[] sArr) throws IOException {
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int a = mo246779a(sArr, i3);
            i3 = (i3 << 1) | a;
            int i4 = i2 + 1;
            i |= a << i2;
            if (i3 >= sArr.length) {
                return i;
            }
            i2 = i4;
        }
    }
}
