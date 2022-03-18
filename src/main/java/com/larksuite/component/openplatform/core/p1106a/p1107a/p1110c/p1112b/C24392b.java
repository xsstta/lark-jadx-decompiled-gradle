package com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b;

import android.os.Bundle;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1109b.C24381a;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a;
import com.larksuite.component.openplatform.core.utils.p1136a.C25526b;

/* renamed from: com.larksuite.component.openplatform.core.a.a.c.b.b */
public class C24392b extends AbstractC24387a {
    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: c */
    public String mo87181c() {
        return "STEP_COMPONENT";
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
    /* renamed from: a */
    public void mo87177a(IAppContext iAppContext, Bundle bundle) {
        mo87179b().mo87290h();
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: b */
    public void mo87180b(IAppContext iAppContext, Bundle bundle) {
        C25526b.m91116a("op_component_lib_load_start", iAppContext, null, null, null);
        if (mo87179b().mo87291i() == null) {
            mo87176a().mo87166a(this, iAppContext, bundle, "-10013", "LAUNCH_SCHEDULER_STEP_NO_COMPONENT");
            C25526b.m91116a("op_component_lib_load_result", iAppContext, "fail", null, null);
            return;
        }
        mo87176a().mo87169b(this, iAppContext, bundle);
        C25526b.m91116a("op_component_lib_load_result", iAppContext, "success", null, null);
    }
}
