package com.larksuite.component.openplatform.core.plugin.op;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.view.swipeback.C67224a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.C67478b;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.aa */
public class C25329aa extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "showErrorPage";
    }

    public C25329aa() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            Activity currentActivity = getAppContext().getCurrentActivity();
            if (currentActivity == null) {
                callbackFail("activity is null");
                return;
            }
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString(ShareHitPoint.f121869d);
            if (TextUtils.isEmpty(optString)) {
                callbackFail(ApiCallResultHelper.generateIllegalParamExtraInfo(ShareHitPoint.f121869d));
                return;
            }
            C67224a.f169674a = "others";
            C67224a.f169675b = true;
            String schema = AppbrandApplicationImpl.getInst(getAppContext()).getSchema();
            if (TextUtils.isEmpty(schema) || !HostDependManager.getInst().handleAppbrandDisablePage(currentActivity, schema)) {
                HostDependManager.getInst().jumpToWebView(currentActivity, m90820a(optString), null, true);
            }
            callbackOk();
            if (jSONObject.optBoolean("closeApp")) {
                C67070z.m261391a(currentActivity, 14, getAppContext());
            } else {
                C67070z.m261391a(currentActivity, 9, getAppContext());
            }
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiShowErrorPageCtrl", e);
            callbackFail(e);
        }
    }

    /* renamed from: a */
    private String m90820a(String str) {
        return AppbrandConstant.C65701b.m257612c().mo230139d() + "/" + str + "?" + C67478b.m262466b();
    }

    public C25329aa(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
