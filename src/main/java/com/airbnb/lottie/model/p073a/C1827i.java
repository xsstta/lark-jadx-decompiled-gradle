package com.airbnb.lottie.model.p073a;

import android.graphics.PointF;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1776m;
import com.airbnb.lottie.p072d.C1793a;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.a.i */
public class C1827i implements AbstractC1831m<PointF, PointF> {

    /* renamed from: a */
    private final C1820b f6253a;

    /* renamed from: b */
    private final C1820b f6254b;

    @Override // com.airbnb.lottie.model.p073a.AbstractC1831m
    /* renamed from: c */
    public List<C1793a<PointF>> mo9137c() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.model.p073a.AbstractC1831m
    /* renamed from: a */
    public AbstractC1758a<PointF, PointF> mo9135a() {
        return new C1776m(this.f6253a.mo9135a(), this.f6254b.mo9135a());
    }

    @Override // com.airbnb.lottie.model.p073a.AbstractC1831m
    /* renamed from: b */
    public boolean mo9136b() {
        if (!this.f6253a.mo9136b() || !this.f6254b.mo9136b()) {
            return false;
        }
        return true;
    }

    public C1827i(C1820b bVar, C1820b bVar2) {
        this.f6253a = bVar;
        this.f6254b = bVar2;
    }
}
