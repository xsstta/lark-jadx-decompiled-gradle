package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* access modifiers changed from: package-private */
/* renamed from: androidx.transition.n */
public class C1548n<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f5420a;

    /* renamed from: b */
    private final PathMeasure f5421b;

    /* renamed from: c */
    private final float f5422c;

    /* renamed from: d */
    private final float[] f5423d = new float[2];

    /* renamed from: e */
    private final PointF f5424e = new PointF();

    /* renamed from: f */
    private float f5425f;

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f5425f);
    }

    C1548n(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f5420a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f5421b = pathMeasure;
        this.f5422c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f) {
        this.f5425f = f.floatValue();
        this.f5421b.getPosTan(this.f5422c * f.floatValue(), this.f5423d, null);
        this.f5424e.x = this.f5423d[0];
        this.f5424e.y = this.f5423d[1];
        this.f5420a.set(t, this.f5424e);
    }
}
