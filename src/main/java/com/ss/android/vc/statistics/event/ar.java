package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class ar {
    /* renamed from: a */
    public static void m250050a(boolean z, VideoChat videoChat) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("action_enabled", i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", "mute_on_entry");
            jSONObject2.put("extend_value", jSONObject);
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
