package com.airbnb.lottie;

import androidx.core.os.C0804i;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.airbnb.lottie.c */
public class C1783c {

    /* renamed from: a */
    public static boolean f6104a;

    /* renamed from: b */
    private static boolean f6105b;

    /* renamed from: c */
    private static String[] f6106c;

    /* renamed from: d */
    private static long[] f6107d;

    /* renamed from: e */
    private static int f6108e;

    /* renamed from: f */
    private static int f6109f;

    /* renamed from: a */
    public static void m7956a(String str) {
        if (f6105b) {
            int i = f6108e;
            if (i == 20) {
                f6109f++;
                return;
            }
            f6106c[i] = str;
            f6107d[i] = System.nanoTime();
            C0804i.m3896a(str);
            f6108e++;
        }
    }

    /* renamed from: b */
    public static float m7957b(String str) {
        int i = f6109f;
        if (i > 0) {
            f6109f = i - 1;
            return BitmapDescriptorFactory.HUE_RED;
        } else if (!f6105b) {
            return BitmapDescriptorFactory.HUE_RED;
        } else {
            int i2 = f6108e - 1;
            f6108e = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f6106c[i2])) {
                C0804i.m3895a();
                return ((float) (System.nanoTime() - f6107d[f6108e])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f6106c[f6108e] + ".");
            }
        }
    }
}
