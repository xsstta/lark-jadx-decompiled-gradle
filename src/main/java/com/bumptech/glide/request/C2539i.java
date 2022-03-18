package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C2123e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.C2360k;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.p091b.C2401a;
import com.bumptech.glide.request.p095a.AbstractC2521i;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2531c;
import com.bumptech.glide.util.C2563f;
import com.bumptech.glide.util.C2568k;
import com.bumptech.glide.util.p097a.AbstractC2554c;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.request.i */
public final class C2539i<R> implements AbstractC2521i, AbstractC2533d, AbstractC2538h {

    /* renamed from: a */
    private static final boolean f8221a = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private int f8222A;

    /* renamed from: B */
    private int f8223B;

    /* renamed from: C */
    private boolean f8224C;

    /* renamed from: D */
    private RuntimeException f8225D;

    /* renamed from: b */
    private final String f8226b;

    /* renamed from: c */
    private final AbstractC2554c f8227c;

    /* renamed from: d */
    private final Object f8228d;

    /* renamed from: e */
    private final AbstractC2536f<R> f8229e;

    /* renamed from: f */
    private final RequestCoordinator f8230f;

    /* renamed from: g */
    private final Context f8231g;

    /* renamed from: h */
    private final C2123e f8232h;

    /* renamed from: i */
    private final Object f8233i;

    /* renamed from: j */
    private final Class<R> f8234j;

    /* renamed from: k */
    private final AbstractC2510a<?> f8235k;

    /* renamed from: l */
    private final int f8236l;

    /* renamed from: m */
    private final int f8237m;

    /* renamed from: n */
    private final Priority f8238n;

    /* renamed from: o */
    private final AbstractC2522j<R> f8239o;

    /* renamed from: p */
    private final List<AbstractC2536f<R>> f8240p;

    /* renamed from: q */
    private final AbstractC2531c<? super R> f8241q;

    /* renamed from: r */
    private final Executor f8242r;

    /* renamed from: s */
    private AbstractC2383u<R> f8243s;

    /* renamed from: t */
    private C2360k.C2366d f8244t;

    /* renamed from: u */
    private long f8245u;

    /* renamed from: v */
    private volatile C2360k f8246v;

    /* renamed from: w */
    private EnumC2540a f8247w;

    /* renamed from: x */
    private Drawable f8248x;

    /* renamed from: y */
    private Drawable f8249y;

    /* renamed from: z */
    private Drawable f8250z;

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.request.i$a */
    public enum EnumC2540a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bumptech.glide.request.i<R> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: com.bumptech.glide.load.engine.k */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.bumptech.glide.load.engine.u, com.bumptech.glide.load.engine.u<R>, com.bumptech.glide.load.engine.k$d] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r5.f8246v.mo10842a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bumptech.glide.request.AbstractC2538h
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11214a(com.bumptech.glide.load.engine.AbstractC2383u<?> r6, com.bumptech.glide.load.DataSource r7) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C2539i.mo11214a(com.bumptech.glide.load.engine.u, com.bumptech.glide.load.DataSource):void");
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: a */
    public boolean mo11196a(AbstractC2533d dVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        AbstractC2510a<?> aVar;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        AbstractC2510a<?> aVar2;
        Priority priority2;
        int size2;
        if (!(dVar instanceof C2539i)) {
            return false;
        }
        synchronized (this.f8228d) {
            i = this.f8236l;
            i2 = this.f8237m;
            obj = this.f8233i;
            cls = this.f8234j;
            aVar = this.f8235k;
            priority = this.f8238n;
            List<AbstractC2536f<R>> list = this.f8240p;
            size = list != null ? list.size() : 0;
        }
        C2539i iVar = (C2539i) dVar;
        synchronized (iVar.f8228d) {
            i3 = iVar.f8236l;
            i4 = iVar.f8237m;
            obj2 = iVar.f8233i;
            cls2 = iVar.f8234j;
            aVar2 = iVar.f8235k;
            priority2 = iVar.f8238n;
            List<AbstractC2536f<R>> list2 = iVar.f8240p;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && C2568k.m10917b(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && priority == priority2 && size == size2;
    }

    /* renamed from: s */
    private void m10811s() {
        RequestCoordinator requestCoordinator = this.f8230f;
        if (requestCoordinator != null) {
            requestCoordinator.mo11104e(this);
        }
    }

    /* renamed from: t */
    private void m10812t() {
        RequestCoordinator requestCoordinator = this.f8230f;
        if (requestCoordinator != null) {
            requestCoordinator.mo11105f(this);
        }
    }

    @Override // com.bumptech.glide.request.AbstractC2538h
    /* renamed from: h */
    public Object mo11215h() {
        this.f8227c.mo11228b();
        return this.f8228d;
    }

    /* renamed from: j */
    private void m10802j() {
        if (this.f8224C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: o */
    private boolean m10807o() {
        RequestCoordinator requestCoordinator = this.f8230f;
        if (requestCoordinator == null || requestCoordinator.mo11101b(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private boolean m10808p() {
        RequestCoordinator requestCoordinator = this.f8230f;
        if (requestCoordinator == null || requestCoordinator.mo11103d(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean m10809q() {
        RequestCoordinator requestCoordinator = this.f8230f;
        if (requestCoordinator == null || requestCoordinator.mo11102c(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m10801i() {
        m10802j();
        this.f8227c.mo11228b();
        this.f8239o.mo11176b(this);
        C2360k.C2366d dVar = this.f8244t;
        if (dVar != null) {
            dVar.mo10847a();
            this.f8244t = null;
        }
    }

    /* renamed from: r */
    private boolean m10810r() {
        RequestCoordinator requestCoordinator = this.f8230f;
        if (requestCoordinator == null || !requestCoordinator.mo11107h().mo11106g()) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: c */
    public void mo11198c() {
        synchronized (this.f8228d) {
            if (mo11199d()) {
                mo11197b();
            }
        }
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: d */
    public boolean mo11199d() {
        boolean z;
        synchronized (this.f8228d) {
            if (this.f8247w != EnumC2540a.RUNNING) {
                if (this.f8247w != EnumC2540a.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: e */
    public boolean mo11200e() {
        boolean z;
        synchronized (this.f8228d) {
            if (this.f8247w == EnumC2540a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: f */
    public boolean mo11201f() {
        boolean z;
        synchronized (this.f8228d) {
            if (this.f8247w == EnumC2540a.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: g */
    public boolean mo11106g() {
        boolean z;
        synchronized (this.f8228d) {
            if (this.f8247w == EnumC2540a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: k */
    private Drawable m10803k() {
        if (this.f8248x == null) {
            Drawable v = this.f8235k.mo11165v();
            this.f8248x = v;
            if (v == null && this.f8235k.mo11166w() > 0) {
                this.f8248x = m10796a(this.f8235k.mo11166w());
            }
        }
        return this.f8248x;
    }

    /* renamed from: l */
    private Drawable m10804l() {
        if (this.f8249y == null) {
            Drawable y = this.f8235k.mo11168y();
            this.f8249y = y;
            if (y == null && this.f8235k.mo11167x() > 0) {
                this.f8249y = m10796a(this.f8235k.mo11167x());
            }
        }
        return this.f8249y;
    }

    /* renamed from: m */
    private Drawable m10805m() {
        if (this.f8250z == null) {
            Drawable A = this.f8235k.mo11109A();
            this.f8250z = A;
            if (A == null && this.f8235k.mo11169z() > 0) {
                this.f8250z = m10796a(this.f8235k.mo11169z());
            }
        }
        return this.f8250z;
    }

    /* renamed from: n */
    private void m10806n() {
        if (m10809q()) {
            Drawable drawable = null;
            if (this.f8233i == null) {
                drawable = m10805m();
            }
            if (drawable == null) {
                drawable = m10803k();
            }
            if (drawable == null) {
                drawable = m10804l();
            }
            this.f8239o.mo10444b(drawable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r4.f8246v.mo10842a((com.bumptech.glide.load.engine.AbstractC2383u<?>) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11197b() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f8228d
            monitor-enter(r0)
            r4.m10802j()     // Catch:{ all -> 0x003b }
            com.bumptech.glide.util.a.c r1 = r4.f8227c     // Catch:{ all -> 0x003b }
            r1.mo11228b()     // Catch:{ all -> 0x003b }
            com.bumptech.glide.request.i$a r1 = r4.f8247w     // Catch:{ all -> 0x003b }
            com.bumptech.glide.request.i$a r2 = com.bumptech.glide.request.C2539i.EnumC2540a.CLEARED     // Catch:{ all -> 0x003b }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x0013:
            r4.m10801i()     // Catch:{ all -> 0x003b }
            com.bumptech.glide.load.engine.u<R> r1 = r4.f8243s     // Catch:{ all -> 0x003b }
            r2 = 0
            if (r1 == 0) goto L_0x001e
            r4.f8243s = r2     // Catch:{ all -> 0x003b }
            goto L_0x001f
        L_0x001e:
            r1 = r2
        L_0x001f:
            boolean r2 = r4.m10808p()     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x002e
            com.bumptech.glide.request.a.j<R> r2 = r4.f8239o     // Catch:{ all -> 0x003b }
            android.graphics.drawable.Drawable r3 = r4.m10804l()     // Catch:{ all -> 0x003b }
            r2.mo11036a(r3)     // Catch:{ all -> 0x003b }
        L_0x002e:
            com.bumptech.glide.request.i$a r2 = com.bumptech.glide.request.C2539i.EnumC2540a.CLEARED     // Catch:{ all -> 0x003b }
            r4.f8247w = r2     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x003a
            com.bumptech.glide.load.engine.k r0 = r4.f8246v
            r0.mo10842a(r1)
        L_0x003a:
            return
        L_0x003b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C2539i.mo11197b():void");
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: a */
    public void mo11194a() {
        int i;
        synchronized (this.f8228d) {
            m10802j();
            this.f8227c.mo11228b();
            this.f8245u = C2563f.m10880a();
            if (this.f8233i == null) {
                if (C2568k.m10911a(this.f8236l, this.f8237m)) {
                    this.f8222A = this.f8236l;
                    this.f8223B = this.f8237m;
                }
                if (m10805m() == null) {
                    i = 5;
                } else {
                    i = 3;
                }
                m10798a(new GlideException("Received null model"), i);
            } else if (this.f8247w == EnumC2540a.RUNNING) {
                throw new IllegalArgumentException("Cannot restart a running request");
            } else if (this.f8247w == EnumC2540a.COMPLETE) {
                mo11214a((AbstractC2383u<?>) this.f8243s, DataSource.MEMORY_CACHE);
            } else {
                this.f8247w = EnumC2540a.WAITING_FOR_SIZE;
                if (C2568k.m10911a(this.f8236l, this.f8237m)) {
                    mo11187a(this.f8236l, this.f8237m);
                } else {
                    this.f8239o.mo11175a((AbstractC2521i) this);
                }
                if ((this.f8247w == EnumC2540a.RUNNING || this.f8247w == EnumC2540a.WAITING_FOR_SIZE) && m10809q()) {
                    this.f8239o.mo11172c(m10804l());
                }
                if (f8221a) {
                    m10800a("finished run method in " + C2563f.m10879a(this.f8245u));
                }
            }
        }
    }

    @Override // com.bumptech.glide.request.AbstractC2538h
    /* renamed from: a */
    public void mo11213a(GlideException glideException) {
        m10798a(glideException, 5);
    }

    /* renamed from: a */
    private Drawable m10796a(int i) {
        Resources.Theme theme;
        if (this.f8235k.mo11110B() != null) {
            theme = this.f8235k.mo11110B();
        } else {
            theme = this.f8231g.getTheme();
        }
        return C2401a.m10161a(this.f8232h, i, theme);
    }

    /* renamed from: a */
    private void m10800a(String str) {
        Log.v("Request", str + " this: " + this.f8226b);
    }

    /* renamed from: a */
    private static int m10795a(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return i;
        }
        return Math.round(f * ((float) i));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m10798a(GlideException glideException, int i) {
        boolean z;
        this.f8227c.mo11228b();
        synchronized (this.f8228d) {
            glideException.setOrigin(this.f8225D);
            int e = this.f8232h.mo10383e();
            if (e <= i) {
                Log.w("Glide", "Load failed for " + this.f8233i + " with size [" + this.f8222A + "x" + this.f8223B + "]", glideException);
                if (e <= 4) {
                    glideException.logRootCauses("Glide");
                }
            }
            this.f8244t = null;
            this.f8247w = EnumC2540a.FAILED;
            boolean z2 = true;
            this.f8224C = true;
            try {
                List<AbstractC2536f<R>> list = this.f8240p;
                if (list != null) {
                    z = false;
                    for (AbstractC2536f<R> fVar : list) {
                        z |= fVar.mo11204a(glideException, this.f8233i, this.f8239o, m10810r());
                    }
                } else {
                    z = false;
                }
                AbstractC2536f<R> fVar2 = this.f8229e;
                if (fVar2 == null || !fVar2.mo11204a(glideException, this.f8233i, this.f8239o, m10810r())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    m10806n();
                }
                this.f8224C = false;
                m10812t();
            } catch (Throwable th) {
                this.f8224C = false;
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2521i
    /* renamed from: a */
    public void mo11187a(int i, int i2) {
        Object obj;
        this.f8227c.mo11228b();
        Object obj2 = this.f8228d;
        synchronized (obj2) {
            try {
                boolean z = f8221a;
                if (z) {
                    m10800a("Got onSizeReady in " + C2563f.m10879a(this.f8245u));
                }
                if (this.f8247w == EnumC2540a.WAITING_FOR_SIZE) {
                    this.f8247w = EnumC2540a.RUNNING;
                    float J = this.f8235k.mo11118J();
                    this.f8222A = m10795a(i, J);
                    this.f8223B = m10795a(i2, J);
                    if (z) {
                        m10800a("finished setup for calling load in " + C2563f.m10879a(this.f8245u));
                    }
                    obj = obj2;
                    try {
                        this.f8244t = this.f8246v.mo10838a(this.f8232h, this.f8233i, this.f8235k.mo11112D(), this.f8222A, this.f8223B, this.f8235k.mo11163t(), this.f8234j, this.f8238n, this.f8235k.mo11164u(), this.f8235k.mo11160q(), this.f8235k.mo11161r(), this.f8235k.mo11119K(), this.f8235k.mo11162s(), this.f8235k.mo11111C(), this.f8235k.mo11120L(), this.f8235k.mo11121M(), this.f8235k.mo11122N(), this, this.f8242r);
                        if (this.f8247w != EnumC2540a.RUNNING) {
                            this.f8244t = null;
                        }
                        if (z) {
                            m10800a("finished onSizeReady in " + C2563f.m10879a(this.f8245u));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m10799a(AbstractC2383u<R> uVar, R r, DataSource dataSource) {
        boolean z;
        boolean r2 = m10810r();
        this.f8247w = EnumC2540a.COMPLETE;
        this.f8243s = uVar;
        if (this.f8232h.mo10383e() <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + dataSource + " for " + this.f8233i + " with size [" + this.f8222A + "x" + this.f8223B + "] in " + C2563f.m10879a(this.f8245u) + " ms");
        }
        boolean z2 = true;
        this.f8224C = true;
        try {
            List<AbstractC2536f<R>> list = this.f8240p;
            if (list != null) {
                z = false;
                for (AbstractC2536f<R> fVar : list) {
                    z |= fVar.mo11205a(r, this.f8233i, this.f8239o, dataSource, r2);
                }
            } else {
                z = false;
            }
            AbstractC2536f<R> fVar2 = this.f8229e;
            if (fVar2 == null || !fVar2.mo11205a(r, this.f8233i, this.f8239o, dataSource, r2)) {
                z2 = false;
            }
            if (!z2 && !z) {
                this.f8239o.mo10442a(r, this.f8241q.mo11203a(dataSource, r2));
            }
            this.f8224C = false;
            m10811s();
        } catch (Throwable th) {
            this.f8224C = false;
            throw th;
        }
    }

    /* renamed from: a */
    public static <R> C2539i<R> m10797a(Context context, C2123e eVar, Object obj, Object obj2, Class<R> cls, AbstractC2510a<?> aVar, int i, int i2, Priority priority, AbstractC2522j<R> jVar, AbstractC2536f<R> fVar, List<AbstractC2536f<R>> list, RequestCoordinator requestCoordinator, C2360k kVar, AbstractC2531c<? super R> cVar, Executor executor) {
        return new C2539i<>(context, eVar, obj, obj2, cls, aVar, i, i2, priority, jVar, fVar, list, requestCoordinator, kVar, cVar, executor);
    }

    private C2539i(Context context, C2123e eVar, Object obj, Object obj2, Class<R> cls, AbstractC2510a<?> aVar, int i, int i2, Priority priority, AbstractC2522j<R> jVar, AbstractC2536f<R> fVar, List<AbstractC2536f<R>> list, RequestCoordinator requestCoordinator, C2360k kVar, AbstractC2531c<? super R> cVar, Executor executor) {
        String str;
        if (f8221a) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.f8226b = str;
        this.f8227c = AbstractC2554c.m10866a();
        this.f8228d = obj;
        this.f8231g = context;
        this.f8232h = eVar;
        this.f8233i = obj2;
        this.f8234j = cls;
        this.f8235k = aVar;
        this.f8236l = i;
        this.f8237m = i2;
        this.f8238n = priority;
        this.f8239o = jVar;
        this.f8229e = fVar;
        this.f8240p = list;
        this.f8230f = requestCoordinator;
        this.f8246v = kVar;
        this.f8241q = cVar;
        this.f8242r = executor;
        this.f8247w = EnumC2540a.PENDING;
        if (this.f8225D == null && eVar.mo10385g()) {
            this.f8225D = new RuntimeException("Glide request origin trace");
        }
    }
}
