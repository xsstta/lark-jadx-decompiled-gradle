package com.larksuite.component.openplatform.core.plugin;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.OpenPlatform;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.ILogger;

public class OPLinkTracePlugin extends OPPlugin {
    private IAppContext mAppContext;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mAppContext = null;
    }

    public OPLinkTracePlugin(IAppContext iAppContext) {
        this.mAppContext = iAppContext;
    }

    @LKPluginFunction(async = true, eventName = {"linkTrace"})
    public void linkTraceAsync(OpenPlatform.Requests.LinkTrace linkTrace, AbstractC25895f fVar) {
        OPTrace deserialize = OPTrace.deserialize(linkTrace.mOriginTrace);
        ILogger b = fVar.mo92190b();
        b.mo92224i("OPLinkTracePlugin", "linkTraceId:" + linkTrace.mLinkTraceId + "  originTraceId:" + deserialize.getTracingID());
        OPMonitorUtils.linkTraceId(this.mAppContext, deserialize, linkTrace.mLinkTraceId);
    }
}
