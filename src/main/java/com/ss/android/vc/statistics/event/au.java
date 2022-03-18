package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.statistics.C63685a;
import org.json.JSONException;
import org.json.JSONObject;

public class au {
    /* renamed from: a */
    public static void m250120a(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            C63685a.m249653a("vc_meeting_page_update", jSONObject);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingPageRefreshEvent", "[sendRefreshEntry]", e.getMessage());
        }
    }
}
