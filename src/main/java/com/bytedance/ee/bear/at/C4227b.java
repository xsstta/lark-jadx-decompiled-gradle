package com.bytedance.ee.bear.at;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.at.AbstractC4242i;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.atfinder.AbstractC4272g;
import com.bytedance.ee.bear.atfinder.AtFinderResult;
import com.bytedance.ee.bear.atfinder.C4266b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13748k;

/* renamed from: com.bytedance.ee.bear.at.b */
public class C4227b {

    /* renamed from: a */
    public static AbstractC4242i f12743a;

    /* renamed from: b */
    private static AbstractC4242i.AbstractC4244b f12744b;

    /* renamed from: com.bytedance.ee.bear.at.b$a */
    private static class C4228a {

        /* renamed from: a */
        static AbstractC4240g f12745a = new AbstractC4240g() {
            /* class com.bytedance.ee.bear.at.C4227b.C4228a.C42291 */

            /* renamed from: a */
            private C4266b f12746a;

            /* renamed from: b */
            private AbstractC4272g f12747b;

            /* renamed from: c */
            private String f12748c;

            /* renamed from: d */
            private int f12749d;

            /* renamed from: e */
            private String f12750e;

            /* renamed from: f */
            private AbstractC1178x<AtFinderResult> f12751f;

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m17593b() {
                this.f12746a.getSearchResultList(this.f12750e).mo5928b(this.f12751f);
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4240g
            /* renamed from: a */
            public void mo16635a() {
                if (this.f12746a != null) {
                    C13748k.m55732a(new Runnable() {
                        /* class com.bytedance.ee.bear.at.$$Lambda$b$a$1$0nG5uw_bV6Z7hX3fCVbQRE0GJE0 */

                        public final void run() {
                            C4227b.C4228a.C42291.lambda$0nG5uw_bV6Z7hX3fCVbQRE0GJE0(C4227b.C4228a.C42291.this);
                        }
                    });
                }
                this.f12747b = null;
                this.f12746a = null;
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4240g
            /* renamed from: a */
            public void mo16637a(AbstractC4272g gVar) {
                this.f12747b = gVar;
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4240g
            /* renamed from: b */
            public void mo16639b(AbstractC4272g gVar) {
                if (this.f12747b == gVar) {
                    this.f12747b = null;
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m17591a(AtFinderResult atFinderResult) {
                C13479a.m54772d("AtModule", "onChanged atFinderResult = " + atFinderResult);
                if (atFinderResult == null) {
                    C13479a.m54775e("AtModule", "onChanged: atFinderResult == null");
                    return;
                }
                AbstractC4272g gVar = this.f12747b;
                if (gVar != null) {
                    gVar.mo16697a(atFinderResult);
                } else {
                    C13479a.m54758a("AtModule", "onChanged(): mOnSearchCallback is null");
                }
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4240g
            /* renamed from: a */
            public void mo16638a(String str) {
                C4266b bVar = this.f12746a;
                if (bVar != null) {
                    bVar.search(this.f12748c, str, this.f12750e, this.f12749d, "");
                }
                AbstractC4272g gVar = this.f12747b;
                if (gVar != null) {
                    gVar.mo16696a();
                    return;
                }
                C13479a.m54758a("AtModule", "search() mOnSearchCallback is null: content = " + C13598b.m55197d(str));
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m17592a(String str, FragmentActivity fragmentActivity) {
                this.f12746a.getSearchResultList(str).mo5923a(fragmentActivity, this.f12751f);
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4240g
            /* renamed from: a */
            public void mo16636a(FragmentActivity fragmentActivity, String str, int i, String str2) {
                this.f12748c = str;
                this.f12749d = i;
                this.f12750e = str2;
                C4266b bVar = (C4266b) aj.m5366a(fragmentActivity).mo6005a(C4266b.class);
                this.f12746a = bVar;
                bVar.setSearchDelegate(C4227b.f12743a.mo16663b());
                this.f12751f = new AbstractC1178x() {
                    /* class com.bytedance.ee.bear.at.$$Lambda$b$a$1$q267Bixp9ZqDSb4rJtjH8nKtwk */

                    @Override // androidx.lifecycle.AbstractC1178x
                    public final void onChanged(Object obj) {
                        C4227b.C4228a.C42291.m269074lambda$q267Bixp9ZqDSb4rJtjH8nKtwk(C4227b.C4228a.C42291.this, (AtFinderResult) obj);
                    }
                };
                C13748k.m55732a(new Runnable(str2, fragmentActivity) {
                    /* class com.bytedance.ee.bear.at.$$Lambda$b$a$1$ekNVxv_u4hi5ikGSnajm5T90m38 */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ FragmentActivity f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C4227b.C4228a.C42291.lambda$ekNVxv_u4hi5ikGSnajm5T90m38(C4227b.C4228a.C42291.this, this.f$1, this.f$2);
                    }
                });
            }
        };
    }

    /* renamed from: c */
    public static AbstractC4240g m17590c() {
        return C4228a.f12745a;
    }

    /* renamed from: a */
    public static AbstractC4242i m17586a() {
        if (f12743a == null) {
            C13479a.m54758a("AtModule", "getDependency sDependency = null, use default!");
            f12743a = new C4237f();
        }
        return f12743a;
    }

    /* renamed from: b */
    public static AbstractC4242i.AbstractC4244b m17589b() {
        if (f12744b == null) {
            C13479a.m54758a("AtModule", "getExtraDependency sExtraDependency = null, use default!");
            f12744b = new C4234e();
        }
        return f12744b;
    }

    /* renamed from: a */
    public static void m17587a(AbstractC4242i.AbstractC4244b bVar) {
        f12744b = bVar;
    }

    /* renamed from: a */
    public static void m17588a(AbstractC4242i iVar) {
        f12743a = iVar;
    }
}
