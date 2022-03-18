package com.bumptech.glide.load.p083a;

import com.bumptech.glide.load.p083a.AbstractC2149e;
import com.bumptech.glide.util.C2567j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.a.f */
public class C2151f {

    /* renamed from: b */
    private static final AbstractC2149e.AbstractC2150a<?> f7448b = new AbstractC2149e.AbstractC2150a<Object>() {
        /* class com.bumptech.glide.load.p083a.C2151f.C21521 */

        @Override // com.bumptech.glide.load.p083a.AbstractC2149e.AbstractC2150a
        /* renamed from: a */
        public Class<Object> mo10507a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2149e.AbstractC2150a
        /* renamed from: a */
        public AbstractC2149e<Object> mo10506a(Object obj) {
            return new C2153a(obj);
        }
    };

    /* renamed from: a */
    private final Map<Class<?>, AbstractC2149e.AbstractC2150a<?>> f7449a = new HashMap();

    /* renamed from: com.bumptech.glide.load.a.f$a */
    private static final class C2153a implements AbstractC2149e<Object> {

        /* renamed from: a */
        private final Object f7450a;

        @Override // com.bumptech.glide.load.p083a.AbstractC2149e
        /* renamed from: b */
        public void mo10505b() {
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2149e
        /* renamed from: a */
        public Object mo10504a() {
            return this.f7450a;
        }

        C2153a(Object obj) {
            this.f7450a = obj;
        }
    }

    /* renamed from: a */
    public synchronized void mo10509a(AbstractC2149e.AbstractC2150a<?> aVar) {
        this.f7449a.put(aVar.mo10507a(), aVar);
    }

    /* renamed from: a */
    public synchronized <T> AbstractC2149e<T> mo10508a(T t) {
        AbstractC2149e.AbstractC2150a<?> aVar;
        C2567j.m10894a((Object) t);
        aVar = this.f7449a.get(t.getClass());
        if (aVar == null) {
            Iterator<AbstractC2149e.AbstractC2150a<?>> it = this.f7449a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC2149e.AbstractC2150a<?> next = it.next();
                if (next.mo10507a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f7448b;
        }
        return (AbstractC2149e<T>) aVar.mo10506a(t);
    }
}
