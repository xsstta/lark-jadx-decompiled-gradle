package com.larksuite.component.openplatform.core.plugin.container.navigation;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.util.C67052p;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.navigation.d */
public class C24686d extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setNavigationBarTitle";
    }

    public C24686d() {
    }

    /* renamed from: a */
    public boolean mo87667a() {
        return TextUtils.equals(C67052p.m261322a(getAppContext()), "custom");
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            if (!jSONObject.has("title")) {
                callbackFail(ApiCode.GENERAL_PARAM);
                return;
            }
            final String optString = jSONObject.optString("title");
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.larksuite.component.openplatform.core.plugin.container.navigation.C24686d.RunnableC246871 */

                public void run() {
                    boolean a = C24686d.this.mo87667a();
                    AppBrandLogger.m52830i("tma_ApiSetNavigationBarTitle", "isCustomNavigationBar:" + a);
                    if (!a) {
                        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(C24686d.this.getAppContext()).getRenderViewManager();
                        if (renderViewManager != null) {
                            RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
                            if (currentIRender != null) {
                                currentIRender.setNavigationBarTitle(optString);
                            } else {
                                C24686d.this.callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "current render is null");
                            }
                        } else {
                            C24686d.this.callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "WebViewManager is null");
                        }
                    }
                }
            });
            callbackOk();
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_ApiSetNavigationBarTitle", e);
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, e.getMessage());
        }
    }

    public C24686d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
