package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothGatt;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24777a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.c */
public class C24788c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "disconnectBLEDevice";
    }

    public C24788c() {
    }

    /* renamed from: a */
    private String m89888a() throws JSONException {
        return new JSONObject(this.mArgs).optString("deviceId");
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("BluetoothTAG", "act disconnectBLEDevice");
        try {
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87818a(m89888a(), new C24777a.AbstractC24782e() {
                /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24788c.C247891 */

                /* renamed from: a */
                public void onResult(BluetoothGatt bluetoothGatt, Integer num, Integer num2) {
                    AppBrandLogger.m52830i("BluetoothTAG", "disconnectBLEDevice, status: " + num + ", newState: " + num2);
                    if (num2.intValue() == 0) {
                        C24788c.this.callbackOk(C24758b.m89823a(BluetoothError.BLUETOOTH_API_NO_ERROR));
                    } else {
                        C24788c.this.callbackFail(C24758b.m89823a(BluetoothError.BLUETOOTH_API_SYSTEM_ERROR));
                    }
                }
            });
            if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackFail(C24758b.m89823a(a));
            }
        } catch (Exception e) {
            callbackFail("fail");
            AppBrandLogger.m52829e("BluetoothTAG", "LarkApiDisconnectBLEDeviceCtrl error: " + e.getMessage(), e);
        }
    }

    public C24788c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
