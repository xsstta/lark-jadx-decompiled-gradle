package com.bytedance.ee.larkbrand.hostbridge.p655a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13317i;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3379e.C67577a;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.h */
public class C13090h extends AbstractC13088f {
    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public String mo49145a() {
        return "face_offline_prepare";
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public void mo49146a(CrossProcessDataEntity crossProcessDataEntity, final C67577a aVar) {
        if (crossProcessDataEntity == null) {
            AppBrandLogger.m52829e("OfflineFacePrepareHandler", "offline data is null");
            aVar.mo234768a(null, true);
            return;
        }
        LarkExtensionManager.getInstance().getExtension().mo49589a(crossProcessDataEntity.mo234740a("app_id", ""), new AbstractC13317i.AbstractC13318a() {
            /* class com.bytedance.ee.larkbrand.hostbridge.p655a.C13090h.C130911 */

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i.AbstractC13318a
            public void onResult(JSONObject jSONObject) {
                C67577a aVar = aVar;
                if (aVar != null) {
                    aVar.mo234767a(C13090h.this.mo49156a(jSONObject));
                }
            }
        });
    }
}
