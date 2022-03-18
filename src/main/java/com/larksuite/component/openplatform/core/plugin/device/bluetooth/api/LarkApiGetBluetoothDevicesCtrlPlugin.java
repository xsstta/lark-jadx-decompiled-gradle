package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import android.bluetooth.le.ScanResult;
import com.alibaba.fastjson.JSONArray;
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
import java.util.Map;

public class LarkApiGetBluetoothDevicesCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiGetBluetoothDevicesCtrlRequest extends C25920a {
        private LarkApiGetBluetoothDevicesCtrlRequest() {
        }
    }

    private static class LarkApiGetBluetoothDevicesCtrlResponse extends C25921b {
        @JSONField(name = "devices")
        public JSONArray devices;

        private LarkApiGetBluetoothDevicesCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"getBluetoothDevices"})
    public void LarkApiGetBluetoothDevicesCtrlAsync(LKEvent lKEvent, LarkApiGetBluetoothDevicesCtrlRequest larkApiGetBluetoothDevicesCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiGetBluetoothDevicesCtrlResponse> hVar) {
        LarkApiGetBluetoothDevicesCtrlResponse larkApiGetBluetoothDevicesCtrlResponse = new LarkApiGetBluetoothDevicesCtrlResponse();
        this.mInvokeCallback = hVar;
        AppBrandLogger.m52830i("LarkApiGetBluetoothDevicesCtrlPlugin_BluetoothTAG", "act getBluetoothDevices");
        if (!C24759c.m89831a(getAppContext())) {
            callbackResponse((LarkApiGetBluetoothDevicesCtrlResponse) fillResponse(larkApiGetBluetoothDevicesCtrlResponse, C25907b.f64096h));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, ScanResult> entry : C24737a.m89797a(getAppContext()).mo87742e().entrySet()) {
            ScanResult value = entry.getValue();
            if (value != null) {
                jSONArray.add(C24759c.m89830a(value));
            }
        }
        LarkApiGetBluetoothDevicesCtrlResponse larkApiGetBluetoothDevicesCtrlResponse2 = (LarkApiGetBluetoothDevicesCtrlResponse) fillResponse(larkApiGetBluetoothDevicesCtrlResponse, C25907b.f64095g);
        larkApiGetBluetoothDevicesCtrlResponse2.devices = jSONArray;
        callbackResponse(larkApiGetBluetoothDevicesCtrlResponse2);
        AppBrandLogger.m52830i("LarkApiGetBluetoothDevicesCtrlPlugin_BluetoothTAG", "getBluetoothDevices result" + jSONArray.toString());
    }
}
