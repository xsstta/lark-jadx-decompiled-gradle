package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24759c;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25907b;

public class LarkApiStopBluetoothDiscoveryCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiStopBluetoothDiscoveryCtrlRequest extends C25920a {
        private LarkApiStopBluetoothDiscoveryCtrlRequest() {
        }
    }

    private static class LarkApiStopBluetoothDiscoveryCtrlResponse extends C25921b {
        private LarkApiStopBluetoothDiscoveryCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"stopBluetoothDevicesDiscovery"})
    public void LarkApiStopBluetoothDiscoveryCtrlAsync(LKEvent lKEvent, LarkApiStopBluetoothDiscoveryCtrlRequest larkApiStopBluetoothDiscoveryCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiStopBluetoothDiscoveryCtrlResponse> hVar) {
        LarkApiStopBluetoothDiscoveryCtrlResponse larkApiStopBluetoothDiscoveryCtrlResponse;
        this.mInvokeCallback = hVar;
        LarkApiStopBluetoothDiscoveryCtrlResponse larkApiStopBluetoothDiscoveryCtrlResponse2 = new LarkApiStopBluetoothDiscoveryCtrlResponse();
        AppBrandLogger.m52830i("LarkApiStopBluetoothDiscoveryCtrlPlugin_BluetoothTAG", "act stopBluetoothDevicesDiscovery");
        if (!C24759c.m89831a(getAppContext())) {
            callbackResponse(fillResponse(larkApiStopBluetoothDiscoveryCtrlResponse2, C25907b.f64096h));
            return;
        }
        if (C24737a.m89797a(getAppContext()).mo87745h()) {
            larkApiStopBluetoothDiscoveryCtrlResponse = (LarkApiStopBluetoothDiscoveryCtrlResponse) fillResponse(larkApiStopBluetoothDiscoveryCtrlResponse2, C25907b.f64095g);
        } else {
            larkApiStopBluetoothDiscoveryCtrlResponse = (LarkApiStopBluetoothDiscoveryCtrlResponse) fillResponse(larkApiStopBluetoothDiscoveryCtrlResponse2, C25907b.f64097i);
        }
        callbackResponse(larkApiStopBluetoothDiscoveryCtrlResponse);
    }
}
