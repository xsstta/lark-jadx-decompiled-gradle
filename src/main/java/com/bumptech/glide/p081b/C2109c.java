package com.bumptech.glide.p081b;

import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.C2352i;
import com.bumptech.glide.load.engine.C2380s;
import com.bumptech.glide.load.resource.p094e.C2488g;
import com.bumptech.glide.util.C2566i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.b.c */
public class C2109c {

    /* renamed from: a */
    private static final C2380s<?, ?, ?> f7282a = new C2380s<>(Object.class, Object.class, Object.class, Collections.singletonList(new C2352i(Object.class, Object.class, Object.class, Collections.emptyList(), new C2488g(), null)), null);

    /* renamed from: b */
    private final ArrayMap<C2566i, C2380s<?, ?, ?>> f7283b = new ArrayMap<>();

    /* renamed from: c */
    private final AtomicReference<C2566i> f7284c = new AtomicReference<>();

    /* renamed from: a */
    public boolean mo10337a(C2380s<?, ?, ?> sVar) {
        return f7282a.equals(sVar);
    }

    /* renamed from: b */
    private C2566i m9122b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C2566i andSet = this.f7284c.getAndSet(null);
        if (andSet == null) {
            andSet = new C2566i();
        }
        andSet.mo11260a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C2380s<Data, TResource, Transcode> mo10335a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C2380s<Data, TResource, Transcode> sVar;
        C2566i b = m9122b(cls, cls2, cls3);
        synchronized (this.f7283b) {
            sVar = (C2380s<Data, TResource, Transcode>) this.f7283b.get(b);
        }
        this.f7284c.set(b);
        return sVar;
    }

    /* renamed from: a */
    public void mo10336a(Class<?> cls, Class<?> cls2, Class<?> cls3, C2380s<?, ?, ?> sVar) {
        synchronized (this.f7283b) {
            ArrayMap<C2566i, C2380s<?, ?, ?>> arrayMap = this.f7283b;
            C2566i iVar = new C2566i(cls, cls2, cls3);
            if (sVar == null) {
                sVar = f7282a;
            }
            arrayMap.put(iVar, sVar);
        }
    }
}
