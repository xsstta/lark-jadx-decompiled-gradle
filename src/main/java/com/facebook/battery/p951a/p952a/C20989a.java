package com.facebook.battery.p951a.p952a;

import androidx.collection.SimpleArrayMap;
import com.facebook.battery.metrics.composite.CompositeMetrics;
import com.facebook.battery.metrics.core.SystemMetrics;
import com.facebook.battery.p951a.p953b.AbstractC20990a;

/* renamed from: com.facebook.battery.a.a.a */
public class C20989a implements AbstractC20990a<CompositeMetrics> {

    /* renamed from: a */
    private final SimpleArrayMap<Class<? extends SystemMetrics>, AbstractC20990a<?>> f51376a = new SimpleArrayMap<>();

    /* renamed from: a */
    public <T extends SystemMetrics<T>> C20989a mo71085a(Class<T> cls, AbstractC20990a<T> aVar) {
        this.f51376a.put(cls, aVar);
        return this;
    }

    /* renamed from: a */
    public void mo71087a(CompositeMetrics compositeMetrics, AbstractC20990a.AbstractC20991a aVar) {
        for (int i = 0; i < this.f51376a.size(); i++) {
            Class<? extends SystemMetrics> keyAt = this.f51376a.keyAt(i);
            if (compositeMetrics.isValid(keyAt)) {
                this.f51376a.get(keyAt).mo71087a(compositeMetrics.getMetric(keyAt), aVar);
            }
        }
    }
}
