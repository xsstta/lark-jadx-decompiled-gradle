package com.larksuite.component.openplatform.core.plugin.container.tabbar;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.container.impl.C24491h;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.C66661q;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.util.C67054r;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.tabbar.a */
public class C24706a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "hideTabBar";
    }

    public C24706a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (!C67054r.m261338a(getAppContext())) {
            callbackFail(ApiCode.HIDETABBAR_NO_TAB);
            return;
        }
        try {
            final boolean optBoolean = new JSONObject(this.mArgs).optBoolean("animation", false);
            Activity currentActivity = getAppContext().getCurrentActivity();
            AbstractC67497e eVar = null;
            if (currentActivity instanceof MiniappHostBase) {
                eVar = ((MiniappHostBase) currentActivity).getActivityProxy();
            } else if (getAppContext().getAppContainer() instanceof C24491h) {
                eVar = ((C24491h) getAppContext().getAppContainer()).mo87354s();
            } else {
                AppBrandLogger.m52829e("ApiHideTabBar", "app container can not cast to OPLegacyGadgetAppContainer");
            }
            if (eVar instanceof C66546p) {
                if (((C66546p) eVar).mo232112D() != null) {
                    final C66661q D = ((C66546p) eVar).mo232112D();
                    if (D != null) {
                        AppbrandContext.getMainHandler().post(new Runnable() {
                            /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.C24706a.RunnableC247071 */

                            public void run() {
                                if (optBoolean) {
                                    D.mo232391b(false);
                                } else {
                                    D.mo232387a(false);
                                }
                                C24706a.this.callbackOk();
                            }
                        });
                        return;
                    }
                    AppBrandLogger.m52829e("ApiHideTabBar", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment") + " needAnimation " + optBoolean);
                    callbackFail(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                    return;
                }
            }
            AppBrandLogger.m52829e("ApiHideTabBar", "environment not available");
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "environment not available");
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiHideTabBar", e);
            callbackFail(ApiCode.GENERAL_JSON_ERROR);
        }
    }

    public C24706a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
