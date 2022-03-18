package com.bytedance.ee.larkbrand.permission;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.permission.p662a.C13282a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b;

/* renamed from: com.bytedance.ee.larkbrand.permission.j */
public class C13299j implements AbstractC67728b {
    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b
    /* renamed from: a */
    public String mo49147a() {
        return "sync_auth";
    }

    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b
    /* renamed from: a */
    public void mo49148a(CrossProcessDataEntity crossProcessDataEntity, final AbstractC67727a aVar) {
        if (crossProcessDataEntity == null) {
            AppBrandLogger.m52830i("SyncAuthCrossCallHandler", "sync auth data is null");
            aVar.mo49530a(null);
            return;
        }
        String b = crossProcessDataEntity.mo234744b("app_id");
        AppType appType = AppType.GadgetAPP;
        if (crossProcessDataEntity.mo234745c("app_type") != null) {
            appType = (AppType) crossProcessDataEntity.mo234745c("app_type");
        }
        AppBrandLogger.m52830i("SyncAuthCrossCallHandler", "sync auth, appId = " + b + " appType = " + appType);
        if (TextUtils.isEmpty(b)) {
            aVar.mo49530a(null);
        } else {
            HostDependManager.getInst().syncAuth(b, C13282a.m54091a(AppbrandContext.getInst().getApplicationContext(), b, appType), new AbstractC13298i() {
                /* class com.bytedance.ee.larkbrand.permission.C13299j.C133001 */

                @Override // com.bytedance.ee.larkbrand.permission.AbstractC13298i
                /* renamed from: a */
                public void mo49531a() {
                    aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("sync_auth_result", (Object) true).mo234763b());
                }

                @Override // com.bytedance.ee.larkbrand.permission.AbstractC13298i
                /* renamed from: b */
                public void mo49532b() {
                    aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("sync_auth_result", (Object) false).mo234763b());
                }
            });
        }
    }
}
