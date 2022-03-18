package com.larksuite.component.openplatform.core.plugin.device.p1130a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.util.C67032f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.a.a */
public class C24725a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getClipboardData";
    }

    public C24725a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        String a = C67032f.m261248a(AppbrandContext.getInst().getApplicationContext());
        AppBrandLogger.m52830i("tma_ApiGetClipboardData", "api getClipboardData, content length:" + a.length());
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, a);
        callbackOk(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
    }

    public C24725a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
