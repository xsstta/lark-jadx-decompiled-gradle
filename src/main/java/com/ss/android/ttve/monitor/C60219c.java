package com.ss.android.ttve.monitor;

import android.content.Context;
import android.util.Log;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.c */
public class C60219c {
    /* renamed from: a */
    public static void m234050a() {
        SDKMonitorUtils.setConfigUrl("1357", m234056d());
        SDKMonitorUtils.setDefaultReportUrl("1357", m234055c());
    }

    /* renamed from: b */
    private static SDKMonitor m234054b() {
        try {
            return SDKMonitorUtils.getInstance("1357");
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("MonitorCompat", "SDKMonitor getInstance failed");
            return null;
        }
    }

    /* renamed from: c */
    private static List<String> m234055c() {
        return new ArrayList(Arrays.asList("https://mon.snssdk.com/monitor/collect/", "https://mon.toutiao.com/monitor/collect/", "https://mon.toutiaocloud.com/monitor/collect/", "https://mon.toutiaocloud.net/monitor/collect/"));
    }

    /* renamed from: d */
    private static List<String> m234056d() {
        return new ArrayList(Arrays.asList("https://mon.snssdk.com/monitor/appmonitor/v2/settings", "https://monsetting.toutiao.com/monitor/appmonitor/v2/settings", "https://monsetting.toutiao.com/monitor/appmonitor/v2/settings"));
    }

    /* renamed from: a */
    public static String m234049a(String str) {
        SDKMonitor b = m234054b();
        if (b == null) {
            Log.e("MonitorCompat", "SDKMonitor is not inited, setDeviceId failed!");
            return null;
        }
        JSONObject reportJsonHeaderInfo = b.reportJsonHeaderInfo();
        if (reportJsonHeaderInfo != null) {
            try {
                return reportJsonHeaderInfo.getString(str);
            } catch (JSONException e) {
                Log.e("MonitorCompat", "getHeaderInfo failed! key = " + str, e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m234053a(String str, String str2) {
        SDKMonitor b = m234054b();
        if (b == null) {
            Log.e("MonitorCompat", "SDKMonitor is not inited, setDeviceId failed!");
            return;
        }
        JSONObject reportJsonHeaderInfo = b.reportJsonHeaderInfo();
        if (reportJsonHeaderInfo != null) {
            try {
                reportJsonHeaderInfo.put(str, str2);
            } catch (JSONException e) {
                Log.e("MonitorCompat", "setHeaderInfo failed! key = " + str, e);
            }
        }
    }

    /* renamed from: a */
    public static void m234052a(String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e) {
                Log.e("MonitorCompat", "monitorStatusAndDuration: ", e);
            }
        }
        if (m234054b() != null) {
            m234054b().monitorStatusAndDuration(str, i, jSONObject, null);
        }
    }

    /* renamed from: a */
    public static void m234051a(Context context, String str, String str2, String str3) {
        SDKMonitorUtils.initMonitor(context, "1357", C60223e.m234077b(context, str, str2, str3), new SDKMonitor.IGetExtendParams() {
            /* class com.ss.android.ttve.monitor.C60219c.C602201 */

            @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
            public String getSessionId() {
                return null;
            }

            @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
            public Map<String, String> getCommonParams() {
                HashMap hashMap = new HashMap();
                hashMap.put("effect_version", "9.9.0_rel_1_lark_202111161500_9215fa605ba");
                return hashMap;
            }
        });
    }
}
