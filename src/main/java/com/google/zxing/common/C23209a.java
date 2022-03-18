package com.google.zxing.common;

import java.util.Arrays;

/* renamed from: com.google.zxing.common.a */
public final class C23209a implements Cloneable {

    /* renamed from: a */
    private int[] f57234a;

    /* renamed from: b */
    private int f57235b;

    /* renamed from: a */
    public int mo80480a() {
        return this.f57235b;
    }

    /* renamed from: b */
    public int mo80486b() {
        return (this.f57235b + 7) / 8;
    }

    public C23209a() {
        this.f57234a = new int[1];
    }

    /* renamed from: c */
    public C23209a clone() {
        return new C23209a((int[]) this.f57234a.clone(), this.f57235b);
    }

    public int hashCode() {
        return (this.f57235b * 31) + Arrays.hashCode(this.f57234a);
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(this.f57235b);
        for (int i = 0; i < this.f57235b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            if (mo80485a(i)) {
                c = 'X';
            } else {
                c = '.';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static int[] m84039c(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: b */
    private void m84038b(int i) {
        if (i > this.f57234a.length * 32) {
            int[] c = m84039c(i);
            int[] iArr = this.f57234a;
            System.arraycopy(iArr, 0, c, 0, iArr.length);
            this.f57234a = c;
        }
    }

    /* renamed from: a */
    public void mo80483a(C23209a aVar) {
        int i = aVar.f57235b;
        m84038b(this.f57235b + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo80484a(aVar.mo80485a(i2));
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C23209a)) {
            return false;
        }
        C23209a aVar = (C23209a) obj;
        if (this.f57235b != aVar.f57235b || !Arrays.equals(this.f57234a, aVar.f57234a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo80487b(C23209a aVar) {
        if (this.f57235b == aVar.f57235b) {
            int i = 0;
            while (true) {
                int[] iArr = this.f57234a;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.f57234a[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    /* renamed from: a */
    public void mo80484a(boolean z) {
        m84038b(this.f57235b + 1);
        if (z) {
            int[] iArr = this.f57234a;
            int i = this.f57235b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f57235b++;
    }

    /* renamed from: a */
    public boolean mo80485a(int i) {
        if (((1 << (i & 31)) & this.f57234a[i / 32]) != 0) {
            return true;
        }
        return false;
    }

    C23209a(int[] iArr, int i) {
        this.f57234a = iArr;
        this.f57235b = i;
    }

    /* renamed from: a */
    public void mo80481a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m84038b(this.f57235b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo80484a(z);
            i2--;
        }
    }

    /* renamed from: a */
    public void mo80482a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (mo80485a(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }
}
