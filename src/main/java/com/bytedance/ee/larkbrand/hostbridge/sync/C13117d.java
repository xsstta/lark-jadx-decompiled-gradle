package com.bytedance.ee.larkbrand.hostbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.entity.C66007a;
import com.tt.miniapp.entity.C66011b;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.d */
public class C13117d implements AbstractC67571b {
    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "inner_open_miniapp";
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            AppBrandLogger.m52829e("InnerOpenMiniappSyncHandler", " calldata is null");
            return null;
        }
        String b = crossProcessDataEntity.mo234744b("inner_open_miniapp_schema");
        String b2 = crossProcessDataEntity.mo234744b("inner_open_miniapp_fromid");
        C66011b bVar = new C66011b();
        boolean a = crossProcessDataEntity.mo234743a("inner_open_miniapp_is_gadget_appType", false);
        bVar.mo231056a(a);
        if (a) {
            boolean a2 = crossProcessDataEntity.mo234743a("inner_open_miniapp_isNormalGadgetContainer", true);
            int a3 = crossProcessDataEntity.mo234737a("inner_open_miniapp_from_sandbox_type", -1);
            bVar.mo231058b(a2);
            bVar.mo231055a(a3);
        }
        AppBrandLogger.m52830i("InnerOpenMiniappSyncHandler", " from app " + b2);
        C66007a.m258488a(b, b2, false, false, bVar);
        return null;
    }
}
