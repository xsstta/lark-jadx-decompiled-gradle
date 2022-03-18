package com.tt.miniapp.aa;

import android.content.Intent;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapphost.data.C67485a;
import java.util.HashMap;

/* renamed from: com.tt.miniapp.aa.b */
public class C65722b {

    /* renamed from: a */
    private AbstractC65725a f165602a;

    /* renamed from: b */
    private IAppContext f165603b;

    /* renamed from: com.tt.miniapp.aa.b$a */
    public interface AbstractC65725a {
        /* renamed from: a */
        void mo230321a();

        /* renamed from: b */
        void mo230322b();

        /* renamed from: c */
        void mo230323c();

        /* renamed from: d */
        void mo230324d();

        /* renamed from: e */
        void mo230325e();
    }

    /* renamed from: a */
    public boolean mo230313a() {
        C65721a b = mo230315b();
        if (b != null) {
            return b.f165597f;
        }
        return false;
    }

    /* renamed from: b */
    public C65721a mo230315b() {
        C66467o.C66470b a = C66467o.m259788a(this.f165603b);
        if (a == null) {
            return null;
        }
        C65721a aVar = new C65721a();
        aVar.f165597f = a.f167780f;
        aVar.f165599h = a.f167782h;
        aVar.f165598g = a.f167781g;
        aVar.f165593b = a.f167776b;
        aVar.f165592a = a.f167775a;
        aVar.f165594c = a.f167777c;
        aVar.f165596e = a.f167779e;
        aVar.f165595d = a.f167778d;
        aVar.f165600i = a.f167783i;
        aVar.f165601j = a.f167784j;
        return aVar;
    }

    public C65722b(IAppContext iAppContext) {
        this.f165603b = iAppContext;
    }

    /* renamed from: a */
    public static C65722b m257660a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234301v();
    }

    /* renamed from: a */
    public void mo230312a(final AbstractC65725a aVar, HashMap<String, Object> hashMap) {
        this.f165602a = aVar;
        C66467o.m259790a(new C66467o.AbstractC66469a() {
            /* class com.tt.miniapp.aa.C65722b.C657231 */

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: b */
            public void mo230316b() {
                AbstractC65725a aVar = aVar;
                if (aVar != null) {
                    aVar.mo230321a();
                }
            }

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: c */
            public void mo230317c() {
                AbstractC65725a aVar = aVar;
                if (aVar != null) {
                    aVar.mo230322b();
                }
            }

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: d */
            public void mo230318d() {
                AbstractC65725a aVar = aVar;
                if (aVar != null) {
                    aVar.mo230323c();
                }
            }

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: e */
            public void mo230319e() {
                AbstractC65725a aVar = aVar;
                if (aVar != null) {
                    aVar.mo230324d();
                }
            }

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: f */
            public void mo230320f() {
                AbstractC65725a aVar = aVar;
                if (aVar != null) {
                    aVar.mo230325e();
                }
            }
        }, hashMap, this.f165603b);
    }

    /* renamed from: a */
    public boolean mo230314a(int i, int i2, Intent intent) {
        final AbstractC65725a aVar = this.f165602a;
        if (aVar == null) {
            return false;
        }
        this.f165602a = null;
        return C66467o.m259791a(i, i2, intent, new C66467o.AbstractC66469a() {
            /* class com.tt.miniapp.aa.C65722b.C657242 */

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: b */
            public void mo230316b() {
                aVar.mo230321a();
            }

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: c */
            public void mo230317c() {
                aVar.mo230322b();
            }

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: d */
            public void mo230318d() {
                aVar.mo230323c();
            }

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: e */
            public void mo230319e() {
                aVar.mo230324d();
            }

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: f */
            public void mo230320f() {
                aVar.mo230325e();
            }
        }, this.f165603b);
    }
}
