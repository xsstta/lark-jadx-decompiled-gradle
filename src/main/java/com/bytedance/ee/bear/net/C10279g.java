package com.bytedance.ee.bear.net;

import com.bytedance.ee.bear.net.AbstractC10281h;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.CookieJar;
import okhttp3.Interceptor;

/* renamed from: com.bytedance.ee.bear.net.g */
public class C10279g {

    /* renamed from: a */
    private final AbstractC10281h f27755a;

    /* renamed from: b */
    private final AbstractC10278f f27756b;

    /* renamed from: c */
    private final C10291l f27757c;

    /* renamed from: d */
    private final CopyOnWriteArrayList<AbstractC10300u> f27758d;

    /* renamed from: a */
    public AbstractC10281h mo39280a() {
        return this.f27755a;
    }

    /* renamed from: b */
    public C10291l mo39285b() {
        return this.f27757c;
    }

    /* renamed from: com.bytedance.ee.bear.net.g$a */
    public static class C10280a {

        /* renamed from: a */
        private final CopyOnWriteArrayList<AbstractC10300u> f27759a = new CopyOnWriteArrayList<>();

        /* renamed from: b */
        private AbstractC10281h f27760b = new AbstractC10281h.C10284c();

        /* renamed from: c */
        private AbstractC10278f f27761c;

        /* renamed from: d */
        private C10291l f27762d;

        /* renamed from: e */
        private CookieJar f27763e;

        /* renamed from: f */
        private boolean f27764f;

        /* renamed from: g */
        private long f27765g;

        /* renamed from: h */
        private Interceptor f27766h;

        /* renamed from: a */
        public C10279g mo39293a() {
            C10299t.m42917a(this.f27760b.mo39294a());
            AbstractC10281h hVar = this.f27760b;
            if (hVar instanceof AbstractC10281h.C10284c) {
                ((AbstractC10281h.C10284c) hVar).mo39297a(this.f27764f);
            }
            C10291l lVar = new C10291l();
            this.f27762d = lVar;
            lVar.mo39309a(this.f27766h);
            this.f27762d.mo39307a(this.f27765g);
            this.f27762d.mo39308a(this.f27763e);
            return new C10279g(this.f27760b, this.f27761c, this.f27762d, this.f27759a);
        }

        /* renamed from: a */
        public C10280a mo39287a(long j) {
            this.f27765g = j;
            return this;
        }

        /* renamed from: a */
        public C10280a mo39288a(AbstractC10278f fVar) {
            this.f27761c = fVar;
            return this;
        }

        /* renamed from: a */
        public C10280a mo39289a(AbstractC10300u uVar) {
            this.f27759a.add(uVar);
            return this;
        }

        /* renamed from: a */
        public C10280a mo39290a(CookieJar cookieJar) {
            this.f27763e = cookieJar;
            return this;
        }

        /* renamed from: a */
        public C10280a mo39286a(int i) {
            if (i == 4) {
                this.f27760b = new AbstractC10281h.C10285d();
            } else if (i == 5) {
                this.f27760b = new AbstractC10281h.C10286e();
            } else if (i == 2) {
                this.f27760b = new AbstractC10281h.C10287f();
            } else if (i == 6) {
                this.f27760b = new AbstractC10281h.C10283b();
            } else {
                this.f27760b = new AbstractC10281h.C10284c();
            }
            return this;
        }

        /* renamed from: a */
        public C10280a mo39291a(Interceptor interceptor) {
            this.f27766h = interceptor;
            return this;
        }

        /* renamed from: a */
        public C10280a mo39292a(boolean z) {
            this.f27764f = z;
            return this;
        }
    }

    /* renamed from: a */
    public <T extends Serializable> C10298s<T> mo39281a(AbstractC10295p<T> pVar) {
        return mo39282a(pVar, null);
    }

    /* renamed from: a */
    public <T extends Serializable> C10298s<T> mo39283a(Type type) {
        return mo39281a(new C10276c(type));
    }

    /* renamed from: a */
    public void mo39284a(String str) {
        C10299t.m42917a(str);
        this.f27755a.mo39295a(str);
    }

    /* renamed from: a */
    public <T extends Serializable> C10298s<T> mo39282a(AbstractC10295p<T> pVar, HeaderInterceptor eVar) {
        return new C10298s<>(this.f27757c, pVar, eVar, this.f27756b, this.f27755a.mo39296b(), this.f27758d);
    }

    public C10279g(AbstractC10281h hVar, AbstractC10278f fVar, C10291l lVar, List<AbstractC10300u> list) {
        CopyOnWriteArrayList<AbstractC10300u> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f27758d = copyOnWriteArrayList;
        this.f27755a = hVar;
        this.f27756b = fVar;
        this.f27757c = lVar;
        copyOnWriteArrayList.addAll(list);
    }
}
