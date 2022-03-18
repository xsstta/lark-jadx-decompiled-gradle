package com.larksuite.component.openplatform.core.plugin.vc.audio.async;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.vc.audio.async.a */
public class C25487a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "createAudioInstance";
    }

    public C25487a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("audioId", ContextSingletonInstance.getInstance().audioId.getAndIncrement());
            callbackOk(jSONObject);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_ApiCreateAudioInstanceCtrl", "act", e);
            callbackFail(e);
        }
    }

    public C25487a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
