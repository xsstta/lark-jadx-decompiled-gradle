package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.framwork.core.p749b.C14120a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.d */
public class C24752d extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getConnectedBluetoothDevices";
    }

    public C24752d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        int i;
        AppBrandLogger.m52830i("BluetoothTAG", "act getConnectedBluetoothDevices");
        if (C24758b.m89828a(this, getAppContext())) {
            try {
                JSONArray optJSONArray = new JSONObject(this.mArgs).optJSONArray("services");
                List<BluetoothDevice> connectedDevices = ((BluetoothManager) AppbrandContext.getInst().getApplicationContext().getSystemService("bluetooth")).getConnectedDevices(7);
                Object[] objArr = new Object[2];
                objArr[0] = "connected device size: ";
                if (connectedDevices != null) {
                    i = connectedDevices.size();
                } else {
                    i = -1;
                }
                objArr[1] = Integer.valueOf(i);
                AppBrandLogger.m52830i("ApiHandler", objArr);
                JSONArray jSONArray = new JSONArray();
                Map<String, ScanResult> e = C24737a.m89797a(getAppContext()).mo87742e();
                for (BluetoothDevice bluetoothDevice : connectedDevices) {
                    if (m89814a(optJSONArray, e, bluetoothDevice.getAddress())) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("name", bluetoothDevice.getName());
                        jSONObject.put("deviceId", bluetoothDevice.getAddress());
                        jSONArray.put(jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("devices", jSONArray);
                callbackOk(jSONObject2);
            } catch (JSONException e2) {
                callbackFail("fail");
                AppBrandLogger.m52829e("BluetoothTAG", "LarkApiGetConnectedBluetoothDevicesCtrl json error: " + e2.getMessage(), e2);
            }
        }
    }

    public C24752d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    /* renamed from: a */
    private boolean m89814a(JSONArray jSONArray, Map<String, ScanResult> map, String str) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return true;
        }
        ScanResult scanResult = map.get(str);
        if (scanResult == null) {
            AppBrandLogger.m52830i("BluetoothTAG", "no such result in ScanResultMap:" + str);
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
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (!hashSet.contains(jSONArray.getString(i))) {
                    return false;
                }
            } catch (JSONException unused) {
                AppBrandLogger.m52830i("BluetoothTAG", "parse serviceUUIDs error" + jSONArray);
                return false;
            }
        }
        return true;
    }
}
