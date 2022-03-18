package com.larksuite.component.openplatform.core.plugin.container.navigation;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.navigation.c */
public class C24684c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setNavigationBarColor";
    }

    public C24684c() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            final String optString = jSONObject.optString("frontColor");
            final String optString2 = jSONObject.optString("backgroundColor");
            AppBrandLogger.m52830i("ApiSetNavigationBarColor", "fontColor ", optString, "backgroundColor", optString2);
            if (!TextUtils.equals(optString, "#ffffff") && !TextUtils.equals(optString, "#000000")) {
                callbackFail(ApiCode.SETNAVIGATIONBARCOLOR_INVALID_FRONT_COLOR);
            } else if (TextUtils.isEmpty(optString2)) {
                callbackFail(ApiCode.SETNAVIGATIONBARCOLOR_INVALID_BACKGROUND_COLOR);
            } else {
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.container.navigation.C24684c.RunnableC246851 */

                    public void run() {
                        RenderViewManager.IRender currentIRender = AppbrandApplicationImpl.getInst(C24684c.this.getAppContext()).getRenderViewManager().getCurrentIRender();
                        if (currentIRender != null) {
                            currentIRender.setNavigationBarColor(optString, optString2);
                            C24684c.this.callbackOk();
                            return;
                        }
                        C24684c.this.callbackFail(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("render"));
                    }
                });
            }
        } catch (IllegalArgumentException e) {
            AppBrandLogger.m52829e("ApiSetNavigationBarColor", e);
            callbackFail(ApiCode.SETNAVIGATIONBARCOLOR_INVALID_BACKGROUND_COLOR);
        } catch (Exception e2) {
            AppBrandLogger.m52829e("ApiSetNavigationBarColor", e2);
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, e2.getMessage());
        }
    }

    public C24684c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
