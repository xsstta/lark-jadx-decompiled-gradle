package com.larksuite.component.openplatform.core.plugin.device.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.framwork.core.p749b.C14120a;
import com.huawei.hms.android.HwBuildEx;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.b */
public class C24758b {
    /* renamed from: a */
    public static byte[] m89829a(String str) {
        if (TextUtils.isEmpty(str) || str.length() % 2 != 0) {
            return null;
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) ((((byte) (Character.digit(str.charAt(i), 16) & 255)) << 4) | ((byte) (Character.digit(str.charAt(i + 1), 16) & 255)));
            i += 2;
        }
        return bArr;
    }

    /* renamed from: a */
    public static String m89823a(BluetoothError bluetoothError) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", bluetoothError.errorCode());
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, bluetoothError.errorMsg());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "build errormsg error";
        }
    }

    /* renamed from: a */
    public static String m89825a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] >>> 4) & 15];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return new String(cArr2);
    }

    /* renamed from: a */
    public static JSONObject m89827a(ScanResult scanResult) {
        AppBrandLogger.m52830i("BluetoothTAG", "parse ScanResult" + scanResult);
        JSONObject jSONObject = new JSONObject();
        BluetoothDevice device = scanResult.getDevice();
        ScanRecord scanRecord = scanResult.getScanRecord();
        try {
            jSONObject.put("RSSI", scanResult.getRssi());
            if (device != null) {
                jSONObject.put("name", device.getName()).put("deviceId", device.getAddress());
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
                            jSONArray.put(parcelUuid.getUuid().toString());
                        }
                    }
                }
                jSONObject.put("advertisServiceUUIDs", jSONArray);
                JSONObject jSONObject2 = new JSONObject();
                Map<ParcelUuid, byte[]> serviceData = scanRecord.getServiceData();
                if (serviceData != null) {
                    for (ParcelUuid parcelUuid2 : serviceData.keySet()) {
                        String encodeToString = Base64.encodeToString(serviceData.get(parcelUuid2), 2);
                        if (!TextUtils.isEmpty(parcelUuid2.toString()) && !TextUtils.isEmpty(encodeToString)) {
                            jSONObject2.put(parcelUuid2.toString(), encodeToString);
                        }
                    }
                }
                jSONObject.put("serviceData", jSONObject2);
                AppBrandLogger.m52830i("BluetoothTAG", "scanresult info json:" + jSONObject.toString());
            }
        } catch (JSONException e) {
            AppBrandLogger.m52830i("BluetoothTAG", "build bluetooth deviceInfo error" + e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m89824a(BluetoothError bluetoothError, int i) {
        return m89822a(bluetoothError.errorCode(), bluetoothError.errorMsg(), i);
    }

    /* renamed from: a */
    public static String m89821a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", i);
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "build errormsg error";
        }
    }

    /* renamed from: a */
    public static JSONObject m89826a(BluetoothAdapter bluetoothAdapter, IAppContext iAppContext) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("available", bluetoothAdapter.isEnabled());
            jSONObject.put("discovering", C24737a.m89797a(iAppContext).mo87741d());
            AppBrandLogger.m52830i("BluetoothTAG", "getBluetoothAdapterState result:" + jSONObject.toString());
        } catch (JSONException unused) {
            AppBrandLogger.m52830i("BluetoothTAG", "build json result error");
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m89828a(ApiHandler apiHandler, IAppContext iAppContext) {
        if (C24737a.m89797a(iAppContext).mo87740c()) {
            return true;
        }
        AppBrandLogger.m52830i("BluetoothTAG", "checkInited, not init");
        apiHandler.callbackFail(m89821a((int) HwBuildEx.VersionCodes.CUR_DEVELOPMENT, "not init"));
        return false;
    }

    /* renamed from: a */
    public static String m89822a(int i, String str, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", i);
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str);
            jSONObject.put("state", i2);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "build errormsg error";
        }
    }
}
