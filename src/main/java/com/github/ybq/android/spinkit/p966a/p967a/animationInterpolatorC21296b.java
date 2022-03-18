package com.github.ybq.android.spinkit.p966a.p967a;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* renamed from: com.github.ybq.android.spinkit.a.a.b  reason: invalid class name */
public class animationInterpolatorC21296b implements Interpolator {

    /* renamed from: a */
    private TimeInterpolator f51837a;

    /* renamed from: b */
    private float[] f51838b;

    /* renamed from: b */
    public void mo72384b(float... fArr) {
        this.f51838b = fArr;
    }

    /* renamed from: a */
    public static animationInterpolatorC21296b m77140a(float... fArr) {
        animationInterpolatorC21296b bVar = new animationInterpolatorC21296b(C21295a.m77138a(), new float[0]);
        bVar.mo72384b(fArr);
        return bVar;
    }

    public float getInterpolation(float f) {
        if (this.f51838b.length > 1) {
            int i = 0;
            while (true) {
                float[] fArr = this.f51838b;
                if (i >= fArr.length - 1) {
                    break;
                }
                float f2 = fArr[i];
                i++;
                float f3 = fArr[i];
                float f4 = f3 - f2;
                if (f >= f2 && f <= f3) {
                    return f2 + (this.f51837a.getInterpolation((f - f2) / f4) * f4);
                }
            }
        }
        return this.f51837a.getInterpolation(f);
    }

    public animationInterpolatorC21296b(TimeInterpolator timeInterpolator, float... fArr) {
        this.f51837a = timeInterpolator;
        this.f51838b = fArr;
    }

    /* renamed from: a */
    public static animationInterpolatorC21296b m77139a(float f, float f2, float f3, float f4, float... fArr) {
        animationInterpolatorC21296b bVar = new animationInterpolatorC21296b(C21297c.m77142a(f, f2, f3, f4), new float[0]);
        bVar.mo72384b(fArr);
        return bVar;
    }
}
