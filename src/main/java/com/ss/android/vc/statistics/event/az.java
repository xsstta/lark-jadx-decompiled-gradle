package com.ss.android.vc.statistics.event;

import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class az {
    /* renamed from: a */
    public static void m250132a(String str, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uuid", C57859q.m224565a(str));
            m250133a("calling", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSearchListEvent", "[sendCallEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    private static void m250133a(String str, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_page_search_list", jSONObject2, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSearchListEvent", "[sendEvent]", e.getMessage());
        }
    }
}
