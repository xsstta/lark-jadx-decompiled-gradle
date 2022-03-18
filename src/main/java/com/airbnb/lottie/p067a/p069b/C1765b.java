package com.airbnb.lottie.p067a.p069b;

import com.airbnb.lottie.p071c.C1785b;
import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p072d.C1793a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.b */
public class C1765b extends AbstractC1769f<Integer> {
    /* renamed from: i */
    public int mo8970i() {
        return mo8969c(mo8956c(), mo8958e());
    }

    public C1765b(List<C1793a<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Integer mo8950a(C1793a<Integer> aVar, float f) {
        return Integer.valueOf(mo8969c(aVar, f));
    }

    /* renamed from: c */
    public int mo8969c(C1793a<Integer> aVar, float f) {
        Integer num;
        if (aVar.f6147a == null || aVar.f6148b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = aVar.f6147a.intValue();
        int intValue2 = aVar.f6148b.intValue();
        if (this.f6048c == null || (num = (Integer) this.f6048c.mo9083a(aVar.f6150d, aVar.f6151e.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo8957d(), mo8961h())) == null) {
            return C1785b.m7964a(C1790g.m8008b(f, BitmapDescriptorFactory.HUE_RED, 1.0f), intValue, intValue2);
        }
        return num.intValue();
    }
}
