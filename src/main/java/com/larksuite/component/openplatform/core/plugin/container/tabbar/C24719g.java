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

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.tabbar.g */
public class C24719g extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "showTabBar";
    }

    public C24719g() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (!C67054r.m261338a(getAppContext())) {
            callbackFail(ApiCode.SHOWTABBAR_NO_TAB);
            return;
        }
        try {
            final boolean optBoolean = new JSONObject(this.mArgs).optBoolean("animation", false);
            Activity currentActivity = getAppContext().getCurrentActivity();
            if ((currentActivity instanceof MiniappHostBase) && (((MiniappHostBase) currentActivity).getActivityProxy() instanceof C66546p)) {
                if (((C66546p) ((MiniappHostBase) currentActivity).getActivityProxy()).mo232112D() != null) {
                    final C66661q D = ((C66546p) ((MiniappHostBase) currentActivity).getActivityProxy()).mo232112D();
                    if (D != null) {
                        AppbrandContext.getMainHandler().post(new Runnable() {
                            /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.C24719g.RunnableC247201 */

                            public void run() {
                                if (optBoolean) {
                                    D.mo232391b(true);
                                } else {
                                    D.mo232387a(true);
                                }
                                C24719g.this.callbackOk();
                            }
                        });
                        return;
                    }
                    AppBrandLogger.m52829e("ApiShowTabBar", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment") + " needAnimation " + optBoolean);
                    callbackFail(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                    return;
                }
            }
            AppBrandLogger.m52829e("ApiShowTabBar", "environment not available");
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "environment not available");
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiShowTabBar", e);
            callbackFail(ApiCode.GENERAL_JSON_ERROR);
        }
    }

    public C24719g(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
