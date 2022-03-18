package com.airbnb.lottie.p067a.p069b;

import com.airbnb.lottie.p072d.C1793a;
import com.airbnb.lottie.p072d.C1794b;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.a.b.p */
public class C1779p<K, A> extends AbstractC1758a<K, A> {

    /* renamed from: d */
    private final C1794b<A> f6091d;

    /* renamed from: e */
    private final A f6092e;

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a
    /* renamed from: f */
    public float mo8959f() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a
    /* renamed from: b */
    public void mo8955b() {
        if (this.f6048c != null) {
            super.mo8955b();
        }
    }

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a
    /* renamed from: g */
    public A mo8960g() {
        C1795c cVar = this.f6048c;
        A a = this.f6092e;
        return (A) cVar.mo9083a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, a, a, mo8961h(), mo8961h(), mo8961h());
    }

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a
    /* renamed from: a */
    public void mo8952a(float f) {
        this.f6047b = f;
    }

    public C1779p(C1795c<A> cVar) {
        this(cVar, null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a
    /* renamed from: a */
    public A mo8950a(C1793a<K> aVar, float f) {
        return mo8960g();
    }

    public C1779p(C1795c<A> cVar, A a) {
        super(Collections.emptyList());
        this.f6091d = new C1794b<>();
        mo8954a(cVar);
        this.f6092e = a;
    }
}
