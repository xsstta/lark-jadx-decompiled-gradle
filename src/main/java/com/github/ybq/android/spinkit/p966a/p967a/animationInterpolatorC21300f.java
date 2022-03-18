package com.github.ybq.android.spinkit.p966a.p967a;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.github.ybq.android.spinkit.a.a.f  reason: invalid class name */
public class animationInterpolatorC21300f implements Interpolator {

    /* renamed from: a */
    private final float[] f51839a;

    /* renamed from: b */
    private final float[] f51840b;

    public animationInterpolatorC21300f(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f51839a = new float[i];
        this.f51840b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, null);
            this.f51839a[i2] = fArr[0];
            this.f51840b[i2] = fArr[1];
        }
    }

    public float getInterpolation(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f51839a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f51839a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f51839a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return this.f51840b[i];
        }
        float[] fArr2 = this.f51840b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    public animationInterpolatorC21300f(float f, float f2, float f3, float f4) {
        this(m77145a(f, f2, f3, f4));
    }

    /* renamed from: a */
    private static Path m77145a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }
}
