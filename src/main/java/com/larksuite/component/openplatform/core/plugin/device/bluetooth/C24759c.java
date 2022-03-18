package com.larksuite.component.openplatform.core.plugin.device.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.framwork.core.p749b.C14120a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.c */
public class C24759c {
    /* renamed from: a */
    public static boolean m89831a(IAppContext iAppContext) {
        if (C24737a.m89797a(iAppContext).mo87740c()) {
            return true;
        }
        AppBrandLogger.m52830i("BluetoothTAG", "checkInitedV2, not init");
        return false;
    }

    /* renamed from: a */
    public static JSONObject m89830a(ScanResult scanResult) {
        AppBrandLogger.m52830i("BluetoothTAG", "parse ScanResult" + scanResult);
        JSONObject jSONObject = new JSONObject();
        BluetoothDevice device = scanResult.getDevice();
        ScanRecord scanRecord = scanResult.getScanRecord();
        try {
            jSONObject.put("RSSI", Integer.valueOf(scanResult.getRssi()));
            if (device != null) {
                jSONObject.put("name", device.getName());
                jSONObject.put("deviceId", device.getAddress());
            }
            if (scanRecord != null) {
                jSONObject.put("localName", scanRecord.getDeviceName());
                SparseArray<byte[]> manufacturerSpecificData = scanRecord.getManufacturerSpecificData();
                byte[] bArr = new byte[scanRecord.getBytes().length];
                if (manufacturerSpecificData != null) {
                    int i = 0;
                    for (int i2 = 0; i2 < manufacturerSpecificData.size(); i2++) {
                        int keyAt = manufacturerSpecificData.keyAt(i2);
                        int i3 = i + 1;
                        bArr[i] = (byte) (keyAt & 255);
                        i = i3 + 1;
                        bArr[i3] = (byte) ((keyAt >> 8) & 255);
                        byte[] bArr2 = manufacturerSpecificData.get(keyAt);
                        int i4 = 0;
                        while (i4 < bArr2.length) {
                            bArr[i] = bArr2[i4];
                            i4++;
                            i++;
                        }
                    }
                    jSONObject.put("advertisData", Base64.encodeToString(Arrays.copyOf(bArr, i), 2));
                }
                JSONArray jSONArray = new JSONArray();
                if (!C14120a.m57141a(scanRecord.getServiceUuids())) {
                    for (ParcelUuid parcelUuid : scanRecord.getServiceUuids()) {
                        if (parcelUuid.getUuid() != null && !TextUtils.isEmpty(parcelUuid.getUuid().toString())) {
                            jSONArray.add(parcelUuid.getUuid().toString());
                        }
                    }
                }
                jSONObject.put("advertisServiceUUIDs", (Object) jSONArray);
                JSONObject jSONObject2 = new JSONObject();
                Map<ParcelUuid, byte[]> serviceData = scanRecord.getServiceData();
                if (serviceData != null) {
                    for (ParcelUuid parcelUuid2 : serviceData.keySet()) {
                        String encodeToString = Base64.encodeToString(serviceData.get(parcelUuid2), 2);
                        if (!TextUtils.isEmpty(parcelUuid2.toString()) && !TextUtils.isEmpty(encodeToString)) {
                            jSONObject2.put(parcelUuid2.toString(), (Object) encodeToString);
                        }
                    }
                }
                jSONObject.put("serviceData", (Object) jSONObject2);
                AppBrandLogger.m52830i("BluetoothTAG", "scanresult info json:" + jSONObject.toString());
            }
        } catch (JSONException e) {
            AppBrandLogger.m52830i("BluetoothTAG", "build bluetooth deviceInfo error" + e);
        }
        return jSONObject;
    }
}
