package com.larksuite.component.openplatform.core.plugin.container.navigation;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.util.C67052p;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.navigation.a */
public class C24680a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "hideHomeButton";
    }

    public C24680a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (TextUtils.equals("custom", C67052p.m261322a(getAppContext()))) {
            callbackOk("custom navigation style");
            return;
        }
        final RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(getAppContext()).getRenderViewManager();
        if (renderViewManager == null) {
            callbackFail("webview manager is null");
        } else {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.larksuite.component.openplatform.core.plugin.container.navigation.C24680a.RunnableC246811 */

                public void run() {
                    try {
                        RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
                        if (currentIRender == null) {
                            C24680a.this.callbackFail("current render is null");
                            return;
                        }
                        currentIRender.hideNavigationBarHomeButton();
                        C24680a.this.callbackOk();
                    } catch (Throwable th) {
                        AppBrandLogger.m52829e("ApiHideHomeButtonCtrl", th);
                        C24680a.this.callbackFail(th);
                    }
                }
            });
        }
    }

    public C24680a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
