package com.bytedance.push;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.push.interfaze.AbstractC20438a;
import com.bytedance.push.interfaze.AbstractC20439b;
import com.bytedance.push.interfaze.AbstractC20440c;
import com.bytedance.push.interfaze.AbstractC20441d;
import com.bytedance.push.interfaze.AbstractC20442e;
import com.bytedance.push.interfaze.AbstractC20444g;
import com.bytedance.push.interfaze.AbstractC20447j;
import com.bytedance.push.interfaze.AbstractC20448k;
import com.bytedance.push.interfaze.AbstractC20453p;
import com.bytedance.push.interfaze.AbstractC20454q;
import com.bytedance.push.interfaze.AbstractC20456s;
import com.bytedance.push.interfaze.AbstractC20458t;
import com.bytedance.push.log.ILogger;
import com.bytedance.push.notification.C20481d;
import com.bytedance.push.notification.C20500j;
import com.bytedance.push.p881c.AbstractC20390a;
import com.bytedance.push.p881c.C20393d;
import com.bytedance.push.p884f.AbstractC20414a;
import com.bytedance.push.p884f.p885a.AbstractC20415a;
import com.bytedance.push.p888i.AbstractC20436a;
import com.bytedance.push.p888i.C20437b;
import com.bytedance.push.p890k.C20466a;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.AbstractC59434a;
import com.ss.android.message.p3002a.C59436a;
import com.ss.android.pushmanager.AbstractC59965c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.push.c */
public class C20386c {

    /* renamed from: A */
    public final AbstractC20415a f49770A;

    /* renamed from: B */
    public final boolean f49771B;

    /* renamed from: C */
    public final long f49772C;

    /* renamed from: D */
    public final AbstractC20448k f49773D;

    /* renamed from: E */
    public final AbstractC20453p f49774E;

    /* renamed from: F */
    public final C20481d f49775F;

    /* renamed from: G */
    public final int[] f49776G;

    /* renamed from: H */
    public final ILogger f49777H;

    /* renamed from: I */
    private final AbstractC20447j f49778I;

    /* renamed from: a */
    public final Application f49779a;

    /* renamed from: b */
    public final int f49780b;

    /* renamed from: c */
    public final int f49781c;

    /* renamed from: d */
    public final int f49782d;

    /* renamed from: e */
    public final String f49783e;

    /* renamed from: f */
    public final boolean f49784f;

    /* renamed from: g */
    public final int f49785g;

    /* renamed from: h */
    public final String f49786h;

    /* renamed from: i */
    public final String f49787i;

    /* renamed from: j */
    public final String f49788j;

    /* renamed from: k */
    public final C20389b f49789k;

    /* renamed from: l */
    public final List<AbstractC59434a> f49790l;

    /* renamed from: m */
    public final AbstractC20442e f49791m;

    /* renamed from: n */
    public final C20500j f49792n;

    /* renamed from: o */
    public final String f49793o;

    /* renamed from: p */
    public final AbstractC20458t f49794p;

    /* renamed from: q */
    public final AbstractC20438a f49795q;

    /* renamed from: r */
    public final AbstractC59965c f49796r;

    /* renamed from: s */
    public final AbstractC20440c f49797s;

    /* renamed from: t */
    public final AbstractC20454q f49798t;

    /* renamed from: u */
    public final AbstractC20414a f49799u;

    /* renamed from: v */
    public final AbstractC20456s f49800v;

    /* renamed from: w */
    public final String f49801w;

    /* renamed from: x */
    public final String f49802x;

    /* renamed from: y */
    public final boolean f49803y;

    /* renamed from: z */
    public final AbstractC20439b f49804z;

    /* renamed from: a */
    public AbstractC20447j mo68756a() {
        return this.f49778I;
    }

    /* renamed from: com.bytedance.push.c$a */
    public static class C20388a {

        /* renamed from: A */
        private boolean f49805A;

        /* renamed from: B */
        private AbstractC20439b f49806B;

        /* renamed from: C */
        private AbstractC20415a f49807C;

        /* renamed from: D */
        private AbstractC20444g f49808D;

        /* renamed from: E */
        private AbstractC20441d f49809E;

        /* renamed from: F */
        private AbstractC20436a f49810F;

        /* renamed from: G */
        private AbstractC20447j f49811G;

        /* renamed from: a */
        public boolean f49812a;

        /* renamed from: b */
        public long f49813b = TimeUnit.MINUTES.toMillis(2);

        /* renamed from: c */
        public AbstractC20448k f49814c;

        /* renamed from: d */
        public AbstractC20453p f49815d;

        /* renamed from: e */
        public int[] f49816e;

        /* renamed from: f */
        public ILogger f49817f;

        /* renamed from: g */
        private final Application f49818g;

        /* renamed from: h */
        private boolean f49819h;

        /* renamed from: i */
        private int f49820i = 3;

        /* renamed from: j */
        private String f49821j;

        /* renamed from: k */
        private C20389b f49822k;

        /* renamed from: l */
        private List<AbstractC59434a> f49823l = new ArrayList();

        /* renamed from: m */
        private AbstractC20442e f49824m;

        /* renamed from: n */
        private final String f49825n;

        /* renamed from: o */
        private AbstractC20458t f49826o;

        /* renamed from: p */
        private AbstractC20438a f49827p;

        /* renamed from: q */
        private boolean f49828q;

        /* renamed from: r */
        private AbstractC59965c f49829r;

        /* renamed from: s */
        private AbstractC20440c f49830s;

        /* renamed from: t */
        private AbstractC20390a f49831t;

        /* renamed from: u */
        private AbstractC20454q f49832u;

        /* renamed from: v */
        private AbstractC20414a f49833v;

        /* renamed from: w */
        private AbstractC20456s f49834w;

        /* renamed from: x */
        private final C20380a f49835x;

        /* renamed from: y */
        private String f49836y;

        /* renamed from: z */
        private String f49837z;

        /* renamed from: a */
        public C20388a mo68768a(boolean z) {
            this.f49819h = z;
            return this;
        }

        /* renamed from: a */
        public C20388a mo68767a(String str) {
            this.f49821j = str;
            return this;
        }

        /* renamed from: a */
        public C20386c mo68769a() {
            mo68773c();
            if (TextUtils.isEmpty(this.f49821j)) {
                this.f49821j = C59436a.m230725a(this.f49818g);
            }
            if (this.f49829r == null) {
                C20395d dVar = new C20395d(this.f49828q, this.f49835x.mo68745e());
                this.f49829r = dVar;
                if (this.f49819h) {
                    dVar.mo68789a(this.f49818g);
                }
            }
            if (this.f49831t == null) {
                this.f49831t = new C20393d();
            }
            if (this.f49834w == null) {
                this.f49834w = new AbstractC20456s.C20457a();
            }
            if (this.f49806B == null) {
                this.f49806B = new C20466a();
            }
            C20500j jVar = new C20500j(this.f49809E, this.f49808D, this.f49831t);
            if (this.f49810F == null) {
                this.f49810F = new C20437b();
            }
            C20481d dVar2 = new C20481d(this.f49810F);
            mo68772b();
            return new C20386c(this.f49818g, this.f49835x, this.f49819h, this.f49820i, this.f49821j, this.f49822k, this.f49823l, this.f49824m, jVar, this.f49825n, this.f49826o, this.f49827p, this.f49829r, this.f49830s, this.f49832u, this.f49833v, this.f49834w, this.f49836y, this.f49805A, this.f49806B, this.f49807C, dVar2, this.f49816e, this.f49811G, this.f49837z, this);
        }

        /* renamed from: a */
        public C20388a mo68766a(AbstractC59965c cVar) {
            this.f49829r = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo68773c() {
            m74267a(this.f49835x);
            if (TextUtils.isEmpty(this.f49825n)) {
                m74269c("please set none empty host in builder constructor");
            }
            if (this.f49824m == null) {
                m74269c("please implement the event callback");
            }
            if (this.f49832u == null) {
                m74269c("click event listener is null, you'll not receive the event when user click notifications.Please implement it.");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo68772b() {
            String str;
            C20552c.m74852c("init", "debuggable = " + this.f49819h);
            if (this.f49819h) {
                C20380a aVar = this.f49835x;
                if (aVar == null) {
                    str = "";
                } else {
                    str = aVar.toString();
                }
                C20552c.m74845a("init", str);
                C20552c.m74845a("init", "process:\t" + this.f49821j);
            }
        }

        /* renamed from: a */
        public C20388a mo68757a(AbstractC20415a aVar) {
            this.f49807C = aVar;
            return this;
        }

        /* renamed from: b */
        public C20388a mo68771b(boolean z) {
            this.f49812a = z;
            return this;
        }

        /* renamed from: c */
        private void m74269c(String str) {
            m74268a(this.f49819h, str);
        }

        /* renamed from: a */
        public C20388a mo68758a(AbstractC20414a aVar) {
            this.f49833v = aVar;
            return this;
        }

        /* renamed from: b */
        public C20388a mo68770b(String str) {
            this.f49822k = new C20389b("push", str);
            return this;
        }

        /* renamed from: a */
        public C20388a mo68759a(AbstractC20438a aVar) {
            this.f49827p = aVar;
            return this;
        }

        /* renamed from: a */
        public C20388a mo68760a(AbstractC20442e eVar) {
            this.f49824m = eVar;
            return this;
        }

        /* renamed from: a */
        public C20388a mo68761a(AbstractC20444g gVar) {
            this.f49808D = gVar;
            return this;
        }

        /* renamed from: a */
        private void m74267a(C20380a aVar) {
            if (aVar == null) {
                m74269c("appinfo is null");
                return;
            }
            if (aVar.mo68735a() <= 0) {
                m74269c(" aid {" + aVar.mo68735a() + "} is invalid");
            }
            if (TextUtils.isEmpty(aVar.mo68746f())) {
                m74269c("appName {" + aVar.mo68746f() + "} is invalid");
            }
            if (TextUtils.isEmpty(aVar.mo68744d())) {
                m74269c("versionName {" + aVar.mo68744d() + "} is invalid");
            }
            if (aVar.mo68738b() <= 0) {
                m74269c("versionCode {" + aVar.mo68738b() + "} is invalid");
            }
            if (aVar.mo68741c() <= 0) {
                m74269c("updateVersionCode {" + aVar.mo68741c() + "} is invalid");
            }
            if (TextUtils.isEmpty(aVar.mo68745e())) {
                m74269c("channel {" + aVar.mo68745e() + "} is invalid");
            }
        }

        /* renamed from: a */
        public C20388a mo68762a(AbstractC20448k kVar) {
            this.f49814c = kVar;
            return this;
        }

        /* renamed from: a */
        public C20388a mo68763a(AbstractC20453p pVar) {
            this.f49815d = pVar;
            return this;
        }

        /* renamed from: a */
        public C20388a mo68764a(AbstractC20454q qVar) {
            this.f49832u = qVar;
            return this;
        }

        /* renamed from: a */
        public C20388a mo68765a(ILogger iLogger) {
            this.f49817f = iLogger;
            return this;
        }

        /* renamed from: a */
        private void m74268a(boolean z, String str) {
            if (!z) {
                C20552c.m74850b("init", str);
                return;
            }
            throw new IllegalArgumentException(str);
        }

        public C20388a(Application application, C20380a aVar, String str) {
            this.f49818g = application;
            this.f49835x = aVar;
            this.f49825n = str;
        }
    }

    /* renamed from: com.bytedance.push.c$b */
    public static class C20389b {

        /* renamed from: a */
        public String f49838a;

        /* renamed from: b */
        public String f49839b;

        /* renamed from: a */
        public boolean mo68774a() {
            if (TextUtils.isEmpty(this.f49839b) || TextUtils.isEmpty(this.f49838a)) {
                return false;
            }
            return true;
        }

        public C20389b(String str, String str2) {
            this.f49838a = str2;
            this.f49839b = str;
        }
    }

    private C20386c(Application application, C20380a aVar, boolean z, int i, String str, C20389b bVar, List<AbstractC59434a> list, AbstractC20442e eVar, C20500j jVar, String str2, AbstractC20458t tVar, AbstractC20438a aVar2, AbstractC59965c cVar, AbstractC20440c cVar2, AbstractC20454q qVar, AbstractC20414a aVar3, AbstractC20456s sVar, String str3, boolean z2, AbstractC20439b bVar2, AbstractC20415a aVar4, C20481d dVar, int[] iArr, AbstractC20447j jVar2, String str4, C20388a aVar5) {
        this.f49779a = application;
        this.f49780b = aVar.mo68735a();
        this.f49781c = aVar.mo68738b();
        this.f49782d = aVar.mo68741c();
        this.f49783e = aVar.mo68744d();
        this.f49786h = aVar.mo68745e();
        this.f49788j = aVar.mo68746f();
        this.f49784f = z;
        this.f49785g = i;
        this.f49787i = str;
        this.f49789k = bVar;
        this.f49790l = new CopyOnWriteArrayList(list);
        this.f49791m = eVar;
        this.f49792n = jVar;
        this.f49793o = str2;
        this.f49794p = tVar;
        this.f49795q = aVar2;
        this.f49796r = cVar;
        this.f49797s = cVar2;
        this.f49798t = qVar;
        this.f49799u = aVar3;
        this.f49800v = sVar;
        this.f49801w = str3;
        this.f49803y = z2;
        this.f49804z = bVar2;
        this.f49770A = aVar4;
        this.f49771B = aVar5.f49812a;
        this.f49772C = aVar5.f49813b;
        this.f49773D = aVar5.f49814c;
        this.f49774E = aVar5.f49815d;
        this.f49775F = dVar;
        this.f49776G = iArr;
        this.f49778I = jVar2;
        this.f49802x = str4;
        ILogger iLogger = aVar5.f49817f;
        this.f49777H = iLogger;
        C20552c.m74843a(iLogger);
    }
}
