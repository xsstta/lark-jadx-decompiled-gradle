package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.framwork.core.p749b.C14120a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24759c;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25907b;
import com.tt.miniapphost.AppbrandContext;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class LarkApiGetConnectedBluetoothDevicesCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiGetConnectedBluetoothDevicesCtrlRequest extends C25920a {
        @JSONField(name = "services")
        public JSONArray services;

        private LarkApiGetConnectedBluetoothDevicesCtrlRequest() {
        }
    }

    private static class LarkApiGetConnectedBluetoothDevicesCtrlResponse extends C25921b {
        @JSONField(name = "devices")
        public JSONArray devices;

        private LarkApiGetConnectedBluetoothDevicesCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private boolean addToResult(JSONArray jSONArray, Map<String, ScanResult> map, String str) {
        if (jSONArray == null || jSONArray.size() == 0) {
            return true;
        }
        ScanResult scanResult = map.get(str);
        if (scanResult == null) {
            AppBrandLogger.m52830i("LarkApiGetConnectedBluetoothDevicesCtrlPlugin_BluetoothTAG", "no such result in ScanResultMap:" + str);
            return false;
        }
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord == null || C14120a.m57141a(scanRecord.getServiceUuids())) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (ParcelUuid parcelUuid : scanRecord.getServiceUuids()) {
            if (!TextUtils.isEmpty(parcelUuid.toString())) {
                hashSet.add(parcelUuid.toString());
            }
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            try {
                if (!hashSet.contains(jSONArray.getString(i))) {
                    return false;
                }
            } catch (JSONException unused) {
                AppBrandLogger.m52830i("LarkApiGetConnectedBluetoothDevicesCtrlPlugin_BluetoothTAG", "parse serviceUUIDs error" + jSONArray);
                return false;
            }
        }
        return true;
    }

    @LKPluginFunction(async = true, eventName = {"getConnectedBluetoothDevices"})
    public void getConnectedBluetoothDevicesCtrlAsync(LKEvent lKEvent, LarkApiGetConnectedBluetoothDevicesCtrlRequest larkApiGetConnectedBluetoothDevicesCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiGetConnectedBluetoothDevicesCtrlResponse> hVar) {
        JSONException e;
        int i;
        this.mInvokeCallback = hVar;
        LarkApiGetConnectedBluetoothDevicesCtrlResponse larkApiGetConnectedBluetoothDevicesCtrlResponse = new LarkApiGetConnectedBluetoothDevicesCtrlResponse();
        AppBrandLogger.m52830i("LarkApiGetConnectedBluetoothDevicesCtrlPlugin_BluetoothTAG", "act getConnectedBluetoothDevices");
        if (!C24759c.m89831a(getAppContext())) {
            callbackResponse(fillResponse(larkApiGetConnectedBluetoothDevicesCtrlResponse, C25907b.f64096h));
            return;
        }
        try {
            JSONArray jSONArray = larkApiGetConnectedBluetoothDevicesCtrlRequest.services;
            List<BluetoothDevice> connectedDevices = ((BluetoothManager) AppbrandContext.getInst().getApplicationContext().getSystemService("bluetooth")).getConnectedDevices(7);
            Object[] objArr = new Object[2];
            objArr[0] = "connected device size: ";
            if (connectedDevices != null) {
                i = connectedDevices.size();
            } else {
                i = -1;
            }
            objArr[1] = Integer.valueOf(i);
            AppBrandLogger.m52830i("LarkApiGetConnectedBluetoothDevicesCtrlPlugin_BluetoothTAG", objArr);
            JSONArray jSONArray2 = new JSONArray();
            Map<String, ScanResult> e2 = C24737a.m89797a(getAppContext()).mo87742e();
            for (BluetoothDevice bluetoothDevice : connectedDevices) {
                if (addToResult(jSONArray, e2, bluetoothDevice.getAddress())) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", (Object) bluetoothDevice.getName());
                    jSONObject.put("deviceId", (Object) bluetoothDevice.getAddress());
                    jSONArray2.add(jSONObject);
                }
            }
            LarkApiGetConnectedBluetoothDevicesCtrlResponse larkApiGetConnectedBluetoothDevicesCtrlResponse2 = (LarkApiGetConnectedBluetoothDevicesCtrlResponse) fillResponse(larkApiGetConnectedBluetoothDevicesCtrlResponse, C25907b.f64095g);
            try {
                larkApiGetConnectedBluetoothDevicesCtrlResponse2.devices = jSONArray2;
                callbackResponse(larkApiGetConnectedBluetoothDevicesCtrlResponse2);
            } catch (JSONException e3) {
                e = e3;
                larkApiGetConnectedBluetoothDevicesCtrlResponse = larkApiGetConnectedBluetoothDevicesCtrlResponse2;
            }
        } catch (JSONException e4) {
            e = e4;
            fillFailedResponse(larkApiGetConnectedBluetoothDevicesCtrlResponse, C25906a.f64080j, e.getMessage());
            callbackResponse(larkApiGetConnectedBluetoothDevicesCtrlResponse);
            AppBrandLogger.m52829e("LarkApiGetConnectedBluetoothDevicesCtrlPlugin_BluetoothTAG", "LarkApiGetConnectedBluetoothDevicesCtrl json error: " + e.getMessage(), e);
        }
    }
}
