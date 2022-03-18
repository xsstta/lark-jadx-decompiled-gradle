package com.larksuite.component.openplatform.core.plugin.settings;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapphost.host.HostDependManager;
import org.json.JSONException;

public class ApiGetSettingPlugin extends OPPlugin {

    private static class ApiGetSettingRequest extends C25920a {
        private ApiGetSettingRequest() {
        }
    }

    private static class ApiGetSettingResponse extends C25921b {
        @JSONField(name = "authSetting")
        public JSONObject authSetting;

        private ApiGetSettingResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"getSetting"})
    public void getSettingAsync(LKEvent lKEvent, AbstractC25897h<ApiGetSettingResponse> hVar) {
        ApiGetSettingResponse apiGetSettingResponse = new ApiGetSettingResponse();
        ILogger b = lKEvent.mo92134c().mo92190b();
        b.mo92224i("ApiGetSettingPlugin", "invoke api");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            HostDependManager.getInst().getLocalScope(jSONObject, getAppContext());
            apiGetSettingResponse.authSetting = JSON.parseObject(jSONObject.toString());
            hVar.callback(apiGetSettingResponse);
        } catch (JSONException e) {
            fillFailedResponse(apiGetSettingResponse, C25906a.f64080j, "internal error json");
            hVar.callback(apiGetSettingResponse);
            b.mo92223e("ApiGetSettingPlugin", e);
        }
    }
}
