package com.bumptech.glide.p081b;

import com.bumptech.glide.load.AbstractC2392h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.b.f */
public class C2113f {

    /* renamed from: a */
    private final List<C2114a<?>> f7292a = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.b.f$a */
    public static final class C2114a<T> {

        /* renamed from: a */
        final AbstractC2392h<T> f7293a;

        /* renamed from: b */
        private final Class<T> f7294b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo10349a(Class<?> cls) {
            return this.f7294b.isAssignableFrom(cls);
        }

        C2114a(Class<T> cls, AbstractC2392h<T> hVar) {
            this.f7294b = cls;
            this.f7293a = hVar;
        }
    }

    /* JADX DEBUG: Type inference failed for r5v3. Raw type applied. Possible types: com.bumptech.glide.load.h<T>, com.bumptech.glide.load.h<Z> */
    /* renamed from: a */
    public synchronized <Z> AbstractC2392h<Z> mo10346a(Class<Z> cls) {
        int size = this.f7292a.size();
        for (int i = 0; i < size; i++) {
            C2114a<?> aVar = this.f7292a.get(i);
            if (aVar.mo10349a(cls)) {
                return (AbstractC2392h<T>) aVar.f7293a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized <Z> void mo10347a(Class<Z> cls, AbstractC2392h<Z> hVar) {
        this.f7292a.add(new C2114a<>(cls, hVar));
    }

    /* renamed from: b */
    public synchronized <Z> void mo10348b(Class<Z> cls, AbstractC2392h<Z> hVar) {
        this.f7292a.add(0, new C2114a<>(cls, hVar));
    }
}
