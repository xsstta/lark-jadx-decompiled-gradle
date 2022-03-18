package com.ss.sys.ces.p3234e;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.p002a.p003a.p005b.C0030c;

/* renamed from: com.ss.sys.ces.e.f */
public class C65399f {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.sys.ces.e.f$a */
    public static class C65400a implements Comparator<Object> {
        C65400a() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int abs = Math.abs(((ScanResult) obj).level);
            int abs2 = Math.abs(((ScanResult) obj2).level);
            if (abs > abs2) {
                return 1;
            }
            return abs == abs2 ? 0 : -1;
        }
    }

    /* renamed from: a */
    public static String m256474a(Context context) {
        String str;
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            String bssid = connectionInfo.getBSSID();
            String trim = bssid == null ? "" : bssid.trim();
            String ssid = connectionInfo.getSSID();
            String replace = (ssid == null ? "" : ssid.trim()).replace(' ', ' ').replace('\'', ' ').replace('\"', ' ');
            String num = Integer.toString(connectionInfo.getIpAddress());
            str = trim + "[<!>]" + replace + "[<!>]" + (num == null ? "" : num.trim()) + "[<!>]";
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: b */
    public static String m256475b(Context context) {
        String str;
        JSONArray jSONArray = new JSONArray();
        if (context == null) {
            C0030c.m48a("Context Instance is null...");
            return jSONArray.toString();
        }
        try {
            List<ScanResult> scanResults = ((WifiManager) context.getSystemService("wifi")).getScanResults();
            if (scanResults != null) {
                if (scanResults.size() > 0) {
                    Collections.sort(scanResults, new C65400a());
                    int i = 0;
                    while (true) {
                        if (i >= scanResults.size()) {
                            break;
                        } else if (i >= 10) {
                            break;
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("ss", scanResults.get(i).SSID.replaceAll("\"", "_"));
                                jSONObject.put("bs", scanResults.get(i).BSSID.replaceAll("\"", "_"));
                                jSONArray.put(jSONObject);
                            } catch (JSONException unused) {
                            }
                            i++;
                        }
                    }
                    str = jSONArray.toString();
                    return str == null ? "[]" : str.trim();
                }
            }
            C0030c.m48a("WifiList is null");
            return jSONArray.toString();
        } catch (Throwable unused2) {
            str = null;
        }
    }
}
