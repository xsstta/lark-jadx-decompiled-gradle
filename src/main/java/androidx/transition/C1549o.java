package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.transition.o */
class C1549o {
    /* renamed from: a */
    static PropertyValuesHolder m7110a(Property<?, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
        return PropertyValuesHolder.ofFloat(new C1548n(property, path), BitmapDescriptorFactory.HUE_RED, 1.0f);
    }
}
