package androidx.p031d.p032a.p033a;

import android.view.animation.Interpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.d.a.a.d  reason: invalid class name */
abstract class AbstractanimationInterpolatorC0968d implements Interpolator {

    /* renamed from: a */
    private final float[] f3619a;

    /* renamed from: b */
    private final float f3620b;

    protected AbstractanimationInterpolatorC0968d(float[] fArr) {
        this.f3619a = fArr;
        this.f3620b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr = this.f3619a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f3620b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f3619a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
