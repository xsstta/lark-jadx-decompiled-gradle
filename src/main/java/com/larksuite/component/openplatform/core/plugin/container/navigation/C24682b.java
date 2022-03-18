package com.larksuite.component.openplatform.core.plugin.container.navigation;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.util.C67052p;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.navigation.b */
public class C24682b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "hideNavigationBarLoading";
    }

    public C24682b() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (TextUtils.equals("custom", C67052p.m261322a(getAppContext()))) {
            callbackOk("custom navigation style");
            return;
        }
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(getAppContext()).getRenderViewManager();
        if (renderViewManager == null) {
            callbackFail("webview manager is null");
            return;
        }
        final RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
        if (currentIRender == null) {
            callbackFail("current render is null");
        } else {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.larksuite.component.openplatform.core.plugin.container.navigation.C24682b.RunnableC246831 */

                public void run() {
                    try {
                        currentIRender.setNavigationBarLoading(false);
                        C24682b.this.callbackOk();
                    } catch (Throwable th) {
                        AppBrandLogger.m52829e("ApiHideNavigationBarLoadingCtrl", th);
                        C24682b.this.callbackFail(th);
                    }
                }
            });
        }
    }

    public C24682b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
