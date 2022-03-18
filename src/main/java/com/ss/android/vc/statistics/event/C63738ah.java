package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.audio.C61405a;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.ah */
public class C63738ah {
    /* renamed from: a */
    public static void m250009a(MeetingAudioManager.AudioType audioType, boolean z, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_voice_source", C61405a.m239521a(audioType, z));
            jSONObject.put("after_voice_source", 0);
            m250011a("voice_source_unchanged", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m250011a(String str, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250010a(MeetingAudioManager.AudioType audioType, boolean z, MeetingAudioManager.AudioType audioType2, boolean z2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_voice_source", C61405a.m239521a(audioType, z));
            jSONObject.put("after_voice_source", C61405a.m239521a(audioType2, z2));
            m250011a("voice_source_changed", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
