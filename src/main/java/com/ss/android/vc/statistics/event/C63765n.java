package com.ss.android.vc.statistics.event;

import com.google.firebase.messaging.Constants;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.audio.C61405a;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.n */
public class C63765n {
    /* renamed from: a */
    public static void m250319a(VideoChat videoChat) {
        m250322a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, (JSONObject) null, videoChat);
    }

    /* renamed from: a */
    public static void m250320a(MeetingAudioManager.AudioType audioType, boolean z, VideoChat videoChat) {
        m250322a(C61405a.m239521a(audioType, z), (JSONObject) null, videoChat);
    }

    /* renamed from: b */
    public static void m250323b(MeetingAudioManager.AudioType audioType, boolean z, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_voice_source", C61405a.m239521a(audioType, z));
            jSONObject.put("after_voice_source", 0);
            m250322a("voice_source_unchanged", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("CallingPageEvent", "[sendAudioTypeUnchangedEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    private static void m250322a(String str, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_call_page_calling", jSONObject2, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("CallingPageEvent", "[sendCallingPageEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250321a(MeetingAudioManager.AudioType audioType, boolean z, MeetingAudioManager.AudioType audioType2, boolean z2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_voice_source", C61405a.m239521a(audioType, z));
            jSONObject.put("after_voice_source", C61405a.m239521a(audioType2, z2));
            m250322a("voice_source_changed", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("CallingPageEvent", "[sendAudioTypeChangedEvent]", e.getMessage());
        }
    }
}
