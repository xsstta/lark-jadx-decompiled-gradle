package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.f */
public class C24794f extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "notifyBLECharacteristicValueChange";
    }

    public C24794f() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("ApiHandler", "act notifyBLECharacteristicValueChange");
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87823a(jSONObject.optString("deviceId"), jSONObject.optString("serviceId"), jSONObject.optString("characteristicId"), jSONObject.optString("descriptorId"), jSONObject.optBoolean("state", true));
            if (a == BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackOk(C24758b.m89823a(a));
            } else {
                callbackFail(C24758b.m89823a(a));
            }
        } catch (Exception e) {
            callbackFail("fail");
            AppBrandLogger.m52829e("ApiHandler", "notifyBLECharacteristicValueChange error: " + e.getMessage(), e);
        }
    }

    public C24794f(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
