package com.larksuite.component.openplatform.core.plugin.messenger;

import android.text.TextUtils;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import org.json.JSONException;
import org.json.JSONObject;

public class LarkApiEnterBotPlugin extends OPPlugin {

    private static class LarkApiEnterBotResponse extends C25921b {
        private LarkApiEnterBotResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"enterBot"})
    public void enterBot(ILogger aVar, AbstractC25897h<LarkApiEnterBotResponse> hVar) {
        LarkApiEnterBotResponse larkApiEnterBotResponse = new LarkApiEnterBotResponse();
        aVar.mo92224i("LarkApiEnterBot", "enter bot appId:" + getAppContext().getAppId());
        AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
        if (appInfo == null || TextUtils.isEmpty(appInfo.encryptextra)) {
            fillFailedResponse(larkApiEnterBotResponse, C25906a.f64080j, "extra info is empty");
            aVar.mo92223e("LarkApiEnterBot", "extra info is empty!");
        } else {
            try {
                String optString = new JSONObject(appInfo.encryptextra).optString("botid");
                if (!TextUtils.isEmpty(optString)) {
                    LarkExtensionManager.getInstance().getExtension().mo49609b(optString, C67432a.m262319a(getAppContext()).getAppInfo().appId, true);
                } else {
                    fillFailedResponse(larkApiEnterBotResponse, C25913h.f64182l, C25913h.f64182l.f64117J);
                    aVar.mo92223e("LarkApiEnterBot", "bot_id is empty!");
                }
            } catch (JSONException e) {
                fillFailedResponse(larkApiEnterBotResponse, C25906a.f64080j, e.getMessage());
                aVar.mo92223e("LarkApiEnterBot", "jsonException ", e);
            }
        }
        hVar.callback(larkApiEnterBotResponse);
    }
}
