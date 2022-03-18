package com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b;

import android.os.Bundle;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a;
import com.larksuite.component.openplatform.api.p1105d.AbstractC24375d;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1109b.C24381a;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a;
import com.larksuite.component.openplatform.core.p1121d.C24498b;
import com.larksuite.component.openplatform.core.utils.p1136a.C25526b;

/* renamed from: com.larksuite.component.openplatform.core.a.a.c.b.e */
public class C24398e extends AbstractC24387a {
    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: a */
    public void mo87177a(IAppContext iAppContext, Bundle bundle) {
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: c */
    public String mo87181c() {
        return "STEP_RENDER";
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: c */
    public void mo87182c(IAppContext iAppContext, Bundle bundle) {
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: d */
    public boolean mo87183d() {
        return true;
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: a */
    public void mo87178a(C24381a aVar, AbstractC24469d dVar) {
        super.mo87178a(aVar, dVar);
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: b */
    public void mo87180b(IAppContext iAppContext, Bundle bundle) {
        AbstractC24375d dVar = (AbstractC24375d) C24498b.m89361a().mo87139a(AbstractC24375d.class);
        if (dVar == null) {
            mo87176a().mo87166a(this, iAppContext, bundle, "-10010", "LAUNCH_SCHEDULER_STEP_NO_RUNNER_PROVIDER");
            return;
        }
        C25526b.m91116a("op_render_load_start", iAppContext, null, null, null);
        AbstractC24363a a = dVar.mo87141a(iAppContext, bundle);
        if (a == null) {
            mo87176a().mo87166a(this, iAppContext, bundle, "-10014", "LAUNCH_SCHEDULER_STEP_NO_RENDER");
            return;
        }
        a.mo87118a();
        C25526b.m91116a("op_render_load_result", iAppContext, "success", null, null);
        mo87179b().mo87293k().mo87115a(a);
        mo87176a().mo87169b(this, iAppContext, bundle);
    }
}
