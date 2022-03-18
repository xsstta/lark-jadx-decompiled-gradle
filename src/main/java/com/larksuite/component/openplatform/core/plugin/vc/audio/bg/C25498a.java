package com.larksuite.component.openplatform.core.plugin.vc.audio.bg;

import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.audio.background.C65764a;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.vc.audio.bg.a */
public class C25498a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getBackgroundAudioContext";
    }

    public C25498a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        C65764a.m257802a().mo230426a(new C65764a.AbstractC65773b() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.bg.C25498a.C254991 */

            @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65773b
            /* renamed from: a */
            public void mo88631a(int i) {
                if (i != -1) {
                    C25498a.this.callbackOk();
                } else {
                    C25498a.this.callbackFail("bind fail");
                }
            }
        }, getAppContext());
    }

    public C25498a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
