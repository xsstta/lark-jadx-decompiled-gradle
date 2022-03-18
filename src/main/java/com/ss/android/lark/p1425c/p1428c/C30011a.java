package com.ss.android.lark.p1425c.p1428c;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.c.c.a */
public class C30011a extends BaseHitPoint {
    /* renamed from: a */
    public static void m110968a() {
        Statistics.sendEvent("android_rate_rule_now");
    }

    /* renamed from: b */
    public static void m110971b() {
        Statistics.sendEvent("android_rate_rule_later");
    }

    /* renamed from: c */
    public static void m110972c() {
        Statistics.sendEvent("android_rate_rule_lark_no_gp");
    }

    /* renamed from: d */
    public static void m110973d() {
        Statistics.sendEvent("android_rate_rule_feishu_no_store");
    }

    /* renamed from: a */
    public static void m110969a(int i) {
        try {
            Statistics.sendEvent("android_rate_rule", new JSONObject().put("rate_type", m110970b(i)));
        } catch (JSONException e) {
            Log.m165383e("AppRating", e.getMessage());
        }
    }

    /* renamed from: b */
    private static String m110970b(int i) {
        if (i == 1) {
            return "reaction";
        }
        if (i == 2) {
            return "badge";
        }
        Log.m165397w("AppRating", "type is unknown.");
        return "unknown";
    }
}
