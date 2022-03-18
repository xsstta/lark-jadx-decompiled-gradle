package androidx.constraintlayout.motion.p024a;

import java.util.Arrays;

/* renamed from: androidx.constraintlayout.motion.a.f */
public class C0534f {

    /* renamed from: a */
    public static String f1962a = "Oscillator";

    /* renamed from: b */
    float[] f1963b = new float[0];

    /* renamed from: c */
    double[] f1964c = new double[0];

    /* renamed from: d */
    double[] f1965d;

    /* renamed from: e */
    int f1966e;

    /* renamed from: f */
    double f1967f = 6.283185307179586d;

    /* renamed from: g */
    private boolean f1968g;

    public String toString() {
        return "pos =" + Arrays.toString(this.f1964c) + " period=" + Arrays.toString(this.f1963b);
    }

    /* renamed from: a */
    public void mo3118a() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.f1963b;
            if (i >= fArr.length) {
                break;
            }
            d += (double) fArr[i];
            i++;
        }
        double d2 = 0.0d;
        int i2 = 1;
        while (true) {
            float[] fArr2 = this.f1963b;
            if (i2 >= fArr2.length) {
                break;
            }
            int i3 = i2 - 1;
            double[] dArr = this.f1964c;
            d2 += (dArr[i2] - dArr[i3]) * ((double) ((fArr2[i3] + fArr2[i2]) / 2.0f));
            i2++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr3 = this.f1963b;
            if (i4 >= fArr3.length) {
                break;
            }
            fArr3[i4] = (float) (((double) fArr3[i4]) * (d / d2));
            i4++;
        }
        this.f1965d[0] = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr4 = this.f1963b;
            if (i5 < fArr4.length) {
                int i6 = i5 - 1;
                double[] dArr2 = this.f1964c;
                double d3 = dArr2[i5] - dArr2[i6];
                double[] dArr3 = this.f1965d;
                dArr3[i5] = dArr3[i6] + (d3 * ((double) ((fArr4[i6] + fArr4[i5]) / 2.0f)));
                i5++;
            } else {
                this.f1968g = true;
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo3120a(int i) {
        this.f1966e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo3117a(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f1964c, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f1963b;
        int i2 = i - 1;
        double d2 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.f1964c;
        double d3 = d2 / (dArr[i] - dArr[i2]);
        return this.f1965d[i2] + ((((double) fArr[i2]) - (dArr[i2] * d3)) * (d - dArr[i2])) + ((d3 * ((d * d) - (dArr[i2] * dArr[i2]))) / 2.0d);
    }

    /* renamed from: b */
    public double mo3121b(double d) {
        double abs;
        switch (this.f1966e) {
            case 1:
                return Math.signum(0.5d - (mo3117a(d) % 1.0d));
            case 2:
                abs = Math.abs((((mo3117a(d) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((mo3117a(d) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((mo3117a(d) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f1967f * mo3117a(d));
            case 6:
                double abs2 = 1.0d - Math.abs(((mo3117a(d) * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            default:
                return Math.sin(this.f1967f * mo3117a(d));
        }
        return 1.0d - abs;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public double mo3122c(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f1964c, d);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f1963b;
        int i2 = i - 1;
        double d2 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.f1964c;
        double d3 = d2 / (dArr[i] - dArr[i2]);
        return (((double) fArr[i2]) - (d3 * dArr[i2])) + (d * d3);
    }

    /* renamed from: d */
    public double mo3123d(double d) {
        double c;
        double signum;
        double c2;
        double c3;
        double sin;
        switch (this.f1966e) {
            case 1:
                return 0.0d;
            case 2:
                c = mo3122c(d) * 4.0d;
                signum = Math.signum((((mo3117a(d) * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                return c * signum;
            case 3:
                c2 = mo3122c(d);
                return c2 * 2.0d;
            case 4:
                c2 = -mo3122c(d);
                return c2 * 2.0d;
            case 5:
                c3 = (-this.f1967f) * mo3122c(d);
                sin = Math.sin(this.f1967f * mo3117a(d));
                return c3 * sin;
            case 6:
                c = mo3122c(d) * 4.0d;
                signum = (((mo3117a(d) * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                return c * signum;
            default:
                c3 = this.f1967f * mo3122c(d);
                sin = Math.cos(this.f1967f * mo3117a(d));
                return c3 * sin;
        }
    }

    /* renamed from: a */
    public void mo3119a(double d, float f) {
        int length = this.f1963b.length + 1;
        int binarySearch = Arrays.binarySearch(this.f1964c, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f1964c = Arrays.copyOf(this.f1964c, length);
        this.f1963b = Arrays.copyOf(this.f1963b, length);
        this.f1965d = new double[length];
        double[] dArr = this.f1964c;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f1964c[binarySearch] = d;
        this.f1963b[binarySearch] = f;
        this.f1968g = false;
    }
}
