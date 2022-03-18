package com.bytedance.ee.bear.facade.common;

import com.bytedance.ee.bear.facade.common.AbstractC7717k;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.bear.facade.common.f */
public class C7707f<T extends AbstractC7717k> {

    /* renamed from: a */
    private WeakReference<T> f20823a;

    /* renamed from: g */
    public T mo30187g() {
        return this.f20823a.get();
    }

    public C7707f(T t) {
        this.f20823a = new WeakReference<>(t);
    }
}
