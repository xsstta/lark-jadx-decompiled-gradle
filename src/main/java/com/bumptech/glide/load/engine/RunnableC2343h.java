package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C2123e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.AbstractC2392h;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.AbstractC2340f;
import com.bumptech.glide.load.engine.C2352i;
import com.bumptech.glide.load.engine.p088b.AbstractC2302a;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p083a.AbstractC2149e;
import com.bumptech.glide.load.resource.bitmap.C2434k;
import com.bumptech.glide.util.C2563f;
import com.bumptech.glide.util.p097a.AbstractC2554c;
import com.bumptech.glide.util.p097a.C2545a;
import com.bumptech.glide.util.p097a.C2553b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.h */
public class RunnableC2343h<R> implements AbstractC2340f.AbstractC2341a, C2545a.AbstractC2551c, Comparable<RunnableC2343h<?>>, Runnable {

    /* renamed from: A */
    private DataSource f7762A;

    /* renamed from: B */
    private AbstractC2147d<?> f7763B;

    /* renamed from: C */
    private volatile AbstractC2340f f7764C;

    /* renamed from: D */
    private volatile boolean f7765D;

    /* renamed from: E */
    private volatile boolean f7766E;

    /* renamed from: a */
    private final C2342g<R> f7767a = new C2342g<>();

    /* renamed from: b */
    private final List<Throwable> f7768b = new ArrayList();

    /* renamed from: c */
    private final AbstractC2554c f7769c = AbstractC2554c.m10866a();

    /* renamed from: d */
    private final AbstractC2348d f7770d;

    /* renamed from: e */
    private final Pools.AbstractC0839a<RunnableC2343h<?>> f7771e;

    /* renamed from: f */
    private final C2347c<?> f7772f = new C2347c<>();

    /* renamed from: g */
    private final C2349e f7773g = new C2349e();

    /* renamed from: h */
    private C2123e f7774h;

    /* renamed from: i */
    private AbstractC2265c f7775i;

    /* renamed from: j */
    private Priority f7776j;

    /* renamed from: k */
    private C2374n f7777k;

    /* renamed from: l */
    private int f7778l;

    /* renamed from: m */
    private int f7779m;

    /* renamed from: n */
    private AbstractC2354j f7780n;

    /* renamed from: o */
    private C2390f f7781o;

    /* renamed from: p */
    private AbstractC2345a<R> f7782p;

    /* renamed from: q */
    private int f7783q;

    /* renamed from: r */
    private EnumC2351g f7784r;

    /* renamed from: s */
    private EnumC2350f f7785s;

    /* renamed from: t */
    private long f7786t;

    /* renamed from: u */
    private boolean f7787u;

    /* renamed from: v */
    private Object f7788v;

    /* renamed from: w */
    private Thread f7789w;

    /* renamed from: x */
    private AbstractC2265c f7790x;

    /* renamed from: y */
    private AbstractC2265c f7791y;

    /* renamed from: z */
    private Object f7792z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.h$a */
    public interface AbstractC2345a<R> {
        /* renamed from: a */
        void mo10819a(GlideException glideException);

        /* renamed from: a */
        void mo10820a(RunnableC2343h<?> hVar);

        /* renamed from: a */
        void mo10821a(AbstractC2383u<R> uVar, DataSource dataSource);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.h$d */
    public interface AbstractC2348d {
        /* renamed from: a */
        AbstractC2302a mo10827a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.h$f */
    public enum EnumC2350f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.h$g */
    public enum EnumC2351g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.h$c */
    public static class C2347c<Z> {

        /* renamed from: a */
        private AbstractC2265c f7798a;

        /* renamed from: b */
        private AbstractC2392h<Z> f7799b;

        /* renamed from: c */
        private C2381t<Z> f7800c;

        C2347c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo10826b() {
            this.f7798a = null;
            this.f7799b = null;
            this.f7800c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo10825a() {
            if (this.f7800c != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10824a(AbstractC2348d dVar, C2390f fVar) {
            C2553b.m10863a("DecodeJob.encode");
            try {
                dVar.mo10827a().mo10723a(this.f7798a, new C2339e(this.f7799b, this.f7800c, fVar));
            } finally {
                this.f7800c.mo10890a();
                C2553b.m10862a();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bumptech.glide.load.h<X> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bumptech.glide.load.engine.t<X> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <X> void mo10823a(AbstractC2265c cVar, AbstractC2392h<X> hVar, C2381t<X> tVar) {
            this.f7798a = cVar;
            this.f7799b = hVar;
            this.f7800c = tVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.h$e */
    public static class C2349e {

        /* renamed from: a */
        private boolean f7801a;

        /* renamed from: b */
        private boolean f7802b;

        /* renamed from: c */
        private boolean f7803c;

        C2349e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized boolean mo10828a() {
            this.f7802b = true;
            return m9999b(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized boolean mo10830b() {
            this.f7803c = true;
            return m9999b(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized void mo10831c() {
            this.f7802b = false;
            this.f7801a = false;
            this.f7803c = false;
        }

        /* renamed from: b */
        private boolean m9999b(boolean z) {
            if ((this.f7803c || z || this.f7802b) && this.f7801a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized boolean mo10829a(boolean z) {
            this.f7801a = true;
            return m9999b(z);
        }
    }

    @Override // com.bumptech.glide.util.p097a.C2545a.AbstractC2551c
    public AbstractC2554c e_() {
        return this.f7769c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public RunnableC2343h<R> mo10812a(C2123e eVar, Object obj, C2374n nVar, AbstractC2265c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, AbstractC2354j jVar, Map<Class<?>, AbstractC2393i<?>> map, boolean z, boolean z2, boolean z3, C2390f fVar, AbstractC2345a<R> aVar, int i3) {
        this.f7767a.mo10790a(eVar, obj, cVar, i, i2, jVar, cls, cls2, priority, fVar, map, z, z2, this.f7770d);
        this.f7774h = eVar;
        this.f7775i = cVar;
        this.f7776j = priority;
        this.f7777k = nVar;
        this.f7778l = i;
        this.f7779m = i2;
        this.f7780n = jVar;
        this.f7787u = z3;
        this.f7781o = fVar;
        this.f7782p = aVar;
        this.f7783q = i3;
        this.f7785s = EnumC2350f.INITIALIZE;
        this.f7788v = obj;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10815a() {
        EnumC2351g a = m9962a(EnumC2351g.INITIALIZE);
        return a == EnumC2351g.RESOURCE_CACHE || a == EnumC2351g.DATA_CACHE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10814a(boolean z) {
        if (this.f7773g.mo10829a(z)) {
            m9973g();
        }
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2340f.AbstractC2341a
    /* renamed from: a */
    public void mo10785a(AbstractC2265c cVar, Object obj, AbstractC2147d<?> dVar, DataSource dataSource, AbstractC2265c cVar2) {
        this.f7790x = cVar;
        this.f7792z = obj;
        this.f7763B = dVar;
        this.f7762A = dataSource;
        this.f7791y = cVar2;
        if (Thread.currentThread() != this.f7789w) {
            this.f7785s = EnumC2350f.DECODE_DATA;
            this.f7782p.mo10820a((RunnableC2343h<?>) this);
            return;
        }
        C2553b.m10863a("DecodeJob.decodeFromRetrievedData");
        try {
            m9980n();
        } finally {
            C2553b.m10862a();
        }
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2340f.AbstractC2341a
    /* renamed from: a */
    public void mo10784a(AbstractC2265c cVar, Exception exc, AbstractC2147d<?> dVar, DataSource dataSource) {
        dVar.mo10489b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(cVar, dataSource, dVar.mo10481a());
        this.f7768b.add(glideException);
        if (Thread.currentThread() != this.f7789w) {
            this.f7785s = EnumC2350f.SWITCH_TO_SOURCE_SERVICE;
            this.f7782p.mo10820a((RunnableC2343h<?>) this);
            return;
        }
        m9977k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <Z> AbstractC2383u<Z> mo10813a(DataSource dataSource, AbstractC2383u<Z> uVar) {
        AbstractC2393i<Z> iVar;
        AbstractC2383u<Z> uVar2;
        EncodeStrategy encodeStrategy;
        AbstractC2265c cVar;
        Class<?> cls = uVar.mo10878d().getClass();
        AbstractC2392h hVar = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            AbstractC2393i<Z> c = this.f7767a.mo10798c(cls);
            iVar = c;
            uVar2 = c.mo10631a(this.f7774h, uVar, this.f7778l, this.f7779m);
        } else {
            uVar2 = uVar;
            iVar = null;
        }
        if (!uVar.equals(uVar2)) {
            uVar.mo10880f();
        }
        if (this.f7767a.mo10792a((AbstractC2383u<?>) uVar2)) {
            hVar = this.f7767a.mo10796b(uVar2);
            encodeStrategy = hVar.mo10905a(this.f7781o);
        } else {
            encodeStrategy = EncodeStrategy.NONE;
        }
        if (!this.f7780n.mo10836a(!this.f7767a.mo10791a(this.f7790x), dataSource, encodeStrategy)) {
            return uVar2;
        }
        if (hVar != null) {
            int i = C23441.f7795c[encodeStrategy.ordinal()];
            if (i == 1) {
                cVar = new C2338d(this.f7790x, this.f7775i);
            } else if (i == 2) {
                cVar = new C2385w(this.f7767a.mo10804i(), this.f7790x, this.f7775i, this.f7778l, this.f7779m, iVar, cls, this.f7781o);
            } else {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
            }
            C2381t a = C2381t.m10098a(uVar2);
            this.f7772f.mo10823a(cVar, hVar, a);
            return a;
        }
        throw new Registry.NoResultEncoderAvailableException(uVar2.mo10878d().getClass());
    }

    /* renamed from: h */
    private int m9974h() {
        return this.f7776j.ordinal();
    }

    /* renamed from: e */
    private void m9971e() {
        if (this.f7773g.mo10828a()) {
            m9973g();
        }
    }

    /* renamed from: f */
    private void m9972f() {
        if (this.f7773g.mo10830b()) {
            m9973g();
        }
    }

    /* renamed from: b */
    public void mo10816b() {
        this.f7766E = true;
        AbstractC2340f fVar = this.f7764C;
        if (fVar != null) {
            fVar.mo10760b();
        }
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2340f.AbstractC2341a
    /* renamed from: c */
    public void mo10786c() {
        this.f7785s = EnumC2350f.SWITCH_TO_SOURCE_SERVICE;
        this.f7782p.mo10820a((RunnableC2343h<?>) this);
    }

    /* renamed from: l */
    private void m9978l() {
        m9979m();
        this.f7782p.mo10819a(new GlideException("Failed to load resource", new ArrayList(this.f7768b)));
        m9972f();
    }

    /* renamed from: g */
    private void m9973g() {
        this.f7773g.mo10831c();
        this.f7772f.mo10826b();
        this.f7767a.mo10789a();
        this.f7765D = false;
        this.f7774h = null;
        this.f7775i = null;
        this.f7781o = null;
        this.f7776j = null;
        this.f7777k = null;
        this.f7782p = null;
        this.f7784r = null;
        this.f7764C = null;
        this.f7789w = null;
        this.f7790x = null;
        this.f7792z = null;
        this.f7762A = null;
        this.f7763B = null;
        this.f7786t = 0;
        this.f7766E = false;
        this.f7788v = null;
        this.f7768b.clear();
        this.f7771e.release(this);
    }

    /* renamed from: m */
    private void m9979m() {
        Throwable th;
        this.f7769c.mo11228b();
        if (this.f7765D) {
            if (this.f7768b.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f7768b;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f7765D = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.h$1 */
    public static /* synthetic */ class C23441 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7793a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7794b;

        /* renamed from: c */
        static final /* synthetic */ int[] f7795c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.RunnableC2343h.C23441.<clinit>():void");
        }
    }

    /* renamed from: i */
    private void m9975i() {
        int i = C23441.f7793a[this.f7785s.ordinal()];
        if (i == 1) {
            this.f7784r = m9962a(EnumC2351g.INITIALIZE);
            this.f7764C = m9976j();
            m9977k();
        } else if (i == 2) {
            m9977k();
        } else if (i == 3) {
            m9980n();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f7785s);
        }
    }

    /* renamed from: j */
    private AbstractC2340f m9976j() {
        int i = C23441.f7794b[this.f7784r.ordinal()];
        if (i == 1) {
            return new C2384v(this.f7767a, this);
        }
        if (i == 2) {
            return new C2327c(this.f7767a, this);
        }
        if (i == 3) {
            return new C2388y(this.f7767a, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f7784r);
    }

    /* renamed from: k */
    private void m9977k() {
        this.f7789w = Thread.currentThread();
        this.f7786t = C2563f.m10880a();
        boolean z = false;
        while (!this.f7766E && this.f7764C != null && !(z = this.f7764C.mo10759a())) {
            this.f7784r = m9962a(this.f7784r);
            this.f7764C = m9976j();
            if (this.f7784r == EnumC2351g.SOURCE) {
                mo10786c();
                return;
            }
        }
        if ((this.f7784r == EnumC2351g.FINISHED || this.f7766E) && !z) {
            m9978l();
        }
    }

    /* renamed from: n */
    private void m9980n() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f7786t;
            m9969a("Retrieved data", j, "data: " + this.f7792z + ", cache key: " + this.f7790x + ", fetcher: " + this.f7763B);
        }
        AbstractC2383u<R> uVar = null;
        try {
            uVar = m9963a(this.f7763B, this.f7792z, this.f7762A);
        } catch (GlideException e) {
            e.setLoggingDetails(this.f7791y, this.f7762A);
            this.f7768b.add(e);
        }
        if (uVar != null) {
            m9970b(uVar, this.f7762A);
        } else {
            m9977k();
        }
    }

    public void run() {
        C2553b.m10864a("DecodeJob#run(model=%s)", this.f7788v);
        AbstractC2147d<?> dVar = this.f7763B;
        try {
            if (this.f7766E) {
                m9978l();
                if (dVar != null) {
                    dVar.mo10489b();
                }
                C2553b.m10862a();
                return;
            }
            m9975i();
            if (dVar != null) {
                dVar.mo10489b();
            }
            C2553b.m10862a();
        } catch (C2301b e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo10489b();
            }
            C2553b.m10862a();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.h$b */
    public final class C2346b<Z> implements C2352i.AbstractC2353a<Z> {

        /* renamed from: b */
        private final DataSource f7797b;

        @Override // com.bumptech.glide.load.engine.C2352i.AbstractC2353a
        /* renamed from: a */
        public AbstractC2383u<Z> mo10822a(AbstractC2383u<Z> uVar) {
            return RunnableC2343h.this.mo10813a(this.f7797b, uVar);
        }

        C2346b(DataSource dataSource) {
            this.f7797b = dataSource;
        }
    }

    /* renamed from: a */
    private EnumC2351g m9962a(EnumC2351g gVar) {
        int i = C23441.f7794b[gVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return EnumC2351g.FINISHED;
                }
                if (i != 5) {
                    throw new IllegalArgumentException("Unrecognized stage: " + gVar);
                } else if (this.f7780n.mo10834a()) {
                    return EnumC2351g.RESOURCE_CACHE;
                } else {
                    return m9962a(EnumC2351g.RESOURCE_CACHE);
                }
            } else if (this.f7787u) {
                return EnumC2351g.FINISHED;
            } else {
                return EnumC2351g.SOURCE;
            }
        } else if (this.f7780n.mo10837b()) {
            return EnumC2351g.DATA_CACHE;
        } else {
            return m9962a(EnumC2351g.DATA_CACHE);
        }
    }

    /* renamed from: a */
    private C2390f m9966a(DataSource dataSource) {
        boolean z;
        C2390f fVar = this.f7781o;
        if (Build.VERSION.SDK_INT < 26) {
            return fVar;
        }
        if (dataSource == DataSource.RESOURCE_DISK_CACHE || this.f7767a.mo10808m()) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = (Boolean) fVar.mo10900a(C2434k.f7989e);
        if (bool != null && (!bool.booleanValue() || z)) {
            return fVar;
        }
        C2390f fVar2 = new C2390f();
        fVar2.mo10901a(this.f7781o);
        fVar2.mo10899a(C2434k.f7989e, Boolean.valueOf(z));
        return fVar2;
    }

    /* renamed from: a */
    public int compareTo(RunnableC2343h<?> hVar) {
        int h = m9974h() - hVar.m9974h();
        if (h == 0) {
            return this.f7783q - hVar.f7783q;
        }
        return h;
    }

    /* renamed from: a */
    private void m9968a(String str, long j) {
        m9969a(str, j, (String) null);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.bumptech.glide.load.engine.s<Data, ?, R>, com.bumptech.glide.load.engine.s<Data, ResourceType, R> */
    /* renamed from: a */
    private <Data> AbstractC2383u<R> m9964a(Data data, DataSource dataSource) throws GlideException {
        return m9965a(data, dataSource, (C2380s<Data, ?, R>) this.f7767a.mo10795b(data.getClass()));
    }

    /* renamed from: a */
    private void m9967a(AbstractC2383u<R> uVar, DataSource dataSource) {
        m9979m();
        this.f7782p.mo10821a(uVar, dataSource);
    }

    RunnableC2343h(AbstractC2348d dVar, Pools.AbstractC0839a<RunnableC2343h<?>> aVar) {
        this.f7770d = dVar;
        this.f7771e = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.bumptech.glide.load.engine.t */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.bumptech.glide.load.engine.t */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.bumptech.glide.load.engine.t */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private void m9970b(AbstractC2383u<R> uVar, DataSource dataSource) {
        if (uVar instanceof AbstractC2378q) {
            ((AbstractC2378q) uVar).mo10884a();
        }
        C2381t tVar = 0;
        if (this.f7772f.mo10825a()) {
            uVar = C2381t.m10098a(uVar);
            tVar = uVar;
        }
        m9967a((AbstractC2383u) uVar, dataSource);
        this.f7784r = EnumC2351g.ENCODE;
        try {
            if (this.f7772f.mo10825a()) {
                this.f7772f.mo10824a(this.f7770d, this.f7781o);
            }
            m9971e();
        } finally {
            if (tVar != 0) {
                tVar.mo10890a();
            }
        }
    }

    /* renamed from: a */
    private <Data> AbstractC2383u<R> m9963a(AbstractC2147d<?> dVar, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            dVar.mo10489b();
            return null;
        }
        try {
            long a = C2563f.m10880a();
            AbstractC2383u<R> a2 = m9964a((Object) data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m9968a("Decoded result " + a2, a);
            }
            return a2;
        } finally {
            dVar.mo10489b();
        }
    }

    /* renamed from: a */
    private <Data, ResourceType> AbstractC2383u<R> m9965a(Data data, DataSource dataSource, C2380s<Data, ResourceType, R> sVar) throws GlideException {
        C2390f a = m9966a(dataSource);
        AbstractC2149e<Data> b = this.f7774h.mo10382d().mo10314b((Object) data);
        try {
            return sVar.mo10888a(b, a, this.f7778l, this.f7779m, new C2346b(dataSource));
        } finally {
            b.mo10505b();
        }
    }

    /* renamed from: a */
    private void m9969a(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C2563f.m10879a(j));
        sb.append(", load key: ");
        sb.append(this.f7777k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }
}
