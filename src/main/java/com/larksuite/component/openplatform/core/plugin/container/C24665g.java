package com.larksuite.component.openplatform.core.plugin.container;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AbstractC66202i;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.g */
public class C24665g extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setMenuButtonVisibility";
    }

    public C24665g() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            AbstractC67497e activityProxy = ((MiniappHostBase) getAppContext().getCurrentActivity()).getActivityProxy();
            if (activityProxy == null) {
                AppBrandLogger.m52829e("ApiSetMenuButtonVisibilityCtrl", "iActivityProxy is null");
                callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("IActivityProxy"));
                return;
            }
            AbstractC66202i A = activityProxy.mo232109A();
            if (A == null) {
                AppBrandLogger.m52829e("ApiSetMenuButtonVisibilityCtrl", "iTitleBar is null");
                callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("ITitleBar"));
                return;
            }
            boolean optBoolean = jSONObject.optBoolean("visible", true);
            AppBrandLogger.m52830i("ApiSetMenuButtonVisibilityCtrl", " set visible " + optBoolean);
            A.mo230940b(optBoolean, getAppContext());
            callbackOk();
        } catch (JSONException e) {
            DebugUtil.outputError("ApiSetMenuButtonVisibilityCtrl", e);
            callbackFail(ApiCallResultHelper.generateIllegalArgExtraInfo(this.mArgs));
        }
    }

    public C24665g(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
