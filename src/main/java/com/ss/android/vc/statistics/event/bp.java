package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.audio.C61405a;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bp {
    /* renamed from: a */
    public static void m250202a(MeetingAudioManager.AudioType audioType, boolean z, VideoChat videoChat) {
        m250204a(C61405a.m239521a(audioType, z), (JSONObject) null, videoChat);
    }

    /* renamed from: a */
    private static void m250204a(String str, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_page_preview", jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m250206b(MeetingAudioManager.AudioType audioType, boolean z, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_voice_source", C61405a.m239521a(audioType, z));
            jSONObject.put("after_voice_source", 0);
            m250204a("voice_source_unchanged", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250203a(MeetingAudioManager.AudioType audioType, boolean z, MeetingAudioManager.AudioType audioType2, boolean z2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_voice_source", C61405a.m239521a(audioType, z));
            jSONObject.put("after_voice_source", C61405a.m239521a(audioType2, z2));
            m250204a("voice_source_changed", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250205a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        String str2;
        int i;
        int i2;
        int i3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "start");
            if (z) {
                str2 = "create_meeting";
            } else {
                str2 = "join_meeting";
            }
            jSONObject.put("from_source", str2);
            int i4 = 1;
            if (z2) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("default_camera", i);
            if (z3) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("default_mic", i2);
            if (z4) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("start_camera", i3);
            if (!z5) {
                i4 = 0;
            }
            jSONObject.put("start_mic", i4);
            jSONObject.put("env_id", str);
            C63726b.m249915a("vc_meeting_page_preview", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
