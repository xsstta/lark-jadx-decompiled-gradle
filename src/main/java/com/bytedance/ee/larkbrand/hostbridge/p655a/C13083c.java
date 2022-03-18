package com.bytedance.ee.larkbrand.hostbridge.p655a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67570a;
import com.tt.miniapphost.process.p3379e.C67577a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.c */
public class C13083c implements AbstractC67570a {

    /* renamed from: a */
    private AbstractC41371j f34765a;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public String mo49145a() {
        return "lark_get_deviceId";
    }

    public C13083c(AbstractC41371j jVar) {
        this.f34765a = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public void mo49146a(CrossProcessDataEntity crossProcessDataEntity, final C67577a aVar) {
        AppBrandLogger.m52830i("GetDeviceIdHandler", "get device id ipc");
        this.f34765a.mo148989a(new AbstractC41371j.AbstractC41376e() {
            /* class com.bytedance.ee.larkbrand.hostbridge.p655a.C13083c.C130841 */

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41376e
            /* renamed from: a */
            public void mo49150a(String str) {
                AppBrandLogger.m52830i("GetDeviceIdHandler", "get device id ipc success, id:" + str);
                aVar.mo234768a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("device_id", (Object) str).mo234763b(), true);
            }

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41376e
            /* renamed from: b */
            public void mo49151b(String str) {
                AppBrandLogger.m52829e("GetDeviceIdHandler", "get device id ipc fail, error:" + str);
                try {
                    new JSONObject().put("device_id_error", str);
                } catch (JSONException e) {
                    e.printStackTrace();
                    AppBrandLogger.m52829e("GetDeviceIdHandler", "get device id ipc json fail, error:", e);
                }
                aVar.mo234768a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("device_id_error", (Object) str).mo234763b(), true);
            }
        });
    }
}
