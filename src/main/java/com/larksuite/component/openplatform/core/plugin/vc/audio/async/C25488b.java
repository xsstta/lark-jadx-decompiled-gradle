package com.larksuite.component.openplatform.core.plugin.vc.audio.async;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapphost.entity.C67522b;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.vc.audio.async.b */
public class C25488b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "destroyAudioInstance";
    }

    public C25488b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            int optInt = new JSONObject(this.mArgs).optInt("audioId");
            C67522b bVar = new C67522b();
            if (AbstractC65746a.m257747a(getAppContext()).mo230381b(optInt, bVar)) {
                callbackOk();
                return;
            }
            AppBrandLogger.eWithThrowable("tma_ApiDestroyAudioInstanceCtrl", "Exception", bVar.mo234470b());
            callbackFail(bVar.mo234468a(), (JSONObject) null, bVar.mo234470b());
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_ApiDestroyAudioInstanceCtrl", "act", e);
            callbackFail(e);
        }
    }

    public C25488b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
