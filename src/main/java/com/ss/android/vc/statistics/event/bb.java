package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bb {
    /* renamed from: a */
    public static void m250148a(boolean z, VideoChat videoChat) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "click_mirror");
            jSONObject.put("from_source", "vc_main_settings");
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("action_enable", i);
            C63726b.m249915a("vc_meeting_video_setting", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingSettingsEvent", "[sendClickMirrorSwitchEvent]", e.getMessage());
        }
    }
}
