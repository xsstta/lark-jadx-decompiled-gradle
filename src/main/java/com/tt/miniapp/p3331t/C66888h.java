package com.tt.miniapp.p3331t;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;

/* renamed from: com.tt.miniapp.t.h */
public class C66888h extends AbstractC66880a {
    @Override // com.tt.miniapp.p3331t.AbstractC66884d
    /* renamed from: b */
    public String mo232869b() {
        return "onShow";
    }

    @Override // com.tt.miniapp.p3331t.AbstractC66884d
    /* renamed from: a */
    public void mo232868a() {
        C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(this.f168706a).getRouteEventCtrl();
        if (routeEventCtrl != null) {
            routeEventCtrl.mo232874c();
        }
    }

    public C66888h(IAppContext iAppContext) {
        super(iAppContext);
    }
}
