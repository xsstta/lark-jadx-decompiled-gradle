package com.larksuite.component.openplatform.core.plugin.passport;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.passport.a */
public class C25449a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getUserStateDirectly";
    }

    public C25449a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (!C67556a.m262941a("getUserInfo")) {
            callbackAppUnSupportFeature();
            return;
        }
        try {
            CrossProcessDataEntity f = C67556a.m262949f();
            if (f != null) {
                C66467o.C66470b bVar = new C66467o.C66470b(f);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uid", bVar.f167781g);
                jSONObject.put("isLogin", bVar.f167780f);
                callbackOk(jSONObject);
                return;
            }
            callbackFail("get user info fail");
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiGetUserStateDirectlyCtrl", e);
            callbackFail(e);
        }
    }

    public C25449a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
