package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C2123e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C2376p;
import com.bumptech.glide.load.engine.RunnableC2343h;
import com.bumptech.glide.load.engine.p088b.AbstractC2302a;
import com.bumptech.glide.load.engine.p088b.AbstractC2317i;
import com.bumptech.glide.load.engine.p088b.C2305b;
import com.bumptech.glide.load.engine.p089c.ExecutorServiceC2328a;
import com.bumptech.glide.request.AbstractC2538h;
import com.bumptech.glide.util.C2563f;
import com.bumptech.glide.util.C2567j;
import com.bumptech.glide.util.p097a.C2545a;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.load.engine.k */
public class C2360k implements AbstractC2317i.AbstractC2318a, AbstractC2373m, C2376p.AbstractC2377a {

    /* renamed from: a */
    private static final boolean f7816a = Log.isLoggable("Engine", 2);

    /* renamed from: b */
    private final C2379r f7817b;

    /* renamed from: c */
    private final C2375o f7818c;

    /* renamed from: d */
    private final AbstractC2317i f7819d;

    /* renamed from: e */
    private final C2363b f7820e;

    /* renamed from: f */
    private final C2386x f7821f;

    /* renamed from: g */
    private final C2365c f7822g;

    /* renamed from: h */
    private final C2361a f7823h;

    /* renamed from: i */
    private final C2271a f7824i;

    /* renamed from: a */
    public void mo10842a(AbstractC2383u<?> uVar) {
        if (uVar instanceof C2376p) {
            ((C2376p) uVar).mo10882h();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: com.bumptech.glide.load.engine.k$d */
    public class C2366d {

        /* renamed from: b */
        private final C2367l<?> f7840b;

        /* renamed from: c */
        private final AbstractC2538h f7841c;

        /* renamed from: a */
        public void mo10847a() {
            synchronized (C2360k.this) {
                this.f7840b.mo10857c(this.f7841c);
            }
        }

        C2366d(AbstractC2538h hVar, C2367l<?> lVar) {
            this.f7841c = hVar;
            this.f7840b = lVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$c */
    private static class C2365c implements RunnableC2343h.AbstractC2348d {

        /* renamed from: a */
        private final AbstractC2302a.AbstractC2303a f7837a;

        /* renamed from: b */
        private volatile AbstractC2302a f7838b;

        @Override // com.bumptech.glide.load.engine.RunnableC2343h.AbstractC2348d
        /* renamed from: a */
        public AbstractC2302a mo10827a() {
            if (this.f7838b == null) {
                synchronized (this) {
                    if (this.f7838b == null) {
                        this.f7838b = this.f7837a.mo10724a();
                    }
                    if (this.f7838b == null) {
                        this.f7838b = new C2305b();
                    }
                }
            }
            return this.f7838b;
        }

        C2365c(AbstractC2302a.AbstractC2303a aVar) {
            this.f7837a = aVar;
        }
    }

    @Override // com.bumptech.glide.load.engine.p088b.AbstractC2317i.AbstractC2318a
    /* renamed from: b */
    public void mo10740b(AbstractC2383u<?> uVar) {
        this.f7821f.mo10894a(uVar, true);
    }

    /* renamed from: a */
    private C2376p<?> m10033a(AbstractC2265c cVar) {
        C2376p<?> b = this.f7824i.mo10658b(cVar);
        if (b != null) {
            b.mo10881g();
        }
        return b;
    }

    /* renamed from: b */
    private C2376p<?> m10036b(AbstractC2265c cVar) {
        C2376p<?> c = m10037c(cVar);
        if (c != null) {
            c.mo10881g();
            this.f7824i.mo10655a(cVar, c);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.k$a */
    public static class C2361a {

        /* renamed from: a */
        final RunnableC2343h.AbstractC2348d f7825a;

        /* renamed from: b */
        final Pools.AbstractC0839a<RunnableC2343h<?>> f7826b = C2545a.m10851a(150, new C2545a.AbstractC2549a<RunnableC2343h<?>>() {
            /* class com.bumptech.glide.load.engine.C2360k.C2361a.C23621 */

            /* renamed from: a */
            public RunnableC2343h<?> mo10754b() {
                return new RunnableC2343h<>(C2361a.this.f7825a, C2361a.this.f7826b);
            }
        });

        /* renamed from: c */
        private int f7827c;

        C2361a(RunnableC2343h.AbstractC2348d dVar) {
            this.f7825a = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> RunnableC2343h<R> mo10843a(C2123e eVar, Object obj, C2374n nVar, AbstractC2265c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, AbstractC2354j jVar, Map<Class<?>, AbstractC2393i<?>> map, boolean z, boolean z2, boolean z3, C2390f fVar, RunnableC2343h.AbstractC2345a<R> aVar) {
            RunnableC2343h hVar = (RunnableC2343h) C2567j.m10894a(this.f7826b.acquire());
            int i3 = this.f7827c;
            this.f7827c = i3 + 1;
            return hVar.mo10812a(eVar, obj, nVar, cVar, i, i2, cls, cls2, priority, jVar, map, z, z2, z3, fVar, aVar, i3);
        }
    }

    /* renamed from: c */
    private C2376p<?> m10037c(AbstractC2265c cVar) {
        AbstractC2383u<?> a = this.f7819d.mo10734a(cVar);
        if (a == null) {
            return null;
        }
        if (a instanceof C2376p) {
            return (C2376p) a;
        }
        return new C2376p<>(a, true, true, cVar, this);
    }

    @Override // com.bumptech.glide.load.engine.C2376p.AbstractC2377a
    /* renamed from: a */
    public void mo10839a(AbstractC2265c cVar, C2376p<?> pVar) {
        this.f7824i.mo10654a(cVar);
        if (pVar.mo10876b()) {
            this.f7819d.mo10738b(cVar, pVar);
        } else {
            this.f7821f.mo10894a(pVar, false);
        }
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2373m
    /* renamed from: a */
    public synchronized void mo10840a(C2367l<?> lVar, AbstractC2265c cVar) {
        this.f7817b.mo10887b(cVar, lVar);
    }

    /* renamed from: a */
    private C2376p<?> m10034a(C2374n nVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        C2376p<?> a = m10033a(nVar);
        if (a != null) {
            if (f7816a) {
                m10035a("Loaded resource from active resources", j, nVar);
            }
            return a;
        }
        C2376p<?> b = m10036b(nVar);
        if (b == null) {
            return null;
        }
        if (f7816a) {
            m10035a("Loaded resource from cache", j, nVar);
        }
        return b;
    }

    /* renamed from: a */
    private static void m10035a(String str, long j, AbstractC2265c cVar) {
        Log.v("Engine", str + " in " + C2563f.m10879a(j) + "ms, key: " + cVar);
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2373m
    /* renamed from: a */
    public synchronized void mo10841a(C2367l<?> lVar, AbstractC2265c cVar, C2376p<?> pVar) {
        if (pVar != null) {
            if (pVar.mo10876b()) {
                this.f7824i.mo10655a(cVar, pVar);
            }
        }
        this.f7817b.mo10887b(cVar, lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.k$b */
    public static class C2363b {

        /* renamed from: a */
        final ExecutorServiceC2328a f7829a;

        /* renamed from: b */
        final ExecutorServiceC2328a f7830b;

        /* renamed from: c */
        final ExecutorServiceC2328a f7831c;

        /* renamed from: d */
        final ExecutorServiceC2328a f7832d;

        /* renamed from: e */
        final AbstractC2373m f7833e;

        /* renamed from: f */
        final C2376p.AbstractC2377a f7834f;

        /* renamed from: g */
        final Pools.AbstractC0839a<C2367l<?>> f7835g = C2545a.m10851a(150, new C2545a.AbstractC2549a<C2367l<?>>() {
            /* class com.bumptech.glide.load.engine.C2360k.C2363b.C23641 */

            /* renamed from: a */
            public C2367l<?> mo10754b() {
                return new C2367l<>(C2363b.this.f7829a, C2363b.this.f7830b, C2363b.this.f7831c, C2363b.this.f7832d, C2363b.this.f7833e, C2363b.this.f7834f, C2363b.this.f7835g);
            }
        });

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C2367l<R> mo10845a(AbstractC2265c cVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C2367l) C2567j.m10894a(this.f7835g.acquire())).mo10848a(cVar, z, z2, z3, z4);
        }

        C2363b(ExecutorServiceC2328a aVar, ExecutorServiceC2328a aVar2, ExecutorServiceC2328a aVar3, ExecutorServiceC2328a aVar4, AbstractC2373m mVar, C2376p.AbstractC2377a aVar5) {
            this.f7829a = aVar;
            this.f7830b = aVar2;
            this.f7831c = aVar3;
            this.f7832d = aVar4;
            this.f7833e = mVar;
            this.f7834f = aVar5;
        }
    }

    public C2360k(AbstractC2317i iVar, AbstractC2302a.AbstractC2303a aVar, ExecutorServiceC2328a aVar2, ExecutorServiceC2328a aVar3, ExecutorServiceC2328a aVar4, ExecutorServiceC2328a aVar5, boolean z) {
        this(iVar, aVar, aVar2, aVar3, aVar4, aVar5, null, null, null, null, null, null, z);
    }

    C2360k(AbstractC2317i iVar, AbstractC2302a.AbstractC2303a aVar, ExecutorServiceC2328a aVar2, ExecutorServiceC2328a aVar3, ExecutorServiceC2328a aVar4, ExecutorServiceC2328a aVar5, C2379r rVar, C2375o oVar, C2271a aVar6, C2363b bVar, C2361a aVar7, C2386x xVar, boolean z) {
        C2271a aVar8;
        C2375o oVar2;
        C2379r rVar2;
        C2363b bVar2;
        C2361a aVar9;
        C2386x xVar2;
        this.f7819d = iVar;
        C2365c cVar = new C2365c(aVar);
        this.f7822g = cVar;
        if (aVar6 == null) {
            aVar8 = new C2271a(z);
        } else {
            aVar8 = aVar6;
        }
        this.f7824i = aVar8;
        aVar8.mo10657a(this);
        if (oVar == null) {
            oVar2 = new C2375o();
        } else {
            oVar2 = oVar;
        }
        this.f7818c = oVar2;
        if (rVar == null) {
            rVar2 = new C2379r();
        } else {
            rVar2 = rVar;
        }
        this.f7817b = rVar2;
        if (bVar == null) {
            bVar2 = new C2363b(aVar2, aVar3, aVar4, aVar5, this, this);
        } else {
            bVar2 = bVar;
        }
        this.f7820e = bVar2;
        if (aVar7 == null) {
            aVar9 = new C2361a(cVar);
        } else {
            aVar9 = aVar7;
        }
        this.f7823h = aVar9;
        if (xVar == null) {
            xVar2 = new C2386x();
        } else {
            xVar2 = xVar;
        }
        this.f7821f = xVar2;
        iVar.mo10737a(this);
    }

    /* renamed from: a */
    public <R> C2366d mo10838a(C2123e eVar, Object obj, AbstractC2265c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, AbstractC2354j jVar, Map<Class<?>, AbstractC2393i<?>> map, boolean z, boolean z2, C2390f fVar, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC2538h hVar, Executor executor) {
        long j;
        if (f7816a) {
            j = C2563f.m10880a();
        } else {
            j = 0;
        }
        C2374n a = this.f7818c.mo10874a(obj, cVar, i, i2, map, cls, cls2, fVar);
        synchronized (this) {
            C2376p<?> a2 = m10034a(a, z3, j);
            if (a2 == null) {
                return m10032a(eVar, obj, cVar, i, i2, cls, cls2, priority, jVar, map, z, z2, fVar, z3, z4, z5, z6, hVar, executor, a, j);
            }
            hVar.mo11214a(a2, DataSource.MEMORY_CACHE);
            return null;
        }
    }

    /* renamed from: a */
    private <R> C2366d m10032a(C2123e eVar, Object obj, AbstractC2265c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, AbstractC2354j jVar, Map<Class<?>, AbstractC2393i<?>> map, boolean z, boolean z2, C2390f fVar, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC2538h hVar, Executor executor, C2374n nVar, long j) {
        C2367l<?> a = this.f7817b.mo10885a(nVar, z6);
        if (a != null) {
            a.mo10851a(hVar, executor);
            if (f7816a) {
                m10035a("Added to existing load", j, nVar);
            }
            return new C2366d(hVar, a);
        }
        C2367l<R> a2 = this.f7820e.mo10845a(nVar, z3, z4, z5, z6);
        RunnableC2343h<R> a3 = this.f7823h.mo10843a(eVar, obj, nVar, cVar, i, i2, cls, cls2, priority, jVar, map, z, z2, z6, fVar, a2);
        this.f7817b.mo10886a((AbstractC2265c) nVar, (C2367l<?>) a2);
        a2.mo10851a(hVar, executor);
        a2.mo10854b(a3);
        if (f7816a) {
            m10035a("Started new load", j, nVar);
        }
        return new C2366d(hVar, a2);
    }
}
