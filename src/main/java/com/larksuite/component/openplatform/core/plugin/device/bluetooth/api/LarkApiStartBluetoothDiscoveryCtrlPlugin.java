package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import com.alibaba.fastjson.annotation.JSONField;
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
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

public class LarkApiStartBluetoothDiscoveryCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiStartBluetoothDiscoveryCtrlRequest extends C25920a {
        @JSONField(name = "allowDuplicatesKey")
        public boolean allowDuplicatesKey;
        @JSONField(name = "interval")
        public int interval;
        @JSONField(name = "services")
        public List<String> services;

        private LarkApiStartBluetoothDiscoveryCtrlRequest() {
        }
    }

    private static class LarkApiStartBluetoothDiscoveryCtrlResponse extends C25921b {
        private LarkApiStartBluetoothDiscoveryCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"startBluetoothDevicesDiscovery"})
    public void LarkApiStartBluetoothDiscoveryCtrlAsync(LKEvent lKEvent, LarkApiStartBluetoothDiscoveryCtrlRequest larkApiStartBluetoothDiscoveryCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiStartBluetoothDiscoveryCtrlResponse> hVar) {
        LarkApiStartBluetoothDiscoveryCtrlResponse larkApiStartBluetoothDiscoveryCtrlResponse;
        LarkApiStartBluetoothDiscoveryCtrlResponse larkApiStartBluetoothDiscoveryCtrlResponse2 = new LarkApiStartBluetoothDiscoveryCtrlResponse();
        this.mInvokeCallback = hVar;
        AppBrandLogger.m52830i("LarkApiStartBluetoothDiscoveryCtrlPlugin_BluetoothTAG", "act startBluetoothDevicesDiscovery");
        if (!C24759c.m89831a(getAppContext())) {
            callbackResponse(fillResponse(larkApiStartBluetoothDiscoveryCtrlResponse2, C25907b.f64096h));
            return;
        }
        if (C24737a.m89797a(getAppContext()).mo87738a(new JSONArray((Collection) larkApiStartBluetoothDiscoveryCtrlRequest.services), larkApiStartBluetoothDiscoveryCtrlRequest.allowDuplicatesKey, larkApiStartBluetoothDiscoveryCtrlRequest.interval)) {
            larkApiStartBluetoothDiscoveryCtrlResponse = (LarkApiStartBluetoothDiscoveryCtrlResponse) fillResponse(larkApiStartBluetoothDiscoveryCtrlResponse2, C25907b.f64095g);
        } else {
            larkApiStartBluetoothDiscoveryCtrlResponse = (LarkApiStartBluetoothDiscoveryCtrlResponse) fillResponse(larkApiStartBluetoothDiscoveryCtrlResponse2, C25907b.f64097i);
        }
        callbackResponse(larkApiStartBluetoothDiscoveryCtrlResponse);
    }
}
