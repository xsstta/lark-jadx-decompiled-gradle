package com.google.zxing.common.reedsolomon;

/* access modifiers changed from: package-private */
/* renamed from: com.google.zxing.common.reedsolomon.b */
public final class C23213b {

    /* renamed from: a */
    private final C23212a f57255a;

    /* renamed from: b */
    private final int[] f57256b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo80517a() {
        return this.f57256b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo80518b() {
        return this.f57256b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo80520c() {
        if (this.f57256b[0] == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo80518b() * 8);
        for (int b = mo80518b(); b >= 0; b--) {
            int a = mo80514a(b);
            if (a != 0) {
                if (a < 0) {
                    sb.append(" - ");
                    a = -a;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || a != 1) {
                    int b2 = this.f57255a.mo80510b(a);
                    if (b2 == 0) {
                        sb.append('1');
                    } else if (b2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(b2);
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo80514a(int i) {
        int[] iArr = this.f57256b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C23213b mo80516a(C23213b bVar) {
        if (!this.f57255a.equals(bVar.f57255a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo80520c()) {
            return bVar;
        } else {
            if (bVar.mo80520c()) {
                return this;
            }
            int[] iArr = this.f57256b;
            int[] iArr2 = bVar.f57256b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = C23212a.m84061b(iArr2[i - length], iArr[i]);
            }
            return new C23213b(this.f57255a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C23213b mo80519b(C23213b bVar) {
        if (!this.f57255a.equals(bVar.f57255a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo80520c() || bVar.mo80520c()) {
            return this.f57255a.mo80507a();
        } else {
            int[] iArr = this.f57256b;
            int length = iArr.length;
            int[] iArr2 = bVar.f57256b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C23212a.m84061b(iArr3[i4], this.f57255a.mo80512c(i2, iArr2[i3]));
                }
            }
            return new C23213b(this.f57255a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C23213b[] mo80521c(C23213b bVar) {
        if (!this.f57255a.equals(bVar.f57255a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.mo80520c()) {
            C23213b a = this.f57255a.mo80507a();
            int c = this.f57255a.mo80511c(bVar.mo80514a(bVar.mo80518b()));
            C23213b bVar2 = this;
            while (bVar2.mo80518b() >= bVar.mo80518b() && !bVar2.mo80520c()) {
                int b = bVar2.mo80518b() - bVar.mo80518b();
                int c2 = this.f57255a.mo80512c(bVar2.mo80514a(bVar2.mo80518b()), c);
                C23213b a2 = bVar.mo80515a(b, c2);
                a = a.mo80516a(this.f57255a.mo80508a(b, c2));
                bVar2 = bVar2.mo80516a(a2);
            }
            return new C23213b[]{a, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    C23213b(C23212a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f57255a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f57256b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f57256b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f57256b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C23213b mo80515a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f57255a.mo80507a();
        } else {
            int length = this.f57256b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f57255a.mo80512c(this.f57256b[i3], i2);
            }
            return new C23213b(this.f57255a, iArr);
        }
    }
}
