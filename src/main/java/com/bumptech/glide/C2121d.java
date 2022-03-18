package com.bumptech.glide;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.C2360k;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.engine.p087a.C2284f;
import com.bumptech.glide.load.engine.p087a.C2289j;
import com.bumptech.glide.load.engine.p087a.C2292k;
import com.bumptech.glide.load.engine.p088b.AbstractC2302a;
import com.bumptech.glide.load.engine.p088b.AbstractC2317i;
import com.bumptech.glide.load.engine.p088b.C2313f;
import com.bumptech.glide.load.engine.p088b.C2316h;
import com.bumptech.glide.load.engine.p088b.C2319j;
import com.bumptech.glide.load.engine.p089c.ExecutorServiceC2328a;
import com.bumptech.glide.manager.AbstractC2494d;
import com.bumptech.glide.manager.C2497f;
import com.bumptech.glide.manager.C2502k;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.C2537g;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.d */
public final class C2121d {

    /* renamed from: a */
    private final Map<Class<?>, AbstractC2135h<?, ?>> f7313a = new ArrayMap();

    /* renamed from: b */
    private C2360k f7314b;

    /* renamed from: c */
    private AbstractC2283e f7315c;

    /* renamed from: d */
    private AbstractC2278b f7316d;

    /* renamed from: e */
    private AbstractC2317i f7317e;

    /* renamed from: f */
    private ExecutorServiceC2328a f7318f;

    /* renamed from: g */
    private ExecutorServiceC2328a f7319g;

    /* renamed from: h */
    private AbstractC2302a.AbstractC2303a f7320h;

    /* renamed from: i */
    private C2319j f7321i;

    /* renamed from: j */
    private AbstractC2494d f7322j;

    /* renamed from: k */
    private int f7323k = 4;

    /* renamed from: l */
    private ComponentCallbacks2C2115c.AbstractC2116a f7324l = new ComponentCallbacks2C2115c.AbstractC2116a() {
        /* class com.bumptech.glide.C2121d.C21221 */

        @Override // com.bumptech.glide.ComponentCallbacks2C2115c.AbstractC2116a
        /* renamed from: a */
        public C2537g mo10365a() {
            return new C2537g();
        }
    };

    /* renamed from: m */
    private C2502k.AbstractC2504a f7325m;

    /* renamed from: n */
    private ExecutorServiceC2328a f7326n;

    /* renamed from: o */
    private boolean f7327o;

    /* renamed from: p */
    private List<AbstractC2536f<Object>> f7328p;

    /* renamed from: q */
    private boolean f7329q;

    /* renamed from: r */
    private boolean f7330r;

    /* renamed from: a */
    public C2121d mo10372a(AbstractC2302a.AbstractC2303a aVar) {
        this.f7320h = aVar;
        return this;
    }

    /* renamed from: a */
    public C2121d mo10374a(C2319j jVar) {
        this.f7321i = jVar;
        return this;
    }

    /* renamed from: a */
    public C2121d mo10373a(C2319j.C2320a aVar) {
        return mo10374a(aVar.mo10746a());
    }

    /* renamed from: a */
    public C2121d mo10375a(AbstractC2494d dVar) {
        this.f7322j = dVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10376a(C2502k.AbstractC2504a aVar) {
        this.f7325m = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ComponentCallbacks2C2115c mo10371a(Context context) {
        if (this.f7318f == null) {
            this.f7318f = ExecutorServiceC2328a.m9916d();
        }
        if (this.f7319g == null) {
            this.f7319g = ExecutorServiceC2328a.m9914b();
        }
        if (this.f7326n == null) {
            this.f7326n = ExecutorServiceC2328a.m9919g();
        }
        if (this.f7321i == null) {
            this.f7321i = new C2319j.C2320a(context).mo10746a();
        }
        if (this.f7322j == null) {
            this.f7322j = new C2497f();
        }
        if (this.f7315c == null) {
            int b = this.f7321i.mo10742b();
            if (b > 0) {
                this.f7315c = new C2292k((long) b);
            } else {
                this.f7315c = new C2284f();
            }
        }
        if (this.f7316d == null) {
            this.f7316d = new C2289j(this.f7321i.mo10743c());
        }
        if (this.f7317e == null) {
            this.f7317e = new C2316h((long) this.f7321i.mo10741a());
        }
        if (this.f7320h == null) {
            this.f7320h = new C2313f(context);
        }
        if (this.f7314b == null) {
            this.f7314b = new C2360k(this.f7317e, this.f7320h, this.f7319g, this.f7318f, ExecutorServiceC2328a.m9917e(), this.f7326n, this.f7327o);
        }
        List<AbstractC2536f<Object>> list = this.f7328p;
        if (list == null) {
            this.f7328p = Collections.emptyList();
        } else {
            this.f7328p = Collections.unmodifiableList(list);
        }
        return new ComponentCallbacks2C2115c(context, this.f7314b, this.f7317e, this.f7315c, this.f7316d, new C2502k(this.f7325m), this.f7322j, this.f7323k, this.f7324l, this.f7313a, this.f7328p, this.f7329q, this.f7330r);
    }
}
