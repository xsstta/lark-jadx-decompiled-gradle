package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.load.resource.p093d.C2468c;
import com.bumptech.glide.manager.AbstractC2492c;
import com.bumptech.glide.manager.AbstractC2494d;
import com.bumptech.glide.manager.AbstractC2499h;
import com.bumptech.glide.manager.AbstractC2500i;
import com.bumptech.glide.manager.AbstractC2505l;
import com.bumptech.glide.manager.C2506m;
import com.bumptech.glide.manager.C2509o;
import com.bumptech.glide.request.AbstractC2510a;
import com.bumptech.glide.request.AbstractC2533d;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.C2537g;
import com.bumptech.glide.request.p095a.AbstractC2514d;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.bumptech.glide.util.C2568k;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bumptech.glide.g */
public class ComponentCallbacks2C2126g implements ComponentCallbacks2, AbstractC2500i {

    /* renamed from: d */
    private static final C2537g f7360d = ((C2537g) C2537g.m10790b(Bitmap.class).mo11158o());

    /* renamed from: e */
    private static final C2537g f7361e = ((C2537g) C2537g.m10790b(C2468c.class).mo11158o());

    /* renamed from: f */
    private static final C2537g f7362f = ((C2537g) ((C2537g) C2537g.m10788b(AbstractC2354j.f7813c).mo11126a(Priority.LOW)).mo11145c(true));

    /* renamed from: a */
    protected final ComponentCallbacks2C2115c f7363a;

    /* renamed from: b */
    protected final Context f7364b;

    /* renamed from: c */
    final AbstractC2499h f7365c;

    /* renamed from: g */
    private final C2506m f7366g;

    /* renamed from: h */
    private final AbstractC2505l f7367h;

    /* renamed from: i */
    private final C2509o f7368i;

    /* renamed from: j */
    private final Runnable f7369j;

    /* renamed from: k */
    private final Handler f7370k;

    /* renamed from: l */
    private final AbstractC2492c f7371l;

    /* renamed from: m */
    private final CopyOnWriteArrayList<AbstractC2536f<Object>> f7372m;

    /* renamed from: n */
    private C2537g f7373n;

    /* renamed from: o */
    private boolean f7374o;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public List<AbstractC2536f<Object>> mo10435n() {
        return this.f7372m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo10419a(C2537g gVar) {
        this.f7373n = (C2537g) ((C2537g) gVar.clone()).mo11159p();
    }

    /* renamed from: a */
    public synchronized boolean mo10420a() {
        return this.f7366g.mo11082a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo10418a(AbstractC2522j<?> jVar, AbstractC2533d dVar) {
        this.f7368i.mo11098a(jVar);
        this.f7366g.mo11081a(dVar);
    }

    /* renamed from: k */
    public C2124f<Drawable> mo10432k() {
        return mo10412a(Drawable.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public synchronized C2537g mo10436o() {
        return this.f7373n;
    }

    /* renamed from: c */
    public synchronized void mo10424c() {
        this.f7366g.mo11085c();
    }

    /* renamed from: e */
    public synchronized void mo10426e() {
        this.f7366g.mo11086d();
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: f */
    public synchronized void mo10427f() {
        mo10426e();
        this.f7368i.mo10427f();
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: g */
    public synchronized void mo10428g() {
        mo10422b();
        this.f7368i.mo10428g();
    }

    /* renamed from: i */
    public C2124f<Bitmap> mo10430i() {
        return mo10412a(Bitmap.class).mo10391a((AbstractC2510a<?>) f7360d);
    }

    /* renamed from: j */
    public C2124f<C2468c> mo10431j() {
        return mo10412a(C2468c.class).mo10391a((AbstractC2510a<?>) f7361e);
    }

    /* renamed from: l */
    public C2124f<File> mo10433l() {
        return mo10412a(File.class).mo10391a((AbstractC2510a<?>) f7362f);
    }

    /* renamed from: m */
    public C2124f<File> mo10434m() {
        return mo10412a(File.class).mo10391a((AbstractC2510a<?>) C2537g.m10791d(true));
    }

    /* renamed from: b */
    public synchronized void mo10422b() {
        this.f7366g.mo11083b();
    }

    /* renamed from: d */
    public synchronized void mo10425d() {
        mo10424c();
        for (ComponentCallbacks2C2126g gVar : this.f7367h.mo11062a()) {
            gVar.mo10424c();
        }
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f7366g + ", treeNode=" + this.f7367h + "}";
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: h */
    public void mo10429h() {
        synchronized (this) {
            this.f7368i.mo10429h();
            for (AbstractC2522j<?> jVar : this.f7368i.mo11097a()) {
                mo10417a(jVar);
            }
            this.f7368i.mo11099b();
            this.f7366g.mo11087e();
            this.f7365c.mo11067b(this);
            this.f7365c.mo11067b(this.f7371l);
            this.f7370k.removeCallbacks(this.f7369j);
        }
        this.f7363a.mo10355b(this);
    }

    /* renamed from: com.bumptech.glide.g$a */
    private static class C2128a extends AbstractC2514d<View, Object> {
        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: a */
        public void mo10442a(Object obj, AbstractC2529b<? super Object> bVar) {
        }

        /* access modifiers changed from: protected */
        @Override // com.bumptech.glide.request.p095a.AbstractC2514d
        public void a_(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: b */
        public void mo10444b(Drawable drawable) {
        }

        C2128a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public void mo10417a(AbstractC2522j<?> jVar) {
        if (jVar != null) {
            m9220c(jVar);
        }
    }

    /* renamed from: com.bumptech.glide.g$b */
    private class C2129b implements AbstractC2492c.AbstractC2493a {

        /* renamed from: b */
        private final C2506m f7377b;

        @Override // com.bumptech.glide.manager.AbstractC2492c.AbstractC2493a
        /* renamed from: a */
        public void mo10445a(boolean z) {
            if (z) {
                synchronized (ComponentCallbacks2C2126g.this) {
                    this.f7377b.mo11088f();
                }
            }
        }

        C2129b(C2506m mVar) {
            this.f7377b = mVar;
        }
    }

    /* renamed from: a */
    public C2124f<Drawable> mo10409a(Bitmap bitmap) {
        return mo10432k().mo10388a(bitmap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> AbstractC2135h<?, T> mo10421b(Class<T> cls) {
        return this.f7363a.mo10358e().mo10377a(cls);
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f7374o) {
            mo10425d();
        }
    }

    /* renamed from: c */
    private void m9220c(AbstractC2522j<?> jVar) {
        boolean b = mo10423b(jVar);
        AbstractC2533d a = jVar.mo11170a();
        if (!b && !this.f7363a.mo10353a(jVar) && a != null) {
            jVar.mo11171a((AbstractC2533d) null);
            a.mo11197b();
        }
    }

    /* renamed from: a */
    public C2124f<Drawable> mo10410a(Uri uri) {
        return mo10432k().mo10389a(uri);
    }

    /* renamed from: a */
    public C2124f<Drawable> mo10411a(File file) {
        return mo10432k().mo10393a(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized boolean mo10423b(AbstractC2522j<?> jVar) {
        AbstractC2533d a = jVar.mo11170a();
        if (a == null) {
            return true;
        }
        if (!this.f7366g.mo11084b(a)) {
            return false;
        }
        this.f7368i.mo11100b(jVar);
        jVar.mo11171a((AbstractC2533d) null);
        return true;
    }

    /* renamed from: a */
    public <ResourceType> C2124f<ResourceType> mo10412a(Class<ResourceType> cls) {
        return new C2124f<>(this.f7363a, this, cls, this.f7364b);
    }

    /* renamed from: a */
    public C2124f<Drawable> mo10413a(Integer num) {
        return mo10432k().mo10394a(num);
    }

    /* renamed from: a */
    public C2124f<Drawable> mo10414a(Object obj) {
        return mo10432k().mo10395a(obj);
    }

    /* renamed from: a */
    public C2124f<Drawable> mo10415a(String str) {
        return mo10432k().mo10396a(str);
    }

    /* renamed from: a */
    public void mo10416a(View view) {
        mo10417a((AbstractC2522j<?>) new C2128a(view));
    }

    public ComponentCallbacks2C2126g(ComponentCallbacks2C2115c cVar, AbstractC2499h hVar, AbstractC2505l lVar, Context context) {
        this(cVar, hVar, lVar, new C2506m(), cVar.mo10357d(), context);
    }

    ComponentCallbacks2C2126g(ComponentCallbacks2C2115c cVar, AbstractC2499h hVar, AbstractC2505l lVar, C2506m mVar, AbstractC2494d dVar, Context context) {
        this.f7368i = new C2509o();
        RunnableC21271 r0 = new Runnable() {
            /* class com.bumptech.glide.ComponentCallbacks2C2126g.RunnableC21271 */

            public void run() {
                ComponentCallbacks2C2126g.this.f7365c.mo11065a(ComponentCallbacks2C2126g.this);
            }
        };
        this.f7369j = r0;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f7370k = handler;
        this.f7363a = cVar;
        this.f7365c = hVar;
        this.f7367h = lVar;
        this.f7366g = mVar;
        this.f7364b = context;
        AbstractC2492c a = dVar.mo11069a(context.getApplicationContext(), new C2129b(mVar));
        this.f7371l = a;
        if (C2568k.m10920d()) {
            handler.post(r0);
        } else {
            hVar.mo11065a(this);
        }
        hVar.mo11065a(a);
        this.f7372m = new CopyOnWriteArrayList<>(cVar.mo10358e().mo10379a());
        mo10419a(cVar.mo10358e().mo10380b());
        cVar.mo10352a(this);
    }
}
