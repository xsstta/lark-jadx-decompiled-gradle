package com.tt.miniapp.webbridge.aysnc;

import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.p3283f.p3284a.C66041a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;

/* renamed from: com.tt.miniapp.webbridge.aysnc.b */
public class C67305b extends ApiHandler {

    /* renamed from: a */
    public boolean f169848a;

    /* renamed from: b */
    private C67307a f169849b;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "openCustomerService";
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    /* renamed from: com.tt.miniapp.webbridge.aysnc.b$a */
    private class C67307a implements C66041a.AbstractC66044a, C66467o.AbstractC66469a {
        @Override // com.tt.miniapp.p3283f.p3284a.C66041a.AbstractC66044a
        /* renamed from: a */
        public void mo231132a() {
            AppBrandLogger.m52828d("ApiOpenCustomerServiceCtrl", "OpenCustomerServiceSuccess");
            C67305b.this.callbackOk();
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: b */
        public void mo230316b() {
            C67305b.this.unRegesterResultHandler();
            C66041a.m258630a(C67305b.this.getAppContext()).mo231127a(this);
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: c */
        public void mo230317c() {
            C67305b.this.f169848a = true;
            AppBrandLogger.m52828d("ApiOpenCustomerServiceCtrl", "onTriggerHostClientLogin");
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: d */
        public void mo230318d() {
            C67305b.this.unRegesterResultHandler();
            AppBrandLogger.m52828d("ApiOpenCustomerServiceCtrl", "onLoginFail");
            C67305b.this.callbackFail("login failed");
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: e */
        public void mo230319e() {
            C67305b.this.unRegesterResultHandler();
            AppBrandLogger.m52828d("ApiOpenCustomerServiceCtrl", "onLoginWhenBackground");
            C67305b.this.callbackFail("login fail background");
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: f */
        public void mo230320f() {
            C67305b.this.unRegesterResultHandler();
            AppBrandLogger.m52828d("ApiOpenCustomerServiceCtrl", "onLoginUnSupport");
            C67305b.this.callbackFail("login is not supported in app");
        }

        private C67307a() {
        }

        @Override // com.tt.miniapp.p3283f.p3284a.C66041a.AbstractC66044a
        /* renamed from: a */
        public void mo231133a(String str) {
            AppBrandLogger.m52828d("ApiOpenCustomerServiceCtrl", "OpenCustomerServiceFail");
            C67305b.this.callbackFail(str);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (!HostDependManager.getInst().supportCustomerService()) {
            callbackFail("feature is not supported in app");
            return;
        }
        boolean z = C66467o.m259788a(getAppContext()).f167780f;
        this.f169849b = new C67307a();
        if (z) {
            C66041a.m258630a(getAppContext()).mo231127a(this.f169849b);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("key_customer_service_login_flag", "");
        C66467o.m259790a(this.f169849b, hashMap, getAppContext());
    }

    public C67305b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (this.f169848a) {
            return C66467o.m259791a(i, i2, intent, this.f169849b, getAppContext());
        }
        return false;
    }
}
