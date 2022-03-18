package com.ss.android.vesdk;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class aj {

    /* renamed from: a */
    private static volatile aj f161442a;

    /* renamed from: b */
    private static float[] f161443b = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: c */
    private static float[] f161444c = {-2.0f, -2.0f};

    /* renamed from: d */
    private double f161445d;

    /* renamed from: e */
    private float[] f161446e = f161443b;

    /* renamed from: f */
    private float[] f161447f = f161444c;

    /* renamed from: g */
    private boolean f161448g;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public double mo221170b() {
        return this.f161445d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float[] mo221171c() {
        return this.f161446e;
    }

    /* renamed from: d */
    public boolean mo221172d() {
        return this.f161448g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float[] mo221173e() {
        return this.f161447f;
    }

    private aj() {
    }

    /* renamed from: a */
    public static aj m251022a() {
        if (f161442a == null) {
            synchronized (aj.class) {
                if (f161442a == null) {
                    f161442a = new aj();
                }
            }
        }
        return f161442a;
    }
}
