package com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b;

import android.os.Bundle;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24368a;
import com.larksuite.component.openplatform.api.p1105d.AbstractC24375d;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1109b.C24381a;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a;
import com.larksuite.component.openplatform.core.p1121d.C24498b;
import com.larksuite.component.openplatform.core.utils.p1136a.C25526b;

/* renamed from: com.larksuite.component.openplatform.core.a.a.c.b.f */
public class C24399f extends AbstractC24387a {
    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: a */
    public void mo87177a(IAppContext iAppContext, Bundle bundle) {
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: c */
    public String mo87181c() {
        return "STEP_WORKER";
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
    public void mo87180b(final IAppContext iAppContext, final Bundle bundle) {
        AbstractC24375d dVar = (AbstractC24375d) C24498b.m89361a().mo87139a(AbstractC24375d.class);
        if (dVar == null) {
            mo87176a().mo87166a(this, iAppContext, bundle, "-10010", "LAUNCH_SCHEDULER_STEP_NO_RUNNER_PROVIDER");
            return;
        }
        C25526b.m91116a("op_worker_load_start", iAppContext, null, null, null);
        final AbstractC24364a b = dVar.mo87142b(iAppContext, bundle);
        if (b == null) {
            mo87176a().mo87166a(this, iAppContext, bundle, "-10011", "LAUNCH_SCHEDULER_STEP_NO_WORKER");
            return;
        }
        C25526b.m91116a("op_worker_load_result", iAppContext, "success", null, null);
        C25526b.m91116a("op_worker_lib_load_start", iAppContext, null, null, null);
        b.mo87123a(new AbstractC24368a() {
            /* class com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24399f.C244001 */

            @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24368a
            /* renamed from: a */
            public void mo87134a() {
                C24399f.this.mo87179b().mo87282a(b);
                C24399f.this.mo87176a().mo87169b(C24399f.this, iAppContext, bundle);
                C25526b.m91116a("op_worker_lib_load_result", iAppContext, "success", null, null);
            }

            @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24368a
            /* renamed from: a */
            public void mo87135a(String str, String str2) {
                C25526b.m91116a("op_worker_lib_load_result", iAppContext, "fail", null, null);
                C24399f.this.mo87176a().mo87166a(C24399f.this, iAppContext, bundle, "-10012", "LAUNCH_SCHEDULER_STEP_NO_WORKER_LOAD_JSSDK_FAIL");
            }
        });
    }
}
