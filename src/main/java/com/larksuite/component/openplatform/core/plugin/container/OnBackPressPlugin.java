package com.larksuite.component.openplatform.core.plugin.container;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.IBackPressedListener;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import org.json.JSONObject;

public class OnBackPressPlugin extends OPPlugin implements IBackPressedListener {
    private IAppContext appContext;
    private RenderViewManager.IRender currentIRender;
    private AbstractC25905b lkBridgeContext;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        RenderViewManager.IRender iRender = this.currentIRender;
        if (iRender != null) {
            iRender.unregisterBackPressedListener(this);
        }
    }

    @Override // com.tt.frontendapiinterface.IBackPressedListener
    public boolean onBackPressed() {
        this.lkBridgeContext.mo92214a("onNavigateBackListener", new JSONObject());
        return true;
    }

    @LKPluginFunction(async = true, eventName = {"onNavigateBack"})
    public void onNavigateBack(AbstractC25895f fVar, AbstractC25905b bVar, AbstractC25897h<C25921b> hVar) {
        ILogger b = fVar.mo92190b();
        this.lkBridgeContext = bVar;
        IAppContext appContext2 = getAppContext();
        this.appContext = appContext2;
        if (appContext2 == null) {
            b.mo92223e("OnBackPressPlugin", "appContext is null");
            hVar.callback(createFailedResponse(C25906a.f64077g, "appContext is null"));
            return;
        }
        RenderViewManager.IRender currentIRender2 = AppbrandApplicationImpl.getInst(appContext2).getRenderViewManager().getCurrentIRender();
        this.currentIRender = currentIRender2;
        if (currentIRender2 != null) {
            currentIRender2.registerBackPressedListener(this);
            return;
        }
        b.mo92223e("OnBackPressPlugin", "current render is null");
        hVar.callback(createFailedResponse(C25906a.f64077g, "current render is null"));
    }
}
