package com.airbnb.lottie.p067a.p069b;

import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p072d.C1793a;
import com.airbnb.lottie.p072d.C1796d;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.k */
public class C1774k extends AbstractC1769f<C1796d> {

    /* renamed from: d */
    private final C1796d f6071d = new C1796d();

    public C1774k(List<C1793a<C1796d>> list) {
        super(list);
    }

    /* renamed from: b */
    public C1796d mo8950a(C1793a<C1796d> aVar, float f) {
        C1796d dVar;
        if (aVar.f6147a == null || aVar.f6148b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t = aVar.f6147a;
        T t2 = aVar.f6148b;
        if (this.f6048c != null && (dVar = (C1796d) this.f6048c.mo9083a(aVar.f6150d, aVar.f6151e.floatValue(), t, t2, f, mo8957d(), mo8961h())) != null) {
            return dVar;
        }
        this.f6071d.mo9086a(C1790g.m8000a(t.mo9085a(), t2.mo9085a(), f), C1790g.m8000a(t.mo9087b(), t2.mo9087b(), f));
        return this.f6071d;
    }
}
