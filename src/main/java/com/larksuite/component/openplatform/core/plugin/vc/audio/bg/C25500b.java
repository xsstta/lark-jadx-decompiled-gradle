package com.larksuite.component.openplatform.core.plugin.vc.audio.bg;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.audio.background.BgAudioState;
import com.tt.miniapp.audio.background.C65764a;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.vc.audio.bg.b */
public class C25500b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getBgAudioState";
    }

    public C25500b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            BgAudioState b = C65764a.m257802a().mo230428b();
            if (b == null) {
                callbackFail("audio state is null");
            } else if (b.f165736a < 0) {
                callbackFail("audio duration < 0");
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("paused", b.f165738c);
                jSONObject.put("currentTime", b.f165737b);
                jSONObject.put("duration", b.f165736a);
                jSONObject.put("buffered", b.f165739d);
                jSONObject.put("volume", b.f165740e);
                callbackOk(jSONObject);
            }
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_ApiGetBgAudioStateCtrl", "act", e);
            callbackFail(e);
        }
    }

    public C25500b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
