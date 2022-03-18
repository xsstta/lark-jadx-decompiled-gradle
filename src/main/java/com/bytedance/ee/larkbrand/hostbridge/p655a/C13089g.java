package com.bytedance.ee.larkbrand.hostbridge.p655a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13317i;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3379e.C67577a;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.g */
public class C13089g extends AbstractC13088f {
    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public String mo49145a() {
        return "face_offline_check_state";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m53632a(C67577a aVar, JSONObject jSONObject) {
        if (aVar != null) {
            aVar.mo234767a(mo49156a(jSONObject));
        }
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public void mo49146a(CrossProcessDataEntity crossProcessDataEntity, C67577a aVar) {
        if (crossProcessDataEntity == null) {
            AppBrandLogger.m52829e("OfflineFaceCheckHandler", "offline data is null");
            aVar.mo234768a(null, true);
            return;
        }
        LarkExtensionManager.getInstance().getExtension().mo49592a(crossProcessDataEntity.mo234740a("app_id", ""), crossProcessDataEntity.mo234743a("checkUpdate", true), new AbstractC13317i.AbstractC13318a(aVar) {
            /* class com.bytedance.ee.larkbrand.hostbridge.p655a.$$Lambda$g$2j3Wllr09GN1zQ9VMXlv3HiLfw */
            public final /* synthetic */ C67577a f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i.AbstractC13318a
            public final void onResult(JSONObject jSONObject) {
                C13089g.this.m53632a((C13089g) this.f$1, (C67577a) jSONObject);
            }
        });
    }
}
