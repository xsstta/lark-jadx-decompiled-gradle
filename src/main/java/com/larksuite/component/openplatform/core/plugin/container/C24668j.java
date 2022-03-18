package com.larksuite.component.openplatform.core.plugin.container;

import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.j */
public class C24668j extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "startPullDownRefresh";
    }

    public C24668j() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(getAppContext()).getRenderViewManager();
        if (renderViewManager == null) {
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "WebViewManager is null");
            return;
        }
        final RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
        if (currentIRender == null) {
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "current render is null");
        } else {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.larksuite.component.openplatform.core.plugin.container.C24668j.RunnableC246691 */

                public void run() {
                    currentIRender.onStartPullDownRefresh();
                    C24668j.this.callbackOk();
                }
            });
        }
    }

    public C24668j(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
