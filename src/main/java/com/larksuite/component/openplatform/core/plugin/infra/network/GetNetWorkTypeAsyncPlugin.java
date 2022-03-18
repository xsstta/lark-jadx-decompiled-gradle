package com.larksuite.component.openplatform.core.plugin.infra.network;

import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.refer.common.util.NetworkUtil;
import java.util.HashMap;
import org.json.JSONObject;

public class GetNetWorkTypeAsyncPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"getNetworkType"})
    public void getNetworkType(LKEvent lKEvent) {
        HashMap hashMap = new HashMap();
        hashMap.put("networkType", NetworkUtil.m264004a(getAppContext().getApplicationContext()));
        callbackOk(ApiCallResultHelper.generateJsonObjectResponseData(hashMap), lKEvent);
    }

    private void callbackOk(JSONObject jSONObject, LKEvent lKEvent) {
        lKEvent.mo92127a(jSONObject);
    }
}
