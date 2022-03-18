package com.tt.miniapp.webbridge.aysnc;

import android.content.Intent;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.manager.C66467o;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.tt.miniapp.webbridge.aysnc.a */
public class C67303a extends ApiHandler {

    /* renamed from: a */
    public boolean f169845a;

    /* renamed from: b */
    private C66467o.AbstractC66469a f169846b = new C66467o.AbstractC66469a() {
        /* class com.tt.miniapp.webbridge.aysnc.C67303a.C673041 */

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: b */
        public void mo230316b() {
            C67303a.this.callbackOk();
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: c */
        public void mo230317c() {
            C67303a.this.f169845a = true;
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: d */
        public void mo230318d() {
            C67303a.this.callbackFail("login fail");
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: e */
        public void mo230319e() {
            C67303a.this.callbackFail("background");
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: f */
        public void mo230320f() {
            C67303a.this.callbackAppUnSupportFeature();
        }
    };

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "hostLogin";
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        C66467o.m259790a(this.f169846b, null, getAppContext());
    }

    public C67303a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (this.f169845a) {
            return C66467o.m259791a(i, i2, intent, this.f169846b, getAppContext());
        }
        return false;
    }
}
