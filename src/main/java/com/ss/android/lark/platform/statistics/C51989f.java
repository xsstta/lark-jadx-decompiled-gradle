package com.ss.android.lark.platform.statistics;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.statistics.f */
public class C51989f {
    /* renamed from: a */
    public static boolean m201666a() {
        return false;
    }

    /* renamed from: a */
    public static void m201663a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            MonitorUtils.monitorEvent("app_launch_time", null, jSONObject, jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    static void m201662a(long j, long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("latency", j + j2);
            jSONObject.put("pct2cet", j2);
            MonitorUtils.monitorEvent("app_startup_time_v2", null, jSONObject, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    static void m201664a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        try {
            jSONObject2.put("page_name", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MonitorUtils.monitorEvent("app_startup_time", null, jSONObject, jSONObject2);
    }

    /* renamed from: b */
    static void m201667b(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject3.put(next, jSONObject.getLong(next));
            }
            jSONObject3.put("extra_metrics", jSONObject2.toString());
            jSONObject3.put("page_name", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Statistics.sendEvent("lark_android_dev_launcher_traces", jSONObject3);
    }

    /* renamed from: a */
    public static void m201665a(boolean z, JSONObject jSONObject, JSONObject jSONObject2, String str, long j, long j2) {
        boolean z2 = !z;
        if (z) {
            try {
                Log.m165389i("PerfReporter", "clod start is invalid, no need to report");
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (z2) {
            m201667b(jSONObject, jSONObject2, str);
            m201664a(jSONObject, jSONObject2, str);
            m201662a(j, j2);
        }
    }
}
