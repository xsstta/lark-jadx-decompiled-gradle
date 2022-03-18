package com.ss.android.lark.preload;

import com.larksuite.framework.utils.ao;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.preload.moment.PreloadMoment;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.preload.d */
public class C52235d {

    /* renamed from: a */
    private static String f129584a;

    /* renamed from: a */
    public static void m202608a() {
        f129584a = ao.m95038a().toString().replace("-", "");
    }

    /* renamed from: a */
    public static void m202609a(PreloadTarget preloadTarget, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time_of_occurrence", j);
            jSONObject.put("key_id", f129584a);
            jSONObject.put("business_type", preloadTarget);
            Statistics.sendEvent("lark_preload_launch_business_dev", jSONObject);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m202611b(PreloadTarget preloadTarget, PreloadMoment preloadMoment) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key_id", f129584a);
            jSONObject.put("preload_timing", preloadMoment);
            jSONObject.put("business_type", preloadTarget);
            jSONObject.put("time_of_occurrence", System.currentTimeMillis());
            Statistics.sendEvent("lark_preload_finish_preload_dev", jSONObject);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m202610a(PreloadTarget preloadTarget, PreloadMoment preloadMoment) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key_id", f129584a);
            jSONObject.put("preload_timing", preloadMoment);
            jSONObject.put("business_type", preloadTarget);
            jSONObject.put("time_of_occurrence", System.currentTimeMillis());
            Statistics.sendEvent("lark_preload_begin_preload_dev", jSONObject);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }
}
