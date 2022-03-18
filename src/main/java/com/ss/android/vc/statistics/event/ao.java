package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class ao {
    /* renamed from: a */
    public static void m250025a(VideoChat videoChat, Participant participant) {
        if (videoChat != null && participant != null) {
            if (participant.getOfflineReason() == Participant.OfflineReason.KICK_OUT) {
                m250026a(videoChat, "kickout");
            } else if (participant.getOfflineReason() == Participant.OfflineReason.END) {
                m250026a(videoChat, "hang_up");
            } else if (videoChat.getEndReason() == VideoChat.EndReason.HANGUP) {
                m250026a(videoChat, "hang_up");
            } else if (videoChat.getEndReason() == VideoChat.EndReason.SDK_EXCEPTION) {
                m250026a(videoChat, "streaming_sdk_bad");
            } else if (videoChat.getEndReason() == VideoChat.EndReason.CONNECTION_FAILED) {
                m250026a(videoChat, "heartbeat_fail");
            } else {
                m250026a(videoChat, "other");
            }
        }
    }

    /* renamed from: a */
    public static void m250026a(VideoChat videoChat, String str) {
        if (videoChat != null) {
            C60700b.m235851b("MeetingFinishEvent", "[sendMeetingFinish]", "finishReason = " + str);
            if (!C60785x.m236238b()) {
                str = "no_network";
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("conference_id", videoChat.getId());
                jSONObject.put("finish_reason", str);
                jSONObject.put("participant_type", "lark_user");
                C63726b.m249915a("vc_meeting_finish", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
