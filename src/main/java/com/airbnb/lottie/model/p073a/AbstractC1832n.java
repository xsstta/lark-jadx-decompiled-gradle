package com.airbnb.lottie.model.p073a;

import com.airbnb.lottie.p072d.C1793a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.model.a.n */
public abstract class AbstractC1832n<V, O> implements AbstractC1831m<V, O> {

    /* renamed from: a */
    final List<C1793a<V>> f6268a;

    @Override // com.airbnb.lottie.model.p073a.AbstractC1831m
    /* renamed from: c */
    public List<C1793a<V>> mo9137c() {
        return this.f6268a;
    }

    @Override // com.airbnb.lottie.model.p073a.AbstractC1831m
    /* renamed from: b */
    public boolean mo9136b() {
        if (this.f6268a.isEmpty() || (this.f6268a.size() == 1 && this.f6268a.get(0).mo9076e())) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f6268a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f6268a.toArray()));
        }
        return sb.toString();
    }

    AbstractC1832n(List<C1793a<V>> list) {
        this.f6268a = list;
    }

    AbstractC1832n(V v) {
        this(Collections.singletonList(new C1793a(v)));
    }
}
