package com.tt.miniapp.p3331t;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3331t.AbstractC66882c;

/* renamed from: com.tt.miniapp.t.g */
public class C66887g extends AbstractC66880a {

    /* renamed from: b */
    private AbstractC66882c.C66883a f168712b;

    @Override // com.tt.miniapp.p3331t.AbstractC66884d
    /* renamed from: b */
    public String mo232869b() {
        return "onAppRoute";
    }

    @Override // com.tt.miniapp.p3331t.AbstractC66884d
    /* renamed from: a */
    public void mo232868a() {
        C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(this.f168706a).getRouteEventCtrl();
        if (routeEventCtrl != null) {
            routeEventCtrl.mo232871a(this.f168712b);
        }
    }

    public C66887g(AbstractC66882c.C66883a aVar, IAppContext iAppContext) {
        super(iAppContext);
        this.f168712b = aVar;
    }
}
