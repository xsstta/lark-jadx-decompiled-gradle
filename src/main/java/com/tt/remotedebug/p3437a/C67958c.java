package com.tt.remotedebug.p3437a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d;
import com.bytedance.ee.lark.infra.network.p622a.p626b.C12810b;
import com.bytedance.ee.lark.infra.network.p622a.p626b.C12811c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.remotedebug.C67949a;
import com.tt.remotedebug.p3438b.C67965b;

/* renamed from: com.tt.remotedebug.a.c */
public class C67958c {

    /* renamed from: a */
    private C12811c f171214a;

    /* renamed from: a */
    public void mo235816a() {
        C12811c cVar = this.f171214a;
        if (cVar != null) {
            cVar.mo48386c();
        }
    }

    /* renamed from: b */
    public void mo235819b() {
        C12811c cVar = this.f171214a;
        if (cVar != null) {
            cVar.mo48387d();
        }
    }

    /* renamed from: a */
    public void mo235817a(AbstractC12821d dVar) {
        this.f171214a.mo48383a(dVar);
    }

    C67958c(IAppContext iAppContext) {
        C12811c.C12820a aVar = new C12811c.C12820a(AppbrandContext.getInst().getApplicationContext());
        C12810b bVar = new C12810b();
        bVar.f34201a = C67949a.m264516b().mo235812a();
        this.f171214a = aVar.mo48406a(false).mo48404a(bVar).mo48405a(bVar.f34201a).mo48407a(iAppContext);
        new C67500a(C67965b.f171226a, iAppContext).flush();
    }

    /* renamed from: a */
    public void mo235818a(String str) {
        C12811c cVar = this.f171214a;
        if (cVar != null) {
            boolean a = cVar.mo48384a(str);
            AppBrandLogger.m52830i("VscJsCore", "vsJsCore send: " + str + " ret: " + a);
        }
    }
}
