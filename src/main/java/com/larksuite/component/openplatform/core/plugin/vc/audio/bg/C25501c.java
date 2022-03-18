package com.larksuite.component.openplatform.core.plugin.vc.audio.bg;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.audio.background.C65764a;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.vc.audio.bg.c */
public class C25501c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "operateBgAudio";
    }

    public C25501c() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString("operationType");
            C255021 r3 = new C65764a.AbstractC65774c() {
                /* class com.larksuite.component.openplatform.core.plugin.vc.audio.bg.C25501c.C255021 */

                @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65774c
                /* renamed from: a */
                public void mo88634a() {
                    C25501c.this.callbackOk();
                }

                @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65774c
                /* renamed from: a */
                public void mo88635a(String str, Throwable th) {
                    C25501c.this.callbackFail(str, (JSONObject) null, th);
                }
            };
            if (TextUtils.equals(optString, "play")) {
                C65764a.m257802a().mo230427a(r3, getAppContext());
            } else if (TextUtils.equals(optString, "pause")) {
                C65764a.m257802a().mo230429b(r3, getAppContext());
            } else if (TextUtils.equals(optString, "stop")) {
                C65764a.m257802a().mo230430c(r3, getAppContext());
            } else if (TextUtils.equals(optString, "seek")) {
                C65764a.m257802a().mo230424a(jSONObject.optInt("currentTime"), r3, getAppContext());
            } else {
                callbackFail(ApiCallResultHelper.generateIllegalParamExtraInfo("operationType"));
            }
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_ApiOperateBgAudioCtrl", "act", e);
            callbackFail(e);
        }
    }

    public C25501c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
