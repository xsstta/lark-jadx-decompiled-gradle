package com.ss.android.bytedcert.p1308f.p1309a.p1312c;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.bytedcert.f.a.c.c */
public class C28373c {

    /* renamed from: a */
    public static final float[] f71305a = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: b */
    public static final float[] f71306b = {1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: c */
    public static final float[] f71307c = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f};

    /* renamed from: d */
    public static final float[] f71308d = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};

    /* renamed from: e */
    public static final float[] f71309e = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a */
    private static float m104068a(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    public static float[] m104069a(int i, boolean z, boolean z2) {
        float[] fArr;
        if (i == 90) {
            fArr = f71306b;
        } else if (i == 180) {
            fArr = f71307c;
        } else if (i != 270) {
            fArr = f71305a;
        } else {
            fArr = f71308d;
        }
        if (z) {
            fArr = new float[]{m104068a(fArr[0]), fArr[1], m104068a(fArr[2]), fArr[3], m104068a(fArr[4]), fArr[5], m104068a(fArr[6]), fArr[7]};
        }
        if (!z2) {
            return fArr;
        }
        return new float[]{fArr[0], m104068a(fArr[1]), fArr[2], m104068a(fArr[3]), fArr[4], m104068a(fArr[5]), fArr[6], m104068a(fArr[7])};
    }
}
