package com.bumptech.glide.load.resource.p094e;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.e.f */
public class C2486f {

    /* renamed from: a */
    private final List<C2487a<?, ?>> f8101a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.resource.e.f$a */
    public static final class C2487a<Z, R> {

        /* renamed from: a */
        final AbstractC2485e<Z, R> f8102a;

        /* renamed from: b */
        private final Class<Z> f8103b;

        /* renamed from: c */
        private final Class<R> f8104c;

        /* renamed from: a */
        public boolean mo11049a(Class<?> cls, Class<?> cls2) {
            if (!this.f8103b.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.f8104c)) {
                return false;
            }
            return true;
        }

        public C2487a(Class<Z> cls, Class<R> cls2, AbstractC2485e<Z, R> eVar) {
            this.f8103b = cls;
            this.f8104c = cls2;
            this.f8102a = eVar;
        }
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo11047b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C2487a<?, ?> aVar : this.f8101a) {
            if (aVar.mo11049a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <Z, R> AbstractC2485e<Z, R> mo11045a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C2488g.m10479a();
        }
        for (C2487a<?, ?> aVar : this.f8101a) {
            if (aVar != null && aVar.mo11049a(cls, cls2)) {
                return aVar.f8102a;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: a */
    public synchronized <Z, R> void mo11046a(Class<Z> cls, Class<R> cls2, AbstractC2485e<Z, R> eVar) {
        this.f8101a.add(new C2487a<>(cls, cls2, eVar));
    }

    /* renamed from: b */
    public synchronized <Z, R> void mo11048b(Class<Z> cls, Class<R> cls2, AbstractC2485e<Z, R> eVar) {
        this.f8101a.add(0, new C2487a<>(cls, cls2, eVar));
    }
}
