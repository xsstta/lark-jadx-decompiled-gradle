package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
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
import java.util.List;

public class LarkApiGetBLEDeviceServicesCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiGetBLEDeviceServicesCtrlRequest extends C25920a {
        @JSONField(name = "deviceId")
        public String deviceId;

        private LarkApiGetBLEDeviceServicesCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class LarkApiGetBLEDeviceServicesCtrlResponse extends C25921b {
        @JSONField(name = "services")
        public JSONArray services;

        private LarkApiGetBLEDeviceServicesCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"getBLEDeviceServices"})
    public void LarkApiGetBLEDeviceServicesCtrlAsync(LKEvent lKEvent, LarkApiGetBLEDeviceServicesCtrlRequest larkApiGetBLEDeviceServicesCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiGetBLEDeviceServicesCtrlResponse> hVar) {
        final LarkApiGetBLEDeviceServicesCtrlResponse larkApiGetBLEDeviceServicesCtrlResponse = new LarkApiGetBLEDeviceServicesCtrlResponse();
        this.mInvokeCallback = hVar;
        AppBrandLogger.m52830i("LarkApiGetBLEDeviceServicesCtrlPlugin_BluetoothTAG", "act getBLEDeviceServices");
        try {
            BluetoothError a = C24777a.m89866a(getAppContext()).mo87820a(larkApiGetBLEDeviceServicesCtrlRequest.deviceId, new C24777a.AbstractC24784g() {
                /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.LarkApiGetBLEDeviceServicesCtrlPlugin.C247721 */

                /* renamed from: a */
                public void onResult(BluetoothGatt bluetoothGatt, Integer num, List<BluetoothGattService> list) {
                    boolean z;
                    if (list == null || list.isEmpty()) {
                        LarkApiGetBLEDeviceServicesCtrlPlugin larkApiGetBLEDeviceServicesCtrlPlugin = LarkApiGetBLEDeviceServicesCtrlPlugin.this;
                        larkApiGetBLEDeviceServicesCtrlPlugin.callbackResponse(larkApiGetBLEDeviceServicesCtrlPlugin.fillResponse(larkApiGetBLEDeviceServicesCtrlResponse, C25907b.f64100l));
                        AppBrandLogger.m52829e("LarkApiGetBLEDeviceServicesCtrlPlugin_BluetoothTAG", "getBLEDeviceServices error, service list is empty");
                        return;
                    }
                    try {
                        JSONArray jSONArray = new JSONArray();
                        for (BluetoothGattService bluetoothGattService : list) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("serviceId", (Object) bluetoothGattService.getUuid().toString());
                            if (bluetoothGattService.getType() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            jSONObject.put("isPrimary", (Object) Boolean.valueOf(z));
                            jSONArray.add(jSONObject);
                        }
                        larkApiGetBLEDeviceServicesCtrlResponse.services = jSONArray;
                        LarkApiGetBLEDeviceServicesCtrlPlugin larkApiGetBLEDeviceServicesCtrlPlugin2 = LarkApiGetBLEDeviceServicesCtrlPlugin.this;
                        larkApiGetBLEDeviceServicesCtrlPlugin2.callbackResponse(larkApiGetBLEDeviceServicesCtrlPlugin2.fillResponse(larkApiGetBLEDeviceServicesCtrlResponse, C25907b.f64095g));
                    } catch (JSONException e) {
                        LarkApiGetBLEDeviceServicesCtrlPlugin.this.fillFailedResponse(larkApiGetBLEDeviceServicesCtrlResponse, C25906a.f64080j, e.getMessage());
                        LarkApiGetBLEDeviceServicesCtrlPlugin.this.callbackResponse(larkApiGetBLEDeviceServicesCtrlResponse);
                        AppBrandLogger.m52829e("LarkApiGetBLEDeviceServicesCtrlPlugin_BluetoothTAG", "getBLEDeviceServices error: " + e.getMessage(), e);
                    }
                }
            });
            if (a != BluetoothError.BLUETOOTH_API_NO_ERROR) {
                callbackResponse(fillResponse(larkApiGetBLEDeviceServicesCtrlResponse, a));
            }
        } catch (Exception e) {
            fillFailedResponse(larkApiGetBLEDeviceServicesCtrlResponse, C25906a.f64080j, e.getMessage());
            callbackResponse(larkApiGetBLEDeviceServicesCtrlResponse);
            AppBrandLogger.m52829e("LarkApiGetBLEDeviceServicesCtrlPlugin_BluetoothTAG", "getBLEDeviceServices error: " + e.getMessage(), e);
        }
    }
}
