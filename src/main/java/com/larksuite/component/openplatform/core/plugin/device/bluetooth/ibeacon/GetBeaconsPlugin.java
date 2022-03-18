package com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25907b;
import com.ss.android.lark.optrace.api.ILogger;
import java.util.ArrayList;
import java.util.List;

public class GetBeaconsPlugin extends OPPlugin {
    private ILogger log;
    private IAppContext mAppContext;

    public static class GetBeaconsResponse extends C25921b {
        @JSONField(name = "beacons")
        public List<BeaconInfo> beacons = new ArrayList();
    }

    @LKPluginFunction(async = true, eventName = {"getBeacons"})
    public void getBeacons(LKEvent lKEvent, ILogger aVar, AbstractC25897h<GetBeaconsResponse> hVar) {
        this.log = aVar;
        GetBeaconsResponse getBeaconsResponse = new GetBeaconsResponse();
        IAppContext appContext = getAppContext();
        this.mAppContext = appContext;
        if (appContext == null) {
            this.log.mo92223e("GetBeaconsPlugin", "appContext is null");
            fillFailedResponse(getBeaconsResponse, C25906a.f64080j, "appContext is null");
            hVar.callback(getBeaconsResponse);
        } else if (!BeaconManager.m89833a(appContext).mo87782f()) {
            this.log.mo92223e("GetBeaconsPlugin", "not startBeaconDiscovery");
            fillFailedResponse(getBeaconsResponse, C25907b.f64084C, "not startBeaconDiscovery");
            hVar.callback(getBeaconsResponse);
        } else {
            getBeaconsResponse.beacons.addAll(BeaconManager.m89833a(this.mAppContext).mo87783g());
            hVar.callback(getBeaconsResponse);
        }
    }
}
