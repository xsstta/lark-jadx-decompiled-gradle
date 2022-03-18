package com.airbnb.lottie.p067a.p069b;

import android.graphics.PointF;
import com.airbnb.lottie.p072d.C1793a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.j */
public class C1773j extends AbstractC1769f<PointF> {

    /* renamed from: d */
    private final PointF f6070d = new PointF();

    public C1773j(List<C1793a<PointF>> list) {
        super(list);
    }

    /* renamed from: b */
    public PointF mo8950a(C1793a<PointF> aVar, float f) {
        PointF pointF;
        if (aVar.f6147a == null || aVar.f6148b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t = aVar.f6147a;
        T t2 = aVar.f6148b;
        if (this.f6048c != null && (pointF = (PointF) this.f6048c.mo9083a(aVar.f6150d, aVar.f6151e.floatValue(), t, t2, f, mo8957d(), mo8961h())) != null) {
            return pointF;
        }
        this.f6070d.set(((PointF) t).x + ((((PointF) t2).x - ((PointF) t).x) * f), ((PointF) t).y + (f * (((PointF) t2).y - ((PointF) t).y)));
        return this.f6070d;
    }
}
