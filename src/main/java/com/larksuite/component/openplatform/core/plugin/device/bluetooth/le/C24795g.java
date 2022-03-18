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

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.g */
public class C24795g extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "readBLECharacteristicValue";
    }

    public C24795g() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("ApiHandler", "act readBLECharacteristicValue");
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString("deviceId");
            final String optString2 = jSONObject.optString("serviceId");
            final String optString3 = jSONObject.optString("characteristicId");
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87821a(optString, optString2, optString3, new C24777a.AbstractC24781d() {
                /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24795g.C247961 */

                /* renamed from: a */
                public void onResult(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, Integer num) {
                    if (num.intValue() == 0) {
                        try {
                            C24795g.this.callbackOk(new JSONObject().put("characteristic", new JSONObject().put("characteristicId", optString3).put("serviceId", optString2).put("value", C24758b.m89825a(bluetoothGattCharacteristic.getValue()))));
                        } catch (Exception e) {
                            AppBrandLogger.m52829e("ApiHandler", "readBLECharacteristicValue error: " + e.getMessage(), e);
                            C24795g.this.callbackFail("fail");
                        }
                    } else {
                        C24795g.this.callbackFail(C24758b.m89823a(BluetoothError.BLUETOOTH_API_FAILED_TO_READ));
                    }
                }
            });
            if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackFail(C24758b.m89823a(a));
            }
        } catch (Exception e) {
            callbackFail("fail");
            AppBrandLogger.m52829e("ApiHandler", "readBLECharacteristicValue error: " + e.getMessage(), e);
        }
    }

    public C24795g(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
