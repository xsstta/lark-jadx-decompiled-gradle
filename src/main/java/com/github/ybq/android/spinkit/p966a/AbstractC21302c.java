package com.github.ybq.android.spinkit.p966a;

import android.util.Property;

/* renamed from: com.github.ybq.android.spinkit.a.c */
public abstract class AbstractC21302c<T> extends Property<T, Integer> {
    /* renamed from: a */
    public abstract void mo72390a(T t, int i);

    public AbstractC21302c(String str) {
        super(Integer.class, str);
    }

    /* renamed from: a */
    public final void set(T t, Integer num) {
        mo72390a(t, num.intValue());
    }
}
