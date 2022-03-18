package androidx.core.graphics;

import android.graphics.Color;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.core.graphics.a */
public final class C0768a {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f3129a = new ThreadLocal<>();

    /* renamed from: a */
    private static float m3705a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: a */
    public static void m3712a(int i, float[] fArr) {
        m3710a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* renamed from: a */
    private static double[] m3713a() {
        ThreadLocal<double[]> threadLocal = f3129a;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    /* renamed from: a */
    public static double m3704a(int i) {
        double[] a = m3713a();
        m3711a(i, a);
        return a[1] / 100.0d;
    }

    /* renamed from: d */
    private static int m3717d(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: c */
    public static int m3716c(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: a */
    public static int m3706a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int d = m3717d(alpha2, alpha);
        return Color.argb(d, m3708a(Color.red(i), alpha2, Color.red(i2), alpha, d), m3708a(Color.green(i), alpha2, Color.green(i2), alpha, d), m3708a(Color.blue(i), alpha2, Color.blue(i2), alpha, d));
    }

    /* renamed from: b */
    public static double m3714b(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = m3706a(i, i2);
            }
            double a = m3704a(i) + 0.05d;
            double a2 = m3704a(i2) + 0.05d;
            return Math.max(a, a2) / Math.min(a, a2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    /* renamed from: a */
    public static void m3711a(int i, double[] dArr) {
        m3709a(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: a */
    public static int m3707a(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (m3714b(m3716c(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (m3714b(m3716c(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    /* renamed from: b */
    public static int m3715b(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    public static void m3709a(int i, int i2, int i3, double[] dArr) {
        double d;
        double d2;
        double d3;
        if (dArr.length == 3) {
            double d4 = ((double) i) / 255.0d;
            if (d4 < 0.04045d) {
                d = d4 / 12.92d;
            } else {
                d = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            }
            double d5 = ((double) i2) / 255.0d;
            if (d5 < 0.04045d) {
                d2 = d5 / 12.92d;
            } else {
                d2 = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = ((double) i3) / 255.0d;
            if (d6 < 0.04045d) {
                d3 = d6 / 12.92d;
            } else {
                d3 = Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * d) + (0.3576d * d2) + (0.1805d * d3)) * 100.0d;
            dArr[1] = ((0.2126d * d) + (0.7152d * d2) + (0.0722d * d3)) * 100.0d;
            dArr[2] = ((d * 0.0193d) + (d2 * 0.1192d) + (d3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: a */
    public static void m3710a(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f = BitmapDescriptorFactory.HUE_RED;
            f2 = BitmapDescriptorFactory.HUE_RED;
        } else {
            if (max == f3) {
                f = ((f4 - f5) / f6) % 6.0f;
            } else if (max == f4) {
                f = ((f5 - f3) / f6) + 2.0f;
            } else {
                f = 4.0f + ((f3 - f4) / f6);
            }
            f2 = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f * 60.0f) % 360.0f;
        if (f8 < BitmapDescriptorFactory.HUE_RED) {
            f8 += 360.0f;
        }
        fArr[0] = m3705a(f8, (float) BitmapDescriptorFactory.HUE_RED, 360.0f);
        fArr[1] = m3705a(f2, (float) BitmapDescriptorFactory.HUE_RED, 1.0f);
        fArr[2] = m3705a(f7, (float) BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    /* renamed from: a */
    private static int m3708a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }
}
