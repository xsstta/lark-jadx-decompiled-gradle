package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothGatt;
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

public class LarkApiSetBLEMTUCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiSetBLEMTUCtrlRequest extends C25920a {
        @JSONField(name = "deviceId")
        public String deviceId;
        @JSONField(name = "mtu")
        public int mtu;

        private LarkApiSetBLEMTUCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class LarkApiSetBLEMTUCtrlResponse extends C25921b {
        private LarkApiSetBLEMTUCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"setBLEMTU"})
    public void LarkApiSetBLEMTUCtrlAsync(LKEvent lKEvent, LarkApiSetBLEMTUCtrlRequest larkApiSetBLEMTUCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiSetBLEMTUCtrlResponse> hVar) {
        final LarkApiSetBLEMTUCtrlResponse larkApiSetBLEMTUCtrlResponse = new LarkApiSetBLEMTUCtrlResponse();
        this.mInvokeCallback = hVar;
        AppBrandLogger.m52830i("LarkApiSetBLEMTUCtrlPlugin_BluetoothTAG", "act setBLEMTU");
        try {
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87817a(larkApiSetBLEMTUCtrlRequest.deviceId, larkApiSetBLEMTUCtrlRequest.mtu, new C24777a.AbstractC24785h() {
                /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.LarkApiSetBLEMTUCtrlPlugin.C247751 */

                /* renamed from: a */
                public void onResult(BluetoothGatt bluetoothGatt, Integer num, Integer num2) {
                    if (num2.intValue() == 0) {
                        LarkApiSetBLEMTUCtrlPlugin.this.fillResponse(larkApiSetBLEMTUCtrlResponse, C25907b.f64095g);
                    } else {
                        LarkApiSetBLEMTUCtrlPlugin.this.fillResponse(larkApiSetBLEMTUCtrlResponse, C25907b.f64104p);
                    }
                    LarkApiSetBLEMTUCtrlPlugin.this.callbackResponse(larkApiSetBLEMTUCtrlResponse);
                }
            });
            if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackResponse(fillResponse(larkApiSetBLEMTUCtrlResponse, a));
            }
        } catch (Exception e) {
            fillFailedResponse(larkApiSetBLEMTUCtrlResponse, C25906a.f64080j, e.getMessage());
            callbackResponse(larkApiSetBLEMTUCtrlResponse);
            AppBrandLogger.m52829e("LarkApiSetBLEMTUCtrlPlugin_BluetoothTAG", "notifyBLECharacteristicValueChange error: " + e.getMessage(), e);
        }
    }
}
