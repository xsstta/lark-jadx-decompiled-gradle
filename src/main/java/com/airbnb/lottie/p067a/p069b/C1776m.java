package com.airbnb.lottie.p067a.p069b;

import android.graphics.PointF;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p072d.C1793a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.a.b.m */
public class C1776m extends AbstractC1758a<PointF, PointF> {

    /* renamed from: d */
    private final PointF f6074d = new PointF();

    /* renamed from: e */
    private final AbstractC1758a<Float, Float> f6075e;

    /* renamed from: f */
    private final AbstractC1758a<Float, Float> f6076f;

    /* renamed from: i */
    public PointF mo8960g() {
        return mo8950a(null, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a
    /* renamed from: a */
    public void mo8952a(float f) {
        this.f6075e.mo8952a(f);
        this.f6076f.mo8952a(f);
        this.f6074d.set(this.f6075e.mo8960g().floatValue(), this.f6076f.mo8960g().floatValue());
        for (int i = 0; i < this.f6046a.size(); i++) {
            ((AbstractC1758a.AbstractC1760a) this.f6046a.get(i)).mo8931a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PointF mo8950a(C1793a<PointF> aVar, float f) {
        return this.f6074d;
    }

    public C1776m(AbstractC1758a<Float, Float> aVar, AbstractC1758a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f6075e = aVar;
        this.f6076f = aVar2;
        mo8952a(mo8961h());
    }
}
