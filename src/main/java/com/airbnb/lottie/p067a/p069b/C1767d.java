package com.airbnb.lottie.p067a.p069b;

import com.airbnb.lottie.model.content.C1838c;
import com.airbnb.lottie.p072d.C1793a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.d */
public class C1767d extends AbstractC1769f<C1838c> {

    /* renamed from: d */
    private final C1838c f6060d;

    public C1767d(List<C1793a<C1838c>> list) {
        super(list);
        int i = 0;
        T t = list.get(0).f6147a;
        i = t != null ? t.mo9202c() : i;
        this.f6060d = new C1838c(new float[i], new int[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1838c mo8950a(C1793a<C1838c> aVar, float f) {
        this.f6060d.mo9199a(aVar.f6147a, aVar.f6148b, f);
        return this.f6060d;
    }
}
