package com.bumptech.glide.p081b;

import com.bumptech.glide.load.AbstractC2391g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.b.e */
public class C2111e {

    /* renamed from: a */
    private final List<String> f7287a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C2112a<?, ?>>> f7288b = new HashMap();

    /* renamed from: a */
    private synchronized List<C2112a<?, ?>> m9128a(String str) {
        List<C2112a<?, ?>> list;
        if (!this.f7287a.contains(str)) {
            this.f7287a.add(str);
        }
        list = this.f7288b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f7288b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized void mo10342a(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f7287a);
        this.f7287a.clear();
        for (String str : list) {
            this.f7287a.add(str);
        }
        for (String str2 : arrayList) {
            if (!list.contains(str2)) {
                this.f7287a.add(str2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.b.e$a */
    public static class C2112a<T, R> {

        /* renamed from: a */
        final Class<R> f7289a;

        /* renamed from: b */
        final AbstractC2391g<T, R> f7290b;

        /* renamed from: c */
        private final Class<T> f7291c;

        /* renamed from: a */
        public boolean mo10345a(Class<?> cls, Class<?> cls2) {
            if (!this.f7291c.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.f7289a)) {
                return false;
            }
            return true;
        }

        public C2112a(Class<T> cls, Class<R> cls2, AbstractC2391g<T, R> gVar) {
            this.f7291c = cls;
            this.f7289a = cls2;
            this.f7290b = gVar;
        }
    }

    /* renamed from: a */
    public synchronized <T, R> List<AbstractC2391g<T, R>> mo10340a(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f7287a) {
            List<C2112a<?, ?>> list = this.f7288b.get(str);
            if (list != null) {
                for (C2112a<?, ?> aVar : list) {
                    if (aVar.mo10345a(cls, cls2)) {
                        arrayList.add(aVar.f7290b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized <T, R> List<Class<R>> mo10343b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f7287a) {
            List<C2112a<?, ?>> list = this.f7288b.get(str);
            if (list != null) {
                for (C2112a<?, ?> aVar : list) {
                    if (aVar.mo10345a(cls, cls2) && !arrayList.contains(aVar.f7289a)) {
                        arrayList.add(aVar.f7289a);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo10341a(String str, AbstractC2391g<T, R> gVar, Class<T> cls, Class<R> cls2) {
        m9128a(str).add(new C2112a<>(cls, cls2, gVar));
    }

    /* renamed from: b */
    public synchronized <T, R> void mo10344b(String str, AbstractC2391g<T, R> gVar, Class<T> cls, Class<R> cls2) {
        m9128a(str).add(0, new C2112a<>(cls, cls2, gVar));
    }
}
