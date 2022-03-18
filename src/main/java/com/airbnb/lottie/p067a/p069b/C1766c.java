package com.airbnb.lottie.p067a.p069b;

import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p072d.C1793a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.c */
public class C1766c extends AbstractC1769f<Float> {
    /* renamed from: i */
    public float mo8970i() {
        return mo8972c(mo8956c(), mo8958e());
    }

    public C1766c(List<C1793a<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Float mo8950a(C1793a<Float> aVar, float f) {
        return Float.valueOf(mo8972c(aVar, f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo8972c(C1793a<Float> aVar, float f) {
        Float f2;
        if (aVar.f6147a == null || aVar.f6148b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f6048c == null || (f2 = (Float) this.f6048c.mo9083a(aVar.f6150d, aVar.f6151e.floatValue(), aVar.f6147a, aVar.f6148b, f, mo8957d(), mo8961h())) == null) {
            return C1790g.m8000a(aVar.mo9077f(), aVar.mo9078g(), f);
        } else {
            return f2.floatValue();
        }
    }
}
