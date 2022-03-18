package com.bumptech.glide.util.p097a;

import android.util.Log;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.util.a.a */
public final class C2545a {

    /* renamed from: a */
    private static final AbstractC2552d<Object> f8265a = new AbstractC2552d<Object>() {
        /* class com.bumptech.glide.util.p097a.C2545a.C25461 */

        @Override // com.bumptech.glide.util.p097a.C2545a.AbstractC2552d
        /* renamed from: a */
        public void mo11224a(Object obj) {
        }
    };

    /* renamed from: com.bumptech.glide.util.a.a$a */
    public interface AbstractC2549a<T> {
        /* renamed from: b */
        T mo10754b();
    }

    /* renamed from: com.bumptech.glide.util.a.a$c */
    public interface AbstractC2551c {
        AbstractC2554c e_();
    }

    /* renamed from: com.bumptech.glide.util.a.a$d */
    public interface AbstractC2552d<T> {
        /* renamed from: a */
        void mo11224a(T t);
    }

    /* renamed from: b */
    private static <T> AbstractC2552d<T> m10854b() {
        return (AbstractC2552d<T>) f8265a;
    }

    /* renamed from: a */
    public static <T> Pools.AbstractC0839a<List<T>> m10849a() {
        return m10850a(20);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.util.a.a$b */
    public static final class C2550b<T> implements Pools.AbstractC0839a<T> {

        /* renamed from: a */
        private final AbstractC2549a<T> f8266a;

        /* renamed from: b */
        private final AbstractC2552d<T> f8267b;

        /* renamed from: c */
        private final Pools.AbstractC0839a<T> f8268c;

        @Override // androidx.core.util.Pools.AbstractC0839a
        public T acquire() {
            T acquire = this.f8268c.acquire();
            if (acquire == null) {
                acquire = this.f8266a.mo10754b();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + acquire.getClass());
                }
            }
            if (acquire instanceof AbstractC2551c) {
                acquire.e_().mo11227a(false);
            }
            return acquire;
        }

        @Override // androidx.core.util.Pools.AbstractC0839a
        public boolean release(T t) {
            if (t instanceof AbstractC2551c) {
                t.e_().mo11227a(true);
            }
            this.f8267b.mo11224a(t);
            return this.f8268c.release(t);
        }

        C2550b(Pools.AbstractC0839a<T> aVar, AbstractC2549a<T> aVar2, AbstractC2552d<T> dVar) {
            this.f8268c = aVar;
            this.f8266a = aVar2;
            this.f8267b = dVar;
        }
    }

    /* renamed from: a */
    public static <T> Pools.AbstractC0839a<List<T>> m10850a(int i) {
        return m10853a(new Pools.SynchronizedPool(i), new AbstractC2549a<List<T>>() {
            /* class com.bumptech.glide.util.p097a.C2545a.C25472 */

            /* renamed from: a */
            public List<T> mo10754b() {
                return new ArrayList();
            }
        }, new AbstractC2552d<List<T>>() {
            /* class com.bumptech.glide.util.p097a.C2545a.C25483 */

            /* renamed from: a */
            public void mo11224a(List<T> list) {
                list.clear();
            }
        });
    }

    /* renamed from: a */
    public static <T extends AbstractC2551c> Pools.AbstractC0839a<T> m10851a(int i, AbstractC2549a<T> aVar) {
        return m10852a(new Pools.SynchronizedPool(i), aVar);
    }

    /* renamed from: a */
    private static <T extends AbstractC2551c> Pools.AbstractC0839a<T> m10852a(Pools.AbstractC0839a<T> aVar, AbstractC2549a<T> aVar2) {
        return m10853a(aVar, aVar2, m10854b());
    }

    /* renamed from: a */
    private static <T> Pools.AbstractC0839a<T> m10853a(Pools.AbstractC0839a<T> aVar, AbstractC2549a<T> aVar2, AbstractC2552d<T> dVar) {
        return new C2550b(aVar, aVar2, dVar);
    }
}
