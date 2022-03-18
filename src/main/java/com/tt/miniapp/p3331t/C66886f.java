package com.tt.miniapp.p3331t;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;

/* renamed from: com.tt.miniapp.t.f */
public class C66886f extends AbstractC66880a {
    @Override // com.tt.miniapp.p3331t.AbstractC66884d
    /* renamed from: b */
    public String mo232869b() {
        return "onAppLaunch";
    }

    @Override // com.tt.miniapp.p3331t.AbstractC66884d
    /* renamed from: a */
    public void mo232868a() {
        C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(this.f168706a).getRouteEventCtrl();
        if (routeEventCtrl != null) {
            routeEventCtrl.mo232870a();
        }
    }

    public C66886f(IAppContext iAppContext) {
        super(iAppContext);
    }
}
