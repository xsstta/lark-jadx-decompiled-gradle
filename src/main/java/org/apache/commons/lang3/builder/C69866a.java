package org.apache.commons.lang3.builder;

import java.util.Comparator;

/* renamed from: org.apache.commons.lang3.builder.a */
public class C69866a {

    /* renamed from: a */
    private int f174638a;

    /* renamed from: a */
    public int mo245163a() {
        return this.f174638a;
    }

    /* renamed from: a */
    public C69866a mo245173a(boolean z, boolean z2) {
        if (this.f174638a != 0 || z == z2) {
            return this;
        }
        if (!z) {
            this.f174638a = -1;
        } else {
            this.f174638a = 1;
        }
        return this;
    }

    /* renamed from: a */
    public C69866a mo245180a(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.f174638a != 0 || objArr == objArr2) {
            return this;
        }
        int i = -1;
        if (objArr == null) {
            this.f174638a = -1;
            return this;
        } else if (objArr2 == null) {
            this.f174638a = 1;
            return this;
        } else if (objArr.length != objArr2.length) {
            if (objArr.length >= objArr2.length) {
                i = 1;
            }
            this.f174638a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < objArr.length && this.f174638a == 0; i2++) {
                mo245171a(objArr[i2], objArr2[i2], comparator);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C69866a mo245179a(long[] jArr, long[] jArr2) {
        if (this.f174638a != 0 || jArr == jArr2) {
            return this;
        }
        int i = -1;
        if (jArr == null) {
            this.f174638a = -1;
            return this;
        } else if (jArr2 == null) {
            this.f174638a = 1;
            return this;
        } else if (jArr.length != jArr2.length) {
            if (jArr.length >= jArr2.length) {
                i = 1;
            }
            this.f174638a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < jArr.length && this.f174638a == 0; i2++) {
                mo245169a(jArr[i2], jArr2[i2]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C69866a mo245178a(int[] iArr, int[] iArr2) {
        if (this.f174638a != 0 || iArr == iArr2) {
            return this;
        }
        int i = -1;
        if (iArr == null) {
            this.f174638a = -1;
            return this;
        } else if (iArr2 == null) {
            this.f174638a = 1;
            return this;
        } else if (iArr.length != iArr2.length) {
            if (iArr.length >= iArr2.length) {
                i = 1;
            }
            this.f174638a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < iArr.length && this.f174638a == 0; i2++) {
                mo245168a(iArr[i2], iArr2[i2]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C69866a mo245181a(short[] sArr, short[] sArr2) {
        if (this.f174638a != 0 || sArr == sArr2) {
            return this;
        }
        int i = -1;
        if (sArr == null) {
            this.f174638a = -1;
            return this;
        } else if (sArr2 == null) {
            this.f174638a = 1;
            return this;
        } else if (sArr.length != sArr2.length) {
            if (sArr.length >= sArr2.length) {
                i = 1;
            }
            this.f174638a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < sArr.length && this.f174638a == 0; i2++) {
                mo245172a(sArr[i2], sArr2[i2]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C69866a mo245175a(char[] cArr, char[] cArr2) {
        if (this.f174638a != 0 || cArr == cArr2) {
            return this;
        }
        int i = -1;
        if (cArr == null) {
            this.f174638a = -1;
            return this;
        } else if (cArr2 == null) {
            this.f174638a = 1;
            return this;
        } else if (cArr.length != cArr2.length) {
            if (cArr.length >= cArr2.length) {
                i = 1;
            }
            this.f174638a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < cArr.length && this.f174638a == 0; i2++) {
                mo245165a(cArr[i2], cArr2[i2]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C69866a mo245174a(byte[] bArr, byte[] bArr2) {
        if (this.f174638a != 0 || bArr == bArr2) {
            return this;
        }
        int i = -1;
        if (bArr == null) {
            this.f174638a = -1;
            return this;
        } else if (bArr2 == null) {
            this.f174638a = 1;
            return this;
        } else if (bArr.length != bArr2.length) {
            if (bArr.length >= bArr2.length) {
                i = 1;
            }
            this.f174638a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < bArr.length && this.f174638a == 0; i2++) {
                mo245164a(bArr[i2], bArr2[i2]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C69866a mo245176a(double[] dArr, double[] dArr2) {
        if (this.f174638a != 0 || dArr == dArr2) {
            return this;
        }
        int i = -1;
        if (dArr == null) {
            this.f174638a = -1;
            return this;
        } else if (dArr2 == null) {
            this.f174638a = 1;
            return this;
        } else if (dArr.length != dArr2.length) {
            if (dArr.length >= dArr2.length) {
                i = 1;
            }
            this.f174638a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < dArr.length && this.f174638a == 0; i2++) {
                mo245166a(dArr[i2], dArr2[i2]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C69866a mo245177a(float[] fArr, float[] fArr2) {
        if (this.f174638a != 0 || fArr == fArr2) {
            return this;
        }
        int i = -1;
        if (fArr == null) {
            this.f174638a = -1;
            return this;
        } else if (fArr2 == null) {
            this.f174638a = 1;
            return this;
        } else if (fArr.length != fArr2.length) {
            if (fArr.length >= fArr2.length) {
                i = 1;
            }
            this.f174638a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < fArr.length && this.f174638a == 0; i2++) {
                mo245167a(fArr[i2], fArr2[i2]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C69866a mo245182a(boolean[] zArr, boolean[] zArr2) {
        if (this.f174638a != 0 || zArr == zArr2) {
            return this;
        }
        int i = -1;
        if (zArr == null) {
            this.f174638a = -1;
            return this;
        } else if (zArr2 == null) {
            this.f174638a = 1;
            return this;
        } else if (zArr.length != zArr2.length) {
            if (zArr.length >= zArr2.length) {
                i = 1;
            }
            this.f174638a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < zArr.length && this.f174638a == 0; i2++) {
                mo245173a(zArr[i2], zArr2[i2]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C69866a mo245170a(Object obj, Object obj2) {
        return mo245171a(obj, obj2, (Comparator<?>) null);
    }

    /* renamed from: a */
    public C69866a mo245166a(double d, double d2) {
        if (this.f174638a != 0) {
            return this;
        }
        this.f174638a = Double.compare(d, d2);
        return this;
    }

    /* renamed from: a */
    public C69866a mo245164a(byte b, byte b2) {
        int i;
        if (this.f174638a != 0) {
            return this;
        }
        if (b < b2) {
            i = -1;
        } else if (b > b2) {
            i = 1;
        } else {
            i = 0;
        }
        this.f174638a = i;
        return this;
    }

    /* renamed from: a */
    public C69866a mo245165a(char c, char c2) {
        int i;
        if (this.f174638a != 0) {
            return this;
        }
        if (c < c2) {
            i = -1;
        } else if (c > c2) {
            i = 1;
        } else {
            i = 0;
        }
        this.f174638a = i;
        return this;
    }

    /* renamed from: a */
    public C69866a mo245167a(float f, float f2) {
        if (this.f174638a != 0) {
            return this;
        }
        this.f174638a = Float.compare(f, f2);
        return this;
    }

    /* renamed from: a */
    public C69866a mo245168a(int i, int i2) {
        int i3;
        if (this.f174638a != 0) {
            return this;
        }
        if (i < i2) {
            i3 = -1;
        } else if (i > i2) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.f174638a = i3;
        return this;
    }

    /* renamed from: a */
    public C69866a mo245169a(long j, long j2) {
        int i;
        if (this.f174638a != 0) {
            return this;
        }
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i2 < 0) {
            i = -1;
        } else if (i2 > 0) {
            i = 1;
        } else {
            i = 0;
        }
        this.f174638a = i;
        return this;
    }

    /* renamed from: a */
    public C69866a mo245172a(short s, short s2) {
        int i;
        if (this.f174638a != 0) {
            return this;
        }
        if (s < s2) {
            i = -1;
        } else if (s > s2) {
            i = 1;
        } else {
            i = 0;
        }
        this.f174638a = i;
        return this;
    }

    /* renamed from: b */
    private void m268112b(Object obj, Object obj2, Comparator<?> comparator) {
        if (obj instanceof long[]) {
            mo245179a((long[]) obj, (long[]) obj2);
        } else if (obj instanceof int[]) {
            mo245178a((int[]) obj, (int[]) obj2);
        } else if (obj instanceof short[]) {
            mo245181a((short[]) obj, (short[]) obj2);
        } else if (obj instanceof char[]) {
            mo245175a((char[]) obj, (char[]) obj2);
        } else if (obj instanceof byte[]) {
            mo245174a((byte[]) obj, (byte[]) obj2);
        } else if (obj instanceof double[]) {
            mo245176a((double[]) obj, (double[]) obj2);
        } else if (obj instanceof float[]) {
            mo245177a((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            mo245182a((boolean[]) obj, (boolean[]) obj2);
        } else {
            mo245180a((Object[]) obj, (Object[]) obj2, comparator);
        }
    }

    /* renamed from: a */
    public C69866a mo245171a(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.f174638a != 0 || obj == obj2) {
            return this;
        }
        if (obj == null) {
            this.f174638a = -1;
            return this;
        } else if (obj2 == null) {
            this.f174638a = 1;
            return this;
        } else {
            if (obj.getClass().isArray()) {
                m268112b(obj, obj2, comparator);
            } else if (comparator == null) {
                this.f174638a = ((Comparable) obj).compareTo(obj2);
            } else {
                this.f174638a = comparator.compare(obj, obj2);
            }
            return this;
        }
    }
}
