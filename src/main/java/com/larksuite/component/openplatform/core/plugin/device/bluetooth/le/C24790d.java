package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24777a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.d */
public class C24790d extends ApiHandler {
    /* renamed from: a */
    private static boolean m89892a(int i, int i2) {
        return (i & i2) == i2;
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getBLEDeviceCharacteristics";
    }

    public C24790d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("ApiHandler", "act getBLEDeviceCharacteristics");
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString("deviceId");
            final String optString2 = jSONObject.optString("serviceId");
            if (TextUtils.isEmpty(optString2)) {
                AppBrandLogger.m52829e("ApiHandler", "getBLEDeviceCharacteristics, serviceId is empty");
                callbackFail(C24758b.m89823a(BluetoothError.BLUETOOTH_API_INVALID_SERVICE_ID));
                return;
            }
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87820a(optString, new C24777a.AbstractC24784g() {
                /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24790d.C247911 */

                /* renamed from: a */
                public void onResult(BluetoothGatt bluetoothGatt, Integer num, List<BluetoothGattService> list) {
                    if (list == null || list.isEmpty()) {
                        C24790d.this.callbackFail(C24758b.m89823a(BluetoothError.BLUETOOTH_API_SERVICE_NOT_FOUND));
                        AppBrandLogger.m52829e("ApiHandler", "getBLEDeviceCharacteristics error, service list is empty.");
                        return;
                    }
                    List<BluetoothGattCharacteristic> a = C24790d.m89890a(list, optString2);
                    AppBrandLogger.m52830i("ApiHandler", "getBLEDeviceCharacteristics, size: " + a.size());
                    JSONArray jSONArray = new JSONArray();
                    try {
                        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : a) {
                            jSONArray.put(C24790d.m89891a(bluetoothGattCharacteristic));
                        }
                        C24790d.this.callbackOk(new JSONObject().put("characteristics", jSONArray));
                    } catch (JSONException e) {
                        C24790d.this.callbackFail("fail");
                        AppBrandLogger.m52829e("ApiHandler", "getBLEDeviceCharacteristics error: " + e.getMessage(), e);
                    }
                }
            });
            if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackFail(C24758b.m89823a(a));
            }
        } catch (Exception e) {
            callbackFail("fail");
            AppBrandLogger.m52829e("ApiHandler", "getBLEDeviceCharacteristics error: " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static JSONObject m89891a(BluetoothGattCharacteristic bluetoothGattCharacteristic) throws JSONException {
        boolean z;
        int properties = bluetoothGattCharacteristic.getProperties();
        boolean a = m89892a(properties, 2);
        if (m89892a(properties, 8) || m89892a(properties, 4)) {
            z = true;
        } else {
            z = false;
        }
        boolean a2 = m89892a(properties, 16);
        boolean a3 = m89892a(properties, 32);
        if (a2 || a3) {
            List<BluetoothGattDescriptor> descriptors = bluetoothGattCharacteristic.getDescriptors();
            if (descriptors == null || descriptors.isEmpty()) {
                AppBrandLogger.m52830i("ApiHandler", "notify characteristic: " + bluetoothGattCharacteristic.getUuid().toString() + ", no descriptors");
            } else {
                StringBuilder sb = new StringBuilder("characteristic: ");
                sb.append(bluetoothGattCharacteristic.getUuid().toString());
                sb.append(", notify descriptor: \n");
                for (BluetoothGattDescriptor bluetoothGattDescriptor : descriptors) {
                    sb.append("\t");
                    sb.append(bluetoothGattDescriptor.getUuid().toString());
                    sb.append("\n");
                }
                AppBrandLogger.m52830i("ApiHandler", sb.toString());
            }
        }
        return new JSONObject().put("characteristicId", bluetoothGattCharacteristic.getUuid().toString()).put("serviceId", bluetoothGattCharacteristic.getService().getUuid().toString()).put("value", C24758b.m89825a(bluetoothGattCharacteristic.getValue())).put("properties", new JSONObject().put("read", a).put("write", z).put("notify", a2).put("indicate", a3));
    }

    /* renamed from: a */
    public static List<BluetoothGattCharacteristic> m89890a(List<BluetoothGattService> list, String str) {
        List<BluetoothGattCharacteristic> characteristics;
        if (list == null || list.isEmpty()) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        for (BluetoothGattService bluetoothGattService : list) {
            if (bluetoothGattService.getUuid().toString().equals(str) && (characteristics = bluetoothGattService.getCharacteristics()) != null && !characteristics.isEmpty()) {
                arrayList.addAll(characteristics);
            }
        }
        return arrayList;
    }

    public C24790d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
