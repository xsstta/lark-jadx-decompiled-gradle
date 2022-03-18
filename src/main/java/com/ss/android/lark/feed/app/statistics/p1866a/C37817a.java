package com.ss.android.lark.feed.app.statistics.p1866a;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.feed.app.statistics.a.a */
public class C37817a {
    /* renamed from: b */
    public static void m148837b() {
        Statistics.sendEvent("click_new_activity");
    }

    /* renamed from: a */
    public static void m148835a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121868c, "banner");
            Statistics.sendEvent("click_all_activity_page", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m148838b(boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("close_able", i);
            Statistics.sendEvent("invite_member_entry_inbox_click", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m148836a(boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("close_able", i);
            Statistics.sendEvent("invite_member_entry_inbox_view", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
