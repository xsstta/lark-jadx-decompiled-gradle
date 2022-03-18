package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class av {
    /* renamed from: a */
    public static void m250122a(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "slide");
            if (z) {
                C63726b.m249917b("vc_meeting_page_onthecall", jSONObject);
            } else {
                C63726b.m249919c("vc_meeting_page_onthecall", jSONObject);
            }
        } catch (JSONException e) {
            C60700b.m235864f("MeetingPageRefreshEvent", "[sendSlideEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250121a(int i, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "screen_display");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("screen_type", i);
            jSONObject.put("extend_value", jSONObject2);
            if (z) {
                C63726b.m249917b("vc_meeting_page_onthecall", jSONObject);
            } else {
                C63726b.m249919c("vc_meeting_page_onthecall", jSONObject);
            }
        } catch (JSONException e) {
            C60700b.m235864f("MeetingPageRefreshEvent", "[sendScreenSwitchEvent]", e.getMessage());
        }
    }
}
