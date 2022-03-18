package com.larksuite.component.openplatform.core.plugin.container;

import android.view.View;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.view.refresh.SwipeToLoadLayout;

public class LarkApiDisablePullDownRefreshCtrlPlugin extends OPPlugin {

    private static class LarkApiDisablePullDownRefreshCtrlRequest extends C25920a {
        private LarkApiDisablePullDownRefreshCtrlRequest() {
        }
    }

    private static class LarkApiDisablePullDownRefreshCtrlResponse extends C25921b {
        private LarkApiDisablePullDownRefreshCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"disablePullDownRefresh"})
    public void larkApiDisablePullDownRefreshCtrlAsync(LKEvent lKEvent, LarkApiDisablePullDownRefreshCtrlRequest larkApiDisablePullDownRefreshCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiDisablePullDownRefreshCtrlResponse> hVar) {
        View view;
        SwipeToLoadLayout swipeToLoadLayout;
        LarkApiDisablePullDownRefreshCtrlResponse larkApiDisablePullDownRefreshCtrlResponse = new LarkApiDisablePullDownRefreshCtrlResponse();
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(getAppContext()).getRenderViewManager();
        if (renderViewManager != null) {
            RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
            if (!(!(currentIRender instanceof AppbrandFragment) || (view = ((AppbrandFragment) currentIRender).getView()) == null || (swipeToLoadLayout = (SwipeToLoadLayout) view.findViewById(R.id.microapp_m_refreshLayout)) == null)) {
                swipeToLoadLayout.setRefreshEnabled(false);
                hVar.callback(larkApiDisablePullDownRefreshCtrlResponse);
                return;
            }
        }
        larkApiDisablePullDownRefreshCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
        hVar.callback(larkApiDisablePullDownRefreshCtrlResponse);
    }
}
