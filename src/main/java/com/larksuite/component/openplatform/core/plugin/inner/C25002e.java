package com.larksuite.component.openplatform.core.plugin.inner;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.e */
public class C25002e extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "preloadMiniProgram";
    }

    public C25002e() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52828d("tma_ApiPreloadMiniappCtrl", this.mArgs);
        C67556a.m262943b(this.mArgs, new AbstractC67565b() {
            /* class com.larksuite.component.openplatform.core.plugin.inner.C25002e.C250031 */

            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
            /* renamed from: a */
            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                String str;
                String str2;
                if (crossProcessDataEntity != null) {
                    boolean d = crossProcessDataEntity.mo234746d("preload_app_result");
                    if (d) {
                        C25002e.this.callbackOk();
                        str = "";
                    } else {
                        str = crossProcessDataEntity.mo234744b("preload_app_failed_message");
                        C25002e.this.callbackFail(str);
                    }
                    Object[] objArr = new Object[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("preloadMiniProgram result = ");
                    if (d) {
                        str2 = "success";
                    } else {
                        str2 = "failed , reason : " + str;
                    }
                    sb.append(str2);
                    objArr[0] = sb.toString();
                    AppBrandLogger.m52830i("tma_ApiPreloadMiniappCtrl", objArr);
                    return;
                }
                C25002e.this.callbackFail("ipc fail");
            }
        });
    }

    public C25002e(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
