package com.tt.miniapp.p3331t;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;

/* renamed from: com.tt.miniapp.t.i */
public class C66889i extends AbstractC66880a {
    @Override // com.tt.miniapp.p3331t.AbstractC66884d
    /* renamed from: b */
    public String mo232869b() {
        return "onTabBarReady";
    }

    @Override // com.tt.miniapp.p3331t.AbstractC66884d
    /* renamed from: a */
    public void mo232868a() {
        C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(this.f168706a).getRouteEventCtrl();
        if (routeEventCtrl != null) {
            routeEventCtrl.mo232876e();
        }
    }

    public C66889i(IAppContext iAppContext) {
        super(iAppContext);
    }
}
