package com.bytedance.ee.bear.basesdk.p250a;

import com.bytedance.ee.bear.abtest.service.AbstractC4155a;
import com.bytedance.ee.bear.abtest.service.AbstractC4156b;
import com.bytedance.ee.bear.abtest.service.C4158c;
import com.bytedance.ee.bear.account.C4188f;
import com.bytedance.ee.bear.basesdk.services.C4502c;
import com.bytedance.ee.bear.basesdk.services.C4503d;
import com.bytedance.ee.bear.basesdk.services.C4514h;
import com.bytedance.ee.bear.contract.AbstractC5080aa;
import com.bytedance.ee.bear.contract.AbstractC5114b;
import com.bytedance.ee.bear.contract.AbstractC5124d;
import com.bytedance.ee.bear.contract.AbstractC5170f;
import com.bytedance.ee.bear.contract.AbstractC5214r;
import com.bytedance.ee.bear.contract.AbstractC5232w;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.as;
import com.bytedance.ee.bear.contract.darkmode.AbstractC5126a;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5196a;
import com.bytedance.ee.bear.docshost.C5581a;
import com.bytedance.ee.bear.document.C5639ah;
import com.bytedance.ee.bear.document.C5856k;
import com.bytedance.ee.bear.domain.AbstractC6304b;
import com.bytedance.ee.bear.drive.services.AbstractC7173a;
import com.bytedance.ee.bear.drive.services.AbstractC7174b;
import com.bytedance.ee.bear.drive.services.AbstractC7180h;
import com.bytedance.ee.bear.drive.services.AbstractC7197n;
import com.bytedance.ee.bear.drive.services.C7182j;
import com.bytedance.ee.bear.drive.services.C7189m;
import com.bytedance.ee.bear.leanmode.C8137d;
import com.bytedance.ee.bear.list.C8511i;
import com.bytedance.ee.bear.notification.AbstractC10317b;
import com.bytedance.ee.bear.notification.C10346h;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.base.AbstractC10913a;
import com.bytedance.ee.bear.todocenter.push.AbstractC11708a;
import com.bytedance.ee.bear.todocenter.push.C11712e;
import com.bytedance.ee.bear.wiki.AbstractC11902a;
import com.bytedance.ee.bear.wiki.AbstractC11904b;
import com.bytedance.ee.bear.wiki.AbstractC11940d;
import com.bytedance.ee.bear.wiki.C11941e;
import com.bytedance.ee.bear.wiki.C11956h;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.AbstractC12447a;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.C12449c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.p699b.C13595b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13629i;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.basesdk.a.d */
public abstract class AbstractC4355d extends AbstractC4352a {

    /* renamed from: a */
    private C4514h f12989a = new C4514h();

    /* renamed from: t */
    public boolean mo17008t() {
        return false;
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: b */
    public AbstractC6304b mo16987b() {
        return this.f12989a;
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a, com.bytedance.ee.bear.service.AbstractC10928d
    /* renamed from: a */
    public List<AbstractC10913a> mo16986a() {
        return super.mo16986a();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: c */
    public AbstractC5114b mo16988c() {
        return new C4188f();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: d */
    public AbstractC5214r mo16989d() {
        return new C8511i();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: f */
    public AbstractC5170f mo16991f() {
        return new C5856k();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: g */
    public AbstractC5124d mo16992g() {
        return new C4502c();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: h */
    public AbstractC5232w mo16993h() {
        return new C5639ah();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: i */
    public AbstractC5196a mo16994i() {
        return new C8137d();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: j */
    public AbstractC4155a mo16995j() {
        return new C4158c();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: k */
    public AbstractC11708a mo16996k() {
        return new C11712e();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: l */
    public AbstractC5126a mo16997l() {
        return new C5581a();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: m */
    public AbstractC7180h mo16998m() {
        return new C4503d();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: n */
    public AbstractC7173a mo16999n() {
        return new C7182j();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: o */
    public AbstractC7174b mo17000o() {
        return new C7189m();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: p */
    public AbstractC10317b mo17001p() {
        return new C10346h();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: q */
    public AbstractC11904b mo17002q() {
        return new C11956h();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: r */
    public AbstractC11902a mo17003r() {
        return new C11941e();
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a
    /* renamed from: s */
    public AbstractC12447a mo17004s() {
        return new C12449c();
    }

    @Override // com.bytedance.ee.bear.service.AbstractC10928d
    /* renamed from: u */
    public boolean mo17009u() {
        return C5102ai.m20871i();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m17965a(String str) {
        List<Map> a = C4368o.m18012a();
        if (!(a == null || a.isEmpty())) {
            for (Map map : a) {
                C5234y.m21392b(str, C5234y.m21390a(map), "docs_");
            }
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4352a, com.bytedance.ee.bear.service.AbstractC10928d
    /* renamed from: a */
    public <T extends AbstractC10913a> String mo16985a(Class<T> cls) {
        if (C13595b.m55176a()) {
            return "";
        }
        boolean isAssignableFrom = am.class.isAssignableFrom(cls);
        boolean isAssignableFrom2 = ak.class.isAssignableFrom(cls);
        boolean isAssignableFrom3 = AbstractC5080aa.class.isAssignableFrom(cls);
        boolean isAssignableFrom4 = AbstractC11940d.class.isAssignableFrom(cls);
        boolean isAssignableFrom5 = AbstractC7197n.class.isAssignableFrom(cls);
        boolean isAssignableFrom6 = as.class.isAssignableFrom(cls);
        boolean isAssignableFrom7 = AbstractC4156b.class.isAssignableFrom(cls);
        if (isAssignableFrom || isAssignableFrom2 || isAssignableFrom3 || isAssignableFrom4 || isAssignableFrom5 || isAssignableFrom6 || isAssignableFrom7) {
            return "";
        }
        return "p0";
    }

    @Override // com.bytedance.ee.bear.service.AbstractC10928d
    /* renamed from: a */
    public void mo17007a(String str, Map map) {
        try {
            if (mo17008t() && C10929e.f29413c.get()) {
                Object obj = map.get("service");
                Objects.requireNonNull(obj);
                if (!obj.toString().contains("AnalyticService")) {
                    C4368o.m18013a(C13615c.f35773a);
                    if (C13629i.m55302a()) {
                        C5234y.m21392b(str, C5234y.m21390a(map), "docs_");
                        C13608f.m55249a(new Runnable(str) {
                            /* class com.bytedance.ee.bear.basesdk.p250a.$$Lambda$d$VVnXyIzqlMxtlkOsRKdZRivarM */
                            public final /* synthetic */ String f$0;

                            {
                                this.f$0 = r1;
                            }

                            public final void run() {
                                AbstractC4355d.m269079lambda$VVnXyIzqlMxtlkOsRKdZRivarM(this.f$0);
                            }
                        });
                        return;
                    }
                    C13608f.m55249a(new Runnable(map) {
                        /* class com.bytedance.ee.bear.basesdk.p250a.$$Lambda$d$dLTfmk78nekefMv2agoZg_GmJo */
                        public final /* synthetic */ Map f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void run() {
                            AbstractC4355d.m269080lambda$dLTfmk78nekefMv2agoZg_GmJo(this.f$0);
                        }
                    });
                }
            }
        } catch (Exception e) {
            C13479a.m54761a("ServicesProvider", e);
        }
    }
}
