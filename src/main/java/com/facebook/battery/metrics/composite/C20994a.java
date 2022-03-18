package com.facebook.battery.metrics.composite;

import androidx.collection.SimpleArrayMap;
import com.facebook.battery.metrics.core.AbstractC20997b;
import com.facebook.battery.metrics.core.AbstractC21000d;
import com.facebook.battery.metrics.core.SystemMetrics;

/* renamed from: com.facebook.battery.metrics.composite.a */
public class C20994a extends AbstractC20997b<CompositeMetrics> {

    /* renamed from: a */
    private final SimpleArrayMap<Class<? extends SystemMetrics>, AbstractC20997b<?>> f51377a;

    /* renamed from: com.facebook.battery.metrics.composite.a$a */
    public static class C20995a {

        /* renamed from: a */
        final SimpleArrayMap<Class<? extends SystemMetrics>, AbstractC20997b<?>> f51378a = new SimpleArrayMap<>();

        /* renamed from: a */
        public C20994a mo71112a() {
            return new C20994a(this);
        }

        /* renamed from: a */
        public <T extends SystemMetrics<T>> C20995a mo71111a(Class<T> cls, AbstractC20997b<T> bVar) {
            this.f51378a.put(cls, bVar);
            return this;
        }
    }

    /* renamed from: a */
    public CompositeMetrics mo71110b() {
        CompositeMetrics compositeMetrics = new CompositeMetrics();
        int size = this.f51377a.size();
        for (int i = 0; i < size; i++) {
            compositeMetrics.putMetric(this.f51377a.keyAt(i), this.f51377a.valueAt(i).mo71110b());
        }
        return compositeMetrics;
    }

    protected C20994a(C20995a aVar) {
        SimpleArrayMap<Class<? extends SystemMetrics>, AbstractC20997b<?>> simpleArrayMap = new SimpleArrayMap<>();
        this.f51377a = simpleArrayMap;
        simpleArrayMap.putAll(aVar.f51378a);
    }

    /* renamed from: a */
    public boolean mo71109a(CompositeMetrics compositeMetrics) {
        boolean z;
        AbstractC21000d.m76507a(compositeMetrics, "Null value passed to getSnapshot!");
        SimpleArrayMap<Class<? extends SystemMetrics>, SystemMetrics> metrics = compositeMetrics.getMetrics();
        int size = metrics.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            Class<? extends SystemMetrics> keyAt = metrics.keyAt(i);
            AbstractC20997b<?> bVar = this.f51377a.get(keyAt);
            if (bVar != null) {
                z = bVar.mo71109a(compositeMetrics.getMetric(keyAt));
            } else {
                z = false;
            }
            compositeMetrics.setIsValid(keyAt, z);
            z2 |= z;
        }
        return z2;
    }
}
