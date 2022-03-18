package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.core.view.animation.a  reason: invalid class name */
class animationInterpolatorC0893a implements Interpolator {

    /* renamed from: a */
    private final float[] f3422a;

    /* renamed from: b */
    private final float[] f3423b;

    animationInterpolatorC0893a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f3422a = new float[i];
        this.f3423b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, null);
            this.f3422a[i2] = fArr[0];
            this.f3423b[i2] = fArr[1];
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
        int length = this.f3422a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f3422a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f3422a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return this.f3423b[i];
        }
        float[] fArr2 = this.f3423b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    animationInterpolatorC0893a(float f, float f2) {
        this(m4324a(f, f2));
    }

    /* renamed from: a */
    private static Path m4324a(float f, float f2) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.quadTo(f, f2, 1.0f, 1.0f);
        return path;
    }

    animationInterpolatorC0893a(float f, float f2, float f3, float f4) {
        this(m4325a(f, f2, f3, f4));
    }

    /* renamed from: a */
    private static Path m4325a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }
}
