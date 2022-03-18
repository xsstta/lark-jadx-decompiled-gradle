package com.ss.android.shapeimage.p3021a.p3022a;

import android.graphics.Path;
import android.graphics.RectF;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.shapeimage.a.a.h */
public class C59981h {

    /* renamed from: a */
    private static final String f149528a = C59982i.f149529a;

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0254 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Path m232781a(java.lang.String r35) {
        /*
        // Method dump skipped, instructions count: 696
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.shapeimage.p3021a.p3022a.C59981h.m232781a(java.lang.String):android.graphics.Path");
    }

    /* renamed from: a */
    private static void m232782a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10;
        double d11 = (d - d3) / 2.0d;
        double d12 = (d2 - d4) / 2.0d;
        double radians = Math.toRadians(d7 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d13 = (cos * d11) + (sin * d12);
        double d14 = ((-sin) * d11) + (d12 * cos);
        double abs = Math.abs(d5);
        double abs2 = Math.abs(d6);
        double d15 = abs * abs;
        double d16 = abs2 * abs2;
        double d17 = d13 * d13;
        double d18 = d14 * d14;
        double d19 = (d17 / d15) + (d18 / d16);
        double d20 = 1.0d;
        if (d19 > 1.0d) {
            abs *= Math.sqrt(d19);
            abs2 *= Math.sqrt(d19);
            d15 = abs * abs;
            d16 = abs2 * abs2;
        }
        if (z == z2) {
            d8 = -1.0d;
        } else {
            d8 = 1.0d;
        }
        double d21 = d15 * d16;
        double d22 = d15 * d18;
        double d23 = d16 * d17;
        double d24 = ((d21 - d22) - d23) / (d22 + d23);
        if (d24 < 0.0d) {
            d24 = 0.0d;
        }
        double sqrt = d8 * Math.sqrt(d24);
        double d25 = ((abs * d14) / abs2) * sqrt;
        double d26 = sqrt * (-((abs2 * d13) / abs));
        double d27 = ((d + d3) / 2.0d) + ((cos * d25) - (sin * d26));
        double d28 = ((d2 + d4) / 2.0d) + (sin * d25) + (cos * d26);
        double d29 = (d13 - d25) / abs;
        double d30 = (d14 - d26) / abs2;
        double d31 = ((-d13) - d25) / abs;
        double d32 = ((-d14) - d26) / abs2;
        double d33 = (d29 * d29) + (d30 * d30);
        double sqrt2 = Math.sqrt(d33);
        if (d30 < 0.0d) {
            d9 = -1.0d;
        } else {
            d9 = 1.0d;
        }
        double degrees = Math.toDegrees(d9 * Math.acos(d29 / sqrt2));
        double sqrt3 = Math.sqrt(d33 * ((d31 * d31) + (d32 * d32)));
        double d34 = (d29 * d31) + (d30 * d32);
        if ((d29 * d32) - (d30 * d31) < 0.0d) {
            d20 = -1.0d;
        }
        double degrees2 = Math.toDegrees(d20 * Math.acos(d34 / sqrt3));
        if (z2 || degrees2 <= 0.0d) {
            d10 = 360.0d;
            if (z2 && degrees2 < 0.0d) {
                degrees2 += 360.0d;
            }
        } else {
            d10 = 360.0d;
            degrees2 -= 360.0d;
        }
        path.addArc(new RectF((float) (d27 - abs), (float) (d28 - abs2), (float) (d27 + abs), (float) (d28 + abs2)), (float) (degrees % d10), (float) (degrees2 % d10));
    }
}
