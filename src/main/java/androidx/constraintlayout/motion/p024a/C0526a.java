package androidx.constraintlayout.motion.p024a;

import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: androidx.constraintlayout.motion.a.a */
public class C0526a extends AbstractC0528b {

    /* renamed from: a */
    C0527a[] f1924a;

    /* renamed from: b */
    private final double[] f1925b;

    @Override // androidx.constraintlayout.motion.p024a.AbstractC0528b
    /* renamed from: a */
    public double[] mo3101a() {
        return this.f1925b;
    }

    /* renamed from: androidx.constraintlayout.motion.a.a$a */
    private static class C0527a {

        /* renamed from: s */
        private static double[] f1926s = new double[91];

        /* renamed from: a */
        double[] f1927a;

        /* renamed from: b */
        double f1928b;

        /* renamed from: c */
        double f1929c;

        /* renamed from: d */
        double f1930d;

        /* renamed from: e */
        double f1931e;

        /* renamed from: f */
        double f1932f;

        /* renamed from: g */
        double f1933g;

        /* renamed from: h */
        double f1934h;

        /* renamed from: i */
        double f1935i;

        /* renamed from: j */
        double f1936j;

        /* renamed from: k */
        double f1937k;

        /* renamed from: l */
        double f1938l;

        /* renamed from: m */
        double f1939m;

        /* renamed from: n */
        double f1940n;

        /* renamed from: o */
        double f1941o;

        /* renamed from: p */
        double f1942p;

        /* renamed from: q */
        boolean f1943q;

        /* renamed from: r */
        boolean f1944r;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public double mo3104a() {
            return this.f1938l + (this.f1936j * this.f1941o);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public double mo3106b() {
            return this.f1939m + (this.f1937k * this.f1942p);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public double mo3108c() {
            double d = this.f1936j * this.f1942p;
            double hypot = this.f1940n / Math.hypot(d, (-this.f1937k) * this.f1941o);
            if (this.f1943q) {
                d = -d;
            }
            return d * hypot;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public double mo3110d() {
            double d = this.f1936j * this.f1942p;
            double d2 = (-this.f1937k) * this.f1941o;
            double hypot = this.f1940n / Math.hypot(d, d2);
            if (this.f1943q) {
                return (-d2) * hypot;
            }
            return d2 * hypot;
        }

        /* renamed from: d */
        public double mo3111d(double d) {
            return this.f1938l;
        }

        /* renamed from: e */
        public double mo3112e(double d) {
            return this.f1939m;
        }

        /* renamed from: c */
        public double mo3109c(double d) {
            double d2 = (d - this.f1929c) * this.f1935i;
            double d3 = this.f1933g;
            return d3 + (d2 * (this.f1934h - d3));
        }

        /* renamed from: b */
        public double mo3107b(double d) {
            double d2 = (d - this.f1929c) * this.f1935i;
            double d3 = this.f1931e;
            return d3 + (d2 * (this.f1932f - d3));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3105a(double d) {
            double d2;
            if (this.f1943q) {
                d2 = this.f1930d - d;
            } else {
                d2 = d - this.f1929c;
            }
            double f = mo3113f(d2 * this.f1935i) * 1.5707963267948966d;
            this.f1941o = Math.sin(f);
            this.f1942p = Math.cos(f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public double mo3113f(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f1927a;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            return dArr[i] + ((length - ((double) i)) * (dArr[i + 1] - dArr[i]));
        }

        /* renamed from: a */
        private void m2406a(double d, double d2, double d3, double d4) {
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                double[] dArr = f1926s;
                if (i >= dArr.length) {
                    break;
                }
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = d8 + Math.hypot(sin - d9, cos - d10);
                    f1926s[i] = d5;
                } else {
                    d5 = d8;
                }
                i++;
                d10 = cos;
                d8 = d5;
                d9 = sin;
            }
            this.f1928b = d8;
            int i2 = 0;
            while (true) {
                double[] dArr2 = f1926s;
                if (i2 >= dArr2.length) {
                    break;
                }
                dArr2[i2] = dArr2[i2] / d8;
                i2++;
            }
            int i3 = 0;
            while (true) {
                double[] dArr3 = this.f1927a;
                if (i3 < dArr3.length) {
                    double length = ((double) i3) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(f1926s, length);
                    if (binarySearch >= 0) {
                        this.f1927a[i3] = (double) (binarySearch / (f1926s.length - 1));
                    } else if (binarySearch == -1) {
                        this.f1927a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double[] dArr4 = f1926s;
                        this.f1927a[i3] = (((double) i5) + ((length - dArr4[i5]) / (dArr4[i4 - 1] - dArr4[i5]))) / ((double) (dArr4.length - 1));
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }

        C0527a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            boolean z;
            int i2;
            int i3;
            double d7;
            double d8;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f1943q = z;
            this.f1929c = d;
            this.f1930d = d2;
            this.f1935i = 1.0d / (d2 - d);
            if (3 == i) {
                this.f1944r = true;
            }
            double d9 = d5 - d3;
            double d10 = d6 - d4;
            if (this.f1944r || Math.abs(d9) < 0.001d || Math.abs(d10) < 0.001d) {
                this.f1944r = true;
                this.f1931e = d3;
                this.f1932f = d5;
                this.f1933g = d4;
                this.f1934h = d6;
                double hypot = Math.hypot(d10, d9);
                this.f1928b = hypot;
                this.f1940n = hypot * this.f1935i;
                double d11 = this.f1930d;
                double d12 = this.f1929c;
                this.f1938l = d9 / (d11 - d12);
                this.f1939m = d10 / (d11 - d12);
                return;
            }
            this.f1927a = new double[101];
            boolean z2 = this.f1943q;
            if (z2) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            this.f1936j = d9 * ((double) i2);
            if (z2) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            this.f1937k = d10 * ((double) i3);
            if (z2) {
                d7 = d5;
            } else {
                d7 = d3;
            }
            this.f1938l = d7;
            if (z2) {
                d8 = d4;
            } else {
                d8 = d6;
            }
            this.f1939m = d8;
            m2406a(d3, d4, d5, d6);
            this.f1940n = this.f1928b * this.f1935i;
        }
    }

    @Override // androidx.constraintlayout.motion.p024a.AbstractC0528b
    /* renamed from: a */
    public double mo3098a(double d, int i) {
        int i2 = 0;
        if (d < this.f1924a[0].f1929c) {
            d = this.f1924a[0].f1929c;
        } else {
            C0527a[] aVarArr = this.f1924a;
            if (d > aVarArr[aVarArr.length - 1].f1930d) {
                C0527a[] aVarArr2 = this.f1924a;
                d = aVarArr2[aVarArr2.length - 1].f1930d;
            }
        }
        while (true) {
            C0527a[] aVarArr3 = this.f1924a;
            if (i2 >= aVarArr3.length) {
                return Double.NaN;
            }
            if (d > aVarArr3[i2].f1930d) {
                i2++;
            } else if (!this.f1924a[i2].f1944r) {
                this.f1924a[i2].mo3105a(d);
                if (i == 0) {
                    return this.f1924a[i2].mo3104a();
                }
                return this.f1924a[i2].mo3106b();
            } else if (i == 0) {
                return this.f1924a[i2].mo3107b(d);
            } else {
                return this.f1924a[i2].mo3109c(d);
            }
        }
    }

    @Override // androidx.constraintlayout.motion.p024a.AbstractC0528b
    /* renamed from: b */
    public double mo3102b(double d, int i) {
        int i2 = 0;
        if (d < this.f1924a[0].f1929c) {
            d = this.f1924a[0].f1929c;
        }
        C0527a[] aVarArr = this.f1924a;
        if (d > aVarArr[aVarArr.length - 1].f1930d) {
            C0527a[] aVarArr2 = this.f1924a;
            d = aVarArr2[aVarArr2.length - 1].f1930d;
        }
        while (true) {
            C0527a[] aVarArr3 = this.f1924a;
            if (i2 >= aVarArr3.length) {
                return Double.NaN;
            }
            if (d > aVarArr3[i2].f1930d) {
                i2++;
            } else if (!this.f1924a[i2].f1944r) {
                this.f1924a[i2].mo3105a(d);
                if (i == 0) {
                    return this.f1924a[i2].mo3108c();
                }
                return this.f1924a[i2].mo3110d();
            } else if (i == 0) {
                return this.f1924a[i2].mo3111d(d);
            } else {
                return this.f1924a[i2].mo3112e(d);
            }
        }
    }

    @Override // androidx.constraintlayout.motion.p024a.AbstractC0528b
    /* renamed from: a */
    public void mo3099a(double d, double[] dArr) {
        if (d < this.f1924a[0].f1929c) {
            d = this.f1924a[0].f1929c;
        }
        C0527a[] aVarArr = this.f1924a;
        if (d > aVarArr[aVarArr.length - 1].f1930d) {
            C0527a[] aVarArr2 = this.f1924a;
            d = aVarArr2[aVarArr2.length - 1].f1930d;
        }
        int i = 0;
        while (true) {
            C0527a[] aVarArr3 = this.f1924a;
            if (i >= aVarArr3.length) {
                return;
            }
            if (d > aVarArr3[i].f1930d) {
                i++;
            } else if (this.f1924a[i].f1944r) {
                dArr[0] = this.f1924a[i].mo3107b(d);
                dArr[1] = this.f1924a[i].mo3109c(d);
                return;
            } else {
                this.f1924a[i].mo3105a(d);
                dArr[0] = this.f1924a[i].mo3104a();
                dArr[1] = this.f1924a[i].mo3106b();
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.p024a.AbstractC0528b
    /* renamed from: b */
    public void mo3103b(double d, double[] dArr) {
        if (d < this.f1924a[0].f1929c) {
            d = this.f1924a[0].f1929c;
        } else {
            C0527a[] aVarArr = this.f1924a;
            if (d > aVarArr[aVarArr.length - 1].f1930d) {
                C0527a[] aVarArr2 = this.f1924a;
                d = aVarArr2[aVarArr2.length - 1].f1930d;
            }
        }
        int i = 0;
        while (true) {
            C0527a[] aVarArr3 = this.f1924a;
            if (i >= aVarArr3.length) {
                return;
            }
            if (d > aVarArr3[i].f1930d) {
                i++;
            } else if (this.f1924a[i].f1944r) {
                dArr[0] = this.f1924a[i].mo3111d(d);
                dArr[1] = this.f1924a[i].mo3112e(d);
                return;
            } else {
                this.f1924a[i].mo3105a(d);
                dArr[0] = this.f1924a[i].mo3108c();
                dArr[1] = this.f1924a[i].mo3110d();
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.p024a.AbstractC0528b
    /* renamed from: a */
    public void mo3100a(double d, float[] fArr) {
        if (d < this.f1924a[0].f1929c) {
            d = this.f1924a[0].f1929c;
        } else {
            C0527a[] aVarArr = this.f1924a;
            if (d > aVarArr[aVarArr.length - 1].f1930d) {
                C0527a[] aVarArr2 = this.f1924a;
                d = aVarArr2[aVarArr2.length - 1].f1930d;
            }
        }
        int i = 0;
        while (true) {
            C0527a[] aVarArr3 = this.f1924a;
            if (i >= aVarArr3.length) {
                return;
            }
            if (d > aVarArr3[i].f1930d) {
                i++;
            } else if (this.f1924a[i].f1944r) {
                fArr[0] = (float) this.f1924a[i].mo3107b(d);
                fArr[1] = (float) this.f1924a[i].mo3109c(d);
                return;
            } else {
                this.f1924a[i].mo3105a(d);
                fArr[0] = (float) this.f1924a[i].mo3104a();
                fArr[1] = (float) this.f1924a[i].mo3106b();
                return;
            }
        }
    }

    public C0526a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f1925b = dArr;
        this.f1924a = new C0527a[(dArr.length - 1)];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C0527a[] aVarArr = this.f1924a;
            if (i < aVarArr.length) {
                int i4 = iArr[i];
                if (i4 == 0) {
                    i3 = 3;
                } else if (i4 == 1) {
                    i2 = 1;
                    i3 = 1;
                } else if (i4 == 2) {
                    i2 = 2;
                    i3 = 2;
                } else if (i4 == 3) {
                    if (i2 == 1) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    i3 = i2;
                }
                int i5 = i + 1;
                aVarArr[i] = new C0527a(i3, dArr[i], dArr[i5], dArr2[i][0], dArr2[i][1], dArr2[i5][0], dArr2[i5][1]);
                i = i5;
            } else {
                return;
            }
        }
    }
}
