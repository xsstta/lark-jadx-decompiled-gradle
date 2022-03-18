package com.bytedance.ee.larkbrand.permission;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.permission.b */
public class C13284b implements AbstractC13281a {

    /* renamed from: a */
    private List<AbstractC13281a> f35183a = new ArrayList();

    /* renamed from: b */
    private boolean f35184b;

    @Override // com.bytedance.ee.larkbrand.permission.AbstractC13281a
    /* renamed from: c */
    public boolean mo49520c(IAppContext iAppContext) {
        return this.f35184b;
    }

    /* renamed from: a */
    public void mo49521a(AbstractC13281a aVar) {
        this.f35183a.add(aVar);
    }

    @Override // com.bytedance.ee.larkbrand.permission.AbstractC13281a
    /* renamed from: a */
    public void mo49518a(IAppContext iAppContext) {
        for (AbstractC13281a aVar : this.f35183a) {
            if (!aVar.mo49520c(iAppContext)) {
                aVar.mo49518a(iAppContext);
            }
        }
        this.f35184b = true;
    }

    @Override // com.bytedance.ee.larkbrand.permission.AbstractC13281a
    /* renamed from: b */
    public void mo49519b(IAppContext iAppContext) {
        for (AbstractC13281a aVar : this.f35183a) {
            if (aVar.mo49520c(iAppContext)) {
                aVar.mo49519b(iAppContext);
            }
        }
        this.f35184b = false;
    }
}
