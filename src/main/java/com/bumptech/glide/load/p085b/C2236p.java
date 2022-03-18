package com.bumptech.glide.load.p085b;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.b.p */
public class C2236p {

    /* renamed from: a */
    private final C2241r f7559a;

    /* renamed from: b */
    private final C2237a f7560b;

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.b.p$a */
    public static class C2237a {

        /* renamed from: a */
        private final Map<Class<?>, C2238a<?>> f7561a = new HashMap();

        /* renamed from: a */
        public void mo10608a() {
            this.f7561a.clear();
        }

        C2237a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: com.bumptech.glide.load.b.p$a$a */
        public static class C2238a<Model> {

            /* renamed from: a */
            final List<AbstractC2233n<Model, ?>> f7562a;

            public C2238a(List<AbstractC2233n<Model, ?>> list) {
                this.f7562a = list;
            }
        }

        /* renamed from: a */
        public <Model> List<AbstractC2233n<Model, ?>> mo10607a(Class<Model> cls) {
            C2238a<?> aVar = this.f7561a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f7562a;
        }

        /* renamed from: a */
        public <Model> void mo10609a(Class<Model> cls, List<AbstractC2233n<Model, ?>> list) {
            if (this.f7561a.put(cls, new C2238a<>(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    /* renamed from: b */
    private static <A> Class<A> m9614b(A a) {
        return (Class<A>) a.getClass();
    }

    public C2236p(Pools.AbstractC0839a<List<Throwable>> aVar) {
        this(new C2241r(aVar));
    }

    /* renamed from: a */
    public synchronized List<Class<?>> mo10602a(Class<?> cls) {
        return this.f7559a.mo10615b(cls);
    }

    private C2236p(C2241r rVar) {
        this.f7560b = new C2237a();
        this.f7559a = rVar;
    }

    /* renamed from: a */
    private <Model, Data> void m9613a(List<AbstractC2235o<? extends Model, ? extends Data>> list) {
        for (AbstractC2235o<? extends Model, ? extends Data> oVar : list) {
            oVar.mo10539a();
        }
    }

    /* renamed from: b */
    private synchronized <A> List<AbstractC2233n<A, ?>> m9615b(Class<A> cls) {
        List<AbstractC2233n<A, ?>> a;
        a = this.f7560b.mo10607a(cls);
        if (a == null) {
            a = Collections.unmodifiableList(this.f7559a.mo10611a(cls));
            this.f7560b.mo10609a(cls, a);
        }
        return a;
    }

    /* renamed from: a */
    public <A> List<AbstractC2233n<A, ?>> mo10603a(A a) {
        List<AbstractC2233n<A, ?>> b = m9615b((Class) m9614b((Object) a));
        if (!b.isEmpty()) {
            int size = b.size();
            List<AbstractC2233n<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                AbstractC2233n<A, ?> nVar = b.get(i);
                if (nVar.mo10536a(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new Registry.NoModelLoaderAvailableException(a, b);
        }
        throw new Registry.NoModelLoaderAvailableException(a);
    }

    /* renamed from: b */
    public synchronized <Model, Data> void mo10605b(Class<Model> cls, Class<Data> cls2, AbstractC2235o<? extends Model, ? extends Data> oVar) {
        this.f7559a.mo10616b(cls, cls2, oVar);
        this.f7560b.mo10608a();
    }

    /* renamed from: c */
    public synchronized <Model, Data> void mo10606c(Class<Model> cls, Class<Data> cls2, AbstractC2235o<? extends Model, ? extends Data> oVar) {
        m9613a((List) this.f7559a.mo10617c(cls, cls2, oVar));
        this.f7560b.mo10608a();
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo10604a(Class<Model> cls, Class<Data> cls2, AbstractC2235o<? extends Model, ? extends Data> oVar) {
        this.f7559a.mo10613a(cls, cls2, oVar);
        this.f7560b.mo10608a();
    }
}
