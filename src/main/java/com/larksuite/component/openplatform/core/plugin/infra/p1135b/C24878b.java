package com.larksuite.component.openplatform.core.plugin.infra.p1135b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@ApiSupportType(apiName = {"checkLocalFaceVerify"}, support = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.b.b */
public class C24878b extends AbstractC24877a {
    public C24878b() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("checkLocalFaceVerify");
    }

    @Override // com.larksuite.component.openplatform.core.plugin.infra.p1135b.AbstractC24877a
    /* renamed from: b */
    public void mo87934b() {
        mo87930a(C67501b.ba).flush();
    }

    /* renamed from: a */
    private void m90046a(boolean z) {
        C67560a.m262959a("face_offline_check_state", CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_id", (Object) C67432a.m262319a(mo230473f()).getAppInfo().appId).mo234760a("checkUpdate", (Object) Boolean.valueOf(z)).mo234763b(), new AbstractC67565b() {
            /* class com.larksuite.component.openplatform.core.plugin.infra.p1135b.C24878b.C248791 */

            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
            /* renamed from: a */
            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                AppBrandLogger.m52830i("OfflineFaceVerifyCheckReady", "OfflineFaceVerifyCheckReady getIpcCallback");
                C24878b.this.mo87933a(crossProcessDataEntity);
            }
        });
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("OfflineFaceVerifyCheckReady", "handle Api " + mo230472e());
        boolean booleanValue = ((Boolean) bVar.mo234985a("checkUpdate", true)).booleanValue();
        AppBrandLogger.m52830i("OfflineFaceVerifyCheckReady", "checkUpdate = " + booleanValue);
        m90046a(booleanValue);
    }

    public C24878b(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.infra.p1135b.AbstractC24877a
    /* renamed from: a */
    public void mo87932a(int i, String str, JSONObject jSONObject) {
        mo87930a(C67501b.bb).setErrorCode(String.valueOf(i)).setErrorMessage(str).flush();
    }
}
