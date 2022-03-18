package com.bumptech.glide.load.p085b;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.util.C2567j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.r */
public class C2241r {

    /* renamed from: a */
    private static final C2244c f7572a = new C2244c();

    /* renamed from: b */
    private static final AbstractC2233n<Object, Object> f7573b = new C2242a();

    /* renamed from: c */
    private final List<C2243b<?, ?>> f7574c;

    /* renamed from: d */
    private final C2244c f7575d;

    /* renamed from: e */
    private final Set<C2243b<?, ?>> f7576e;

    /* renamed from: f */
    private final Pools.AbstractC0839a<List<Throwable>> f7577f;

    /* renamed from: com.bumptech.glide.load.b.r$a */
    private static class C2242a implements AbstractC2233n<Object, Object> {
        @Override // com.bumptech.glide.load.p085b.AbstractC2233n
        /* renamed from: a */
        public AbstractC2233n.C2234a<Object> mo10534a(Object obj, int i, int i2, C2390f fVar) {
            return null;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2233n
        /* renamed from: a */
        public boolean mo10536a(Object obj) {
            return false;
        }

        C2242a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.b.r$c */
    public static class C2244c {
        C2244c() {
        }

        /* renamed from: a */
        public <Model, Data> C2239q<Model, Data> mo10620a(List<AbstractC2233n<Model, Data>> list, Pools.AbstractC0839a<List<Throwable>> aVar) {
            return new C2239q<>(list, aVar);
        }
    }

    /* renamed from: a */
    private static <Model, Data> AbstractC2233n<Model, Data> m9634a() {
        return (AbstractC2233n<Model, Data>) f7573b;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.b.r$b */
    public static class C2243b<Model, Data> {

        /* renamed from: a */
        final Class<Data> f7578a;

        /* renamed from: b */
        final AbstractC2235o<? extends Model, ? extends Data> f7579b;

        /* renamed from: c */
        private final Class<Model> f7580c;

        /* renamed from: a */
        public boolean mo10618a(Class<?> cls) {
            return this.f7580c.isAssignableFrom(cls);
        }

        /* renamed from: a */
        public boolean mo10619a(Class<?> cls, Class<?> cls2) {
            if (!mo10618a(cls) || !this.f7578a.isAssignableFrom(cls2)) {
                return false;
            }
            return true;
        }

        public C2243b(Class<Model> cls, Class<Data> cls2, AbstractC2235o<? extends Model, ? extends Data> oVar) {
            this.f7580c = cls;
            this.f7578a = cls2;
            this.f7579b = oVar;
        }
    }

    public C2241r(Pools.AbstractC0839a<List<Throwable>> aVar) {
        this(aVar, f7572a);
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: com.bumptech.glide.load.b.o<? extends Model, ? extends Data>, com.bumptech.glide.load.b.o<Model, Data> */
    /* renamed from: a */
    private <Model, Data> AbstractC2235o<Model, Data> m9635a(C2243b<?, ?> bVar) {
        return (AbstractC2235o<? extends Model, ? extends Data>) bVar.f7579b;
    }

    /* renamed from: b */
    private <Model, Data> AbstractC2233n<Model, Data> m9637b(C2243b<?, ?> bVar) {
        return (AbstractC2233n) C2567j.m10894a(bVar.f7579b.mo10538a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized List<Class<?>> mo10615b(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C2243b<?, ?> bVar : this.f7574c) {
            if (!arrayList.contains(bVar.f7578a) && bVar.mo10618a(cls)) {
                arrayList.add(bVar.f7578a);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized <Model> List<AbstractC2233n<Model, ?>> mo10611a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C2243b<?, ?> bVar : this.f7574c) {
                if (!this.f7576e.contains(bVar)) {
                    if (bVar.mo10618a(cls)) {
                        this.f7576e.add(bVar);
                        arrayList.add(m9637b(bVar));
                        this.f7576e.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f7576e.clear();
            throw th;
        }
        return arrayList;
    }

    C2241r(Pools.AbstractC0839a<List<Throwable>> aVar, C2244c cVar) {
        this.f7574c = new ArrayList();
        this.f7576e = new HashSet();
        this.f7577f = aVar;
        this.f7575d = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized <Model, Data> List<AbstractC2235o<? extends Model, ? extends Data>> mo10612a(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<C2243b<?, ?>> it = this.f7574c.iterator();
        while (it.hasNext()) {
            C2243b<?, ?> next = it.next();
            if (next.mo10619a(cls, cls2)) {
                it.remove();
                arrayList.add(m9635a(next));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized <Model, Data> AbstractC2233n<Model, Data> mo10614b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C2243b<?, ?> bVar : this.f7574c) {
                if (this.f7576e.contains(bVar)) {
                    z = true;
                } else if (bVar.mo10619a(cls, cls2)) {
                    this.f7576e.add(bVar);
                    arrayList.add(m9637b(bVar));
                    this.f7576e.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f7575d.mo10620a(arrayList, this.f7577f);
            } else if (arrayList.size() == 1) {
                return (AbstractC2233n) arrayList.get(0);
            } else if (z) {
                return m9634a();
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f7576e.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized <Model, Data> void mo10613a(Class<Model> cls, Class<Data> cls2, AbstractC2235o<? extends Model, ? extends Data> oVar) {
        m9636a(cls, cls2, oVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized <Model, Data> List<AbstractC2235o<? extends Model, ? extends Data>> mo10617c(Class<Model> cls, Class<Data> cls2, AbstractC2235o<? extends Model, ? extends Data> oVar) {
        List<AbstractC2235o<? extends Model, ? extends Data>> a;
        a = mo10612a(cls, cls2);
        mo10613a(cls, cls2, oVar);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized <Model, Data> void mo10616b(Class<Model> cls, Class<Data> cls2, AbstractC2235o<? extends Model, ? extends Data> oVar) {
        m9636a(cls, cls2, oVar, false);
    }

    /* renamed from: a */
    private <Model, Data> void m9636a(Class<Model> cls, Class<Data> cls2, AbstractC2235o<? extends Model, ? extends Data> oVar, boolean z) {
        int i;
        C2243b<?, ?> bVar = new C2243b<>(cls, cls2, oVar);
        List<C2243b<?, ?>> list = this.f7574c;
        if (z) {
            i = list.size();
        } else {
            i = 0;
        }
        list.add(i, bVar);
    }
}
