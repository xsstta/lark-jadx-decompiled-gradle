package com.airbnb.lottie.p067a.p069b;

import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p072d.C1793a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.e */
public class C1768e extends AbstractC1769f<Integer> {
    /* renamed from: i */
    public int mo8970i() {
        return mo8975c(mo8956c(), mo8958e());
    }

    public C1768e(List<C1793a<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Integer mo8950a(C1793a<Integer> aVar, float f) {
        return Integer.valueOf(mo8975c(aVar, f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8975c(C1793a<Integer> aVar, float f) {
        Integer num;
        if (aVar.f6147a == null || aVar.f6148b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f6048c == null || (num = (Integer) this.f6048c.mo9083a(aVar.f6150d, aVar.f6151e.floatValue(), aVar.f6147a, aVar.f6148b, f, mo8957d(), mo8961h())) == null) {
            return C1790g.m8003a(aVar.mo9079h(), aVar.mo9080i(), f);
        } else {
            return num.intValue();
        }
    }
}
