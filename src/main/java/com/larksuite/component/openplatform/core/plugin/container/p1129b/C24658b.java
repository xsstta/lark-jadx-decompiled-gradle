package com.larksuite.component.openplatform.core.plugin.container.p1129b;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.shortcut.C66817a;
import com.tt.miniapp.shortcut.p3328a.C66823c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67531h;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.b.b */
public class C24658b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "checkShortcut";
    }

    public C24658b() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        if (initParams == null || !TextUtils.isEmpty(initParams.mo234509i())) {
            Application applicationContext = AppbrandContext.getInst().getApplicationContext();
            AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo();
            if (appInfo == null) {
                AppBrandLogger.m52829e("ApiCheckShortcutCtrl", "appInfo is null");
                callbackFail("app info is null");
                return;
            }
            C66823c.C66826a a = C66823c.m260732a(applicationContext, new C66817a.C66818a().mo232742b(appInfo.appName).mo232740a(appInfo.icon).mo232743c(appInfo.appId).mo232741a());
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exist", a.f168581a);
                jSONObject2.put("needUpdate", a.f168582b);
                jSONObject.put(UpdateKey.STATUS, jSONObject2);
                callbackOk(jSONObject);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ApiCheckShortcutCtrl", e);
                callbackFail(e);
            }
        } else {
            AppBrandLogger.m52829e("ApiCheckShortcutCtrl", "shortcut launch activty not config");
            callbackFail("feature is not supported in app");
        }
    }

    public C24658b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
