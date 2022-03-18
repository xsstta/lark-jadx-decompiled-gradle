package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class ca {
    /* renamed from: a */
    public static void m250241a(VideoChat videoChat) {
        m250242a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "cannot_turnon_my_mic", videoChat);
    }

    /* renamed from: b */
    public static void m250245b(VideoChat videoChat) {
        m250242a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "unable_turnon_cam", videoChat);
    }

    /* renamed from: c */
    public static void m250246c(VideoChat videoChat) {
        m250242a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "unable_turnon_camera_apply_to_host", videoChat);
    }

    /* renamed from: d */
    public static void m250247d(VideoChat videoChat) {
        boolean z;
        if (ParticipantUtil.m248731c(videoChat.getParticipants()).getParticipantSettings().getRtcMode() == ParticipantSettings.RtcMode.AUDIENCE_MODE) {
            z = true;
        } else {
            z = false;
        }
        m250244a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "unable_to_unmute_pls_raise_hand", z, videoChat);
    }

    /* renamed from: e */
    public static void m250248e(VideoChat videoChat) {
        m250243a("confirm", "invite_open_camera", m250252i(videoChat), videoChat.getParticipants().size(), videoChat);
    }

    /* renamed from: f */
    public static void m250249f(VideoChat videoChat) {
        m250243a("cancel", "invite_open_camera", m250252i(videoChat), videoChat.getParticipants().size(), videoChat);
    }

    /* renamed from: g */
    public static void m250250g(VideoChat videoChat) {
        m250243a("confirm", "invite_open_mic", m250252i(videoChat), videoChat.getParticipants().size(), videoChat);
    }

    /* renamed from: h */
    public static void m250251h(VideoChat videoChat) {
        m250243a("cancel", "invite_open_mic", m250252i(videoChat), videoChat.getParticipants().size(), videoChat);
    }

    /* renamed from: i */
    private static boolean m250252i(VideoChat videoChat) {
        Participant c = ParticipantUtil.m248731c(videoChat.getParticipants());
        if (c == null || c.getParticipantSettings().getRtcMode() != ParticipantSettings.RtcMode.AUDIENCE_MODE) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m250242a(String str, String str2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("from_source", str2);
            }
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("ThousandMeetingEvent", "[sendToastEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    private static void m250244a(String str, String str2, boolean z, VideoChat videoChat) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("from_source", str2);
            }
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("audience_mode", i);
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("ThousandMeetingEvent", "[sendToastEventWithAudienceMode]", e.getMessage());
        }
    }

    /* renamed from: a */
    private static void m250243a(String str, String str2, boolean z, int i, VideoChat videoChat) {
        int i2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("from_source", str2);
            }
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("audience_mode", i2);
            jSONObject.put("participants_num", i);
            C63726b.m249915a("vc_meeting_lark_hint", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("ThousandMeetingEvent", "[sendHostAskEvent]", e.getMessage());
        }
    }
}
