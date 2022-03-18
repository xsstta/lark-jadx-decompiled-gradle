package com.bumptech.glide.p081b;

import com.bumptech.glide.load.AbstractC2136a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.b.a */
public class C2106a {

    /* renamed from: a */
    private final List<C2107a<?>> f7278a = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.b.a$a */
    public static final class C2107a<T> {

        /* renamed from: a */
        final AbstractC2136a<T> f7279a;

        /* renamed from: b */
        private final Class<T> f7280b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo10332a(Class<?> cls) {
            return this.f7280b.isAssignableFrom(cls);
        }

        C2107a(Class<T> cls, AbstractC2136a<T> aVar) {
            this.f7280b = cls;
            this.f7279a = aVar;
        }
    }

    /* renamed from: a */
    public synchronized <T> AbstractC2136a<T> mo10330a(Class<T> cls) {
        for (C2107a<?> aVar : this.f7278a) {
            if (aVar.mo10332a(cls)) {
                return aVar.f7279a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized <T> void mo10331a(Class<T> cls, AbstractC2136a<T> aVar) {
        this.f7278a.add(new C2107a<>(cls, aVar));
    }
}
