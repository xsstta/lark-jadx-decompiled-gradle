package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.C67556a;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.o */
public class C25413o extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getGeneralInfo";
    }

    public C25413o() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            JSONObject d = C67556a.m262947d();
            if (d != null) {
                d.put("tma_jssdk_version", C66399c.m259608a().mo231922b(AppbrandContext.getInst().getApplicationContext(), getAppContext()));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("info", d);
                callbackOk(jSONObject);
                return;
            }
            AppBrandLogger.m52829e("tma_ApiGetGeneralInfoCtrl", "commonParams is null");
            callbackFail("get net common params fail");
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_ApiGetGeneralInfoCtrl", e);
            callbackFail(e);
        }
    }

    public C25413o(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
