package com.larksuite.component.openplatform.core.plugin.op;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3369c.C67472a;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.c */
public class C25379c extends ApiHandler {

    /* renamed from: a */
    private String f61908a;

    /* renamed from: b */
    private JSONObject f61909b;

    /* renamed from: c */
    private boolean f61910c;

    /* renamed from: d */
    private boolean f61911d;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "callHostMethod";
    }

    public C25379c() {
    }

    /* renamed from: a */
    private void m90884a() throws JSONException {
        if (!this.f61911d) {
            this.f61911d = true;
            JSONObject jSONObject = new JSONObject(this.mArgs);
            this.f61908a = jSONObject.optString("method");
            this.f61909b = jSONObject.optJSONObject("extra");
            this.f61910c = C66236a.m259224a(this.f61908a, getAppContext());
            if (!HostDependManager.getInst().shouldCheckPermissionBeforeCallhostmethod()) {
                this.f61910c = true;
            }
        }
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        try {
            m90884a();
            if (!this.f61910c) {
                return false;
            }
            return C67472a.m262437a(getAppContext()).mo234221a(this.f61908a, this.f61909b);
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiCallHostMethodCtrl", e);
            return false;
        }
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            m90884a();
            if (!this.f61910c) {
                callbackFail("platform auth deny");
                return;
            }
            Activity currentActivity = getAppContext().getCurrentActivity();
            if (currentActivity != null) {
                C67472a.m262437a(getAppContext()).mo234219a(currentActivity, this.f61908a, this.f61909b, new C67472a.AbstractC67473a() {
                    /* class com.larksuite.component.openplatform.core.plugin.op.C25379c.C253801 */
                });
            } else {
                callbackFail("activity is null");
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiCallHostMethodCtrl", e);
            callbackFail(e);
        }
    }

    public C25379c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        try {
            m90884a();
            if (!this.f61910c) {
                return false;
            }
            return C67472a.m262437a(getAppContext()).mo234220a(this.f61908a, i, i2, intent);
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiCallHostMethodCtrl", e);
            return false;
        }
    }
}
