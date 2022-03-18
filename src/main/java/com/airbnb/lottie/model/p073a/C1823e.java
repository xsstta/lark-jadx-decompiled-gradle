package com.airbnb.lottie.model.p073a;

import android.graphics.PointF;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1772i;
import com.airbnb.lottie.p067a.p069b.C1773j;
import com.airbnb.lottie.p072d.C1793a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.a.e */
public class C1823e implements AbstractC1831m<PointF, PointF> {

    /* renamed from: a */
    private final List<C1793a<PointF>> f6252a;

    @Override // com.airbnb.lottie.model.p073a.AbstractC1831m
    /* renamed from: c */
    public List<C1793a<PointF>> mo9137c() {
        return this.f6252a;
    }

    public C1823e() {
        this.f6252a = Collections.singletonList(new C1793a(new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)));
    }

    @Override // com.airbnb.lottie.model.p073a.AbstractC1831m
    /* renamed from: a */
    public AbstractC1758a<PointF, PointF> mo9135a() {
        if (this.f6252a.get(0).mo9076e()) {
            return new C1773j(this.f6252a);
        }
        return new C1772i(this.f6252a);
    }

    @Override // com.airbnb.lottie.model.p073a.AbstractC1831m
    /* renamed from: b */
    public boolean mo9136b() {
        if (this.f6252a.size() != 1 || !this.f6252a.get(0).mo9076e()) {
            return false;
        }
        return true;
    }

    public C1823e(List<C1793a<PointF>> list) {
        this.f6252a = list;
    }
}
