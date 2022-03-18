package com.larksuite.component.openplatform.core.plugin.vc.audio.async;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.vc.audio.async.d */
public class C25490d extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "operateAudio";
    }

    public C25490d() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            int optInt = jSONObject.optInt("audioId");
            String optString = jSONObject.optString("operationType");
            C254911 r4 = new AbstractC65746a.AbstractC65751e() {
                /* class com.larksuite.component.openplatform.core.plugin.vc.audio.async.C25490d.C254911 */

                @Override // com.tt.miniapp.audio.AbstractC65746a.AbstractC65751e
                /* renamed from: a */
                public void mo88627a() {
                    C25490d.this.callbackOk();
                }

                @Override // com.tt.miniapp.audio.AbstractC65746a.AbstractC65751e
                /* renamed from: a */
                public void mo88628a(String str, Throwable th) {
                    AppBrandLogger.eWithThrowable("tma_ApiOperateAudioCtrl", "onFail", th);
                    C25490d.this.callbackFail(str, (JSONObject) null, th);
                }
            };
            if (TextUtils.equals(optString, "play")) {
                AbstractC65746a.m257747a(getAppContext()).mo230377a(optInt, r4);
            } else if (TextUtils.equals(optString, "pause")) {
                AbstractC65746a.m257747a(getAppContext()).mo230380b(optInt, r4);
            } else if (TextUtils.equals(optString, "stop")) {
                AbstractC65746a.m257747a(getAppContext()).mo230383c(optInt, r4);
            } else if (TextUtils.equals(optString, "seek")) {
                AbstractC65746a.m257747a(getAppContext()).mo230376a(optInt, jSONObject.optInt("currentTime"), r4);
            } else {
                callbackFail(ApiCallResultHelper.generateIllegalParamExtraInfo("operationType"));
            }
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_ApiOperateAudioCtrl", "act", e);
            callbackFail(e);
        }
    }

    public C25490d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
