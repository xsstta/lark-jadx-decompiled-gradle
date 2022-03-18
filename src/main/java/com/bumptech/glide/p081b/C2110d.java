package com.bumptech.glide.p081b;

import androidx.collection.ArrayMap;
import com.bumptech.glide.util.C2566i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.b.d */
public class C2110d {

    /* renamed from: a */
    private final AtomicReference<C2566i> f7285a = new AtomicReference<>();

    /* renamed from: b */
    private final ArrayMap<C2566i, List<Class<?>>> f7286b = new ArrayMap<>();

    /* renamed from: a */
    public List<Class<?>> mo10338a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C2566i andSet = this.f7285a.getAndSet(null);
        if (andSet == null) {
            andSet = new C2566i(cls, cls2, cls3);
        } else {
            andSet.mo11260a(cls, cls2, cls3);
        }
        synchronized (this.f7286b) {
            list = this.f7286b.get(andSet);
        }
        this.f7285a.set(andSet);
        return list;
    }

    /* renamed from: a */
    public void mo10339a(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f7286b) {
            this.f7286b.put(new C2566i(cls, cls2, cls3), list);
        }
    }
}
