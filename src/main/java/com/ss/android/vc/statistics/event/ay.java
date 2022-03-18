package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class ay {
    /* renamed from: a */
    public static void m250130a(VideoChat videoChat, boolean z) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "record_popup");
            if (z) {
                str = "stay_meeting";
            } else {
                str = "leave_meeting";
            }
            jSONObject.put("action_name", str);
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingRecordPopupEvent", "[sendRecordPopupEvent]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250131b(VideoChat videoChat, boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("recording_status", i);
            jSONObject.put("action_name", "click_record");
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingRecordPopupEvent", "[sendRecordClickEvent]", e.getMessage());
        }
    }
}
