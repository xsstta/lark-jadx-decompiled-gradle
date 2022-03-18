package com.ss.android.vc.statistics.event;

import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class ax {
    /* renamed from: a */
    public static void m250127a(VideoChat videoChat) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "user_profile");
                C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingProfileClickEvent", "[sendProfileClickEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m250129b(VideoChat videoChat, String str, String str2) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "user_profile");
                jSONObject.put("from_source", "user_list");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("attendee_uuid", C57859q.m224565a(str));
                jSONObject2.put("attendee_device_id", str2);
                jSONObject.put("extend_value", jSONObject2);
                C63726b.m249915a("vc_meeting_page_userlist", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingProfileClickEvent", "[sendUserListProfileClickEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m250128a(VideoChat videoChat, String str, String str2) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "user_profile");
                jSONObject.put("from_source", "raise_hand_notification");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("attendee_uuid", C57859q.m224565a(str));
                jSONObject2.put("attendee_device_id", str2);
                jSONObject.put("extend_value", jSONObject2);
                C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingProfileClickEvent", "[sendRequestSpeakProfileClickEvent]", e.getMessage());
            }
        }
    }
}
