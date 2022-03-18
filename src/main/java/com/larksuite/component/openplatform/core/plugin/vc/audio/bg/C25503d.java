package com.larksuite.component.openplatform.core.plugin.vc.audio.bg;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.audio.background.BgAudioModel;
import com.tt.miniapp.audio.background.C65764a;
import com.tt.miniapphost.entity.C67522b;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.vc.audio.bg.d */
public class C25503d extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setBgAudioState";
    }

    public C25503d() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        C67522b bVar = new C67522b();
        BgAudioModel a = BgAudioModel.m257794a(this.mArgs, bVar, getAppContext());
        if (a == null) {
            AppBrandLogger.m52829e("tma_SetBgAudioModelCtrl", "model == null");
            callbackFail(bVar.mo234468a(), (JSONObject) null, bVar.mo234470b());
            return;
        }
        C65764a.m257802a().mo230425a(a, new C65764a.AbstractC65774c() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.bg.C25503d.C255041 */

            @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65774c
            /* renamed from: a */
            public void mo88634a() {
                C25503d.this.callbackOk();
            }

            @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65774c
            /* renamed from: a */
            public void mo88635a(String str, Throwable th) {
                C25503d.this.callbackFail(str, (JSONObject) null, th);
            }
        }, getAppContext());
    }

    public C25503d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
