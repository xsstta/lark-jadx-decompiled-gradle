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

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.tabbar.b */
public class C24708b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "hideTabBarRedDot";
    }

    public C24708b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (!C67054r.m261338a(getAppContext())) {
            callbackFail(ApiCode.HIDETABBARREDDOT_NO_TAB);
            return;
        }
        try {
            int optInt = new JSONObject(this.mArgs).optInt("index", -1);
            if (optInt == -1) {
                callbackFail(ApiCode.HIDETABBARREDDOT_INDEX_IS_NOT_NUMBER);
                return;
            }
            Activity currentActivity = getAppContext().getCurrentActivity();
            if ((currentActivity instanceof MiniappHostBase) && ((MiniappHostBase) currentActivity).getActivityProxy() != null && (((MiniappHostBase) currentActivity).getActivityProxy() instanceof C66546p)) {
                if (((C66546p) ((MiniappHostBase) currentActivity).getActivityProxy()).mo232112D() != null) {
                    C66661q D = ((C66546p) ((MiniappHostBase) currentActivity).getActivityProxy()).mo232112D();
                    if (D == null) {
                        AppBrandLogger.m52829e("ApiHideTabbarBadge", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                        callbackFail(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                        return;
                    }
                    final C66661q.C66665a a = D.mo232382a(optInt);
                    if (a == null) {
                        AppBrandLogger.m52829e("ApiHideTabbarBadge", "TabController is null pageIndex " + optInt);
                        callbackFail(ApiCode.HIDETABBARREDDOT_INDEX_ERROR);
                        return;
                    }
                    AppbrandContext.getMainHandler().post(new Runnable() {
                        /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.C24708b.RunnableC247091 */

                        public void run() {
                            a.mo232407a(false);
                        }
                    });
                    callbackOk();
                    return;
                }
            }
            AppBrandLogger.m52829e("ApiHideTabbarBadge", "environment not available");
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "environment not available");
        } catch (JSONException e) {
            callbackFail(ApiCode.GENERAL_JSON_ERROR);
            AppBrandLogger.m52829e("ApiHideTabbarBadge", e);
        }
    }

    public C24708b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
