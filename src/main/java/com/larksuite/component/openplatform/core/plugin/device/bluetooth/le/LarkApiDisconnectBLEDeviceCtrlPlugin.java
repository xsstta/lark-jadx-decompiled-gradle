package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothGatt;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24777a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.LarkApiDisconnectBLEDeviceCtrlPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25907b;

public class LarkApiDisconnectBLEDeviceCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiDisconnectBLEDeviceCtrlRequest extends C25920a {
        @JSONField(name = "deviceId")
        public String deviceId;

        private LarkApiDisconnectBLEDeviceCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class LarkApiDisconnectBLEDeviceCtrlResponse extends C25921b {
        private LarkApiDisconnectBLEDeviceCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    public /* synthetic */ void lambda$LarkApiDisconnectBLEDeviceCtrlAsync$0$LarkApiDisconnectBLEDeviceCtrlPlugin(LarkApiDisconnectBLEDeviceCtrlResponse larkApiDisconnectBLEDeviceCtrlResponse, BluetoothGatt bluetoothGatt, Integer num, Integer num2) {
        AppBrandLogger.m52830i("LarkApiDisconnectBLEDeviceCtrlPlugin_BluetoothTAG", "disconnectBLEDevice, status: " + num + ", newState: " + num2);
        if (num2.intValue() == 0) {
            callbackResponse(fillResponse(larkApiDisconnectBLEDeviceCtrlResponse, C25907b.f64095g));
        } else {
            callbackResponse(fillResponse(larkApiDisconnectBLEDeviceCtrlResponse, C25907b.f64104p));
        }
    }

    @LKPluginFunction(async = true, eventName = {"disconnectBLEDevice"})
    public void LarkApiDisconnectBLEDeviceCtrlAsync(LKEvent lKEvent, LarkApiDisconnectBLEDeviceCtrlRequest larkApiDisconnectBLEDeviceCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiDisconnectBLEDeviceCtrlResponse> hVar) {
        LarkApiDisconnectBLEDeviceCtrlResponse larkApiDisconnectBLEDeviceCtrlResponse = new LarkApiDisconnectBLEDeviceCtrlResponse();
        this.mInvokeCallback = hVar;
        AppBrandLogger.m52830i("LarkApiDisconnectBLEDeviceCtrlPlugin_BluetoothTAG", "act disconnectBLEDevice");
        try {
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87818a(larkApiDisconnectBLEDeviceCtrlRequest.deviceId, new C24777a.AbstractC24782e(larkApiDisconnectBLEDeviceCtrlResponse) {
                /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.$$Lambda$LarkApiDisconnectBLEDeviceCtrlPlugin$iHndx8lDQeGPYG2Vk2lEaaBFw */
                public final /* synthetic */ LarkApiDisconnectBLEDeviceCtrlPlugin.LarkApiDisconnectBLEDeviceCtrlResponse f$1;

                {
                    this.f$1 = r2;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.bluetooth.BluetoothGatt, java.lang.Object, java.lang.Object] */
                @Override // com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24777a.AbstractC24778a
                public final void onResult(BluetoothGatt bluetoothGatt, Integer num, Integer num2) {
                    LarkApiDisconnectBLEDeviceCtrlPlugin.this.lambda$LarkApiDisconnectBLEDeviceCtrlAsync$0$LarkApiDisconnectBLEDeviceCtrlPlugin(this.f$1, bluetoothGatt, num, num2);
                }
            });
            if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackResponse(fillResponse(larkApiDisconnectBLEDeviceCtrlResponse, a));
            }
        } catch (Exception e) {
            fillFailedResponse(larkApiDisconnectBLEDeviceCtrlResponse, C25906a.f64080j, e.getMessage());
            callbackResponse(larkApiDisconnectBLEDeviceCtrlResponse);
            AppBrandLogger.m52829e("LarkApiDisconnectBLEDeviceCtrlPlugin_BluetoothTAG", "LarkApiDisconnectBLEDeviceCtrl error: " + e.getMessage(), e);
        }
    }
}
