package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24777a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25907b;

public class LarkApiWriteBLECharacteristicValueCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiWriteBLECharacteristicValueCtrlRequest extends C25920a {
        @JSONField(name = "characteristicId")
        public String characteristicId;
        @JSONField(name = "deviceId")
        public String deviceId;
        @JSONField(name = "serviceId")
        public String serviceId;
        @JSONField(name = "value")
        public String value;

        private LarkApiWriteBLECharacteristicValueCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class LarkApiWriteBLECharacteristicValueCtrlResponse extends C25921b {
        private LarkApiWriteBLECharacteristicValueCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"writeBLECharacteristicValue"})
    public void LarkApiWriteBLECharacteristicValueCtrlAsync(LKEvent lKEvent, LarkApiWriteBLECharacteristicValueCtrlRequest larkApiWriteBLECharacteristicValueCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiWriteBLECharacteristicValueCtrlResponse> hVar) {
        final LarkApiWriteBLECharacteristicValueCtrlResponse larkApiWriteBLECharacteristicValueCtrlResponse = new LarkApiWriteBLECharacteristicValueCtrlResponse();
        this.mInvokeCallback = hVar;
        AppBrandLogger.m52830i("LarkApiWriteBLECharacteristicValueCtrlPlugin_BluetoothTAG", "act writeBLECharacteristicValue");
        try {
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87822a(larkApiWriteBLECharacteristicValueCtrlRequest.deviceId, larkApiWriteBLECharacteristicValueCtrlRequest.serviceId, larkApiWriteBLECharacteristicValueCtrlRequest.characteristicId, larkApiWriteBLECharacteristicValueCtrlRequest.value, new C24777a.AbstractC24781d() {
                /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.LarkApiWriteBLECharacteristicValueCtrlPlugin.C247761 */

                /* renamed from: a */
                public void onResult(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, Integer num) {
                    if (num.intValue() == 0) {
                        LarkApiWriteBLECharacteristicValueCtrlPlugin.this.fillResponse(larkApiWriteBLECharacteristicValueCtrlResponse, C25907b.f64095g);
                    } else {
                        LarkApiWriteBLECharacteristicValueCtrlPlugin.this.fillResponse(larkApiWriteBLECharacteristicValueCtrlResponse, C25907b.f64113y);
                    }
                    LarkApiWriteBLECharacteristicValueCtrlPlugin.this.callbackResponse(larkApiWriteBLECharacteristicValueCtrlResponse);
                }
            });
            if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackResponse(fillResponse(larkApiWriteBLECharacteristicValueCtrlResponse, a));
            }
        } catch (Exception e) {
            fillFailedResponse(larkApiWriteBLECharacteristicValueCtrlResponse, C25906a.f64080j, e.getMessage());
            callbackResponse(larkApiWriteBLECharacteristicValueCtrlResponse);
            AppBrandLogger.m52829e("LarkApiWriteBLECharacteristicValueCtrlPlugin_BluetoothTAG", "writeBLECharacteristicValue error: " + e.getMessage(), e);
        }
    }
}
