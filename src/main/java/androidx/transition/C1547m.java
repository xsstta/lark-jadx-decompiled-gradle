package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.transition.m */
class C1547m {
    /* renamed from: a */
    static <T> ObjectAnimator m7107a(T t, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(t, new C1548n(property, path), BitmapDescriptorFactory.HUE_RED, 1.0f);
    }
}
