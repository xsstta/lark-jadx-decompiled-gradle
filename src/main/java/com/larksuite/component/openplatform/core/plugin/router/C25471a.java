package com.larksuite.component.openplatform.core.plugin.router;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.router.a */
public class C25471a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "navigateBackMiniProgram";
    }

    public C25471a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        Object obj;
        AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
        if (!TextUtils.equals("in_mp", appInfo.launchFrom)) {
            callbackFail("not open by NavigateToMiniProgram");
        } else if (!appInfo.isGame() || m91025a(appInfo)) {
            try {
                String optString = new JSONObject(this.mArgs).optString("extraData");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("appId", AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().appId);
                    if (TextUtils.isEmpty(optString)) {
                        obj = "";
                    } else {
                        obj = new JSONObject(optString);
                    }
                    jSONObject.put("extraData", obj);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("navigateBackMiniProgram", "act", e);
                }
                AppBrandLogger.m52830i("navigateBackMiniProgram", "navigateBackMiniProgram extra = " + optString);
                if (C66612a.m260231a(jSONObject.toString(), true, getAppContext())) {
                    C67070z.m261391a(getAppContext().getCurrentActivity(), 9, getAppContext());
                    callbackOk();
                    return;
                }
                callbackFail("client trigger navigateBack Fail");
            } catch (JSONException unused) {
                callbackFail(ApiCallResultHelper.generateIllegalArgExtraInfo(this.mArgs));
            }
        } else {
            callbackFail("unsupported operation");
        }
    }

    /* renamed from: a */
    private boolean m91025a(AppInfoEntity appInfoEntity) {
        if (appInfoEntity.isWhite()) {
            return true;
        }
        if (TextUtils.isEmpty(appInfoEntity.refererInfo)) {
            return false;
        }
        try {
            return !new JSONObject(appInfoEntity.refererInfo).optBoolean("__NotInnerGame", true);
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("navigateBackMiniProgram", e.getMessage(), e);
            return false;
        }
    }

    public C25471a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
