package com.larksuite.component.openplatform.core.plugin.container.tabbar;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.C66661q;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.util.C67054r;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.tabbar.f */
public class C24717f extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setTabBarBadge";
    }

    public C24717f() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (!C67054r.m261338a(getAppContext())) {
            callbackFail(ApiCode.SETTABBARBADGE_NO_TAB);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            Object opt = jSONObject.opt("index");
            if (opt == null) {
                callbackFail(ApiCode.GENERAL_PARAM);
            } else if (opt instanceof Integer) {
                int intValue = ((Integer) opt).intValue();
                if (!jSONObject.has("text")) {
                    callbackFail(ApiCode.SETTABBARBADGE_TEXT_EMPTY);
                    return;
                }
                final String optString = jSONObject.optString("text");
                Activity currentActivity = getAppContext().getCurrentActivity();
                if ((currentActivity instanceof MiniappHostBase) && ((MiniappHostBase) currentActivity).getActivityProxy() != null && (((MiniappHostBase) currentActivity).getActivityProxy() instanceof C66546p)) {
                    if (((C66546p) ((MiniappHostBase) currentActivity).getActivityProxy()).mo232112D() != null) {
                        C66661q D = ((C66546p) ((MiniappHostBase) currentActivity).getActivityProxy()).mo232112D();
                        if (D == null) {
                            AppBrandLogger.m52829e("ApiSetTabbarBadge", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                            return;
                        }
                        final C66661q.C66665a a = D.mo232382a(intValue);
                        if (a == null) {
                            AppBrandLogger.m52829e("ApiSetTabbarBadge", "TabController is null pageIndex " + intValue);
                            callbackFail(ApiCode.SETTABBARBADGE_INDEX_ERROR);
                            return;
                        }
                        AppbrandContext.getMainHandler().post(new Runnable() {
                            /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.C24717f.RunnableC247181 */

                            public void run() {
                                a.mo232408a(true, optString);
                            }
                        });
                        callbackOk();
                        return;
                    }
                }
                AppBrandLogger.m52829e("ApiSetTabbarBadge", "environment not available");
                callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "environment not available");
            } else {
                callbackFail(ApiCode.SHOWTABBARREDDOT_INDEX_IS_NOT_NUMBER);
            }
        } catch (JSONException e) {
            callbackFail(ApiCode.GENERAL_JSON_ERROR);
            AppBrandLogger.m52829e("ApiSetTabbarBadge", e);
        }
    }

    public C24717f(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
