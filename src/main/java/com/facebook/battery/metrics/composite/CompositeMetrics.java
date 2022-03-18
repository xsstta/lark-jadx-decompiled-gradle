package com.facebook.battery.metrics.composite;

import androidx.collection.SimpleArrayMap;
import com.facebook.battery.metrics.core.AbstractC21000d;
import com.facebook.battery.metrics.core.SystemMetrics;

public class CompositeMetrics extends SystemMetrics<CompositeMetrics> {
    private final SimpleArrayMap<Class<? extends SystemMetrics>, SystemMetrics> mMetricsMap = new SimpleArrayMap<>();
    private final SimpleArrayMap<Class<? extends SystemMetrics>, Boolean> mMetricsValid = new SimpleArrayMap<>();

    public SimpleArrayMap<Class<? extends SystemMetrics>, SystemMetrics> getMetrics() {
        return this.mMetricsMap;
    }

    public int hashCode() {
        return (this.mMetricsMap.hashCode() * 31) + this.mMetricsValid.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Composite Metrics{\n");
        int size = this.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            sb.append(this.mMetricsMap.valueAt(i));
            if (isValid(this.mMetricsMap.keyAt(i))) {
                str = " [valid]";
            } else {
                str = " [invalid]";
            }
            sb.append(str);
            sb.append('\n');
        }
        sb.append("}");
        return sb.toString();
    }

    public <T extends SystemMetrics<T>> T getMetric(Class<T> cls) {
        return cls.cast(this.mMetricsMap.get(cls));
    }

    public boolean isValid(Class cls) {
        Boolean bool = this.mMetricsValid.get(cls);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompositeMetrics compositeMetrics = (CompositeMetrics) obj;
        if (!AbstractC21000d.m76509a(this.mMetricsValid, compositeMetrics.mMetricsValid) || !AbstractC21000d.m76509a(this.mMetricsMap, compositeMetrics.mMetricsMap)) {
            return false;
        }
        return true;
    }

    public CompositeMetrics set(CompositeMetrics compositeMetrics) {
        int size = this.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            Class<? extends SystemMetrics> keyAt = this.mMetricsMap.keyAt(i);
            SystemMetrics metric = compositeMetrics.getMetric(keyAt);
            if (metric != null) {
                getMetric(keyAt).set(metric);
                setIsValid(keyAt, compositeMetrics.isValid(keyAt));
            } else {
                setIsValid(keyAt, false);
            }
        }
        return this;
    }

    public <T extends SystemMetrics<T>> CompositeMetrics putMetric(Class<T> cls, T t) {
        this.mMetricsMap.put(cls, t);
        this.mMetricsValid.put(cls, Boolean.FALSE);
        return this;
    }

    public void setIsValid(Class cls, boolean z) {
        Boolean bool;
        SimpleArrayMap<Class<? extends SystemMetrics>, Boolean> simpleArrayMap = this.mMetricsValid;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        simpleArrayMap.put(cls, bool);
    }

    public CompositeMetrics diff(CompositeMetrics compositeMetrics, CompositeMetrics compositeMetrics2) {
        boolean z;
        SystemMetrics metric;
        if (compositeMetrics2 != null) {
            if (compositeMetrics == null) {
                compositeMetrics2.set(this);
            } else {
                int size = this.mMetricsMap.size();
                for (int i = 0; i < size; i++) {
                    Class<? extends SystemMetrics> keyAt = this.mMetricsMap.keyAt(i);
                    if (!isValid(keyAt) || !compositeMetrics.isValid(keyAt)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && (metric = compositeMetrics2.getMetric(keyAt)) != null) {
                        getMetric(keyAt).diff(compositeMetrics.getMetric(keyAt), metric);
                    }
                    compositeMetrics2.setIsValid(keyAt, z);
                }
            }
            return compositeMetrics2;
        }
        throw new IllegalArgumentException("CompositeMetrics doesn't support nullable results");
    }

    public CompositeMetrics sum(CompositeMetrics compositeMetrics, CompositeMetrics compositeMetrics2) {
        boolean z;
        SystemMetrics metric;
        if (compositeMetrics2 != null) {
            if (compositeMetrics == null) {
                compositeMetrics2.set(this);
            } else {
                int size = this.mMetricsMap.size();
                for (int i = 0; i < size; i++) {
                    Class<? extends SystemMetrics> keyAt = this.mMetricsMap.keyAt(i);
                    if (!isValid(keyAt) || !compositeMetrics.isValid(keyAt)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && (metric = compositeMetrics2.getMetric(keyAt)) != null) {
                        getMetric(keyAt).sum(compositeMetrics.getMetric(keyAt), metric);
                    }
                    compositeMetrics2.setIsValid(keyAt, z);
                }
            }
            return compositeMetrics2;
        }
        throw new IllegalArgumentException("CompositeMetrics doesn't support nullable results");
    }
}
