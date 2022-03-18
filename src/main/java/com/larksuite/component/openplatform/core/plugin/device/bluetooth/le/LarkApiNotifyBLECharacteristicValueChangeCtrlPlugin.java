package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;

public class LarkApiNotifyBLECharacteristicValueChangeCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiNotifyBLECharacteristicValueChangeCtrlRequest extends C25920a {
        @JSONField(name = "characteristicId")
        public String characteristicId;
        @JSONField(name = "descriptorId")
        public String descriptorId;
        @JSONField(name = "deviceId")
        public String deviceId;
        @JSONField(name = "serviceId")
        public String serviceId;
        @JSONField(name = "state")
        public boolean state;

        private LarkApiNotifyBLECharacteristicValueChangeCtrlRequest() {
        }
    }

    private static class LarkApiNotifyBLECharacteristicValueChangeCtrlResponse extends C25921b {
        private LarkApiNotifyBLECharacteristicValueChangeCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"notifyBLECharacteristicValueChange"})
    public void notifyBLECharacteristicValueChangeCtrlAsync(LKEvent lKEvent, LarkApiNotifyBLECharacteristicValueChangeCtrlRequest larkApiNotifyBLECharacteristicValueChangeCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiNotifyBLECharacteristicValueChangeCtrlResponse> hVar) {
        LarkApiNotifyBLECharacteristicValueChangeCtrlResponse larkApiNotifyBLECharacteristicValueChangeCtrlResponse = new LarkApiNotifyBLECharacteristicValueChangeCtrlResponse();
        this.mInvokeCallback = hVar;
        AppBrandLogger.m52830i("LarkApiNotifyBLECharacteristicValueChangeCtrlPlugin_BluetoothTAG", "act notifyBLECharacteristicValueChange");
        try {
            callbackResponse(fillResponse(larkApiNotifyBLECharacteristicValueChangeCtrlResponse, C24777a.m89866a(getAppContext()).mo87823a(larkApiNotifyBLECharacteristicValueChangeCtrlRequest.deviceId, larkApiNotifyBLECharacteristicValueChangeCtrlRequest.serviceId, larkApiNotifyBLECharacteristicValueChangeCtrlRequest.characteristicId, larkApiNotifyBLECharacteristicValueChangeCtrlRequest.descriptorId, larkApiNotifyBLECharacteristicValueChangeCtrlRequest.state)));
        } catch (Exception e) {
            fillFailedResponse(larkApiNotifyBLECharacteristicValueChangeCtrlResponse, C25906a.f64080j, e.getMessage());
            callbackResponse(larkApiNotifyBLECharacteristicValueChangeCtrlResponse);
            AppBrandLogger.m52829e("LarkApiNotifyBLECharacteristicValueChangeCtrlPlugin_BluetoothTAG", "notifyBLECharacteristicValueChange error: " + e.getMessage(), e);
        }
    }
}
