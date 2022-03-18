package com.bytedance.ee.larkbrand.hostbridge.p655a;

import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13317i;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67570a;
import com.tt.miniapphost.process.p3379e.C67577a;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.e */
public class C13086e implements AbstractC67570a {
    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public String mo49145a() {
        return "lark_live_check";
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public void mo49146a(CrossProcessDataEntity crossProcessDataEntity, final C67577a aVar) {
        if (crossProcessDataEntity == null) {
            aVar.mo234768a(null, true);
            return;
        }
        String a = crossProcessDataEntity.mo234740a("scene", "");
        String a2 = crossProcessDataEntity.mo234740a("ticket", "");
        String a3 = crossProcessDataEntity.mo234740a("app_id", "");
        int a4 = crossProcessDataEntity.mo234737a("aid", -1);
        LarkExtensionManager.getInstance().getExtension().mo49591a(a3, a, a2, crossProcessDataEntity.mo234737a("mode", -1), a4, new AbstractC13317i.AbstractC13319b() {
            /* class com.bytedance.ee.larkbrand.hostbridge.p655a.C13086e.C130871 */

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i.AbstractC13319b
            /* renamed from: a */
            public void mo49154a(String str) {
                aVar.mo234767a(new CrossProcessDataEntity.C67574a().mo234760a("reqNo", (Object) str).mo234763b());
            }

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i.AbstractC13319b
            /* renamed from: a */
            public void mo49155a(JSONObject jSONObject) {
                aVar.mo234767a(new CrossProcessDataEntity.C67574a().mo234760a("errorCode", (Object) Integer.valueOf(jSONObject.optInt("errorCode", -1))).mo234760a("errorMsg", (Object) jSONObject.optString("errorMsg", "unknown err")).mo234763b());
            }
        });
    }
}
