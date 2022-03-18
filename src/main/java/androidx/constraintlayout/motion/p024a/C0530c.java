package androidx.constraintlayout.motion.p024a;

import android.util.Log;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.motion.a.c */
public class C0530c {

    /* renamed from: a */
    static C0530c f1947a = new C0530c();

    /* renamed from: c */
    public static String[] f1948c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: b */
    String f1949b = "identity";

    /* renamed from: a */
    public double mo3114a(double d) {
        return d;
    }

    /* renamed from: b */
    public double mo3115b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f1949b;
    }

    /* renamed from: androidx.constraintlayout.motion.a.c$a */
    static class C0531a extends C0530c {

        /* renamed from: h */
        private static double f1950h = 0.01d;

        /* renamed from: i */
        private static double f1951i = 1.0E-4d;

        /* renamed from: d */
        double f1952d;

        /* renamed from: e */
        double f1953e;

        /* renamed from: f */
        double f1954f;

        /* renamed from: g */
        double f1955g;

        /* renamed from: c */
        private double m2434c(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f1952d * d2 * d3 * d) + (this.f1954f * d3 * d * d) + (d * d * d);
        }

        /* renamed from: d */
        private double m2435d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f1953e * d2 * d3 * d) + (this.f1955g * d3 * d * d) + (d * d * d);
        }

        @Override // androidx.constraintlayout.motion.p024a.C0530c
        /* renamed from: b */
        public double mo3115b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f1951i) {
                d2 *= 0.5d;
                if (m2434c(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double c = m2434c(d4);
            double d5 = d3 + d2;
            return (m2435d(d5) - m2435d(d4)) / (m2434c(d5) - c);
        }

        C0531a(String str) {
            this.f1949b = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f1952d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f1953e = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f1954f = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f1955g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // androidx.constraintlayout.motion.p024a.C0530c
        /* renamed from: a */
        public double mo3114a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f1950h) {
                d2 *= 0.5d;
                if (m2434c(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double c = m2434c(d4);
            double d5 = d3 + d2;
            double c2 = m2434c(d5);
            double d6 = m2435d(d4);
            return (((m2435d(d5) - d6) * (d - c)) / (c2 - c)) + d6;
        }
    }

    /* renamed from: a */
    public static C0530c m2431a(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C0531a(str);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c = 1;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 2;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C0531a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new C0531a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new C0531a("cubic(1, 1, 0, 0)");
            case 3:
                return new C0531a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Log.e("ConstraintSet", "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f1948c));
                return f1947a;
        }
    }
}
