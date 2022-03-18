package com.larksuite.component.openplatform.core.plugin.vc.audio.async;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapphost.entity.C67522b;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.vc.audio.async.c */
public class C25489c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getAudioState";
    }

    public C25489c() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            int optInt = new JSONObject(this.mArgs).optInt("audioId");
            AppBrandLogger.m52828d("tma_ApiGetAudioStateCtrl", "audioId ", Integer.valueOf(optInt));
            C67522b bVar = new C67522b();
            AbstractC65746a.C65747a a = AbstractC65746a.m257747a(getAppContext()).mo230375a(optInt, bVar);
            if (a != null) {
                if (a.f165657e >= 0) {
                    AppBrandLogger.m52828d("tma_ApiGetAudioStateCtrl", "audioState.currentTime ", Long.valueOf(a.f165656d));
                    String str = a.f165653a;
                    String d = getApiDependency().mo235048d(str);
                    AppBrandLogger.m52828d("tma_ApiGetAudioStateCtrl", "schemaUrl ", d, " ", str);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("src", d);
                    jSONObject.put("startTime", a.f165654b);
                    jSONObject.put("paused", a.f165655c);
                    jSONObject.put("currentTime", a.f165656d);
                    jSONObject.put("duration", a.f165657e);
                    jSONObject.put("obeyMuteSwitch", a.f165658f);
                    jSONObject.put("buffered", a.f165659g);
                    jSONObject.put("loop", a.f165661i);
                    jSONObject.put("autoplay", a.f165660h);
                    jSONObject.put("volume", (double) a.f165662j);
                    callbackOk(jSONObject);
                    return;
                }
            }
            if (a != null) {
                AppBrandLogger.m52828d("tma_ApiGetAudioStateCtrl", "audioState.duration < 0 ", Long.valueOf(a.f165657e));
                bVar.mo234467a("audioState.duration == ").mo234467a(Long.valueOf(a.f165657e));
            }
            callbackFail(bVar.mo234468a(), (JSONObject) null, bVar.mo234470b());
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_ApiGetAudioStateCtrl", "act", e);
            callbackFail(e);
        }
    }

    public C25489c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
