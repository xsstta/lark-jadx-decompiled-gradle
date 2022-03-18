package com.github.ybq.android.spinkit.p966a;

import android.util.Property;

/* renamed from: com.github.ybq.android.spinkit.a.b */
public abstract class AbstractC21301b<T> extends Property<T, Float> {
    /* renamed from: a */
    public abstract void mo72387a(T t, float f);

    public AbstractC21301b(String str) {
        super(Float.class, str);
    }

    /* renamed from: a */
    public final void set(T t, Float f) {
        mo72387a(t, f.floatValue());
    }
}
