package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
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

public class LarkApiReadBLECharacteristicValueCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiReadBLECharacteristicValueCtrlRequest extends C25920a {
        @JSONField(name = "characteristicId")
        public String characteristicId;
        @JSONField(name = "deviceId")
        public String deviceId;
        @JSONField(name = "serviceId")
        public String serviceId;

        private LarkApiReadBLECharacteristicValueCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class LarkApiReadBLECharacteristicValueCtrlResponse extends C25921b {
        @JSONField(name = "characteristic")
        public JSONObject characteristic;

        private LarkApiReadBLECharacteristicValueCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"readBLECharacteristicValue"})
    public void LarkApiReadBLECharacteristicValueCtrlAsync(LKEvent lKEvent, LarkApiReadBLECharacteristicValueCtrlRequest larkApiReadBLECharacteristicValueCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiReadBLECharacteristicValueCtrlResponse> hVar) {
        final LarkApiReadBLECharacteristicValueCtrlResponse larkApiReadBLECharacteristicValueCtrlResponse = new LarkApiReadBLECharacteristicValueCtrlResponse();
        this.mInvokeCallback = hVar;
        AppBrandLogger.m52830i("LarkApiReadBLECharacteristicValueCtrlPlugin_BluetoothTAG", "act readBLECharacteristicValue");
        try {
            String str = larkApiReadBLECharacteristicValueCtrlRequest.deviceId;
            final String str2 = larkApiReadBLECharacteristicValueCtrlRequest.serviceId;
            final String str3 = larkApiReadBLECharacteristicValueCtrlRequest.characteristicId;
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87821a(str, str2, str3, new C24777a.AbstractC24781d() {
                /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.LarkApiReadBLECharacteristicValueCtrlPlugin.C247741 */

                /* renamed from: a */
                public void onResult(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, Integer num) {
                    if (num.intValue() == 0) {
                        byte[] value = bluetoothGattCharacteristic.getValue();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("characteristicId", (Object) str3);
                            jSONObject.put("serviceId", (Object) str2);
                            jSONObject.put("value", (Object) C24758b.m89825a(value));
                            larkApiReadBLECharacteristicValueCtrlResponse.characteristic = jSONObject;
                            LarkApiReadBLECharacteristicValueCtrlPlugin larkApiReadBLECharacteristicValueCtrlPlugin = LarkApiReadBLECharacteristicValueCtrlPlugin.this;
                            larkApiReadBLECharacteristicValueCtrlPlugin.callbackResponse(larkApiReadBLECharacteristicValueCtrlPlugin.fillResponse(larkApiReadBLECharacteristicValueCtrlResponse, C25907b.f64095g));
                        } catch (Exception e) {
                            AppBrandLogger.m52829e("LarkApiReadBLECharacteristicValueCtrlPlugin_BluetoothTAG", "readBLECharacteristicValue error: " + e.getMessage(), e);
                            LarkApiReadBLECharacteristicValueCtrlPlugin.this.fillFailedResponse(larkApiReadBLECharacteristicValueCtrlResponse, C25906a.f64080j, e.getMessage());
                            larkApiReadBLECharacteristicValueCtrlResponse.mErrorMessage = e.getMessage();
                            LarkApiReadBLECharacteristicValueCtrlPlugin.this.callbackResponse(larkApiReadBLECharacteristicValueCtrlResponse);
                        }
                    } else {
                        LarkApiReadBLECharacteristicValueCtrlPlugin larkApiReadBLECharacteristicValueCtrlPlugin2 = LarkApiReadBLECharacteristicValueCtrlPlugin.this;
                        larkApiReadBLECharacteristicValueCtrlPlugin2.callbackResponse(larkApiReadBLECharacteristicValueCtrlPlugin2.fillResponse(larkApiReadBLECharacteristicValueCtrlResponse, C25907b.f64114z));
                    }
                }
            });
            if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackResponse(fillResponse(larkApiReadBLECharacteristicValueCtrlResponse, a));
            }
        } catch (Exception e) {
            fillFailedResponse(larkApiReadBLECharacteristicValueCtrlResponse, C25906a.f64080j, e.getMessage());
            callbackResponse(larkApiReadBLECharacteristicValueCtrlResponse);
            AppBrandLogger.m52829e("LarkApiReadBLECharacteristicValueCtrlPlugin_BluetoothTAG", "readBLECharacteristicValue error: " + e.getMessage(), e);
        }
    }
}
