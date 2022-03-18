package com.ss.android.lark.invitation.v2.statistic;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.invitation.v2.statistic.a */
public class C40530a {
    /* renamed from: c */
    public static void m160430c() {
        Statistics.sendEvent("guide_update_dialog_skip");
    }

    /* renamed from: a */
    public static void m160428a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger", "addmember");
            jSONObject.put("path", "user_guide");
            Statistics.sendEvent("guide_update_dialog_show", jSONObject);
        } catch (JSONException e) {
            Log.m165383e("GuideHitPoint", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m160429b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger", "addmember");
            jSONObject.put("path", "user_guide");
            Statistics.sendEvent("guide_update_dialog_click", jSONObject);
        } catch (JSONException e) {
            Log.m165383e("GuideHitPoint", e.getMessage());
        }
    }
}
