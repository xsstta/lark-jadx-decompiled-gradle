package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24777a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.i */
public class C24799i extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "writeBLECharacteristicValue";
    }

    public C24799i() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("ApiHandler", "act writeBLECharacteristicValue");
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87822a(jSONObject.optString("deviceId"), jSONObject.optString("serviceId"), jSONObject.optString("characteristicId"), jSONObject.optString("value"), new C24777a.AbstractC24781d() {
                /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24799i.C248001 */

                /* renamed from: a */
                public void onResult(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, Integer num) {
                    if (num.intValue() == 0) {
                        C24799i.this.callbackOk(C24758b.m89823a(BluetoothError.BLUETOOTH_API_NO_ERROR));
                    } else {
                        C24799i.this.callbackFail(C24758b.m89823a(BluetoothError.BLUETOOTH_API_FAILED_TO_WRITE));
                    }
                }
            });
            if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackFail(C24758b.m89823a(a));
            }
        } catch (Exception e) {
            callbackFail("fail");
            AppBrandLogger.m52829e("ApiHandler", "writeBLECharacteristicValue error: " + e.getMessage(), e);
        }
    }

    public C24799i(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
