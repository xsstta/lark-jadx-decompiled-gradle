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

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.b */
public class C24786b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "connectBLEDevice";
    }

    public C24786b() {
    }

    /* renamed from: a */
    private String m89885a() throws JSONException {
        return new JSONObject(this.mArgs).optString("deviceId");
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("BluetoothTAG", "act connectBLEDevice");
        if (!C24758b.m89828a(this, getAppContext())) {
            AppBrandLogger.m52829e("BluetoothTAG", "connectBLEDevice not init");
            return;
        }
        try {
            m89886a(m89885a());
        } catch (Exception e) {
            callbackFail("fail");
            AppBrandLogger.m52829e("BluetoothTAG", "LarkApiConnectBLEDeviceCtrl error: " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    private void m89886a(String str) {
        BluetoothError a = C24777a.m89866a(getAppContext()).mo87819a(str, new C24777a.AbstractC24782e() {
            /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24786b.C247871 */

            /* renamed from: a */
            public void onResult(BluetoothGatt bluetoothGatt, Integer num, Integer num2) {
                AppBrandLogger.m52830i("BluetoothTAG", "connectBLEDevice, status: " + num + ", newState: " + num2);
                if (num2.intValue() == 2) {
                    C24786b.this.callbackOk(C24758b.m89823a(BluetoothError.BLUETOOTH_API_NO_ERROR));
                } else {
                    C24786b.this.callbackFail(C24758b.m89823a(BluetoothError.BLUETOOTH_API_CONNECTION_FAIL));
                }
            }
        }, getAppContext());
        if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
            callbackFail(C24758b.m89823a(a));
        }
    }

    public C24786b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
