package com.ss.android.lark.platform.statistics;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.statistics.d */
public class C51986d {
    /* renamed from: d */
    private static void m201659d(JSONObject jSONObject, JSONObject jSONObject2, ConcurrentHashMap<String, Object> concurrentHashMap) {
    }

    /* renamed from: a */
    private static void m201655a(ConcurrentHashMap<String, Object> concurrentHashMap, JSONObject jSONObject) throws Exception {
        if (!(concurrentHashMap == null || jSONObject == null)) {
            for (String str : concurrentHashMap.keySet()) {
                jSONObject.put(str, concurrentHashMap.get(str));
            }
        }
    }

    /* renamed from: a */
    public static void m201656a(JSONObject jSONObject, JSONObject jSONObject2, ConcurrentHashMap<String, Object> concurrentHashMap) {
        if ((!C26284k.m95185a(C36083a.m141487b().getContext())) && jSONObject != null && jSONObject2 != null && concurrentHashMap != null) {
            m201657b(jSONObject, jSONObject2, concurrentHashMap);
            m201658c(jSONObject, jSONObject2, concurrentHashMap);
            m201659d(jSONObject, jSONObject2, concurrentHashMap);
        }
    }

    /* renamed from: b */
    private static void m201657b(JSONObject jSONObject, JSONObject jSONObject2, ConcurrentHashMap<String, Object> concurrentHashMap) {
        try {
            JSONObject jSONObject3 = new JSONObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject3.put(next, jSONObject.getLong(next));
            }
            jSONObject3.put("extra_metrics", jSONObject2.toString());
            m201655a(concurrentHashMap, jSONObject3);
            Log.m165389i("NonMainProcessReporter", "reportToTea: " + jSONObject3.toString());
            Statistics.sendEvent("non_main_process_launch_report_tea", jSONObject3);
        } catch (Throwable th) {
            Log.m165383e("NonMainProcessReporter", "reportToTea exception: " + th.getMessage());
        }
    }

    /* renamed from: c */
    private static void m201658c(JSONObject jSONObject, JSONObject jSONObject2, ConcurrentHashMap<String, Object> concurrentHashMap) {
        try {
            JSONObject jSONObject3 = new JSONObject();
            m201655a(concurrentHashMap, jSONObject3);
            MonitorUtils.monitorEvent("non_main_process_launch_report_slardar", jSONObject3, jSONObject, jSONObject2);
            Log.m165389i("NonMainProcessReporter", "reportToSlardar, category: " + jSONObject3 + ", metricsLog: " + jSONObject + ", extraLog: " + jSONObject2);
        } catch (Throwable th) {
            Log.m165383e("NonMainProcessReporter", "reportToSlardar exception: " + th.getMessage());
        }
    }
}
