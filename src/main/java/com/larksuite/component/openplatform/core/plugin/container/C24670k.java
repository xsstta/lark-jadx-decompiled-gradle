package com.larksuite.component.openplatform.core.plugin.container;

import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.k */
public class C24670k extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "stopPullDownRefresh";
    }

    public C24670k() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.container.C24670k.RunnableC246711 */

            public void run() {
                RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(C24670k.this.getAppContext()).getRenderViewManager();
                if (renderViewManager == null) {
                    C24670k.this.callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "WebViewManager is null");
                    return;
                }
                RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
                if (currentIRender == null) {
                    C24670k.this.callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "current render is null");
                    return;
                }
                currentIRender.onStopPullDownRefresh();
                C24670k.this.callbackOk();
            }
        });
    }

    public C24670k(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
