package com.larksuite.component.openplatform.core.plugin.vc.audio.async;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.audio.C65783c;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.vc.audio.async.e */
public class C25492e extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setAudioState";
    }

    public C25492e() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            AbstractC65746a.m257747a(getAppContext()).mo230378a(C65783c.m257855a(this.mArgs, getAppContext()), new AbstractC65746a.AbstractC65751e() {
                /* class com.larksuite.component.openplatform.core.plugin.vc.audio.async.C25492e.C254931 */

                @Override // com.tt.miniapp.audio.AbstractC65746a.AbstractC65751e
                /* renamed from: a */
                public void mo88627a() {
                    C25492e.this.callbackOk();
                }

                @Override // com.tt.miniapp.audio.AbstractC65746a.AbstractC65751e
                /* renamed from: a */
                public void mo88628a(String str, Throwable th) {
                    AppBrandLogger.m52829e("tma_ApiSetAudioState", "onFail", th);
                    C25492e.this.callbackFail(str, (JSONObject) null, th);
                }
            });
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_ApiSetAudioState", "Exception", e);
            callbackFail(e);
        }
    }

    public C25492e(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
