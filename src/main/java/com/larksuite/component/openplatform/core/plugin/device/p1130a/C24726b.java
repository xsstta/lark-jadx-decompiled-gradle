package com.larksuite.component.openplatform.core.plugin.device.p1130a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.util.C67032f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.a.b */
public class C24726b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setClipboardData";
    }

    public C24726b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            String optString = new JSONObject(this.mArgs).optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            AppBrandLogger.m52830i("tma_ApiSetClipboardData", "api setClipboardData, data length" + optString.length());
            C67032f.m261249a(optString, AppbrandContext.getInst().getApplicationContext());
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, optString);
            callbackOk(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
        } catch (Exception e) {
            callbackFail(e);
            AppBrandLogger.m52829e("tma_ApiSetClipboardData", "api setClipboardData fail", e);
        }
    }

    public C24726b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
