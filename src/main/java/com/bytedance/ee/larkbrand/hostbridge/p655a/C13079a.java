package com.bytedance.ee.larkbrand.hostbridge.p655a;

import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.p643a.p644a.C12946a;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13314g;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67570a;
import com.tt.miniapphost.process.p3379e.C67577a;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.a */
public class C13079a implements AbstractC67570a {
    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public String mo49145a() {
        return "lark_external_check";
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public void mo49146a(CrossProcessDataEntity crossProcessDataEntity, final C67577a aVar) {
        if (crossProcessDataEntity == null) {
            aVar.mo234768a(null, true);
            return;
        }
        boolean d = crossProcessDataEntity.mo234746d("app_launch");
        String b = crossProcessDataEntity.mo234744b("app_id");
        if (b == null) {
            aVar.mo234768a(null, true);
            return;
        }
        C130801 r0 = new AbstractC13314g.AbstractC13315a() {
            /* class com.bytedance.ee.larkbrand.hostbridge.p655a.C13079a.C130801 */

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13314g.AbstractC13315a
            /* renamed from: a */
            public void mo48844a() {
                aVar.mo234768a(null, true);
            }

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13314g.AbstractC13315a
            /* renamed from: a */
            public void mo48845a(String str) {
                aVar.mo234768a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("hostExternalCheckData", (Object) str).mo234763b(), true);
            }
        };
        if (d) {
            C12946a.m53334a().mo48843a(b, r0);
        } else {
            LarkExtensionManager.getInstance().getExtension().mo49587a(b, r0);
        }
    }
}
