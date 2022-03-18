package com.ss.android.appcenter.common.shadow;

import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.appcenter.common.shadow.n */
public class C28160n {

    /* renamed from: a */
    C28150d f70605a;

    /* renamed from: b */
    C28150d f70606b;

    /* renamed from: c */
    C28150d f70607c;

    /* renamed from: d */
    C28150d f70608d;

    /* renamed from: e */
    AbstractC28149c f70609e;

    /* renamed from: f */
    AbstractC28149c f70610f;

    /* renamed from: g */
    AbstractC28149c f70611g;

    /* renamed from: h */
    AbstractC28149c f70612h;

    /* renamed from: i */
    C28152f f70613i;

    /* renamed from: j */
    C28152f f70614j;

    /* renamed from: k */
    C28152f f70615k;

    /* renamed from: l */
    C28152f f70616l;

    /* renamed from: m */
    C28175q f70617m;

    /* renamed from: com.ss.android.appcenter.common.shadow.n$b */
    public interface AbstractC28163b {
        /* renamed from: a */
        AbstractC28149c mo100311a(AbstractC28149c cVar);
    }

    /* renamed from: a */
    public C28150d mo100333a() {
        return this.f70605a;
    }

    /* renamed from: b */
    public C28150d mo100336b() {
        return this.f70606b;
    }

    /* renamed from: c */
    public C28150d mo100337c() {
        return this.f70607c;
    }

    /* renamed from: d */
    public C28150d mo100338d() {
        return this.f70608d;
    }

    /* renamed from: e */
    public AbstractC28149c mo100339e() {
        return this.f70609e;
    }

    /* renamed from: f */
    public AbstractC28149c mo100340f() {
        return this.f70610f;
    }

    /* renamed from: g */
    public AbstractC28149c mo100341g() {
        return this.f70611g;
    }

    /* renamed from: h */
    public AbstractC28149c mo100342h() {
        return this.f70612h;
    }

    /* renamed from: i */
    public C28152f mo100343i() {
        return this.f70616l;
    }

    /* renamed from: j */
    public C28152f mo100344j() {
        return this.f70613i;
    }

    /* renamed from: k */
    public C28152f mo100345k() {
        return this.f70614j;
    }

    /* renamed from: l */
    public C28152f mo100346l() {
        return this.f70615k;
    }

    /* renamed from: m */
    public C28162a mo100347m() {
        return new C28162a(this);
    }

    /* renamed from: com.ss.android.appcenter.common.shadow.n$a */
    public static final class C28162a {

        /* renamed from: a */
        public C28150d f70618a = C28156j.m103117a();

        /* renamed from: b */
        public C28150d f70619b = C28156j.m103117a();

        /* renamed from: c */
        public C28150d f70620c = C28156j.m103117a();

        /* renamed from: d */
        public C28150d f70621d = C28156j.m103117a();

        /* renamed from: e */
        public AbstractC28149c f70622e = new C28147a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: f */
        public AbstractC28149c f70623f = new C28147a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: g */
        public AbstractC28149c f70624g = new C28147a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: h */
        public AbstractC28149c f70625h = new C28147a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: i */
        public C28152f f70626i = C28156j.m103118b();

        /* renamed from: j */
        public C28152f f70627j = C28156j.m103118b();

        /* renamed from: k */
        public C28152f f70628k = C28156j.m103118b();

        /* renamed from: l */
        public C28152f f70629l = C28156j.m103118b();

        /* renamed from: m */
        public C28175q f70630m;

        /* renamed from: a */
        public C28160n mo100352a() {
            return new C28160n(this);
        }

        public C28162a() {
        }

        /* renamed from: a */
        public C28162a mo100349a(AbstractC28149c cVar) {
            this.f70622e = cVar;
            return this;
        }

        /* renamed from: b */
        public C28162a mo100354b(AbstractC28149c cVar) {
            this.f70623f = cVar;
            return this;
        }

        /* renamed from: c */
        public C28162a mo100357c(AbstractC28149c cVar) {
            this.f70624g = cVar;
            return this;
        }

        /* renamed from: d */
        public C28162a mo100360d(AbstractC28149c cVar) {
            this.f70625h = cVar;
            return this;
        }

        /* renamed from: a */
        public C28162a mo100351a(C28175q qVar) {
            this.f70630m = qVar;
            return this;
        }

        /* renamed from: b */
        public C28162a mo100353b(float f) {
            this.f70622e = new C28147a(f);
            return this;
        }

        /* renamed from: c */
        public C28162a mo100356c(float f) {
            this.f70623f = new C28147a(f);
            return this;
        }

        /* renamed from: d */
        public C28162a mo100359d(float f) {
            this.f70624g = new C28147a(f);
            return this;
        }

        /* renamed from: e */
        public C28162a mo100362e(float f) {
            this.f70625h = new C28147a(f);
            return this;
        }

        /* renamed from: b */
        public C28162a mo100355b(C28150d dVar) {
            this.f70618a = dVar;
            float f = m103140f(dVar);
            if (f != -1.0f) {
                mo100353b(f);
            }
            return this;
        }

        /* renamed from: c */
        public C28162a mo100358c(C28150d dVar) {
            this.f70619b = dVar;
            float f = m103140f(dVar);
            if (f != -1.0f) {
                mo100356c(f);
            }
            return this;
        }

        /* renamed from: d */
        public C28162a mo100361d(C28150d dVar) {
            this.f70620c = dVar;
            float f = m103140f(dVar);
            if (f != -1.0f) {
                mo100359d(f);
            }
            return this;
        }

        /* renamed from: e */
        public C28162a mo100363e(C28150d dVar) {
            this.f70621d = dVar;
            float f = m103140f(dVar);
            if (f != -1.0f) {
                mo100362e(f);
            }
            return this;
        }

        /* renamed from: f */
        private static float m103140f(C28150d dVar) {
            if (dVar instanceof C28158l) {
                return ((C28158l) dVar).f70592a;
            }
            if (dVar instanceof C28151e) {
                return ((C28151e) dVar).f70586a;
            }
            return -1.0f;
        }

        /* renamed from: a */
        public C28162a mo100348a(float f) {
            return mo100353b(f).mo100356c(f).mo100359d(f).mo100362e(f);
        }

        /* renamed from: a */
        public C28162a mo100350a(C28150d dVar) {
            return mo100355b(dVar).mo100358c(dVar).mo100361d(dVar).mo100363e(dVar);
        }

        public C28162a(C28160n nVar) {
            this.f70618a = nVar.f70605a;
            this.f70619b = nVar.f70606b;
            this.f70620c = nVar.f70607c;
            this.f70621d = nVar.f70608d;
            this.f70622e = nVar.f70609e;
            this.f70623f = nVar.f70610f;
            this.f70624g = nVar.f70611g;
            this.f70625h = nVar.f70612h;
            this.f70626i = nVar.f70613i;
            this.f70627j = nVar.f70614j;
            this.f70628k = nVar.f70615k;
            this.f70629l = nVar.f70616l;
            this.f70630m = nVar.f70617m;
        }
    }

    public C28160n() {
        this.f70605a = C28156j.m103117a();
        this.f70606b = C28156j.m103117a();
        this.f70607c = C28156j.m103117a();
        this.f70608d = C28156j.m103117a();
        this.f70609e = new C28147a(BitmapDescriptorFactory.HUE_RED);
        this.f70610f = new C28147a(BitmapDescriptorFactory.HUE_RED);
        this.f70611g = new C28147a(BitmapDescriptorFactory.HUE_RED);
        this.f70612h = new C28147a(BitmapDescriptorFactory.HUE_RED);
        this.f70613i = C28156j.m103118b();
        this.f70614j = C28156j.m103118b();
        this.f70615k = C28156j.m103118b();
        this.f70616l = C28156j.m103118b();
    }

    private C28160n(C28162a aVar) {
        this.f70605a = aVar.f70618a;
        this.f70606b = aVar.f70619b;
        this.f70607c = aVar.f70620c;
        this.f70608d = aVar.f70621d;
        this.f70609e = aVar.f70622e;
        this.f70610f = aVar.f70623f;
        this.f70611g = aVar.f70624g;
        this.f70612h = aVar.f70625h;
        this.f70613i = aVar.f70626i;
        this.f70614j = aVar.f70627j;
        this.f70615k = aVar.f70628k;
        this.f70616l = aVar.f70629l;
        this.f70617m = aVar.f70630m;
    }

    /* renamed from: a */
    public C28160n mo100334a(AbstractC28163b bVar) {
        return mo100347m().mo100349a(bVar.mo100311a(mo100339e())).mo100354b(bVar.mo100311a(mo100340f())).mo100360d(bVar.mo100311a(mo100342h())).mo100357c(bVar.mo100311a(mo100341g())).mo100352a();
    }

    /* renamed from: a */
    public boolean mo100335a(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.f70616l.getClass().equals(C28152f.class) || !this.f70614j.getClass().equals(C28152f.class) || !this.f70613i.getClass().equals(C28152f.class) || !this.f70615k.getClass().equals(C28152f.class)) {
            z = false;
        } else {
            z = true;
        }
        float a = this.f70609e.mo100314a(rectF);
        if (this.f70610f.mo100314a(rectF) == a && this.f70612h.mo100314a(rectF) == a && this.f70611g.mo100314a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(this.f70606b instanceof C28158l) || !(this.f70605a instanceof C28158l) || !(this.f70607c instanceof C28158l) || !(this.f70608d instanceof C28158l)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }
}
