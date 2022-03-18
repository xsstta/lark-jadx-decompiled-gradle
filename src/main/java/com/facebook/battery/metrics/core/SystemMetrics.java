package com.facebook.battery.metrics.core;

import com.facebook.battery.metrics.core.SystemMetrics;
import java.io.Serializable;

public abstract class SystemMetrics<T extends SystemMetrics<T>> implements Serializable {
    public abstract T diff(T t, T t2);

    public abstract T set(T t);

    public abstract T sum(T t, T t2);

    public T diff(T t) {
        return diff(t, null);
    }

    public T sum(T t) {
        return sum(t, null);
    }
}
