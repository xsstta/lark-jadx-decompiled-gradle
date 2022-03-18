package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.s */
public class C25419s extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getTimingSettings";
    }

    public C25419s() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        boolean z;
        CrossProcessDataEntity i;
        JSONObject optJSONObject;
        AppbrandConstant.C65701b.m257612c();
        try {
            int i2 = 30;
            String str = "https://i.snssdk.com/api/apps/report_duration";
            if (!C67556a.m262941a("getHostSettings") || (i = C67556a.m262952i()) == null || (optJSONObject = i.mo234749f("jsonData").optJSONObject("js_timing_settings")) == null) {
                z = false;
            } else {
                z = optJSONObject.optBoolean("switch", false);
                AppbrandConstant.C65701b.m257612c();
                str = optJSONObject.optString("url", str);
                i2 = optJSONObject.optInt("interval", 30);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("switch", z);
            jSONObject.put("url", str);
            jSONObject.put("interval", i2);
            callbackOk(jSONObject);
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiGetTimingSettingCtrl", e);
            callbackFail(e);
        }
    }

    public C25419s(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
