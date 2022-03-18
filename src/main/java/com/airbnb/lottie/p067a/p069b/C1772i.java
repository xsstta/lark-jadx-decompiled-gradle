package com.airbnb.lottie.p067a.p069b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.p072d.C1793a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.i */
public class C1772i extends AbstractC1769f<PointF> {

    /* renamed from: d */
    private final PointF f6066d = new PointF();

    /* renamed from: e */
    private final float[] f6067e = new float[2];

    /* renamed from: f */
    private C1771h f6068f;

    /* renamed from: g */
    private PathMeasure f6069g = new PathMeasure();

    public C1772i(List<? extends C1793a<PointF>> list) {
        super(list);
    }

    /* renamed from: b */
    public PointF mo8950a(C1793a<PointF> aVar, float f) {
        PointF pointF;
        C1771h hVar = (C1771h) aVar;
        Path b = hVar.mo8980b();
        if (b == null) {
            return aVar.f6147a;
        }
        if (this.f6048c != null && (pointF = (PointF) this.f6048c.mo9083a(hVar.f6150d, hVar.f6151e.floatValue(), hVar.f6147a, hVar.f6148b, mo8957d(), f, mo8961h())) != null) {
            return pointF;
        }
        if (this.f6068f != hVar) {
            this.f6069g.setPath(b, false);
            this.f6068f = hVar;
        }
        PathMeasure pathMeasure = this.f6069g;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f6067e, null);
        PointF pointF2 = this.f6066d;
        float[] fArr = this.f6067e;
        pointF2.set(fArr[0], fArr[1]);
        return this.f6066d;
    }
}
