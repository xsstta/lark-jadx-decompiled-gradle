package com.ss.android.vc.statistics.event;

import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class ba {
    /* renamed from: a */
    public static void m250139a(String str, String str2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250141a("remove_user", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSearchUserListEvent", "[sendRemoveEvent]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250143b(String str, String str2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250141a("assign_host", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSearchUserListEvent", "[sendHostEvent]", e.getMessage());
        }
    }

    /* renamed from: c */
    public static void m250145c(String str, String str2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250141a("reclaim_host", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSearchUserListEvent", "[sendReclaimHostEvent]", e.getMessage());
        }
    }

    /* renamed from: d */
    public static void m250147d(String str, String str2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250141a("stop_sharing", (JSONObject) null, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSearchUserListEvent", "[sendStopPartiShareEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    private static void m250141a(String str, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            jSONObject2.put("from_source", "search_userlist");
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_page_userlist", jSONObject2, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSearchUserListEvent", "[sendEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250140a(String str, String str2, boolean z, VideoChat videoChat) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            if (z) {
                str3 = "assign_cohost";
            } else {
                str3 = "withdraw_cohost";
            }
            m250141a(str3, jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSearchUserListEvent", "[sendCoHostEvent]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250144b(boolean z, String str, String str2, VideoChat videoChat) {
        if (z) {
            try {
                m250141a("self_lower_hand", (JSONObject) null, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingSearchUserListEvent", "[sendLowerHandsEvent]", e.getMessage());
            }
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250141a("lower_hand", jSONObject, videoChat);
        }
    }

    /* renamed from: c */
    public static void m250146c(boolean z, String str, String str2, VideoChat videoChat) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("action_enabled", i);
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250141a("mic", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSearchUserListEvent", "[sendManageMicEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250142a(boolean z, String str, String str2, VideoChat videoChat) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("action_enabled", i);
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250141a("camera", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSearchUserListEvent", "[sendManageCameraEvent]", e.getMessage());
        }
    }
}
