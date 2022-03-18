package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bf {
    /* renamed from: a */
    public static void m250156a(VideoChat videoChat, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            jSONObject.put("from_source", "self_unmute");
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSpeakRequestEvent", "[sendHandUpDialogCancelEvent]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250162b(VideoChat videoChat, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            jSONObject.put("from_source", "self_lower_hand");
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSpeakRequestEvent", "[sendHandDownDialogEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250159a(VideoChat videoChat, boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "participants_unmute_permission");
            jSONObject.put("from_source", "control_bar");
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject2.put("action_enabled", i);
            jSONObject.put("extend_value", jSONObject2);
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSpeakRequestEvent", "[sendAllowPartiUnMuteEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250160a(VideoChat videoChat, boolean z, boolean z2) {
        String str;
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "confirm";
            } else {
                str = "cancel";
            }
            jSONObject.put("action_name", str);
            jSONObject.put("from_source", "mute_all");
            if (z) {
                JSONObject jSONObject2 = new JSONObject();
                if (z2) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject2.put("participants_unmute_permission", i);
                jSONObject.put("extend_value", jSONObject2);
            }
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSpeakRequestEvent", "[sendMuteAllDialogEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250157a(VideoChat videoChat, String str, String str2, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            jSONObject.put("from_source", "self_unmute");
            jSONObject.put("is_breakoutroom_start", i);
            jSONObject.put("user_location", str2);
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSpeakRequestEvent", "[sendHandUpDialogEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250158a(VideoChat videoChat, String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            jSONObject.put("from_source", "raise_hand_notification");
            if (TextUtils.equals(str, "unmute")) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("attendee_uuid", C57859q.m224565a(str2));
                jSONObject2.put("attendee_device_id", str3);
                jSONObject.put("extend_value", jSONObject2);
            }
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSpeakRequestEvent", "[sendHandUpTipsEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250161a(VideoChat videoChat, boolean z, boolean z2, int i, String str) {
        String str2;
        int i2;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str2 = "confirm";
            } else {
                str2 = "cancel";
            }
            jSONObject.put("action_name", str2);
            jSONObject.put("from_source", "mute_all");
            jSONObject.put("is_breakoutroom_start", i);
            jSONObject.put("user_location", str);
            if (z) {
                JSONObject jSONObject2 = new JSONObject();
                if (z2) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject2.put("participants_unmute_permission", i2);
                jSONObject.put("extend_value", jSONObject2);
            }
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSpeakRequestEvent", "[sendMuteAllDialogEventNew]", e.getMessage());
        }
    }
}
