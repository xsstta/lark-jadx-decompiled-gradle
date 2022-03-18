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

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.tabbar.e */
public class C24715e extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setTabBarStyle";
    }

    public C24715e() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (!C67054r.m261338a(getAppContext())) {
            callbackFail(ApiCode.SETTABBARSTYLE_NO_TAB);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            final String optString = jSONObject.optString("color");
            final String optString2 = jSONObject.optString("selectedColor");
            final String optString3 = jSONObject.optString("backgroundColor");
            final String optString4 = jSONObject.optString("borderStyle");
            final String optString5 = jSONObject.optString("borderColor");
            Activity currentActivity = getAppContext().getCurrentActivity();
            if ((currentActivity instanceof MiniappHostBase) && (((MiniappHostBase) currentActivity).getActivityProxy() instanceof C66546p)) {
                if (((C66546p) ((MiniappHostBase) currentActivity).getActivityProxy()).mo232112D() != null) {
                    final C66661q D = ((C66546p) ((MiniappHostBase) currentActivity).getActivityProxy()).mo232112D();
                    if (D != null) {
                        AppbrandContext.getMainHandler().post(new Runnable() {
                            /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.C24715e.RunnableC247161 */

                            public void run() {
                                D.mo232386a(optString, optString2, optString3, optString4, optString5);
                                C24715e.this.callbackOk();
                            }
                        });
                        return;
                    }
                    AppBrandLogger.m52829e("ApiSetTabBarStyle", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment") + " color " + optString + " selectedColor " + optString2 + " backgroundColor " + optString3 + " borderStyle " + optString4);
                    callbackFail(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                    return;
                }
            }
            AppBrandLogger.m52829e("ApiSetTabBarStyle", "environment not available");
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "environment not available");
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiSetTabBarStyle", e);
            callbackFail(ApiCode.GENERAL_JSON_ERROR);
        }
    }

    public C24715e(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
