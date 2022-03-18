package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapphost.AppbrandContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.i */
public class C25389i extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "getAppbrandSettingsSync";
    }

    public C25389i() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        try {
            JSONArray optJSONArray = new JSONObject(this.f168426a).optJSONArray("fields");
            if (optJSONArray == null) {
                return mo232451b(ApiCallResultHelper.generateDataNullExtraInfo("fields"));
            }
            String optString = optJSONArray.optString(0);
            JSONObject a = C12738a.m52725a(AppbrandContext.getInst().getApplicationContext());
            if (a == null) {
                AppBrandLogger.m52829e("ApiGetAppBrandSettingsCtrl", "settings is null");
                return mo232451b(ApiCallResultHelper.generateDataNullExtraInfo("settings"));
            }
            JSONObject optJSONObject = a.optJSONObject(optString);
            if (optJSONObject == null) {
                AppBrandLogger.m52829e("ApiGetAppBrandSettingsCtrl", "targetModule is null");
                return mo232451b(ApiCallResultHelper.generateDataNullExtraInfo("targetModule"));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, optJSONObject.toString());
            return mo232446a(jSONObject);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiGetAppBrandSettingsCtrl", e);
            return mo232445a(e);
        }
    }

    public C25389i(String str) {
        super(str);
    }
}
