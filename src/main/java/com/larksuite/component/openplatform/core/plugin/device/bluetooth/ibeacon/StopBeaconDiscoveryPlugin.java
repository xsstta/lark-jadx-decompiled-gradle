package com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25907b;
import com.ss.android.lark.optrace.api.ILogger;

public class StopBeaconDiscoveryPlugin extends OPPlugin {
    private ILogger log;
    private IAppContext mAppContext;

    public static class StopBeaconDiscoveryResponse extends C25921b {
    }

    @LKPluginFunction(async = true, eventName = {"stopBeaconDiscovery"})
    public void stopBeaconDiscovery(AbstractC25897h<StopBeaconDiscoveryResponse> hVar, LKEvent lKEvent, ILogger aVar) {
        this.log = aVar;
        StopBeaconDiscoveryResponse stopBeaconDiscoveryResponse = new StopBeaconDiscoveryResponse();
        IAppContext appContext = getAppContext();
        this.mAppContext = appContext;
        if (appContext == null) {
            this.log.mo92223e("StopBeaconDiscoveryPlugin", "appContext is null");
            fillFailedResponse(stopBeaconDiscoveryResponse, C25906a.f64080j, "appContext is null");
            hVar.callback(stopBeaconDiscoveryResponse);
        } else if (!BeaconManager.m89833a(appContext).mo87782f()) {
            this.log.mo92223e("StopBeaconDiscoveryPlugin", "not startBeaconDiscovery");
            fillFailedResponse(stopBeaconDiscoveryResponse, C25907b.f64084C, "not startBeaconDiscovery");
            hVar.callback(stopBeaconDiscoveryResponse);
        } else if (BeaconManager.m89833a(this.mAppContext).mo87780d()) {
            hVar.callback(stopBeaconDiscoveryResponse);
        } else {
            this.log.mo92223e("StopBeaconDiscoveryPlugin", "beacon close fail");
            fillFailedResponse(stopBeaconDiscoveryResponse, C25906a.f64080j, "beacon close fail");
            hVar.callback(stopBeaconDiscoveryResponse);
        }
    }
}
