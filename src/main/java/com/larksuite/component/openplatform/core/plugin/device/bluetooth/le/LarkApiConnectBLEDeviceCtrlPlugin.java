package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothGatt;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24759c;
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

public class LarkApiConnectBLEDeviceCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiConnectBLEDeviceCtrlRequest extends C25920a {
        @JSONField(name = "deviceId")
        public String deviceId;

        private LarkApiConnectBLEDeviceCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class LarkApiConnectBLEDeviceCtrlResponse extends C25921b {
        private LarkApiConnectBLEDeviceCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private void connectBLEDevice(String str) {
        BluetoothError a = C24777a.m89866a(getAppContext()).mo87819a(str, new C24777a.AbstractC24782e() {
            /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.$$Lambda$LarkApiConnectBLEDeviceCtrlPlugin$auG9cObJiwfxqYQrBtX9T6nwgCY */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.bluetooth.BluetoothGatt, java.lang.Object, java.lang.Object] */
            @Override // com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24777a.AbstractC24778a
            public final void onResult(BluetoothGatt bluetoothGatt, Integer num, Integer num2) {
                LarkApiConnectBLEDeviceCtrlPlugin.this.lambda$connectBLEDevice$0$LarkApiConnectBLEDeviceCtrlPlugin(bluetoothGatt, num, num2);
            }
        }, getAppContext());
        if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
            callbackResponse((LarkApiConnectBLEDeviceCtrlResponse) fillResponse(new LarkApiConnectBLEDeviceCtrlResponse(), a));
        }
    }

    public /* synthetic */ void lambda$connectBLEDevice$0$LarkApiConnectBLEDeviceCtrlPlugin(BluetoothGatt bluetoothGatt, Integer num, Integer num2) {
        LarkApiConnectBLEDeviceCtrlResponse larkApiConnectBLEDeviceCtrlResponse;
        LarkApiConnectBLEDeviceCtrlResponse larkApiConnectBLEDeviceCtrlResponse2 = new LarkApiConnectBLEDeviceCtrlResponse();
        AppBrandLogger.m52830i("LarkApiConnectBLEDeviceCtrlPlugin_BluetoothTAG", "connectBLEDevice, status: " + num + ", newState: " + num2);
        if (num2.intValue() == 2) {
            larkApiConnectBLEDeviceCtrlResponse = (LarkApiConnectBLEDeviceCtrlResponse) fillResponse(larkApiConnectBLEDeviceCtrlResponse2, C25907b.f64095g);
        } else {
            larkApiConnectBLEDeviceCtrlResponse = (LarkApiConnectBLEDeviceCtrlResponse) fillResponse(larkApiConnectBLEDeviceCtrlResponse2, C25907b.f64099k);
        }
        callbackResponse(larkApiConnectBLEDeviceCtrlResponse);
    }

    @LKPluginFunction(async = true, eventName = {"connectBLEDevice"})
    public void LarkApiConnectBLEDeviceCtrlAsync(LKEvent lKEvent, LarkApiConnectBLEDeviceCtrlRequest larkApiConnectBLEDeviceCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiConnectBLEDeviceCtrlResponse> hVar) {
        LarkApiConnectBLEDeviceCtrlResponse larkApiConnectBLEDeviceCtrlResponse = new LarkApiConnectBLEDeviceCtrlResponse();
        this.mInvokeCallback = hVar;
        AppBrandLogger.m52830i("LarkApiConnectBLEDeviceCtrlPlugin_BluetoothTAG", "act connectBLEDevice");
        if (!C24759c.m89831a(getAppContext())) {
            callbackResponse(fillResponse(larkApiConnectBLEDeviceCtrlResponse, C25907b.f64096h));
            AppBrandLogger.m52829e("LarkApiConnectBLEDeviceCtrlPlugin_BluetoothTAG", "connectBLEDevice not init");
            return;
        }
        try {
            connectBLEDevice(larkApiConnectBLEDeviceCtrlRequest.deviceId);
        } catch (Exception e) {
            fillFailedResponse(larkApiConnectBLEDeviceCtrlResponse, C25906a.f64080j, e.getMessage());
            callbackResponse(larkApiConnectBLEDeviceCtrlResponse);
            AppBrandLogger.m52829e("LarkApiConnectBLEDeviceCtrlPlugin_BluetoothTAG", "LarkApiConnectBLEDeviceCtrl error: " + e.getMessage(), e);
        }
    }
}
