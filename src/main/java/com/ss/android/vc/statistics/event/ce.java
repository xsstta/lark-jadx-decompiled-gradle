package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class ce {
    /* renamed from: a */
    public static void m250261a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "tab_meeting_list");
            C63726b.m249914a("vc_meeting_lark_detail", jSONObject);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[clickTabMeetingList]", e.getMessage());
        }
    }

    /* renamed from: e */
    public static void m250272e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "generate_statistics");
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendGenerateMeetingStatisticsEvent]", e.getMessage());
        }
    }

    /* renamed from: f */
    public static void m250273f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "view_statistics");
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendViewMeetingStatisticsEvent]", e.getMessage());
        }
    }

    /* renamed from: g */
    public static void m250274g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "lark_minutes");
            C63726b.m249915a("vc_meeting_tab", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendClickLMEvent]", e.getMessage());
        }
    }

    /* renamed from: h */
    public static void m250275h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "tab_meeting_detail_username");
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendGoToParticipantProfileEvent]", e.getMessage());
        }
    }

    /* renamed from: j */
    public static void m250277j() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "view_in_calendar");
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendCalendarPageEvent]", e.getMessage());
        }
    }

    /* renamed from: k */
    public static void m250278k() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "origin_group");
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendGroupPageEvent]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250265b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "meeting_detail");
            jSONObject.put("action_name", "tab_meeting_detail_chat");
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[send1v1ChatEvent]", e.getMessage());
        }
    }

    /* renamed from: c */
    public static void m250268c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "meeting_detail");
            jSONObject.put("action_name", "tab_meeting_detail_call");
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[send1v1VoiceCallEvent]", e.getMessage());
        }
    }

    /* renamed from: d */
    public static void m250270d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "meeting_detail");
            jSONObject.put("action_name", "tab_meeting_detail_video");
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[send1v1VideoCallEvent]", e.getMessage());
        }
    }

    /* renamed from: i */
    public static void m250276i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "meeting_detail");
            jSONObject.put("action_name", "vc_meeting_username");
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendGoToProfileEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250262a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "meeting_detail");
            jSONObject.put("action_name", "tab_meeting_detail_join");
            jSONObject.put("conference_id", str);
            C63726b.m249915a("vc_meeting_lark_entry", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendJoinStatusEvent]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250266b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "meeting_detail");
            jSONObject.put("action_name", "tab_meeting_detail_joined");
            jSONObject.put("conference_id", str);
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendJoinedStatusEvent]", e.getMessage());
        }
    }

    /* renamed from: c */
    public static void m250269c(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "meeting_detail");
            jSONObject.put("action_name", "tab_meeting_detail_waiting");
            jSONObject.put("conference_id", str);
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendWaitingStatusEvent]", e.getMessage());
        }
    }

    /* renamed from: d */
    public static void m250271d(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "tab_meeting_detail_userlist");
            jSONObject.put("conference_id", str);
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendOpenParticipantPageEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250264a(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_reminded", z);
            jSONObject.put("action_name", "tab_click");
            C63726b.m249914a("vc_meeting_lark_detail", jSONObject);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendRedotEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250263a(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "tab_meeting_detail_mm");
            jSONObject.put("conference_id", str);
            jSONObject.put("in_meeting", z);
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendOpenLarkMinutesEvent]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250267b(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "tab_meeting_detail_link");
            jSONObject.put("conference_id", str);
            jSONObject.put("in_meeting", z);
            C63726b.m249915a("vc_meeting_lark_detail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatTabEvent", "[sendOpenMagicShareEvent]", e.getMessage());
        }
    }
}
