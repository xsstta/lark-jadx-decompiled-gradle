package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24777a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.e */
public class C24792e extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getBLEDeviceServices";
    }

    public C24792e() {
    }

    /* renamed from: a */
    private String m89894a() throws JSONException {
        return new JSONObject(this.mArgs).optString("deviceId");
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("ApiHandler", "act getBLEDeviceServices");
        try {
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87820a(m89894a(), new C24777a.AbstractC24784g() {
                /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24792e.C247931 */

                /* renamed from: a */
                public void onResult(BluetoothGatt bluetoothGatt, Integer num, List<BluetoothGattService> list) {
                    boolean z;
                    if (list == null || list.isEmpty()) {
                        C24792e.this.callbackFail(C24758b.m89823a(BluetoothError.BLUETOOTH_API_SERVICE_NOT_FOUND));
                        AppBrandLogger.m52829e("ApiHandler", "getBLEDeviceServices error, service list is empty");
                        return;
                    }
                    try {
                        JSONArray jSONArray = new JSONArray();
                        for (BluetoothGattService bluetoothGattService : list) {
                            JSONObject put = new JSONObject().put("serviceId", bluetoothGattService.getUuid().toString());
                            if (bluetoothGattService.getType() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            jSONArray.put(put.put("isPrimary", z));
                        }
                        C24792e.this.callbackOk(new JSONObject().put("services", jSONArray));
                    } catch (JSONException e) {
                        C24792e.this.callbackFail("fail");
                        AppBrandLogger.m52829e("ApiHandler", "getBLEDeviceServices error: " + e.getMessage(), e);
                    }
                }
            });
            if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackFail(C24758b.m89823a(a));
            }
        } catch (Exception e) {
            callbackFail("fail");
            AppBrandLogger.m52829e("ApiHandler", "getBLEDeviceServices error: " + e.getMessage(), e);
        }
    }

    public C24792e(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
