package com.google.zxing.common;

import java.util.Arrays;

/* renamed from: com.google.zxing.common.b */
public final class C23211b implements Cloneable {

    /* renamed from: a */
    private final int f57236a;

    /* renamed from: b */
    private final int f57237b;

    /* renamed from: c */
    private final int f57238c;

    /* renamed from: d */
    private final int[] f57239d;

    /* renamed from: c */
    public int mo80499c() {
        return this.f57236a;
    }

    /* renamed from: d */
    public int mo80501d() {
        return this.f57237b;
    }

    /* renamed from: a */
    public void mo80494a() {
        int length = this.f57239d.length;
        for (int i = 0; i < length; i++) {
            this.f57239d[i] = 0;
        }
    }

    public String toString() {
        return mo80493a("X ", "  ");
    }

    /* renamed from: e */
    public C23211b clone() {
        return new C23211b(this.f57236a, this.f57237b, this.f57238c, (int[]) this.f57239d.clone());
    }

    public int hashCode() {
        int i = this.f57236a;
        return (((((((i * 31) + i) * 31) + this.f57237b) * 31) + this.f57238c) * 31) + Arrays.hashCode(this.f57239d);
    }

    /* renamed from: b */
    public int[] mo80498b() {
        int i = this.f57236a;
        int i2 = this.f57237b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f57237b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f57238c;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.f57239d[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 * 32;
                    if (i9 < i) {
                        int i10 = 0;
                        while ((i8 << (31 - i10)) == 0) {
                            i10++;
                        }
                        int i11 = i10 + i9;
                        if (i11 < i) {
                            i = i11;
                        }
                    }
                    if (i9 + 31 > i3) {
                        int i12 = 31;
                        while ((i8 >>> i12) == 0) {
                            i12--;
                        }
                        int i13 = i9 + i12;
                        if (i13 > i3) {
                            i3 = i13;
                        }
                    }
                }
                i6++;
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C23211b)) {
            return false;
        }
        C23211b bVar = (C23211b) obj;
        if (this.f57236a == bVar.f57236a && this.f57237b == bVar.f57237b && this.f57238c == bVar.f57238c && Arrays.equals(this.f57239d, bVar.f57239d)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String mo80493a(String str, String str2) {
        return m84051a(str, str2, "\n");
    }

    /* renamed from: a */
    public boolean mo80496a(int i, int i2) {
        if (((this.f57239d[(i2 * this.f57238c) + (i / 32)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo80497b(int i, int i2) {
        int i3 = (i2 * this.f57238c) + (i / 32);
        int[] iArr = this.f57239d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public C23211b(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f57236a = i;
        this.f57237b = i2;
        int i3 = (i + 31) / 32;
        this.f57238c = i3;
        this.f57239d = new int[(i3 * i2)];
    }

    /* renamed from: a */
    private String m84051a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder(this.f57237b * (this.f57236a + 1));
        for (int i = 0; i < this.f57237b; i++) {
            for (int i2 = 0; i2 < this.f57236a; i2++) {
                if (mo80496a(i2, i)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                sb.append(str4);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    private C23211b(int i, int i2, int i3, int[] iArr) {
        this.f57236a = i;
        this.f57237b = i2;
        this.f57238c = i3;
        this.f57239d = iArr;
    }

    /* renamed from: a */
    public void mo80495a(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f57237b || i5 > this.f57236a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f57238c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f57239d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }
}
