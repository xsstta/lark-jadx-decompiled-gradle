package com.bumptech.glide.load.engine;

import com.bumptech.glide.C2123e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.AbstractC2136a;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.AbstractC2392h;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.RunnableC2343h;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.load.engine.p088b.AbstractC2302a;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.resource.C2461c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.g */
public final class C2342g<Transcode> {

    /* renamed from: a */
    private final List<AbstractC2233n.C2234a<?>> f7744a = new ArrayList();

    /* renamed from: b */
    private final List<AbstractC2265c> f7745b = new ArrayList();

    /* renamed from: c */
    private C2123e f7746c;

    /* renamed from: d */
    private Object f7747d;

    /* renamed from: e */
    private int f7748e;

    /* renamed from: f */
    private int f7749f;

    /* renamed from: g */
    private Class<?> f7750g;

    /* renamed from: h */
    private RunnableC2343h.AbstractC2348d f7751h;

    /* renamed from: i */
    private C2390f f7752i;

    /* renamed from: j */
    private Map<Class<?>, AbstractC2393i<?>> f7753j;

    /* renamed from: k */
    private Class<Transcode> f7754k;

    /* renamed from: l */
    private boolean f7755l;

    /* renamed from: m */
    private boolean f7756m;

    /* renamed from: n */
    private AbstractC2265c f7757n;

    /* renamed from: o */
    private Priority f7758o;

    /* renamed from: p */
    private AbstractC2354j f7759p;

    /* renamed from: q */
    private boolean f7760q;

    /* renamed from: r */
    private boolean f7761r;

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC2354j mo10797c() {
        return this.f7759p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Priority mo10799d() {
        return this.f7758o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C2390f mo10800e() {
        return this.f7752i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC2265c mo10801f() {
        return this.f7757n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo10802g() {
        return this.f7748e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo10803h() {
        return this.f7749f;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.lang.Class<Transcode>, java.lang.Class<?> */
    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Class<?> mo10805j() {
        return (Class<Transcode>) this.f7754k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo10808m() {
        return this.f7761r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC2302a mo10794b() {
        return this.f7751h.mo10827a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public AbstractC2278b mo10804i() {
        return this.f7746c.mo10384f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Class<?> mo10806k() {
        return this.f7747d.getClass();
    }

    C2342g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public List<Class<?>> mo10807l() {
        return this.f7746c.mo10382d().mo10316b(this.f7747d.getClass(), this.f7750g, this.f7754k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10789a() {
        this.f7746c = null;
        this.f7747d = null;
        this.f7757n = null;
        this.f7750g = null;
        this.f7754k = null;
        this.f7752i = null;
        this.f7758o = null;
        this.f7753j = null;
        this.f7759p = null;
        this.f7744a.clear();
        this.f7755l = false;
        this.f7745b.clear();
        this.f7756m = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public List<AbstractC2233n.C2234a<?>> mo10809n() {
        if (!this.f7755l) {
            this.f7755l = true;
            this.f7744a.clear();
            List c = this.f7746c.mo10382d().mo10318c(this.f7747d);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                AbstractC2233n.C2234a<?> a = ((AbstractC2233n) c.get(i)).mo10534a(this.f7747d, this.f7748e, this.f7749f, this.f7752i);
                if (a != null) {
                    this.f7744a.add(a);
                }
            }
        }
        return this.f7744a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public List<AbstractC2265c> mo10810o() {
        if (!this.f7756m) {
            this.f7756m = true;
            this.f7745b.clear();
            List<AbstractC2233n.C2234a<?>> n = mo10809n();
            int size = n.size();
            for (int i = 0; i < size; i++) {
                AbstractC2233n.C2234a<?> aVar = n.get(i);
                if (!this.f7745b.contains(aVar.f7556a)) {
                    this.f7745b.add(aVar.f7556a);
                }
                for (int i2 = 0; i2 < aVar.f7557b.size(); i2++) {
                    if (!this.f7745b.contains(aVar.f7557b.get(i2))) {
                        this.f7745b.add(aVar.f7557b.get(i2));
                    }
                }
            }
        }
        return this.f7745b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <X> AbstractC2136a<X> mo10787a(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f7746c.mo10382d().mo10305a((Object) x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <Data> C2380s<Data, ?, Transcode> mo10795b(Class<Data> cls) {
        return this.f7746c.mo10382d().mo10306a(cls, this.f7750g, this.f7754k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<AbstractC2233n<File, ?>> mo10788a(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f7746c.mo10382d().mo10318c(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <Z> AbstractC2392h<Z> mo10796b(AbstractC2383u<Z> uVar) {
        return this.f7746c.mo10382d().mo10315b((AbstractC2383u) uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <Z> AbstractC2393i<Z> mo10798c(Class<Z> cls) {
        AbstractC2393i<Z> iVar = (AbstractC2393i<Z>) this.f7753j.get(cls);
        if (iVar == null) {
            Iterator<Map.Entry<Class<?>, AbstractC2393i<?>>> it = this.f7753j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, AbstractC2393i<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    iVar = (AbstractC2393i<Z>) next.getValue();
                    break;
                }
            }
        }
        if (iVar != null) {
            return iVar;
        }
        if (!this.f7753j.isEmpty() || !this.f7760q) {
            return C2461c.m10391a();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10791a(AbstractC2265c cVar) {
        List<AbstractC2233n.C2234a<?>> n = mo10809n();
        int size = n.size();
        for (int i = 0; i < size; i++) {
            if (n.get(i).f7556a.equals(cVar)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10792a(AbstractC2383u<?> uVar) {
        return this.f7746c.mo10382d().mo10308a(uVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10793a(Class<?> cls) {
        if (mo10795b(cls) != null) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.lang.Class<R> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <R> void mo10790a(C2123e eVar, Object obj, AbstractC2265c cVar, int i, int i2, AbstractC2354j jVar, Class<?> cls, Class<R> cls2, Priority priority, C2390f fVar, Map<Class<?>, AbstractC2393i<?>> map, boolean z, boolean z2, RunnableC2343h.AbstractC2348d dVar) {
        this.f7746c = eVar;
        this.f7747d = obj;
        this.f7757n = cVar;
        this.f7748e = i;
        this.f7749f = i2;
        this.f7759p = jVar;
        this.f7750g = cls;
        this.f7751h = dVar;
        this.f7754k = cls2;
        this.f7758o = priority;
        this.f7752i = fVar;
        this.f7753j = map;
        this.f7760q = z;
        this.f7761r = z2;
    }
}
