package com.bytedance.ee.larkbrand.hostbridge.p655a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13317i;
import com.huawei.hms.api.ConnectionResult;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3379e.C67577a;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.i */
public class C13092i extends AbstractC13088f {
    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public String mo49145a() {
        return "face_offline_start";
    }

    /* renamed from: a */
    private CrossProcessDataEntity m53637a(String str) {
        String str2;
        AppBrandLogger.m52830i("FaceOfflineStartHandler", "generateFileErrorCallbackData " + str);
        CrossProcessDataEntity.C67574a a = new CrossProcessDataEntity.C67574a().mo234760a("success", (Object) false).mo234760a("errorCode", (Object) Integer.valueOf((int) ConnectionResult.RESOLUTION_REQUIRED));
        if (TextUtils.isEmpty(str)) {
            str2 = "image path is null";
        } else {
            str2 = "image file not exist";
        }
        return a.mo234760a("errorMsg", (Object) str2).mo234763b();
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public void mo49146a(CrossProcessDataEntity crossProcessDataEntity, final C67577a aVar) {
        if (crossProcessDataEntity == null) {
            AppBrandLogger.m52829e("FaceOfflineStartHandler", "offline data is null");
            aVar.mo234768a(null, true);
            return;
        }
        String a = crossProcessDataEntity.mo234740a("app_id", "");
        String a2 = crossProcessDataEntity.mo234740a("path", "");
        if (!TextUtils.isEmpty(a2) && new File(a2).exists()) {
            LarkExtensionManager.getInstance().getExtension().mo49590a(a, a2, new AbstractC13317i.AbstractC13318a() {
                /* class com.bytedance.ee.larkbrand.hostbridge.p655a.C13092i.C130931 */

                @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i.AbstractC13318a
                public void onResult(JSONObject jSONObject) {
                    C67577a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo234767a(C13092i.this.mo49156a(jSONObject));
                    }
                }
            });
        } else if (aVar != null) {
            aVar.mo234767a(m53637a(a2));
        }
    }
}
