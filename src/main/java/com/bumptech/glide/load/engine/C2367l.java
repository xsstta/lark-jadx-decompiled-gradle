package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C2376p;
import com.bumptech.glide.load.engine.RunnableC2343h;
import com.bumptech.glide.load.engine.p089c.ExecutorServiceC2328a;
import com.bumptech.glide.request.AbstractC2538h;
import com.bumptech.glide.util.C2560e;
import com.bumptech.glide.util.C2567j;
import com.bumptech.glide.util.p097a.AbstractC2554c;
import com.bumptech.glide.util.p097a.C2545a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.l */
public class C2367l<R> implements RunnableC2343h.AbstractC2345a<R>, C2545a.AbstractC2551c {

    /* renamed from: e */
    private static final C2370c f7842e = new C2370c();

    /* renamed from: a */
    final C2372e f7843a;

    /* renamed from: b */
    DataSource f7844b;

    /* renamed from: c */
    GlideException f7845c;

    /* renamed from: d */
    C2376p<?> f7846d;

    /* renamed from: f */
    private final AbstractC2554c f7847f;

    /* renamed from: g */
    private final C2376p.AbstractC2377a f7848g;

    /* renamed from: h */
    private final Pools.AbstractC0839a<C2367l<?>> f7849h;

    /* renamed from: i */
    private final C2370c f7850i;

    /* renamed from: j */
    private final AbstractC2373m f7851j;

    /* renamed from: k */
    private final ExecutorServiceC2328a f7852k;

    /* renamed from: l */
    private final ExecutorServiceC2328a f7853l;

    /* renamed from: m */
    private final ExecutorServiceC2328a f7854m;

    /* renamed from: n */
    private final ExecutorServiceC2328a f7855n;

    /* renamed from: o */
    private final AtomicInteger f7856o;

    /* renamed from: p */
    private AbstractC2265c f7857p;

    /* renamed from: q */
    private boolean f7858q;

    /* renamed from: r */
    private boolean f7859r;

    /* renamed from: s */
    private boolean f7860s;

    /* renamed from: t */
    private boolean f7861t;

    /* renamed from: u */
    private AbstractC2383u<?> f7862u;

    /* renamed from: v */
    private boolean f7863v;

    /* renamed from: w */
    private boolean f7864w;

    /* renamed from: x */
    private RunnableC2343h<R> f7865x;

    /* renamed from: y */
    private volatile boolean f7866y;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.l$c */
    public static class C2370c {
        C2370c() {
        }

        /* renamed from: a */
        public <R> C2376p<R> mo10862a(AbstractC2383u<R> uVar, boolean z, AbstractC2265c cVar, C2376p.AbstractC2377a aVar) {
            return new C2376p<>(uVar, z, true, cVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10852a() {
        return this.f7861t;
    }

    @Override // com.bumptech.glide.util.p097a.C2545a.AbstractC2551c
    public AbstractC2554c e_() {
        return this.f7847f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.l$d */
    public static final class C2371d {

        /* renamed from: a */
        final AbstractC2538h f7871a;

        /* renamed from: b */
        final Executor f7872b;

        public int hashCode() {
            return this.f7871a.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2371d) {
                return this.f7871a.equals(((C2371d) obj).f7871a);
            }
            return false;
        }

        C2371d(AbstractC2538h hVar, Executor executor) {
            this.f7871a = hVar;
            this.f7872b = executor;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.l$e */
    public static final class C2372e implements Iterable<C2371d> {

        /* renamed from: a */
        private final List<C2371d> f7873a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo10867a() {
            return this.f7873a.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo10868b() {
            return this.f7873a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo10870c() {
            this.f7873a.clear();
        }

        @Override // java.lang.Iterable
        public Iterator<C2371d> iterator() {
            return this.f7873a.iterator();
        }

        C2372e() {
            this(new ArrayList(2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C2372e mo10871d() {
            return new C2372e(new ArrayList(this.f7873a));
        }

        C2372e(List<C2371d> list) {
            this.f7873a = list;
        }

        /* renamed from: c */
        private static C2371d m10071c(AbstractC2538h hVar) {
            return new C2371d(hVar, C2560e.m10878b());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10865a(AbstractC2538h hVar) {
            this.f7873a.remove(m10071c(hVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo10869b(AbstractC2538h hVar) {
            return this.f7873a.contains(m10071c(hVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10866a(AbstractC2538h hVar, Executor executor) {
            this.f7873a.add(new C2371d(hVar, executor));
        }
    }

    /* renamed from: g */
    private ExecutorServiceC2328a m10052g() {
        if (this.f7859r) {
            return this.f7854m;
        }
        if (this.f7860s) {
            return this.f7855n;
        }
        return this.f7853l;
    }

    /* renamed from: h */
    private boolean m10053h() {
        if (this.f7864w || this.f7863v || this.f7866y) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10853b() {
        if (!m10053h()) {
            this.f7866y = true;
            this.f7865x.mo10816b();
            this.f7851j.mo10840a(this, this.f7857p);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.l$a */
    public class RunnableC2368a implements Runnable {

        /* renamed from: b */
        private final AbstractC2538h f7868b;

        public void run() {
            synchronized (this.f7868b.mo11215h()) {
                synchronized (C2367l.this) {
                    if (C2367l.this.f7843a.mo10869b(this.f7868b)) {
                        C2367l.this.mo10855b(this.f7868b);
                    }
                    C2367l.this.mo10858e();
                }
            }
        }

        RunnableC2368a(AbstractC2538h hVar) {
            this.f7868b = hVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.l$b */
    public class RunnableC2369b implements Runnable {

        /* renamed from: b */
        private final AbstractC2538h f7870b;

        public void run() {
            synchronized (this.f7870b.mo11215h()) {
                synchronized (C2367l.this) {
                    if (C2367l.this.f7843a.mo10869b(this.f7870b)) {
                        C2367l.this.f7846d.mo10881g();
                        C2367l.this.mo10850a(this.f7870b);
                        C2367l.this.mo10857c(this.f7870b);
                    }
                    C2367l.this.mo10858e();
                }
            }
        }

        RunnableC2369b(AbstractC2538h hVar) {
            this.f7870b = hVar;
        }
    }

    /* renamed from: i */
    private synchronized void m10054i() {
        if (this.f7857p != null) {
            this.f7843a.mo10870c();
            this.f7857p = null;
            this.f7846d = null;
            this.f7862u = null;
            this.f7864w = false;
            this.f7866y = false;
            this.f7863v = false;
            this.f7865x.mo10814a(false);
            this.f7865x = null;
            this.f7845c = null;
            this.f7844b = null;
            this.f7849h.release(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10858e() {
        boolean z;
        C2376p<?> pVar;
        synchronized (this) {
            this.f7847f.mo11228b();
            C2567j.m10898a(m10053h(), "Not yet complete!");
            int decrementAndGet = this.f7856o.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            C2567j.m10898a(z, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.f7846d;
                m10054i();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.mo10882h();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f7851j.mo10841a(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.f7872b.execute(new com.bumptech.glide.load.engine.C2367l.RunnableC2369b(r5, r1.f7871a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo10858e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10856c() {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2367l.mo10856c():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f7851j.mo10841a(r4, r1, null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f7872b.execute(new com.bumptech.glide.load.engine.C2367l.RunnableC2368a(r4, r1.f7871a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo10858e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10859f() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2367l.mo10859f():void");
    }

    @Override // com.bumptech.glide.load.engine.RunnableC2343h.AbstractC2345a
    /* renamed from: a */
    public void mo10820a(RunnableC2343h<?> hVar) {
        m10052g().execute(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10855b(AbstractC2538h hVar) {
        try {
            hVar.mo11213a(this.f7845c);
        } catch (Throwable th) {
            throw new C2301b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo10849a(int i) {
        C2376p<?> pVar;
        C2567j.m10898a(m10053h(), "Not yet complete!");
        if (this.f7856o.getAndAdd(i) == 0 && (pVar = this.f7846d) != null) {
            pVar.mo10881g();
        }
    }

    @Override // com.bumptech.glide.load.engine.RunnableC2343h.AbstractC2345a
    /* renamed from: a */
    public void mo10819a(GlideException glideException) {
        synchronized (this) {
            this.f7845c = glideException;
        }
        mo10859f();
    }

    /* renamed from: b */
    public synchronized void mo10854b(RunnableC2343h<R> hVar) {
        ExecutorServiceC2328a aVar;
        this.f7865x = hVar;
        if (hVar.mo10815a()) {
            aVar = this.f7852k;
        } else {
            aVar = m10052g();
        }
        aVar.execute(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo10857c(AbstractC2538h hVar) {
        boolean z;
        this.f7847f.mo11228b();
        this.f7843a.mo10865a(hVar);
        if (this.f7843a.mo10867a()) {
            mo10853b();
            if (!this.f7863v) {
                if (!this.f7864w) {
                    z = false;
                    if (z && this.f7856o.get() == 0) {
                        m10054i();
                    }
                }
            }
            z = true;
            m10054i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10850a(AbstractC2538h hVar) {
        try {
            hVar.mo11214a(this.f7846d, this.f7844b);
        } catch (Throwable th) {
            throw new C2301b(th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bumptech.glide.load.engine.u<R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.RunnableC2343h.AbstractC2345a
    /* renamed from: a */
    public void mo10821a(AbstractC2383u<R> uVar, DataSource dataSource) {
        synchronized (this) {
            this.f7862u = uVar;
            this.f7844b = dataSource;
        }
        mo10856c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo10851a(AbstractC2538h hVar, Executor executor) {
        this.f7847f.mo11228b();
        this.f7843a.mo10866a(hVar, executor);
        if (this.f7863v) {
            mo10849a(1);
            executor.execute(new RunnableC2369b(hVar));
        } else if (this.f7864w) {
            mo10849a(1);
            executor.execute(new RunnableC2368a(hVar));
        } else if (this.f7866y) {
            Log.m165383e("EngineJob", "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C2367l<R> mo10848a(AbstractC2265c cVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f7857p = cVar;
        this.f7858q = z;
        this.f7859r = z2;
        this.f7860s = z3;
        this.f7861t = z4;
        return this;
    }

    C2367l(ExecutorServiceC2328a aVar, ExecutorServiceC2328a aVar2, ExecutorServiceC2328a aVar3, ExecutorServiceC2328a aVar4, AbstractC2373m mVar, C2376p.AbstractC2377a aVar5, Pools.AbstractC0839a<C2367l<?>> aVar6) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, aVar6, f7842e);
    }

    C2367l(ExecutorServiceC2328a aVar, ExecutorServiceC2328a aVar2, ExecutorServiceC2328a aVar3, ExecutorServiceC2328a aVar4, AbstractC2373m mVar, C2376p.AbstractC2377a aVar5, Pools.AbstractC0839a<C2367l<?>> aVar6, C2370c cVar) {
        this.f7843a = new C2372e();
        this.f7847f = AbstractC2554c.m10866a();
        this.f7856o = new AtomicInteger();
        this.f7852k = aVar;
        this.f7853l = aVar2;
        this.f7854m = aVar3;
        this.f7855n = aVar4;
        this.f7851j = mVar;
        this.f7848g = aVar5;
        this.f7849h = aVar6;
        this.f7850i = cVar;
    }
}
