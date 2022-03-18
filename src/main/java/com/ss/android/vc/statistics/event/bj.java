package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bj {
    /* renamed from: a */
    public static void m250181a(boolean z, VideoChat videoChat) {
        String str;
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    str = "zoom_in";
                } else {
                    str = "zoom_out";
                }
                jSONObject.put("action_name", str);
                C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
