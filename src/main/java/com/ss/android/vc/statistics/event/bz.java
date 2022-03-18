package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bz {
    /* renamed from: a */
    public static void m250233a(String str, VideoChat videoChat) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("segid", str);
                C63726b.m249915a("monitor_vc_client_subtitle_delay", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
