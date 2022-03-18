package com.ss.android.lark.passport.infra.util.collection;

import androidx.core.util.Pools;
import com.ss.android.lark.passport.infra.util.collection.AbstractC49181c;
import com.ss.android.lark.passport.infra.util.collection.C49176a;

/* renamed from: com.ss.android.lark.passport.infra.util.collection.b */
public class C49178b extends C49176a<AbstractC49181c.AbstractC49182a, AbstractC49181c, C49180a> {

    /* renamed from: a */
    private static final Pools.SynchronizedPool<C49180a> f123465a = new Pools.SynchronizedPool<>(10);

    /* renamed from: b */
    private static final C49176a.AbstractC49177a<AbstractC49181c.AbstractC49182a, AbstractC49181c, C49180a> f123466b = new C49176a.AbstractC49177a<AbstractC49181c.AbstractC49182a, AbstractC49181c, C49180a>() {
        /* class com.ss.android.lark.passport.infra.util.collection.C49178b.C491791 */

        /* renamed from: a */
        public void mo171677a(AbstractC49181c.AbstractC49182a aVar, AbstractC49181c cVar, int i, C49180a aVar2) {
            if (i == 1) {
                aVar.mo171684a(cVar, aVar2.f123467a, aVar2.f123468b);
            } else if (i == 2) {
                aVar.mo171686b(cVar, aVar2.f123467a, aVar2.f123468b);
            } else if (i == 3) {
                aVar.mo171685a(cVar, aVar2.f123467a, aVar2.f123469c, aVar2.f123468b);
            } else if (i != 4) {
                aVar.mo171683a(cVar);
            } else {
                aVar.mo171687c(cVar, aVar2.f123467a, aVar2.f123468b);
            }
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.passport.infra.util.collection.b$a */
    public static class C49180a {

        /* renamed from: a */
        public int f123467a;

        /* renamed from: b */
        public int f123468b;

        /* renamed from: c */
        public int f123469c;

        C49180a() {
        }
    }

    public C49178b() {
        super(f123466b);
    }

    /* renamed from: a */
    public void mo171678a(AbstractC49181c cVar, int i, int i2) {
        mo171674a(cVar, 1, m193907a(i, 0, i2));
    }

    /* renamed from: b */
    public void mo171680b(AbstractC49181c cVar, int i, int i2) {
        mo171674a(cVar, 2, m193907a(i, 0, i2));
    }

    /* renamed from: c */
    public void mo171681c(AbstractC49181c cVar, int i, int i2) {
        mo171674a(cVar, 4, m193907a(i, 0, i2));
    }

    /* renamed from: a */
    private static C49180a m193907a(int i, int i2, int i3) {
        C49180a acquire = f123465a.acquire();
        if (acquire == null) {
            acquire = new C49180a();
        }
        acquire.f123467a = i;
        acquire.f123469c = i2;
        acquire.f123468b = i3;
        return acquire;
    }

    /* renamed from: a */
    public synchronized void mo171674a(AbstractC49181c cVar, int i, C49180a aVar) {
        super.mo171674a((Object) cVar, i, (Object) aVar);
        if (aVar != null) {
            f123465a.release(aVar);
        }
    }
}
