package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
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
import java.util.ArrayList;
import java.util.List;

public class LarkApiGetBLEDeviceCharacteristicsCtrlPlugin extends BluetoothBaseOPPlugin {
    private static boolean hasPermission(int i, int i2) {
        return (i & i2) == i2;
    }

    private static class LarkApiGetBLEDeviceCharacteristicsCtrlRequest extends C25920a {
        @JSONField(name = "deviceId")
        public String deviceId;
        @JSONField(name = "serviceId")
        public String serviceId;

        private LarkApiGetBLEDeviceCharacteristicsCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class LarkApiGetBLEDeviceCharacteristicsCtrlResponse extends C25921b {
        @JSONField(name = "characteristics")
        public JSONArray characteristics;

        private LarkApiGetBLEDeviceCharacteristicsCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    public static JSONObject toJson(BluetoothGattCharacteristic bluetoothGattCharacteristic) throws JSONException {
        boolean z;
        int properties = bluetoothGattCharacteristic.getProperties();
        boolean hasPermission = hasPermission(properties, 2);
        if (hasPermission(properties, 8) || hasPermission(properties, 4)) {
            z = true;
        } else {
            z = false;
        }
        boolean hasPermission2 = hasPermission(properties, 16);
        boolean hasPermission3 = hasPermission(properties, 32);
        if (hasPermission2 || hasPermission3) {
            List<BluetoothGattDescriptor> descriptors = bluetoothGattCharacteristic.getDescriptors();
            if (descriptors == null || descriptors.isEmpty()) {
                AppBrandLogger.m52830i("LarkApiGetBLEDeviceCharacteristicsCtrlPlugin_BluetoothTAG", "notify characteristic: " + bluetoothGattCharacteristic.getUuid().toString() + ", no descriptors");
            } else {
                StringBuilder sb = new StringBuilder("characteristic: ");
                sb.append(bluetoothGattCharacteristic.getUuid().toString());
                sb.append(", notify descriptor: \n");
                for (BluetoothGattDescriptor bluetoothGattDescriptor : descriptors) {
                    sb.append("\t");
                    sb.append(bluetoothGattDescriptor.getUuid().toString());
                    sb.append("\n");
                }
                AppBrandLogger.m52830i("LarkApiGetBLEDeviceCharacteristicsCtrlPlugin_BluetoothTAG", sb.toString());
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("characteristicId", (Object) bluetoothGattCharacteristic.getUuid().toString());
        jSONObject.put("serviceId", (Object) bluetoothGattCharacteristic.getService().getUuid().toString());
        jSONObject.put("value", (Object) C24758b.m89825a(bluetoothGattCharacteristic.getValue()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("read", (Object) Boolean.valueOf(hasPermission));
        jSONObject2.put("write", (Object) Boolean.valueOf(z));
        jSONObject2.put("notify", (Object) Boolean.valueOf(hasPermission2));
        jSONObject2.put("indicate", (Object) Boolean.valueOf(hasPermission3));
        jSONObject.put("properties", (Object) jSONObject2);
        return jSONObject;
    }

    public static List<BluetoothGattCharacteristic> getAllCharacteristicList(List<BluetoothGattService> list, String str) {
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

    @LKPluginFunction(async = true, eventName = {"getBLEDeviceCharacteristics"})
    public void LarkApiGetBLEDeviceCharacteristicsCtrlAsync(LKEvent lKEvent, LarkApiGetBLEDeviceCharacteristicsCtrlRequest larkApiGetBLEDeviceCharacteristicsCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiGetBLEDeviceCharacteristicsCtrlResponse> hVar) {
        final LarkApiGetBLEDeviceCharacteristicsCtrlResponse larkApiGetBLEDeviceCharacteristicsCtrlResponse = new LarkApiGetBLEDeviceCharacteristicsCtrlResponse();
        this.mInvokeCallback = hVar;
        AppBrandLogger.m52830i("LarkApiGetBLEDeviceCharacteristicsCtrlPlugin_BluetoothTAG", "act getBLEDeviceCharacteristics");
        try {
            String str = larkApiGetBLEDeviceCharacteristicsCtrlRequest.deviceId;
            final String str2 = larkApiGetBLEDeviceCharacteristicsCtrlRequest.serviceId;
            if (TextUtils.isEmpty(str2)) {
                AppBrandLogger.m52829e("LarkApiGetBLEDeviceCharacteristicsCtrlPlugin_BluetoothTAG", "getBLEDeviceCharacteristics, serviceId is empty");
                callbackResponse(fillResponse(larkApiGetBLEDeviceCharacteristicsCtrlResponse, C25907b.f64108t));
                return;
            }
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87820a(str, new C24777a.AbstractC24784g() {
                /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.LarkApiGetBLEDeviceCharacteristicsCtrlPlugin.C247711 */

                /* renamed from: a */
                public void onResult(BluetoothGatt bluetoothGatt, Integer num, List<BluetoothGattService> list) {
                    if (list == null || list.isEmpty()) {
                        LarkApiGetBLEDeviceCharacteristicsCtrlPlugin larkApiGetBLEDeviceCharacteristicsCtrlPlugin = LarkApiGetBLEDeviceCharacteristicsCtrlPlugin.this;
                        larkApiGetBLEDeviceCharacteristicsCtrlPlugin.callbackResponse(larkApiGetBLEDeviceCharacteristicsCtrlPlugin.fillResponse(larkApiGetBLEDeviceCharacteristicsCtrlResponse, C25907b.f64100l));
                        AppBrandLogger.m52829e("LarkApiGetBLEDeviceCharacteristicsCtrlPlugin_BluetoothTAG", "getBLEDeviceCharacteristics error, service list is empty.");
                        return;
                    }
                    List<BluetoothGattCharacteristic> allCharacteristicList = LarkApiGetBLEDeviceCharacteristicsCtrlPlugin.getAllCharacteristicList(list, str2);
                    AppBrandLogger.m52830i("LarkApiGetBLEDeviceCharacteristicsCtrlPlugin_BluetoothTAG", "getBLEDeviceCharacteristics, size: " + allCharacteristicList.size());
                    JSONArray jSONArray = new JSONArray();
                    try {
                        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : allCharacteristicList) {
                            jSONArray.add(LarkApiGetBLEDeviceCharacteristicsCtrlPlugin.toJson(bluetoothGattCharacteristic));
                        }
                        LarkApiGetBLEDeviceCharacteristicsCtrlPlugin.this.fillResponse(larkApiGetBLEDeviceCharacteristicsCtrlResponse, C25907b.f64095g);
                        larkApiGetBLEDeviceCharacteristicsCtrlResponse.characteristics = jSONArray;
                        LarkApiGetBLEDeviceCharacteristicsCtrlPlugin.this.callbackResponse(larkApiGetBLEDeviceCharacteristicsCtrlResponse);
                    } catch (JSONException e) {
                        LarkApiGetBLEDeviceCharacteristicsCtrlPlugin.this.fillFailedResponse(larkApiGetBLEDeviceCharacteristicsCtrlResponse, C25906a.f64080j, e.getMessage());
                        LarkApiGetBLEDeviceCharacteristicsCtrlPlugin.this.callbackResponse(larkApiGetBLEDeviceCharacteristicsCtrlResponse);
                        AppBrandLogger.m52829e("LarkApiGetBLEDeviceCharacteristicsCtrlPlugin_BluetoothTAG", "getBLEDeviceCharacteristics error: " + e.getMessage(), e);
                    }
                }
            });
            if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackResponse(fillResponse(larkApiGetBLEDeviceCharacteristicsCtrlResponse, a));
            }
        } catch (Exception e) {
            fillFailedResponse(larkApiGetBLEDeviceCharacteristicsCtrlResponse, C25906a.f64080j, e.getMessage());
            callbackResponse(larkApiGetBLEDeviceCharacteristicsCtrlResponse);
            AppBrandLogger.m52829e("LarkApiGetBLEDeviceCharacteristicsCtrlPlugin_BluetoothTAG", "getBLEDeviceCharacteristics error: " + e.getMessage(), e);
        }
    }
}
