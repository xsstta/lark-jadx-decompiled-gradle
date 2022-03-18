package com.larksuite.component.openplatform.core.plugin.container;

import android.view.View;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.view.refresh.SwipeToLoadLayout;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.m */
public class C24673m extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "enablePullDownRefresh";
    }

    public C24673m() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        View view;
        SwipeToLoadLayout swipeToLoadLayout;
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(getAppContext()).getRenderViewManager();
        if (renderViewManager != null) {
            RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
            if (!(!(currentIRender instanceof AppbrandFragment) || (view = ((AppbrandFragment) currentIRender).getView()) == null || (swipeToLoadLayout = (SwipeToLoadLayout) view.findViewById(R.id.microapp_m_refreshLayout)) == null)) {
                swipeToLoadLayout.setRefreshEnabled(true);
                callbackDefaultMsg(true);
            }
        }
        callbackDefaultMsg(false);
    }

    public C24673m(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
