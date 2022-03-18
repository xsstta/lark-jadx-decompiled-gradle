package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothGatt;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24777a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.h */
public class C24797h extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setBLEMTU";
    }

    public C24797h() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("ApiHandler", "act setBLEMTU");
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87817a(jSONObject.optString("deviceId"), jSONObject.optInt("mtu"), new C24777a.AbstractC24785h() {
                /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24797h.C247981 */

                /* renamed from: a */
                public void onResult(BluetoothGatt bluetoothGatt, Integer num, Integer num2) {
                    if (num2.intValue() == 0) {
                        C24797h.this.callbackOk(C24758b.m89823a(BluetoothError.BLUETOOTH_API_NO_ERROR));
                    } else {
                        C24797h.this.callbackFail(C24758b.m89823a(BluetoothError.BLUETOOTH_API_SYSTEM_ERROR));
                    }
                }
            });
            if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackFail(C24758b.m89823a(a));
            }
        } catch (Exception e) {
            callbackFail("fail");
            AppBrandLogger.m52829e("ApiHandler", "notifyBLECharacteristicValueChange error: " + e.getMessage(), e);
        }
    }

    public C24797h(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
