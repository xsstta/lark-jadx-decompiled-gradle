package com.tt.frontendapiinterface;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f;
import com.tt.miniapphost.data.C67485a;
import java.util.ArrayList;
import java.util.List;

public class ApiHandlerManager {
    List<ApiHandler> activityResultApiHandler = new ArrayList();
    private ApiHandler extResultHandler;
    private IAppContext mAppContext;
    List<AbstractC65803f> newActivityResultApiHandler = new ArrayList();

    public List<ApiHandler> getActivityResultApiHandler() {
        return this.activityResultApiHandler;
    }

    public ApiHandler getExtResultHandler() {
        return this.extResultHandler;
    }

    public List<AbstractC65803f> getNewActivityResultApiHandler() {
        return this.newActivityResultApiHandler;
    }

    public void unRegisterActivityResultAllHandler() {
        this.activityResultApiHandler.clear();
    }

    public void unRegisterNewActivityResultAllHandler() {
        this.newActivityResultApiHandler.clear();
    }

    public void setExtResultHandler(ApiHandler apiHandler) {
        this.extResultHandler = apiHandler;
    }

    public void registerActivityResultApiHandler(ApiHandler apiHandler) {
        if (apiHandler != null) {
            this.activityResultApiHandler.add(apiHandler);
        }
    }

    public void registerNewActivityResultApiHandler(AbstractC65803f fVar) {
        if (fVar != null) {
            this.newActivityResultApiHandler.add(fVar);
        }
    }

    public static ApiHandlerManager getInst(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234285f();
    }

    public ApiHandlerManager(IAppContext iAppContext) {
        this.mAppContext = iAppContext;
    }

    public void unregisterActivityResultApiHandler(ApiHandler apiHandler) {
        this.activityResultApiHandler.remove(apiHandler);
        AbstractC25576a defaultPluginContainer = this.mAppContext.getDefaultPluginContainer();
        if (defaultPluginContainer != null) {
            defaultPluginContainer.mo92178a(apiHandler);
        }
    }

    public void unregisterNewActivityResultApiHandler(AbstractC65803f fVar) {
        this.newActivityResultApiHandler.remove(fVar);
        AbstractC25576a defaultPluginContainer = this.mAppContext.getDefaultPluginContainer();
        if (defaultPluginContainer != null && (fVar instanceof AbstractC25937e)) {
            defaultPluginContainer.mo92178a((AbstractC25937e) fVar);
        }
    }
}
